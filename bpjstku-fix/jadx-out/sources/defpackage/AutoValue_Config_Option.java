package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class AutoValue_Config_Option {
    public final AutoValue_AttachedSurfaceInfo TuitionPaymentFragmentbindingInflater1;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final AutoValue_CameraThreadConfig TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final List<toStreamSpec> TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 {
        public AutoValue_CameraThreadConfig TuitionPaymentFragmentbindingInflater1 = null;
        public List<toStreamSpec> TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new ArrayList();
        public AutoValue_AttachedSurfaceInfo TuitionPaymentFragmentspecialinlinedviewModeldefault3 = null;
        public String b = "";
    }

    static {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 tuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        new AutoValue_Config_Option(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1, Collections.unmodifiableList(tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1), tuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3, tuitionPaymentFragmentspecialinlinedviewModeldefault2.b);
    }

    public AutoValue_Config_Option(AutoValue_CameraThreadConfig autoValue_CameraThreadConfig, List<toStreamSpec> list, AutoValue_AttachedSurfaceInfo autoValue_AttachedSurfaceInfo, String str) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = autoValue_CameraThreadConfig;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = list;
        this.TuitionPaymentFragmentbindingInflater1 = autoValue_AttachedSurfaceInfo;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
    }
}
