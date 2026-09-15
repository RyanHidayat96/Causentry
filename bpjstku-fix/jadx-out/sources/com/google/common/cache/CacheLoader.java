package com.google.common.cache;

/* JADX INFO: loaded from: classes6.dex */
public abstract class CacheLoader<K, V> {

    public static final class InvalidCacheLoadException extends RuntimeException {
    }

    protected CacheLoader() {
    }

    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
        UnsupportedLoadingOperationException() {
        }
    }
}
