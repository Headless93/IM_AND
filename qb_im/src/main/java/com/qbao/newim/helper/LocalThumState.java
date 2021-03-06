package com.qbao.newim.helper;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/**
 * 高清图图片已经加载过了，使用高清图作为缩略图。
 * 同时使用 {@link TransferImage#CATE_ANIMA_TOGETHER} 动画类型展示图片
 * <p>
 * Created by hitomi on 2017/5/4.
 * <p>
 * email: 196425254@qq.com
 */
class LocalThumState extends TransferState {

    LocalThumState(TransferLayout transfer) {
        super(transfer);
    }

    @Override
    public void prepareTransfer(final TransferImage transImage, final int position) {
        final TransferConfig config = transfer.getTransConfig();

        ImageLoader imageLoader = config.getImageLoader();
        String imgUrl = config.getSourceImageList().get(position);

        imageLoader.loadThumbnailAsync(imgUrl, transImage, new ImageLoader.ThumbnailCallback() {

            @Override
            public void onFinish(Drawable drawable) {
                transImage.setImageDrawable(drawable == null
                        ? config.getMissDrawable(context) : drawable);

            }
        });
    }

    @Override
    public TransferImage createTransferIn(final int position) {
        TransferConfig config = transfer.getTransConfig();

        TransferImage transImage = createTransferImage(
                config.getOriginImageList());
        transformThumbnail(config.getSourceImageList().get(position), transImage, true);
        transfer.addView(transImage, 1);

        return transImage;
    }

    @Override
    public void transferLoad(final int position) {
        final TransferConfig config = transfer.getTransConfig();
        final String imgUrl = config.getSourceImageList().get(position);
        final TransferImage targetImage = transfer.getTransAdapter().getImageItem(position);

        if (config.isJustLoadHitImage()) {
            // 如果用户设置了 JustLoadHitImage 属性，说明在 prepareTransfer 中已经
            // 对 TransferImage 裁剪且设置了占位图， 所以这里直接加载原图即可
            loadSourceImage(imgUrl, targetImage, targetImage.getDrawable(), position);
        } else {
            config.getImageLoader().loadThumbnailAsync(imgUrl, targetImage, new ImageLoader.ThumbnailCallback() {
                @Override
                public void onFinish(Drawable drawable) {
                    if (drawable == null)
                        drawable = config.getMissDrawable(context);

                    loadSourceImage(imgUrl, targetImage, drawable, position);
                }
            });
        }
    }

    private void loadSourceImage(String imgUrl, final TransferImage targetImage, Drawable drawable, final int position) {
        final TransferConfig config = transfer.getTransConfig();

        config.getImageLoader().showSourceImage(imgUrl, targetImage, drawable, new ImageLoader.SourceCallback() {

            @Override
            public void onStart() {
            }

            @Override
            public void onProgress(int progress) {
            }

            @Override
            public void onFinish() {
            }

            @Override
            public void onDelivered(int status) {
                switch (status) {
                    case ImageLoader.STATUS_DISPLAY_SUCCESS:
                        if (TransferImage.STATE_TRANS_CLIP == targetImage.getState())
                            targetImage.transformIn(TransferImage.STAGE_SCALE);
                        // 启用 TransferImage 的手势缩放功能
                        targetImage.enable();
                        // 绑定点击关闭 Transferee
                        transfer.bindOnDismissListener(targetImage, position);
                        break;
                    case ImageLoader.STATUS_DISPLAY_FAILED:  // 加载失败，显示加载错误的占位图
                        targetImage.setImageDrawable(config.getErrorDrawable(context));
                        break;
                }
            }
        });
    }

    @Override
    public TransferImage transferOut(final int position) {
        TransferImage transImage = null;

        TransferConfig config = transfer.getTransConfig();
        ImageView originImageList = config.getOriginImageList();

            transImage = createTransferImage(
                    originImageList);
            transformThumbnail(config.getSourceImageList().get(position), transImage, false);

            transfer.addView(transImage, 1);

        return transImage;
    }
}
