package defpackage;

import com.datadog.android.api.InternalLogger;
import com.datadog.android.core.metrics.MethodCallSamplingRate;
import com.datadog.android.privacy.TrackingConsent;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0014B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0014\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00172\u0006\u0010\u0006\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u001d*\u00020\u00172\u0006\u0010\u0004\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u001eJ\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0003*\u00020\u0017H\u0002¢\u0006\u0004\b\u0014\u0010\u001fR\u0014\u0010\u0014\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010!R\u0014\u0010\u0015\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0014\u0010\u0012\u001a\u00020#8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010$R\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0016\u0010)\u001a\u0004\u0018\u00010\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010+\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010*"}, d2 = {"LsetBufferFormat;", "LImageCaptureExternalSyntheticLambda5;", "LImageCaptureExternalSyntheticLambda3$TuitionPaymentFragmentspecialinlinedviewModeldefault2;", "", "p0", "LgetSupportedEffectTargets;", "p1", "LgetSaveCollection;", "p2", "Lcom/datadog/android/api/InternalLogger;", "p3", "LgetInputImage;", "p4", "LImageReaderProxyProvider;", "p5", "<init>", "(Ljava/lang/String;LgetSupportedEffectTargets;LgetSaveCollection;Lcom/datadog/android/api/InternalLogger;LgetInputImage;LImageReaderProxyProvider;)V", "", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "()V", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "TuitionPaymentFragmentbindingInflater1", "Ljava/io/File;", "LImageCaptureExternalSyntheticLambda1;", "(Ljava/io/File;LImageCaptureExternalSyntheticLambda1;)V", "LImageCaptureBuilder;", "b", "(Ljava/io/File;LImageCaptureBuilder;)V", "", "(Ljava/io/File;Lcom/datadog/android/api/InternalLogger;)Ljava/lang/Long;", "(Ljava/io/File;)Ljava/lang/String;", "LgetInputImage;", "LgetSaveCollection;", "Lcom/datadog/android/api/InternalLogger;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "asInterface", "LImageReaderProxyProvider;", "g", "Ljava/lang/String;", "a", "LgetSupportedEffectTargets;", "d"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class setBufferFormat implements ImageCaptureExternalSyntheticLambda5, ImageCaptureExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2 {

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    private final AtomicBoolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final InternalLogger TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    private final getInputImage TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final getSupportedEffectTargets d;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final ImageReaderProxyProvider TuitionPaymentFragmentbindingInflater1;
    private final getSaveCollection b;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final String a;

    @Override // ImageCaptureExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2
    public final void TuitionPaymentFragmentbindingInflater1() {
    }

    @Override // ImageCaptureExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x004d A[PHI: r3
  0x004d: PHI (r3v4 java.lang.String) = (r3v3 java.lang.String), (r3v5 java.lang.String) binds: [B:15:0x004b, B:12:0x0042] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x005a  */
    private setBufferFormat(String str, getSupportedEffectTargets getsupportedeffecttargets, getSaveCollection getsavecollection, InternalLogger internalLogger, getInputImage getinputimage, ImageReaderProxyProvider imageReaderProxyProvider) {
        String str2;
        String str3;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(getsavecollection, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(getinputimage, "");
        Intrinsics.checkNotNullParameter(imageReaderProxyProvider, "");
        this.d = getsupportedeffecttargets;
        this.b = getsavecollection;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = internalLogger;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = getinputimage;
        this.TuitionPaymentFragmentbindingInflater1 = imageReaderProxyProvider;
        switch (str.hashCode()) {
            case -1067396926:
                if (!str.equals("tracing")) {
                    str2 = null;
                } else {
                    str2 = "trace";
                }
                break;
            case 113290:
                str3 = "rum";
                if (!str.equals("rum")) {
                    str2 = null;
                } else {
                    str2 = str3;
                }
                break;
            case 3327407:
                str3 = "logs";
                if (!str.equals("logs")) {
                    str2 = null;
                } else {
                    str2 = str3;
                }
                break;
            case 456014590:
                if (!str.equals("session-replay")) {
                    str2 = null;
                } else {
                    str2 = "sr";
                }
                break;
            case 2144122390:
                if (!str.equals("session-replay-resources")) {
                    str2 = null;
                } else {
                    str2 = "sr-resources";
                }
                break;
            default:
                str2 = null;
                break;
        }
        this.a = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new AtomicBoolean(true);
    }

    public /* synthetic */ setBufferFormat(String str, getSupportedEffectTargets getsupportedeffecttargets, getSaveCollection getsavecollection, InternalLogger internalLogger, getInputImage getinputimage, createIsolatedReader createisolatedreader, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, getsupportedeffecttargets, getsavecollection, internalLogger, getinputimage, (i & 32) != 0 ? new createIsolatedReader(1.5f) : createisolatedreader);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00cc  */
    @Override // defpackage.ImageCaptureExternalSyntheticLambda5
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2(File p0, ImageCaptureExternalSyntheticLambda1 p1) {
        Map<String, ? extends Object> mapMapOf;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if (this.a != null && this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2() && ImageCaptureOutputFileResults.TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3)) {
            Long lTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(p0, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            if (lTuitionPaymentFragmentbindingInflater1 != null) {
                long jLongValue = p1.TuitionPaymentFragmentspecialinlinedviewModeldefault3 - lTuitionPaymentFragmentbindingInflater1.longValue();
                if (jLongValue >= 0) {
                    mapMapOf = MapsKt.mapOf(TuplesKt.to("track", this.a), TuplesKt.to("metric_type", "batch closed"), TuplesKt.to("batch_duration", Long.valueOf(jLongValue)), TuplesKt.to("uploader_window", Long.valueOf(this.b.g)), TuplesKt.to("batch_size", Long.valueOf(ImageCaptureOutputFileResults.d(p0, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3))), TuplesKt.to("batch_events_count", Long.valueOf(p1.TuitionPaymentFragmentbindingInflater1)), TuplesKt.to("forced_new", Boolean.valueOf(p1.TuitionPaymentFragmentspecialinlinedviewModeldefault2)), TuplesKt.to("consent", TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0)), TuplesKt.to("filename", p0.getName()), TuplesKt.to("thread", Thread.currentThread().getName()));
                } else {
                    mapMapOf = null;
                }
            } else {
                mapMapOf = null;
            }
            if (mapMapOf != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function0<String>() { // from class: com.datadog.android.core.internal.metrics.BatchMetricsDispatcher$sendBatchClosedMetric$1$1
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "[Mobile Metric] Batch Closed";
                    }
                }, mapMapOf, MethodCallSamplingRate.LOW.getRate());
            }
        }
    }

    @Override // ImageCaptureExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(false);
    }

    @Override // ImageCaptureExternalSyntheticLambda3.TuitionPaymentFragmentspecialinlinedviewModeldefault2
    public final void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.set(true);
    }

    private static Long TuitionPaymentFragmentbindingInflater1(final File file, InternalLogger internalLogger) {
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        Long longOrNull = StringsKt.toLongOrNull(name);
        if (longOrNull == null) {
            internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.metrics.BatchMetricsDispatcher$nameAsTimestampSafe$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    String str = String.format(Locale.ENGLISH, "Unable to parse the file name as a timestamp: %s", Arrays.copyOf(new Object[]{file.getName()}, 1));
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    return str;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, null, false, null);
        }
        return longOrNull;
    }

    private static String TuitionPaymentFragmentspecialinlinedviewModeldefault2(File file) {
        File parentFile = file.getParentFile();
        String name = parentFile != null ? parentFile.getName() : null;
        if (name == null) {
            return null;
        }
        String str = name;
        getTakePictureRequest.Companion companion = getTakePictureRequest.INSTANCE;
        if (getTakePictureRequest.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2().matches(str)) {
            String string = TrackingConsent.PENDING.toString();
            Locale locale = Locale.US;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = string.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            return lowerCase;
        }
        getTakePictureRequest.Companion companion2 = getTakePictureRequest.INSTANCE;
        if (!getTakePictureRequest.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3().matches(str)) {
            return null;
        }
        String string2 = TrackingConsent.GRANTED.toString();
        Locale locale2 = Locale.US;
        Intrinsics.checkNotNullExpressionValue(locale2, "");
        String lowerCase2 = string2.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
        return lowerCase2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ImageCaptureExternalSyntheticLambda5
    public final void b(File p0, ImageCaptureBuilder p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        if ((!(p1 instanceof ImageCaptureBuilder.b)) && this.a != null && this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault2()) {
            Long lTuitionPaymentFragmentbindingInflater1 = TuitionPaymentFragmentbindingInflater1(p0, this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
            Map<String, ? extends Object> mapMapOf = null;
            mapMapOf = null;
            if (lTuitionPaymentFragmentbindingInflater1 != null) {
                long jTuitionPaymentFragmentspecialinlinedviewModeldefault1 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1() - lTuitionPaymentFragmentbindingInflater1.longValue();
                if (jTuitionPaymentFragmentspecialinlinedviewModeldefault1 >= 0) {
                    Pair[] pairArr = new Pair[10];
                    pairArr[0] = TuplesKt.to("track", this.a);
                    pairArr[1] = TuplesKt.to("metric_type", "batch deleted");
                    pairArr[2] = TuplesKt.to("batch_age", Long.valueOf(jTuitionPaymentFragmentspecialinlinedviewModeldefault1));
                    Pair[] pairArr2 = new Pair[2];
                    getSupportedEffectTargets getsupportedeffecttargets = this.d;
                    pairArr2[0] = TuplesKt.to("min", getsupportedeffecttargets != null ? Long.valueOf(getsupportedeffecttargets.b) : null);
                    getSupportedEffectTargets getsupportedeffecttargets2 = this.d;
                    pairArr2[1] = TuplesKt.to("max", getsupportedeffecttargets2 != null ? Long.valueOf(getsupportedeffecttargets2.TuitionPaymentFragmentbindingInflater1) : null);
                    pairArr[3] = TuplesKt.to("uploader_delay", MapsKt.mapOf(pairArr2));
                    pairArr[4] = TuplesKt.to("uploader_window", Long.valueOf(this.b.g));
                    pairArr[5] = TuplesKt.to("batch_removal_reason", p1.toString());
                    pairArr[6] = TuplesKt.to("in_background", Boolean.valueOf(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.get()));
                    pairArr[7] = TuplesKt.to("consent", TuitionPaymentFragmentspecialinlinedviewModeldefault2(p0));
                    pairArr[8] = TuplesKt.to("filename", p0.getName());
                    pairArr[9] = TuplesKt.to("thread", Thread.currentThread().getName());
                    mapMapOf = MapsKt.mapOf(pairArr);
                }
            }
            if (mapMapOf != null) {
                this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new Function0<String>() { // from class: com.datadog.android.core.internal.metrics.BatchMetricsDispatcher$sendBatchDeletedMetric$1$1
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "[Mobile Metric] Batch Deleted";
                    }
                }, mapMapOf, MethodCallSamplingRate.LOW.getRate());
            }
        }
    }
}
