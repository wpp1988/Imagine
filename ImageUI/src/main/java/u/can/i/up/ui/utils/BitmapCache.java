package u.can.i.up.ui.utils;

import android.graphics.Bitmap;

/**
 * Created by breeze on 2015/7/13.
 */
public class BitmapCache {
    private static Bitmap bitmapcache;
    private static float backBmpScale;
    private static float backBmpTranslateX;
    private static float backBmpTranslateY;
    private static ImageViewImpl_allocate mImageViewImpl_allocate;

    public static void setBitmapcache(Bitmap mbitmap){
        bitmapcache = mbitmap;
    }

    public static Bitmap getBitmapcache(){
        return bitmapcache;
    }

    public static void setBackBmpScale(float scale){
        backBmpScale = scale;
    }

    public static float getBackBmpScale(){
        return backBmpScale;
    }

    public static void setBackBmpTranslateX(float x){
        backBmpTranslateX = x;
    }
    public static float getBackBmpTranslateX(){
        return backBmpTranslateX;
    }
    public static void setBackBmpTranslateY(float y){
        backBmpTranslateY = y;
    }
    public static float getBackBmpTranslateY(){
        return  backBmpTranslateY;
    }
    public static ImageViewImpl_allocate getImageViewImpl_allocate() {
        return mImageViewImpl_allocate;
    }
    public static void setImageViewImpl_allocate(ImageViewImpl_allocate imageViewImpl_allocate) {
        mImageViewImpl_allocate = imageViewImpl_allocate;
    }

}
