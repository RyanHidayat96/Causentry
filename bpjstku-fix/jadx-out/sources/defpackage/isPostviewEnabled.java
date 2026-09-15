package defpackage;

import android.net.TrafficStats;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.datadog.android.DatadogSite;
import com.datadog.android.api.InternalLogger;
import defpackage.isPostviewEnabled;
import defpackage.submitStillCaptureRequest;
import java.io.IOException;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u000e2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0015\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0013\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0015\u0010\u001b\u001a\u00020\b8CX\u0083\u0084\u0002¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"LisPostviewEnabled;", "LlambdacreatePipeline3androidxcameracoreImageCapture;", "LImageAnalysisBlockingAnalyzer1;", "p0", "Lcom/datadog/android/api/InternalLogger;", "p1", "Lokhttp3/Call$Factory;", "p2", "", "p3", "LconvertYuvToJpegBytesIntoSurface;", "p4", "<init>", "(LImageAnalysisBlockingAnalyzer1;Lcom/datadog/android/api/InternalLogger;Lokhttp3/Call$Factory;Ljava/lang/String;LconvertYuvToJpegBytesIntoSurface;)V", "LrecalculateTransformMatrixAndCropRect;", "", "LImageCapture;", "", "LsubmitStillCaptureRequest;", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "(LrecalculateTransformMatrixAndCropRect;Ljava/util/List;)LsubmitStillCaptureRequest;", "b", "LconvertYuvToJpegBytesIntoSurface;", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "Lokhttp3/Call$Factory;", "TuitionPaymentFragmentbindingInflater1", "Lcom/datadog/android/api/InternalLogger;", "asInterface", "LImageAnalysisBlockingAnalyzer1;", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "Ljava/lang/String;", "a", "Lkotlin/Lazy;"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class isPostviewEnabled implements lambdacreatePipeline3androidxcameracoreImageCapture {
    private final InternalLogger TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    private final Call.Factory b;
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Lazy asInterface;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    private final ImageAnalysisBlockingAnalyzer1 TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final convertYuvToJpegBytesIntoSurface TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    public isPostviewEnabled(ImageAnalysisBlockingAnalyzer1 imageAnalysisBlockingAnalyzer1, InternalLogger internalLogger, Call.Factory factory, String str, convertYuvToJpegBytesIntoSurface convertyuvtojpegbytesintosurface) {
        Intrinsics.checkNotNullParameter(imageAnalysisBlockingAnalyzer1, "");
        Intrinsics.checkNotNullParameter(internalLogger, "");
        Intrinsics.checkNotNullParameter(factory, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(convertyuvtojpegbytesintosurface, "");
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = imageAnalysisBlockingAnalyzer1;
        this.TuitionPaymentFragmentbindingInflater1 = internalLogger;
        this.b = factory;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = convertyuvtojpegbytesintosurface;
        this.asInterface = LazyKt.lazy(new Function0<String>() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$userAgent$2
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
            public final String invoke() throws IOException {
                String strB = isPostviewEnabled.b(this.this$0, System.getProperty("http.agent"));
                isPostviewEnabled ispostviewenabled = this.this$0;
                if (StringsKt.isBlank(strB)) {
                    String str2 = ispostviewenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                    String strD = ispostviewenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault1.d();
                    String strTuitionPaymentFragmentbindingInflater1 = ispostviewenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ispostviewenabled.TuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                    StringBuilder sb = new StringBuilder("Datadog/");
                    sb.append(str2);
                    sb.append(" (Linux; U; Android ");
                    sb.append(strD);
                    sb.append("; ");
                    sb.append(strTuitionPaymentFragmentbindingInflater1);
                    sb.append(" Build/");
                    sb.append(strTuitionPaymentFragmentspecialinlinedviewModeldefault3);
                    sb.append(")");
                    strB = sb.toString();
                }
                return strB;
            }

            {
                super(0);
            }
        });
    }

    public static final /* synthetic */ String b(isPostviewEnabled ispostviewenabled, String str) throws IOException {
        String string;
        if (str != null) {
            String str2 = str;
            StringBuilder sb = new StringBuilder();
            int length = str2.length();
            for (int i = 0; i < length; i++) {
                char cCharAt = str2.charAt(i);
                if (cCharAt == '\t' || (' ' <= cCharAt && cCharAt < 127)) {
                    sb.append(cCharAt);
                }
            }
            string = sb.toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
        } else {
            string = null;
        }
        return string == null ? "" : string;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x00df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0084 A[Catch: all -> 0x01a6, IOException -> 0x01c1, UnknownHostException -> 0x01de, TryCatch #3 {UnknownHostException -> 0x01de, IOException -> 0x01c1, all -> 0x01a6, blocks: (B:4:0x0017, B:5:0x0023, B:7:0x002a, B:11:0x0041, B:13:0x0045, B:16:0x004f, B:18:0x0058, B:19:0x005b, B:21:0x0061, B:28:0x0072, B:29:0x0075, B:30:0x007e, B:34:0x008d, B:35:0x00b3, B:37:0x00b9, B:39:0x00df, B:40:0x00f4, B:41:0x00f8, B:59:0x014a, B:60:0x014d, B:61:0x0177, B:62:0x0181, B:63:0x018b, B:64:0x0194, B:65:0x019d, B:33:0x0084), top: B:148:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b9 A[Catch: all -> 0x01a6, IOException -> 0x01c1, UnknownHostException -> 0x01de, TryCatch #3 {UnknownHostException -> 0x01de, IOException -> 0x01c1, all -> 0x01a6, blocks: (B:4:0x0017, B:5:0x0023, B:7:0x002a, B:11:0x0041, B:13:0x0045, B:16:0x004f, B:18:0x0058, B:19:0x005b, B:21:0x0061, B:28:0x0072, B:29:0x0075, B:30:0x007e, B:34:0x008d, B:35:0x00b3, B:37:0x00b9, B:39:0x00df, B:40:0x00f4, B:41:0x00f8, B:59:0x014a, B:60:0x014d, B:61:0x0177, B:62:0x0181, B:63:0x018b, B:64:0x0194, B:65:0x019d, B:33:0x0084), top: B:148:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x012a  */
    /* JADX WARN: Code duplicated, block: B:45:0x012e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0132  */
    /* JADX WARN: Code duplicated, block: B:49:0x0136  */
    /* JADX WARN: Code duplicated, block: B:51:0x013a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0177 A[Catch: all -> 0x01a6, IOException -> 0x01c1, UnknownHostException -> 0x01de, TryCatch #3 {UnknownHostException -> 0x01de, IOException -> 0x01c1, all -> 0x01a6, blocks: (B:4:0x0017, B:5:0x0023, B:7:0x002a, B:11:0x0041, B:13:0x0045, B:16:0x004f, B:18:0x0058, B:19:0x005b, B:21:0x0061, B:28:0x0072, B:29:0x0075, B:30:0x007e, B:34:0x008d, B:35:0x00b3, B:37:0x00b9, B:39:0x00df, B:40:0x00f4, B:41:0x00f8, B:59:0x014a, B:60:0x014d, B:61:0x0177, B:62:0x0181, B:63:0x018b, B:64:0x0194, B:65:0x019d, B:33:0x0084), top: B:148:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0181 A[Catch: all -> 0x01a6, IOException -> 0x01c1, UnknownHostException -> 0x01de, TryCatch #3 {UnknownHostException -> 0x01de, IOException -> 0x01c1, all -> 0x01a6, blocks: (B:4:0x0017, B:5:0x0023, B:7:0x002a, B:11:0x0041, B:13:0x0045, B:16:0x004f, B:18:0x0058, B:19:0x005b, B:21:0x0061, B:28:0x0072, B:29:0x0075, B:30:0x007e, B:34:0x008d, B:35:0x00b3, B:37:0x00b9, B:39:0x00df, B:40:0x00f4, B:41:0x00f8, B:59:0x014a, B:60:0x014d, B:61:0x0177, B:62:0x0181, B:63:0x018b, B:64:0x0194, B:65:0x019d, B:33:0x0084), top: B:148:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x018b A[Catch: all -> 0x01a6, IOException -> 0x01c1, UnknownHostException -> 0x01de, TryCatch #3 {UnknownHostException -> 0x01de, IOException -> 0x01c1, all -> 0x01a6, blocks: (B:4:0x0017, B:5:0x0023, B:7:0x002a, B:11:0x0041, B:13:0x0045, B:16:0x004f, B:18:0x0058, B:19:0x005b, B:21:0x0061, B:28:0x0072, B:29:0x0075, B:30:0x007e, B:34:0x008d, B:35:0x00b3, B:37:0x00b9, B:39:0x00df, B:40:0x00f4, B:41:0x00f8, B:59:0x014a, B:60:0x014d, B:61:0x0177, B:62:0x0181, B:63:0x018b, B:64:0x0194, B:65:0x019d, B:33:0x0084), top: B:148:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0194 A[Catch: all -> 0x01a6, IOException -> 0x01c1, UnknownHostException -> 0x01de, TryCatch #3 {UnknownHostException -> 0x01de, IOException -> 0x01c1, all -> 0x01a6, blocks: (B:4:0x0017, B:5:0x0023, B:7:0x002a, B:11:0x0041, B:13:0x0045, B:16:0x004f, B:18:0x0058, B:19:0x005b, B:21:0x0061, B:28:0x0072, B:29:0x0075, B:30:0x007e, B:34:0x008d, B:35:0x00b3, B:37:0x00b9, B:39:0x00df, B:40:0x00f4, B:41:0x00f8, B:59:0x014a, B:60:0x014d, B:61:0x0177, B:62:0x0181, B:63:0x018b, B:64:0x0194, B:65:0x019d, B:33:0x0084), top: B:148:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x019d A[Catch: all -> 0x01a6, IOException -> 0x01c1, UnknownHostException -> 0x01de, TRY_LEAVE, TryCatch #3 {UnknownHostException -> 0x01de, IOException -> 0x01c1, all -> 0x01a6, blocks: (B:4:0x0017, B:5:0x0023, B:7:0x002a, B:11:0x0041, B:13:0x0045, B:16:0x004f, B:18:0x0058, B:19:0x005b, B:21:0x0061, B:28:0x0072, B:29:0x0075, B:30:0x007e, B:34:0x008d, B:35:0x00b3, B:37:0x00b9, B:39:0x00df, B:40:0x00f4, B:41:0x00f8, B:59:0x014a, B:60:0x014d, B:61:0x0177, B:62:0x0181, B:63:0x018b, B:64:0x0194, B:65:0x019d, B:33:0x0084), top: B:148:0x0017 }] */
    @Override // defpackage.lambdacreatePipeline3androidxcameracoreImageCapture
    public final submitStillCaptureRequest TuitionPaymentFragmentspecialinlinedviewModeldefault3(final recalculateTransformMatrixAndCropRect recalculatetransformmatrixandcroprect, List<ImageCapture> list) {
        final submitStillCaptureRequest.onTransact ontransact;
        InternalLogger.Level level;
        List<? extends InternalLogger.Target> listListOf;
        Object next;
        Request.Builder builderPost;
        final int iCode;
        String key;
        String value;
        String lowerCase;
        int i;
        Intrinsics.checkNotNullParameter(recalculatetransformmatrixandcroprect, "");
        Intrinsics.checkNotNullParameter(list, "");
        try {
            final setProcessedImageReaderProxy setprocessedimagereaderproxyTuitionPaymentFragmentspecialinlinedviewModeldefault2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2(recalculatetransformmatrixandcroprect, list);
            try {
                Iterator<T> it = setprocessedimagereaderproxyTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!StringsKt.equals((String) ((Map.Entry) next).getKey(), "DD-API-KEY", true));
                Map.Entry entry = (Map.Entry) next;
                String str = entry != null ? (String) entry.getValue() : null;
                if (str != null) {
                    if (str.length() != 0) {
                        String str2 = str;
                        while (true) {
                            if (i < str2.length()) {
                                char cCharAt = str2.charAt(i);
                                i = (cCharAt == '\t' || (' ' <= cCharAt && cCharAt < 127)) ? i + 1 : 0;
                            } else {
                                builderPost = new Request.Builder().url(setprocessedimagereaderproxyTuitionPaymentFragmentspecialinlinedviewModeldefault2.d).post(RequestBody.Companion.create$default(RequestBody.INSTANCE, setprocessedimagereaderproxyTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, setprocessedimagereaderproxyTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null ? MediaType.INSTANCE.parse(setprocessedimagereaderproxyTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) : null, 0, 0, 6, (Object) null));
                                for (Map.Entry<String, String> entry2 : setprocessedimagereaderproxyTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentbindingInflater1.entrySet()) {
                                    key = entry2.getKey();
                                    value = entry2.getValue();
                                    Locale locale = Locale.US;
                                    Intrinsics.checkNotNullExpressionValue(locale, "");
                                    lowerCase = key.toLowerCase(locale);
                                    Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                                    if (Intrinsics.areEqual(lowerCase, "user-agent")) {
                                        builderPost.addHeader(key, value);
                                    } else {
                                        this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$buildOkHttpRequest$1
                                            @Override // kotlin.jvm.functions.Function0
                                            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                                            public final String invoke() {
                                                return "Ignoring provided User-Agent header, because it is reserved.";
                                            }
                                        }, null, false, null);
                                    }
                                }
                                builderPost.addHeader("User-Agent", (String) this.asInterface.getValue());
                                Request requestBuild = builderPost.build();
                                TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
                                Response responseTuitionPaymentFragmentspecialinlinedviewModeldefault2 = AutoValue_Bitmap2JpegBytes_In.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b.newCall(requestBuild));
                                responseTuitionPaymentFragmentspecialinlinedviewModeldefault2.close();
                                iCode = responseTuitionPaymentFragmentspecialinlinedviewModeldefault2.code();
                                if (iCode == 202) {
                                    ontransact = new submitStillCaptureRequest.g(iCode);
                                } else if (iCode != 403) {
                                    ontransact = new submitStillCaptureRequest.d(iCode);
                                } else if (iCode != 408) {
                                    ontransact = new submitStillCaptureRequest.TuitionPaymentFragmentbindingInflater1(iCode);
                                } else if (iCode != 413) {
                                    ontransact = new submitStillCaptureRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(iCode);
                                } else if (iCode == 429) {
                                    ontransact = new submitStillCaptureRequest.TuitionPaymentFragmentbindingInflater1(iCode);
                                } else if (iCode == 500) {
                                    ontransact = new submitStillCaptureRequest.asInterface(iCode);
                                } else {
                                    ontransact = new submitStillCaptureRequest.asInterface(iCode);
                                }
                            }
                        }
                    }
                    ontransact = new submitStillCaptureRequest.d(0);
                } else {
                    builderPost = new Request.Builder().url(setprocessedimagereaderproxyTuitionPaymentFragmentspecialinlinedviewModeldefault2.d).post(RequestBody.Companion.create$default(RequestBody.INSTANCE, setprocessedimagereaderproxyTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1, setprocessedimagereaderproxyTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2 != null ? MediaType.INSTANCE.parse(setprocessedimagereaderproxyTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault2) : null, 0, 0, 6, (Object) null));
                    while (r8.hasNext()) {
                        key = entry2.getKey();
                        value = entry2.getValue();
                        Locale locale2 = Locale.US;
                        Intrinsics.checkNotNullExpressionValue(locale2, "");
                        lowerCase = key.toLowerCase(locale2);
                        Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                        if (Intrinsics.areEqual(lowerCase, "user-agent")) {
                            builderPost.addHeader(key, value);
                        } else {
                            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$buildOkHttpRequest$1
                                @Override // kotlin.jvm.functions.Function0
                                /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                                public final String invoke() {
                                    return "Ignoring provided User-Agent header, because it is reserved.";
                                }
                            }, null, false, null);
                        }
                    }
                    builderPost.addHeader("User-Agent", (String) this.asInterface.getValue());
                    Request requestBuild2 = builderPost.build();
                    TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
                    Response responseTuitionPaymentFragmentspecialinlinedviewModeldefault3 = AutoValue_Bitmap2JpegBytes_In.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this.b.newCall(requestBuild2));
                    responseTuitionPaymentFragmentspecialinlinedviewModeldefault3.close();
                    iCode = responseTuitionPaymentFragmentspecialinlinedviewModeldefault3.code();
                    if (iCode == 202) {
                        if (iCode != 403) {
                            if (iCode != 408) {
                                if (iCode != 413) {
                                    if (iCode == 429) {
                                        if (iCode == 500 && iCode != 507) {
                                            if (iCode != 400) {
                                                if (iCode == 401) {
                                                    ontransact = new submitStillCaptureRequest.d(iCode);
                                                } else {
                                                    switch (iCode) {
                                                        case TypedValues.PositionType.TYPE_DRAWPATH /* 502 */:
                                                        case TypedValues.PositionType.TYPE_PERCENT_WIDTH /* 503 */:
                                                        case TypedValues.PositionType.TYPE_PERCENT_HEIGHT /* 504 */:
                                                            ontransact = new submitStillCaptureRequest.asInterface(iCode);
                                                            break;
                                                        default:
                                                            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.WARN, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.MAINTAINER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$responseCodeToUploadStatus$1
                                                                @Override // kotlin.jvm.functions.Function0
                                                                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                                                                public final String invoke() {
                                                                    int i2 = iCode;
                                                                    String str3 = setprocessedimagereaderproxyTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                                    StringBuilder sb = new StringBuilder("Unexpected status code ");
                                                                    sb.append(i2);
                                                                    sb.append(" on upload request: ");
                                                                    sb.append(str3);
                                                                    return sb.toString();
                                                                }

                                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                                {
                                                                    super(0);
                                                                }
                                                            }, null, false, null);
                                                            ontransact = new submitStillCaptureRequest.cancelAll(iCode);
                                                            break;
                                                    }
                                                }
                                            } else {
                                                ontransact = new submitStillCaptureRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(iCode);
                                            }
                                        } else {
                                            ontransact = new submitStillCaptureRequest.asInterface(iCode);
                                        }
                                    } else {
                                        ontransact = new submitStillCaptureRequest.TuitionPaymentFragmentbindingInflater1(iCode);
                                    }
                                } else {
                                    ontransact = new submitStillCaptureRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(iCode);
                                }
                            } else {
                                ontransact = new submitStillCaptureRequest.TuitionPaymentFragmentbindingInflater1(iCode);
                            }
                        } else {
                            ontransact = new submitStillCaptureRequest.d(iCode);
                        }
                    } else {
                        ontransact = new submitStillCaptureRequest.g(iCode);
                    }
                }
            } catch (UnknownHostException e2) {
                UnknownHostException unknownHostException = e2;
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$upload$uploadStatus$1
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                    public final String invoke() throws Throwable {
                        DatadogSite datadogSiteTuitionPaymentFragmentspecialinlinedviewModeldefault2 = recalculatetransformmatrixandcroprect.TuitionPaymentFragmentspecialinlinedviewModeldefault2();
                        StringBuilder sb = new StringBuilder("Unable to find host for site ");
                        sb.append(datadogSiteTuitionPaymentFragmentspecialinlinedviewModeldefault2);
                        sb.append("; we will retry later.");
                        return sb.toString();
                    }

                    {
                        super(0);
                    }
                }, unknownHostException, false, null);
                ontransact = new submitStillCaptureRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2(unknownHostException);
            } catch (IOException e3) {
                IOException iOException = e3;
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$upload$uploadStatus$2
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Unable to execute the request; we will retry later.";
                    }
                }, iOException, false, null);
                ontransact = new submitStillCaptureRequest.asBinder(iOException);
            } catch (Throwable th) {
                this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$upload$uploadStatus$3
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                    public final String invoke() {
                        return "Unable to execute the request; we will retry later.";
                    }
                }, th, false, null);
                ontransact = new submitStillCaptureRequest.onTransact(th);
            }
            final String str3 = setprocessedimagereaderproxyTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            final int length = setprocessedimagereaderproxyTuitionPaymentFragmentspecialinlinedviewModeldefault2.TuitionPaymentFragmentspecialinlinedviewModeldefault1.length;
            InternalLogger internalLogger = this.TuitionPaymentFragmentbindingInflater1;
            final String str4 = setprocessedimagereaderproxyTuitionPaymentFragmentspecialinlinedviewModeldefault2.b;
            Intrinsics.checkNotNullParameter(str3, "");
            Intrinsics.checkNotNullParameter(internalLogger, "");
            boolean z = ontransact instanceof submitStillCaptureRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            if (z || (ontransact instanceof submitStillCaptureRequest.asInterface) || (ontransact instanceof submitStillCaptureRequest.d) || (ontransact instanceof submitStillCaptureRequest.a) || (ontransact instanceof submitStillCaptureRequest.onTransact) || (ontransact instanceof submitStillCaptureRequest.cancelAll)) {
                level = InternalLogger.Level.ERROR;
            } else if ((ontransact instanceof submitStillCaptureRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2) || (ontransact instanceof submitStillCaptureRequest.TuitionPaymentFragmentbindingInflater1) || (ontransact instanceof submitStillCaptureRequest.b) || (ontransact instanceof submitStillCaptureRequest.asBinder)) {
                level = InternalLogger.Level.WARN;
            } else {
                level = ontransact instanceof submitStillCaptureRequest.g ? InternalLogger.Level.INFO : InternalLogger.Level.VERBOSE;
            }
            if (z || (ontransact instanceof submitStillCaptureRequest.TuitionPaymentFragmentbindingInflater1)) {
                listListOf = CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY});
            } else {
                listListOf = ((ontransact instanceof submitStillCaptureRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault2) || (ontransact instanceof submitStillCaptureRequest.b) || (ontransact instanceof submitStillCaptureRequest.asInterface) || (ontransact instanceof submitStillCaptureRequest.d) || (ontransact instanceof submitStillCaptureRequest.asBinder) || (ontransact instanceof submitStillCaptureRequest.a) || (ontransact instanceof submitStillCaptureRequest.g) || (ontransact instanceof submitStillCaptureRequest.onTransact) || (ontransact instanceof submitStillCaptureRequest.cancelAll)) ? CollectionsKt.listOf(InternalLogger.Target.USER) : CollectionsKt.emptyList();
            }
            internalLogger.TuitionPaymentFragmentspecialinlinedviewModeldefault1(level, listListOf, new Function0<String>() { // from class: com.datadog.android.core.internal.data.upload.UploadStatus$logStatus$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    submitStillCaptureRequest submitstillcapturerequest = ontransact;
                    return submitStillCaptureRequest.TuitionPaymentFragmentspecialinlinedviewModeldefault3(submitstillcapturerequest, str4, length, str3, submitstillcapturerequest.TuitionPaymentFragmentbindingInflater1);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }
            }, null, false, null);
            return ontransact;
        } catch (Exception e4) {
            Exception exc = e4;
            this.TuitionPaymentFragmentbindingInflater1.TuitionPaymentFragmentspecialinlinedviewModeldefault1(InternalLogger.Level.ERROR, CollectionsKt.listOf((Object[]) new InternalLogger.Target[]{InternalLogger.Target.USER, InternalLogger.Target.TELEMETRY}), new Function0<String>() { // from class: com.datadog.android.core.internal.data.upload.DataOkHttpUploader$upload$request$1
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final String invoke() {
                    return "Unable to create the request, probably due to bad data format. The batch will be dropped.";
                }
            }, exc, false, null);
            return new submitStillCaptureRequest.a(exc);
        }
    }
}
