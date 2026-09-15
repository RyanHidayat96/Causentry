package com.squareup.okhttp.internal.framed;

import com.squareup.okhttp.Protocol;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListener;

/* JADX INFO: loaded from: classes7.dex */
public interface Variant {
    Protocol getProtocol();

    FrameReader newReader(RotationProvider1 rotationProvider1, boolean z);

    FrameWriter newWriter(RotationProviderListener rotationProviderListener, boolean z);
}
