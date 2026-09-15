package defpackage;

import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.config.Configurator;
import com.google.firebase.encoders.config.EncoderConfig;
import com.google.firebase.encoders.proto.AtProtobuf;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public final class RgbaImageProxy1 implements Configurator {
    public static final Configurator TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new RgbaImageProxy1();

    private RgbaImageProxy1() {
    }

    @Override // com.google.firebase.encoders.config.Configurator
    public final void configure(EncoderConfig<?> encoderConfig) {
        encoderConfig.registerEncoder(offerRequest.class, TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        encoderConfig.registerEncoder(AutoValue_Config_Option.class, TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        encoderConfig.registerEncoder(AutoValue_CameraThreadConfig.class, d.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        encoderConfig.registerEncoder(toStreamSpec.class, TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        encoderConfig.registerEncoder(LogEventDropped.class, TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        encoderConfig.registerEncoder(AutoValue_AttachedSurfaceInfo.class, b.b);
        encoderConfig.registerEncoder(getValueClass.class, a.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault3 implements ObjectEncoder<offerRequest> {
        static final TuitionPaymentFragmentspecialinlinedviewModeldefault3 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentspecialinlinedviewModeldefault3();
        private static final FieldDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault1 = FieldDescriptor.of("clientMetrics");

        private TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(TuitionPaymentFragmentspecialinlinedviewModeldefault1, ((offerRequest) obj).b());
        }
    }

    static final class TuitionPaymentFragmentbindingInflater1 implements ObjectEncoder<AutoValue_Config_Option> {
        static final TuitionPaymentFragmentbindingInflater1 TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new TuitionPaymentFragmentbindingInflater1();
        private static final FieldDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault1 = FieldDescriptor.builder("window").withProperty(AtProtobuf.builder().tag(1).build()).build();
        private static final FieldDescriptor TuitionPaymentFragmentbindingInflater1 = FieldDescriptor.builder("logSourceMetrics").withProperty(AtProtobuf.builder().tag(2).build()).build();
        private static final FieldDescriptor b = FieldDescriptor.builder("globalMetrics").withProperty(AtProtobuf.builder().tag(3).build()).build();
        private static final FieldDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault3 = FieldDescriptor.builder("appNamespace").withProperty(AtProtobuf.builder().tag(4).build()).build();

        private TuitionPaymentFragmentbindingInflater1() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            AutoValue_Config_Option autoValue_Config_Option = (AutoValue_Config_Option) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(TuitionPaymentFragmentspecialinlinedviewModeldefault1, autoValue_Config_Option.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
            objectEncoderContext2.add(TuitionPaymentFragmentbindingInflater1, autoValue_Config_Option.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            objectEncoderContext2.add(b, autoValue_Config_Option.TuitionPaymentFragmentbindingInflater1);
            objectEncoderContext2.add(TuitionPaymentFragmentspecialinlinedviewModeldefault3, autoValue_Config_Option.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    }

    static final class d implements ObjectEncoder<AutoValue_CameraThreadConfig> {
        static final d TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new d();
        private static final FieldDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault3 = FieldDescriptor.builder("startMs").withProperty(AtProtobuf.builder().tag(1).build()).build();
        private static final FieldDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault2 = FieldDescriptor.builder("endMs").withProperty(AtProtobuf.builder().tag(2).build()).build();

        private d() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            AutoValue_CameraThreadConfig autoValue_CameraThreadConfig = (AutoValue_CameraThreadConfig) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(TuitionPaymentFragmentspecialinlinedviewModeldefault3, autoValue_CameraThreadConfig.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
            objectEncoderContext2.add(TuitionPaymentFragmentspecialinlinedviewModeldefault2, autoValue_CameraThreadConfig.b);
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault2 implements ObjectEncoder<toStreamSpec> {
        static final TuitionPaymentFragmentspecialinlinedviewModeldefault2 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault2();
        private static final FieldDescriptor b = FieldDescriptor.builder("logSource").withProperty(AtProtobuf.builder().tag(1).build()).build();
        private static final FieldDescriptor TuitionPaymentFragmentbindingInflater1 = FieldDescriptor.builder("logEventDropped").withProperty(AtProtobuf.builder().tag(2).build()).build();

        private TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            toStreamSpec tostreamspec = (toStreamSpec) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, tostreamspec.b);
            objectEncoderContext2.add(TuitionPaymentFragmentbindingInflater1, tostreamspec.TuitionPaymentFragmentbindingInflater1);
        }
    }

    static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements ObjectEncoder<LogEventDropped> {
        static final TuitionPaymentFragmentspecialinlinedviewModeldefault1 TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        private static final FieldDescriptor b = FieldDescriptor.builder("eventsDroppedCount").withProperty(AtProtobuf.builder().tag(1).build()).build();
        private static final FieldDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault3 = FieldDescriptor.builder("reason").withProperty(AtProtobuf.builder().tag(3).build()).build();

        private TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            LogEventDropped logEventDropped = (LogEventDropped) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(b, logEventDropped.TuitionPaymentFragmentbindingInflater1);
            objectEncoderContext2.add(TuitionPaymentFragmentspecialinlinedviewModeldefault3, logEventDropped.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        }
    }

    static final class b implements ObjectEncoder<AutoValue_AttachedSurfaceInfo> {
        static final b b = new b();
        private static final FieldDescriptor TuitionPaymentFragmentbindingInflater1 = FieldDescriptor.builder("storageMetrics").withProperty(AtProtobuf.builder().tag(1).build()).build();

        private b() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            objectEncoderContext.add(TuitionPaymentFragmentbindingInflater1, ((AutoValue_AttachedSurfaceInfo) obj).TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        }
    }

    static final class a implements ObjectEncoder<getValueClass> {
        static final a TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new a();
        private static final FieldDescriptor TuitionPaymentFragmentspecialinlinedviewModeldefault3 = FieldDescriptor.builder("currentCacheSizeBytes").withProperty(AtProtobuf.builder().tag(1).build()).build();
        private static final FieldDescriptor b = FieldDescriptor.builder("maxCacheSizeBytes").withProperty(AtProtobuf.builder().tag(2).build()).build();

        private a() {
        }

        @Override // com.google.firebase.encoders.Encoder
        public final /* synthetic */ void encode(Object obj, ObjectEncoderContext objectEncoderContext) throws IOException {
            getValueClass getvalueclass = (getValueClass) obj;
            ObjectEncoderContext objectEncoderContext2 = objectEncoderContext;
            objectEncoderContext2.add(TuitionPaymentFragmentspecialinlinedviewModeldefault3, getvalueclass.b);
            objectEncoderContext2.add(b, getvalueclass.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        }
    }
}
