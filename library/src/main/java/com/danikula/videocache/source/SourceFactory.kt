package com.danikula.videocache.source

import com.danikula.videocache.Config

/**
 * <pre>
 *     author: xieyy@anjiu-tech.com
 *     time  : 2021/12/31
 *     desc  :
 * </pre>
 */
abstract class SourceFactory {
    lateinit var config: Config

    fun initConfig(config: Config) {
        this.config = config
    }

    abstract fun createSource(url: String): Source
}