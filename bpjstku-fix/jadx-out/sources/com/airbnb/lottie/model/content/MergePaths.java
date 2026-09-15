package com.airbnb.lottie.model.content;

import defpackage.dispatchMediaButtonEvent;
import defpackage.fromMediaSession;
import defpackage.onSetCaptioningEnabled;
import defpackage.prepare;
import defpackage.setRepeatMode;
import defpackage.toLegacyStreamType;

/* JADX INFO: loaded from: classes5.dex */
public final class MergePaths implements toLegacyStreamType {
    public final MergePathsMode TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public final String b;

    public enum MergePathsMode {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static MergePathsMode TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i == 5) {
                return EXCLUDE_INTERSECTIONS;
            }
            return MERGE;
        }
    }

    public MergePaths(String str, MergePathsMode mergePathsMode, boolean z) {
        this.b = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = mergePathsMode;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        sb.append(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        sb.append('}');
        return sb.toString();
    }

    @Override // defpackage.toLegacyStreamType
    public final setRepeatMode TuitionPaymentFragmentspecialinlinedviewModeldefault2(prepare prepareVar, fromMediaSession frommediasession) {
        if (!prepareVar.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            onSetCaptioningEnabled.b("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new dispatchMediaButtonEvent(this);
    }
}
