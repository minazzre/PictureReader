package com.example.vizassist;

import android.content.Intent;
import android.os.Build;
import android.provider.MediaStore;

import com.example.vizassist.imagepipeline.ImageActions;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowActivity;

import static org.junit.Assert.*;
import static org.robolectric.Shadows.shadowOf;

@RunWith(RobolectricTestRunner.class)
@Config(sdk = Build.VERSION_CODES.LOLLIPOP)
public class ImageActionsRobolectricTest {
    private final static int TEST_CAMERA_REQUEST_CODE = 1;
    private final static int TEST_GALLERY_REQUEST_CODE = 1;
}
