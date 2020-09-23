package com.example.android.miwok;

public class Word {
    private int mImageResourceId;
    private  String mDefaultTranslation;
    private String mMiwokTranslation;

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