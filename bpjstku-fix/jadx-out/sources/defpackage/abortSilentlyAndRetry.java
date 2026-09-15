package defpackage;

import com.google.android.datatransport.cct.internal.ClientInfo;
import com.google.android.datatransport.cct.internal.ComplianceData;
import com.google.android.datatransport.cct.internal.NetworkConnectionInfo;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
public final class abortSilentlyAndRetry implements Configurator {
    public static final Configurator TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new abortSilentlyAndRetry();

    private abortSilentlyAndRetry() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public final void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(createBitmap.class, TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1);
        encoderConfig.registerEncoder(abort.class, TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1);
        encoderConfig.registerEncoder(RgbaImageProxy2.class, a.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        encoderConfig.registerEncoder(getCompleteFuture.class, a.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        encoderConfig.registerEncoder(ClientInfo.class, TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        encoderConfig.registerEncoder(abortAndSendErrorToApp.class, TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        encoderConfig.registerEncoder(onProcessFailure.class, TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1);
        encoderConfig.registerEncoder(checkOnImageCaptured.class, TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1);
        encoderConfig.registerEncoder(TakePictureManager.class, d.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        encoderConfig.registerEncoder(RequestWithCallbackExternalSyntheticLambda0.class, d.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        encoderConfig.registerEncoder(ComplianceData.class, TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1);
        encoderConfig.registerEncoder(markComplete.class, TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentbindingInflater1);
        encoderConfig.registerEncoder(submitCameraRequest.class, asInterface.b);
        encoderConfig.registerEncoder(setCaptureRequestFuture.class, asInterface.b);
        encoderConfig.registerEncoder(RgbaImageProxy.class, g.TuitionPaymentFragmentbindingInflater1);
        encoderConfig.registerEncoder(lambdanew1androidxcameracoreimagecaptureRequestWithCallback.class, g.TuitionPaymentFragmentbindingInflater1);
        encoderConfig.registerEncoder(NetworkConnectionInfo.class, asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        encoderConfig.registerEncoder(createImageInfo.class, asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        encoderConfig.registerEncoder(checkNotClosed.class, b.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        encoderConfig.registerEncoder(lambdanew0androidxcameracoreimagecaptureRequestWithCallback.class, b.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements ObjectEncoder<createBitmap> {
        static final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        private static final FieldDescriptor b = FieldDescriptor.of("logRequest");

        private TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(b, ((createBitmap) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
    }

    static final class a implements ObjectEncoder<RgbaImageProxy2> {
        static final a TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new a();
        private static final FieldDescriptor asInterface = FieldDescriptor.of("requestTimeMs");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final FieldDescriptor f248a = FieldDescriptor.of("requestUptimeMs");
        private static final FieldDescriptor TuitionPaymentFragmentbindingInflater1 = FieldDescriptor.of("clientInfo");
        private static final FieldDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault2 = FieldDescriptor.of("logSource");
        private static final FieldDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault3 = FieldDescriptor.of("logSourceName");
        private static final FieldDescriptor b = FieldDescriptor.of("logEvent");
        private static final FieldDescriptor asBinder = FieldDescriptor.of("qosTier");

        private a() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            RgbaImageProxy2 rgbaImageProxy2 = (RgbaImageProxy2) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(asInterface, rgbaImageProxy2.d());
            objectEncoderContext2.add(f248a, rgbaImageProxy2.asInterface());
            objectEncoderContext2.add(TuitionPaymentFragmentbindingInflater1, rgbaImageProxy2.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            objectEncoderContext2.add(TuitionPaymentFragmentspecialinlinedviewModeldefault2, rgbaImageProxy2.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            objectEncoderContext2.add(TuitionPaymentFragmentspecialinlinedviewModeldefault3, rgbaImageProxy2.b());
            objectEncoderContext2.add(b, rgbaImageProxy2.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            objectEncoderContext2.add(asBinder, rgbaImageProxy2.TuitionPaymentFragmentbindingInflater1());
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements ObjectEncoder<ClientInfo> {
        static final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        private static final FieldDescriptor b = FieldDescriptor.of("clientType");
        private static final FieldDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault3 = FieldDescriptor.of("androidClientInfo");

        private TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            ClientInfo clientInfo = (ClientInfo) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, clientInfo.b());
            objectEncoderContext2.add(TuitionPaymentFragmentspecialinlinedviewModeldefault3, clientInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements ObjectEncoder<onProcessFailure> {
        static final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        private static final FieldDescriptor notify = FieldDescriptor.of(RemoteConfigConstants.RequestFieldKey.SDK_VERSION);
        private static final FieldDescriptor d = FieldDescriptor.of("model");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final FieldDescriptor f247a = FieldDescriptor.of("hardware");
        private static final FieldDescriptor b = FieldDescriptor.of("device");
        private static final FieldDescriptor cancel = FieldDescriptor.of("product");
        private static final FieldDescriptor onTransact = FieldDescriptor.of("osBuild");
        private static final FieldDescriptor asBinder = FieldDescriptor.of("manufacturer");
        private static final FieldDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault1 = FieldDescriptor.of("fingerprint");
        private static final FieldDescriptor g = FieldDescriptor.of("locale");
        private static final FieldDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault3 = FieldDescriptor.of("country");
        private static final FieldDescriptor asInterface = FieldDescriptor.of("mccMnc");
        private static final FieldDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault2 = FieldDescriptor.of("applicationBuild");

        private TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            onProcessFailure onprocessfailure = (onProcessFailure) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(notify, onprocessfailure.INotificationSideChannel());
            objectEncoderContext2.add(d, onprocessfailure.d());
            objectEncoderContext2.add(f247a, onprocessfailure.b());
            objectEncoderContext2.add(b, onprocessfailure.TuitionPaymentFragmentbindingInflater1());
            objectEncoderContext2.add(cancel, onprocessfailure.cancel());
            objectEncoderContext2.add(onTransact, onprocessfailure.asInterface());
            objectEncoderContext2.add(asBinder, onprocessfailure.g());
            objectEncoderContext2.add(TuitionPaymentFragmentspecialinlinedviewModeldefault1, onprocessfailure.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            objectEncoderContext2.add(g, onprocessfailure.a());
            objectEncoderContext2.add(TuitionPaymentFragmentspecialinlinedviewModeldefault3, onprocessfailure.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
            objectEncoderContext2.add(asInterface, onprocessfailure.asBinder());
            objectEncoderContext2.add(TuitionPaymentFragmentspecialinlinedviewModeldefault2, onprocessfailure.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
    }

    static final class d implements ObjectEncoder<TakePictureManager> {
        static final d TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new d();
        private static final FieldDescriptor b = FieldDescriptor.of("eventTimeMs");
        private static final FieldDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault2 = FieldDescriptor.of("eventCode");
        private static final FieldDescriptor TuitionPaymentFragmentbindingInflater1 = FieldDescriptor.of("complianceData");
        private static final FieldDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault3 = FieldDescriptor.of("eventUptimeMs");
        private static final FieldDescriptor g = FieldDescriptor.of("sourceExtension");
        private static final FieldDescriptor asBinder = FieldDescriptor.of("sourceExtensionJsonProto3");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final FieldDescriptor f249a = FieldDescriptor.of("timezoneOffsetSeconds");
        private static final FieldDescriptor asInterface = FieldDescriptor.of("networkConnectionInfo");
        private static final FieldDescriptor d = FieldDescriptor.of("experimentIds");

        private d() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            TakePictureManager takePictureManager = (TakePictureManager) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, takePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            objectEncoderContext2.add(TuitionPaymentFragmentspecialinlinedviewModeldefault2, takePictureManager.b());
            objectEncoderContext2.add(TuitionPaymentFragmentbindingInflater1, takePictureManager.TuitionPaymentFragmentbindingInflater1());
            objectEncoderContext2.add(TuitionPaymentFragmentspecialinlinedviewModeldefault3, takePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
            objectEncoderContext2.add(g, takePictureManager.d());
            objectEncoderContext2.add(asBinder, takePictureManager.g());
            objectEncoderContext2.add(f249a, takePictureManager.asInterface());
            objectEncoderContext2.add(asInterface, takePictureManager.asBinder());
            objectEncoderContext2.add(d, takePictureManager.TuitionPaymentFragmentspecialinlinedviewModeldefault2());
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1 implements ObjectEncoder<ComplianceData> {
        static final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentbindingInflater1 = new TuitionPaymentFragmentbindingInflater1();
        private static final FieldDescriptor b = FieldDescriptor.of("privacyContext");
        private static final FieldDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault1 = FieldDescriptor.of("productIdOrigin");

        private TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            ComplianceData complianceData = (ComplianceData) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, complianceData.b());
            objectEncoderContext2.add(TuitionPaymentFragmentspecialinlinedviewModeldefault1, complianceData.TuitionPaymentFragmentbindingInflater1());
        }
    }

    static final class asInterface implements ObjectEncoder<submitCameraRequest> {
        static final asInterface b = new asInterface();
        private static final FieldDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault2 = FieldDescriptor.of("prequest");

        private asInterface() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(TuitionPaymentFragmentspecialinlinedviewModeldefault2, ((submitCameraRequest) obj).b());
        }
    }

    static final class g implements ObjectEncoder<RgbaImageProxy> {
        static final g TuitionPaymentFragmentbindingInflater1 = new g();
        private static final FieldDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault1 = FieldDescriptor.of("originAssociatedProductId");

        private g() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((RgbaImageProxy) obj).TuitionPaymentFragmentbindingInflater1());
        }
    }

    static final class asBinder implements ObjectEncoder<NetworkConnectionInfo> {
        static final asBinder TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new asBinder();
        private static final FieldDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault3 = FieldDescriptor.of("networkType");
        private static final FieldDescriptor TuitionPaymentFragmentbindingInflater1 = FieldDescriptor.of("mobileSubtype");

        private asBinder() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            NetworkConnectionInfo networkConnectionInfo = (NetworkConnectionInfo) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(TuitionPaymentFragmentspecialinlinedviewModeldefault3, networkConnectionInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
            objectEncoderContext2.add(TuitionPaymentFragmentbindingInflater1, networkConnectionInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
    }

    static final class b implements ObjectEncoder<checkNotClosed> {
        static final b TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new b();
        private static final FieldDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault3 = FieldDescriptor.of("clearBlob");
        private static final FieldDescriptor TuitionPaymentFragmentbindingInflater1 = FieldDescriptor.of("encryptedBlob");

        private b() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            checkNotClosed checknotclosed = (checkNotClosed) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(TuitionPaymentFragmentspecialinlinedviewModeldefault3, checknotclosed.b());
            objectEncoderContext2.add(TuitionPaymentFragmentbindingInflater1, checknotclosed.TuitionPaymentFragmentspecialinlinedviewModeldefault3());
        }
    }
}
