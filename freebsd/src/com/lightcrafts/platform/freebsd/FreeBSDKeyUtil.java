/* Copyright (C) 2005-2011 Fabio Riccardi */

package com.lightcrafts.platform.freebsd;

/**
 * A JNI wrapper for the FreeBSD implementation of Platform.isKeyPressed().
 */
class FreeBSDKeyUtil {

    static native boolean isKeyPressed( int keyCode );

    static {
        System.loadLibrary( "FreeBSD" );
    }
}
