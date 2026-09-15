package defpackage;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b0\u0018\u0000 \u00112\u00020\u0001:\r\u0011\n\u000e\u0010\f\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B)\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\f\u001a\u00020\u00048\u0007¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0011\u0010\n\u001a\u00020\u00028\u0007¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0007¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0001\f\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%"}, d2 = {"LsubmitStillCaptureRequest;", "", "", "p0", "", "p1", "", "p2", "<init>", "(ZILjava/lang/Throwable;)V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "I", "b", "Z", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "Ljava/lang/Throwable;", "TuitionPaymentFragmentbindingInflater1", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "asInterface", "d", "asBinder", "a", "g", "onTransact", "cancelAll", "INotificationSideChannel", "LsubmitStillCaptureRequest$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "LsubmitStillCaptureRequest$TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "LsubmitStillCaptureRequest$TuitionPaymentFragmentbindingInflater1;", "LsubmitStillCaptureRequest$b;", "LsubmitStillCaptureRequest$asInterface;", "LsubmitStillCaptureRequest$d;", "LsubmitStillCaptureRequest$asBinder;", "LsubmitStillCaptureRequest$a;", "LsubmitStillCaptureRequest$g;", "LsubmitStillCaptureRequest$onTransact;", "LsubmitStillCaptureRequest$cancelAll;", "LsubmitStillCaptureRequest$INotificationSideChannel;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class submitStillCaptureRequest {

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final int b;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final Throwable TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    public static final class b extends submitStillCaptureRequest {
    }

    private submitStillCaptureRequest(boolean z, int i, Throwable th) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = z;
        this.b = i;
        this.TuitionPaymentFragmentbindingInflater1 = th;
    }

    public /* synthetic */ submitStillCaptureRequest(boolean z, int i, Throwable th, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : th, null);
    }

    public static final class g extends submitStillCaptureRequest {
        public g(int i) {
            super(false, i, null, 4, null);
        }
    }

    public static final class asBinder extends submitStillCaptureRequest {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public asBinder(Throwable th) {
            super(true, 0, th, 2, null);
            Intrinsics.checkNotNullParameter(th, "");
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 extends submitStillCaptureRequest {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TuitionPaymentFragmentspecialinlinedviewModeldefault2(Throwable th) {
            super(true, 0, th, 2, null);
            Intrinsics.checkNotNullParameter(th, "");
        }
    }

    public static final class a extends submitStillCaptureRequest {
        public a(Throwable th) {
            super(false, 0, th, 2, null);
        }
    }

    public static final class d extends submitStillCaptureRequest {
        public d(int i) {
            super(false, i, null, 4, null);
        }
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 extends submitStillCaptureRequest {
        public TuitionPaymentFragmentspecialinlinedviewModeldefault3(int i) {
            super(false, i, null, 4, null);
        }
    }

    public static final class asInterface extends submitStillCaptureRequest {
        public asInterface(int i) {
            super(true, i, null, 4, null);
        }
    }

    public static final class TuitionPaymentFragmentbindingInflater1 extends submitStillCaptureRequest {
        public TuitionPaymentFragmentbindingInflater1(int i) {
            super(true, i, null, 4, null);
        }
    }

    public static final class cancelAll extends submitStillCaptureRequest {
        public cancelAll(int i) {
            super(false, i, null, 4, null);
        }
    }

    public static final class onTransact extends submitStillCaptureRequest {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public onTransact(Throwable th) {
            super(true, 0, th, 2, null);
            Intrinsics.checkNotNullParameter(th, "");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LsubmitStillCaptureRequest$INotificationSideChannel;", "LsubmitStillCaptureRequest;", "<init>", "()V"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class INotificationSideChannel extends submitStillCaptureRequest {
        public static final INotificationSideChannel INSTANCE = new INotificationSideChannel();

        private INotificationSideChannel() {
            super(false, 0, null, 4, null);
        }
    }

    public static final /* synthetic */ String TuitionPaymentFragmentspecialinlinedviewModeldefault3(submitStillCaptureRequest submitstillcapturerequest, String str, int i, String str2, Throwable th) {
        StringBuilder sb = new StringBuilder();
        if (str == null) {
            StringBuilder sb2 = new StringBuilder("Batch [");
            sb2.append(i);
            sb2.append(" bytes] (");
            sb2.append(str2);
            sb2.append(")");
            sb.append(sb2.toString());
        } else {
            StringBuilder sb3 = new StringBuilder("Batch ");
            sb3.append(str);
            sb3.append(" [");
            sb3.append(i);
            sb3.append(" bytes] (");
            sb3.append(str2);
            sb3.append(")");
            sb.append(sb3.toString());
        }
        if (submitstillcapturerequest instanceof g) {
            sb.append(" sent successfully.");
        } else if (submitstillcapturerequest instanceof INotificationSideChannel) {
            sb.append(" status is unknown");
        } else {
            sb.append(" failed because ");
            if (submitstillcapturerequest instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                sb.append("of a DNS error");
            } else if (submitstillcapturerequest instanceof TuitionPaymentFragmentspecialinlinedviewModeldefault3) {
                sb.append("of a processing error or invalid data");
            } else if (submitstillcapturerequest instanceof TuitionPaymentFragmentbindingInflater1) {
                sb.append("of an intake rate limitation");
            } else if (submitstillcapturerequest instanceof b) {
                sb.append("of a network redirection");
            } else if (submitstillcapturerequest instanceof asInterface) {
                sb.append("of a server processing error");
            } else if (submitstillcapturerequest instanceof d) {
                sb.append("your token is invalid");
            } else if (submitstillcapturerequest instanceof asBinder) {
                sb.append("of a network error");
            } else if (submitstillcapturerequest instanceof a) {
                sb.append("of an error when creating the request");
            } else if (submitstillcapturerequest instanceof onTransact) {
                sb.append("of an unknown error");
            } else if (submitstillcapturerequest instanceof cancelAll) {
                int i2 = submitstillcapturerequest.b;
                StringBuilder sb4 = new StringBuilder("of an unexpected HTTP error (status code = ");
                sb4.append(i2);
                sb4.append(")");
                sb.append(sb4.toString());
            }
            if (th != null) {
                sb.append(" (");
                sb.append(th.getMessage());
                sb.append(")");
            }
            if (submitstillcapturerequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                sb.append("; we will retry later.");
            } else {
                sb.append("; the batch was dropped.");
            }
        }
        if (submitstillcapturerequest instanceof d) {
            sb.append(" Make sure that the provided token still exists and you're targeting the relevant Datadog site.");
        }
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        return string;
    }

    public /* synthetic */ submitStillCaptureRequest(boolean z, int i, Throwable th, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, i, th);
    }
}
