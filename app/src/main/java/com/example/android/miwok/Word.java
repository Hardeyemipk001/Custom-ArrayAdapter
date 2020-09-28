package com.example.android.miwok;

public class Word {

    private  String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED=-1;

    public Word (String vdefaultTranslation, String vMiwokTranslation, int imageResourceId){
        mDefaultTranslation=vdefaultTranslation;
         mMiwokTranslation=vMiwokTranslation;
         mImageResourceId = imageResourceId;
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
    public Word (String vdefaultTranslation, String vMiwokTranslation){
        mDefaultTranslation=vdefaultTranslation;
        mMiwokTranslation=vMiwokTranslation;

    }
    // Return whether or not there is an image for this word
    public boolean hasImage(){
        return  mImageResourceId != NO_IMAGE_PROVIDED;

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