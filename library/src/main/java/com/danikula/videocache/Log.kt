package com.danikula.videocache

import java.lang.Exception
import java.util.logging.Level
import java.util.logging.Logger

/**
 * <pre>
 *     author: xyoye
 *     time  : 2021/12/23
 *     desc  :
 * </pre>
 */

object Log {
    private const val TAG = "AndroidVideoCache"
    private val logger = Logger.getLogger(TAG)

    @JvmStatic
    fun e(msg: String) {
        log(Level.SEVERE, msg)
    }

    @JvmStatic
    fun e(msg: String, t: Throwable? = null) {
        log(Level.SEVERE, msg, t)
    }

    @JvmStatic
    fun d(msg: String) {
        log(Level.CONFIG, msg)
    }

    @JvmStatic
    fun w(msg: String) {
        log(Level.WARNING, msg)
    }

    @JvmStatic
    fun w(msg: String, t: Throwable? = null) {
        log(Level.WARNING, msg, t)
    }

    @JvmStatic
    fun i(msg: String) {
        log(Level.INFO, msg)
    }

    @JvmStatic
    fun log(level: Level, msg: String, t: Throwable? = null) {
        logger.log(level, msg, t)
    }
}