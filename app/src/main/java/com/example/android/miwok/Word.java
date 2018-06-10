package com.example.android.miwok;

/**
 * Created by stephentwood on 6/10/18.
 */

public class Word {

    // Default translation for the word
    private String mDefaultTranslation;

    // Miwok translation for the word
    private String mMiwokTranslation;

    /**
     * Constructor. Stores given words in the corresponding variables
     * @param defaultTranslation Default translation
     * @param miwokTranslation Miwok translation
     */
    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    // Get the default translation of the word
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    // Get the Miwok translation of the word
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}