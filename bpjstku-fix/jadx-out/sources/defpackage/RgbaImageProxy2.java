package defpackage;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.QosTier;
import com.google.firebase.encoders.annotations.Encodable;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class RgbaImageProxy2 {

    public static abstract class TuitionPaymentFragmentbindingInflater1 {
        public abstract TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1(long j);

        public abstract TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1(String str);

        public abstract RgbaImageProxy2 TuitionPaymentFragmentbindingInflater1();

        public abstract TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault1(List<TakePictureManager> list);

        public abstract TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2(Integer num);

        public abstract TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(long j);

        public abstract TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault3(ClientInfo clientInfo);

        public abstract TuitionPaymentFragmentbindingInflater1 b(QosTier qosTier);
    }

    public abstract QosTier TuitionPaymentFragmentbindingInflater1();

    @Encodable.Field(name = "logEvent")
    public abstract List<TakePictureManager> TuitionPaymentFragmentspecialinlinedviewModeldefault1();

    public abstract ClientInfo TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    public abstract Integer TuitionPaymentFragmentspecialinlinedviewModeldefault3();

    public abstract long asInterface();

    public abstract String b();

    public abstract long d();
}
