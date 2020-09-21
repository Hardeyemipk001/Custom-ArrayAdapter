package com.example.android.miwok;

public class Word {
    private  String mDefaultTranslation;
    private String mMiwokTranslation;

    public Word (String vdefaultTranslation, String vMiwokTranslation){
        mDefaultTranslation=vdefaultTranslation;
         mMiwokTranslation=vMiwokTranslation;
    }
    public String getmDefaultTranslation(){
        return mDefaultTranslation;
    }
    public  String getmMiwokTranslation(){
        return mMiwokTranslation;
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