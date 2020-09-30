package com.example.android.miwok;

public class Word {

    private  String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;
    private  int mAudioResourceId;

    public Word (String vdefaultTranslation, String vMiwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation=vdefaultTranslation;
         mMiwokTranslation=vMiwokTranslation;
         mImageResourceId = imageResourceId;
         mAudioResourceId=audioResourceId;
        }

    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }
    public  String getmMiwokTranslation(){
        return mMiwokTranslation;
    }

    public Word (String vdefaultTranslation, String vMiwokTranslation, int audioResourceId){
        mDefaultTranslation=vdefaultTranslation;
        mMiwokTranslation=vMiwokTranslation;
        mAudioResourceId=audioResourceId;
    }

    // Return whether or not there is an image for this word
    public boolean hasImage(){
        return  mImageResourceId != NO_IMAGE_PROVIDED;
    }
    public int getAudioResourceId(){
        return mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageResourceId=" + mImageResourceId +
                ", mAudioResourceId=" + mAudioResourceId +
                '}';
    }
}



//public class AndroidFlavor {
//    private String mVersionName;
//    private String mVersionNumber;
//    public AndroidFlavor(String vName, String vNumber)
//    {
//        mVersionName = vName;
//        mVersionNumber = vNumber;
//    }
//    public String getVersionName() {
//        return mVersionName;
//    }
//    public String getVersionNumber() {
//        return mVersionNumber;
//    }