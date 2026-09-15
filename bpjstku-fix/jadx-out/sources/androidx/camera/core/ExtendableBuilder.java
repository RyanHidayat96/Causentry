package androidx.camera.core;

import androidx.camera.core.impl.MutableConfig;

/* JADX INFO: loaded from: classes5.dex */
public interface ExtendableBuilder<T> {
    T build();

    MutableConfig getMutableConfig();
}
