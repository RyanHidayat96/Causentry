package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b7\u0018\u00002\u00020\u0001:\u0006\t\n\u000b\u0006\f\bB\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\u0082\u0001\u0006\r\u000e\u000f\u0010\u0011\u0012"}, d2 = {"LbindItemView;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "TuitionPaymentFragmentbindingInflater1", "Ljava/lang/String;", "b", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "a", "LbindItemView$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "LbindItemView$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "LbindItemView$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "LbindItemView$TuitionPaymentFragmentbindingInflater1;", "LbindItemView$b;", "LbindItemView$a;"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class bindItemView {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    final String b;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"LbindItemView$TuitionPaymentFragmentspecialinlinedviewModeldefault1;", "LbindItemView;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault1 extends bindItemView {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault1 INSTANCE = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();

        public final int hashCode() {
            return -1663682594;
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
            super("scholarship_grantee", null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault1)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "TuitionPaymentFragmentspecialinlinedviewModeldefault1";
        }
    }

    private bindItemView(String str) {
        this.b = str;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007H×\u0001¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"LbindItemView$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "LbindItemView;", "<init>", "()V", "", "p0", "p1", "", "b", "(II)Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends bindItemView {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault2 INSTANCE = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();

        public final int hashCode() {
            return -1035074650;
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
            super("scholar_form/{childIndex}/{totalChild}", null);
        }

        public static String b(int p0, int p1) {
            StringBuilder sb = new StringBuilder("scholar_form/");
            sb.append(p0);
            sb.append("/");
            sb.append(p1);
            return sb.toString();
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "TuitionPaymentFragmentspecialinlinedviewModeldefault2";
        }
    }

    public /* synthetic */ bindItemView(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"LbindItemView$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "LbindItemView;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends bindItemView {
        public static final TuitionPaymentFragmentspecialinlinedviewModeldefault3 INSTANCE = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();

        public final int hashCode() {
            return -2103267245;
        }

        private TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
            super("scholarship_confirmation", null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "TuitionPaymentFragmentspecialinlinedviewModeldefault3";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"LbindItemView$TuitionPaymentFragmentbindingInflater1;", "LbindItemView;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class TuitionPaymentFragmentbindingInflater1 extends bindItemView {
        public static final TuitionPaymentFragmentbindingInflater1 INSTANCE = new TuitionPaymentFragmentbindingInflater1();

        public final int hashCode() {
            return -1017043530;
        }

        private TuitionPaymentFragmentbindingInflater1() {
            super("scholarship_history", null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof TuitionPaymentFragmentbindingInflater1)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "TuitionPaymentFragmentbindingInflater1";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"LbindItemView$a;", "LbindItemView;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class a extends bindItemView {
        public static final a INSTANCE = new a();

        public final int hashCode() {
            return -134635457;
        }

        private a() {
            super("scholarship_submission_confirmation", null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof a)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "a";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH×\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"LbindItemView$b;", "LbindItemView;", "<init>", "()V", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class b extends bindItemView {
        public static final b INSTANCE = new b();

        public final int hashCode() {
            return -1135025251;
        }

        private b() {
            super("scholarship_history_participant", null);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof b)) {
                return false;
            }
            return true;
        }

        public final String toString() {
            return "b";
        }
    }
}
