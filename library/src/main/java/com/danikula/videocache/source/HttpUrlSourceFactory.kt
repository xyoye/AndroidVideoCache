package com.danikula.videocache.source

/**
 * <pre>
 *     author: xieyy@anjiu-tech.com
 *     time  : 2021/12/31
 *     desc  :
 * </pre>
 */
class HttpUrlSourceFactory : SourceFactory() {
    override fun createSource(url: String): Source {
        return HttpUrlSource(url, config)
    }
}