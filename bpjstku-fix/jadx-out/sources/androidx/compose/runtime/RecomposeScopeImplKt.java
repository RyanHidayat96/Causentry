package androidx.compose.runtime;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003\"\u0014\u0010\u0004\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0005\"\u0014\u0010\u0007\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\b\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\t\u0010\u0005\"\u0014\u0010\n\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\n\u0010\u0005\"\u0014\u0010\u000b\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0005\"\u0014\u0010\f\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\f\u0010\u0005\"\u0014\u0010\r\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\r\u0010\u0005\"\u0014\u0010\u000e\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0005\"\u0014\u0010\u000f\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0005\"\u0014\u0010\u0010\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0005\"\u0014\u0010\u0011\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0005\"\u0014\u0010\u0012\u001a\u00020\u00008\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0005\"\u0018\u0010\u0015\u001a\u00060\u0013j\u0002`\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"", "p0", "updateChangedFlags", "(I)I", "changedLowBitMask", "I", "changedHighBitMask", "changedMask", "UsedFlag", "DefaultsInScopeFlag", "DefaultsInvalidFlag", "RequiresRecomposeFlag", "SkippedFlag", "RereadingFlag", "ForcedRecomposeFlag", "ForceReusing", "Paused", "Resuming", "ResetReusing", "", "Landroidx/compose/runtime/platform/SynchronizedObject;", "callbackLock", "Ljava/lang/Object;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class RecomposeScopeImplKt {
    private static final int DefaultsInScopeFlag = 2;
    private static final int DefaultsInvalidFlag = 4;
    private static final int ForceReusing = 128;
    private static final int ForcedRecomposeFlag = 64;
    private static final int Paused = 256;
    private static final int RequiresRecomposeFlag = 8;
    private static final int RereadingFlag = 32;
    private static final int ResetReusing = 1024;
    private static final int Resuming = 512;
    private static final int SkippedFlag = 16;
    private static final int UsedFlag = 1;
    private static final Object callbackLock = new Object();
    private static final int changedHighBitMask = 613566756;
    private static final int changedLowBitMask = 306783378;
    private static final int changedMask = -920350135;

    public static final int updateChangedFlags(int i) {
        int i2 = changedLowBitMask & i;
        int i3 = changedHighBitMask & i;
        return (i & changedMask) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }
}
