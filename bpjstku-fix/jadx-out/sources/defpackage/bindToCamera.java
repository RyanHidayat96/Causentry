package defpackage;

import com.dynatrace.android.agent.EventType;
import com.dynatrace.android.agent.conf.DataCollectionLevel;

/* JADX INFO: loaded from: classes3.dex */
public final class bindToCamera {
    public static final bindToCamera TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public static final getAttachedStreamSpec TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public final getAttachedStreamSpec TuitionPaymentFragmentbindingInflater1;

    static {
        getAttachedStreamSpec.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = new getAttachedStreamSpec.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        DataCollectionLevel dataCollectionLevel = DataCollectionLevel.USER_BEHAVIOR;
        if (dataCollectionLevel == null) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                String unused = getAttachedStreamSpec.b;
                ViewPort.asInterface("dataCollectionLevel == null is not allowed");
            }
        } else {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.b = dataCollectionLevel;
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = true;
        if (tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
            tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1 = false;
        }
        tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = null;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new bindToCamera(new getAttachedStreamSpec(tuitionPaymentFragmentspecialinlinedviewModeldefault3, (byte) 0));
        getAttachedStreamSpec.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = new getAttachedStreamSpec.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        DataCollectionLevel dataCollectionLevel2 = DataCollectionLevel.OFF;
        if (dataCollectionLevel2 == null) {
            if (SurfaceRequestExternalSyntheticLambda1.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                String unused2 = getAttachedStreamSpec.b;
                ViewPort.asInterface("dataCollectionLevel == null is not allowed");
            }
        } else {
            tuitionPaymentFragmentspecialinlinedviewModeldefault4.b = dataCollectionLevel2;
        }
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new getAttachedStreamSpec(tuitionPaymentFragmentspecialinlinedviewModeldefault4, (byte) 0);
    }

    public bindToCamera(getAttachedStreamSpec getattachedstreamspec) {
        this.TuitionPaymentFragmentbindingInflater1 = getattachedstreamspec;
    }

    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault3(EventType eventType) {
        if (eventType != EventType.CRASH) {
            if (eventType == EventType.ACTION_AUTO_LOADING_APP) {
                return this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2 == DataCollectionLevel.OFF;
            }
            return eventType.dataCollectionLevel.ordinal() <= this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2.ordinal();
        }
        return this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    }
}
