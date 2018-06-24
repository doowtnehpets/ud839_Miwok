package com.example.android.miwok;

/**
 * Created by stephentwood on 6/10/18.
 */

public class Word {

    // Default translation for the word
    private String mDefaultTranslation;

    // Miwok translation for the word
    private String mMiwokTranslation;

    // Image resource ID
    private int mImageResourceId;

    // Sound resource ID
    private int mAudioResourceId;

    /**
     * Constructor. Stores given words in the corresponding variables
     * @param defaultTranslation Default translation
     * @param miwokTranslation Miwok translation
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Constructo, stores image id and words in corresponding variables
     * @param imageResourceId Image resource id
     * @param defaultTranslation Default translation
     * @param miwokTranslation Miwok translation
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    // Get the default translation of the word
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    // Get the Miwok translation of the word
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    // Get the image resource ID
    public int getmImageResourceId() { return mImageResourceId; }

    // Get the audio resource ID
    public int getmAudioResourceId() { return mAudioResourceId; }
}