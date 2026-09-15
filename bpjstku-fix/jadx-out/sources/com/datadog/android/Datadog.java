package com.datadog.android;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.core.view.ViewCompat;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.SdkCore;
import com.datadog.android.core.configuration.Configuration;
import com.datadog.android.core.internal.CoreFeature$prepareNdkCrashData$1;
import com.datadog.android.core.internal.system.BroadcastReceiverSystemInfoProvider;
import com.datadog.android.privacy.TrackingConsent;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.android.material.search.SearchBarAnimationHelper$$ExternalSyntheticLambda0;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.ImageAnalysisBlockingAnalyzer;
import defpackage.ImageCaptureExtKttakePicture41;
import defpackage.ImageCaptureExternalSyntheticLambda3;
import defpackage.ImageProcessingUtilExternalSyntheticLambda1;
import defpackage.ImageProcessorOutputFormats;
import defpackage.ImageProcessorRequest;
import defpackage.ImageProxyDownsampler;
import defpackage.ImageReaderProxys;
import defpackage.InitializationException;
import defpackage.Logger;
import defpackage.abortImageCaptureRequests;
import defpackage.applyPixelShiftInternal;
import defpackage.convertYUVToRGBInternal;
import defpackage.copyBitmapToByteBuffer;
import defpackage.getCaptureMode;
import defpackage.getImageCaptureError;
import defpackage.getJpegQuality;
import defpackage.getPostviewResolutionSelector;
import defpackage.getRealtimeCaptureLatencyEstimate;
import defpackage.getSaveCollection;
import defpackage.getSavedUri;
import defpackage.initSession;
import defpackage.isDebugEnabled;
import defpackage.isErrorEnabled;
import defpackage.isLogLevelEnabled;
import defpackage.isProcessingPipelineEnabled;
import defpackage.isSupportedRotationDegrees;
import defpackage.isSupportedYUVFormat;
import defpackage.lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy;
import defpackage.lambdasubmitStillCaptureRequest4;
import defpackage.resizeAveraging;
import defpackage.rotateYUVInternal;
import defpackage.setIoExecutor;
import defpackage.setOutputFormat;
import defpackage.setPostviewEnabled;
import defpackage.setScreenFlashToCameraControl;
import defpackage.takePicture;
import defpackage.trySetFlashModeToCameraControl;
import defpackage.unlockFlashMode;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import okhttp3.CipherSuite;
import okhttp3.ConnectionSpec;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.TlsVersion;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u001b\u001a\u00020\u001c2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0007J(\u0010\u001e\u001a\u00020\u001f2\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010!2\b\b\u0002\u0010\"\u001a\u00020#H\u0007J\u0012\u0010$\u001a\u00020\u001f2\b\b\u0002\u0010\"\u001a\u00020#H\u0007J\b\u0010%\u001a\u00020\u001fH\u0003J\u0014\u0010&\u001a\u00020#2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0007J\b\u0010'\u001a\u00020\u0012H\u0007J\"\u0010(\u001a\u0004\u0018\u00010#2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0007J,\u0010(\u001a\u0004\u0018\u00010#2\b\u0010\u001d\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0007J\u0014\u0010/\u001a\u0002002\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0007J\u001a\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u00020.2\b\b\u0002\u0010\"\u001a\u00020#H\u0007JN\u00103\u001a\u00020\u001f2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00042\u0016\b\u0002\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00010!2\b\b\u0002\u0010\"\u001a\u00020#H\u0007J\u0010\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u00020\u0012H\u0007J\u0014\u00109\u001a\u00020\u001f2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0080T¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u0018X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006:"}, d2 = {"Lcom/datadog/android/Datadog;", "", "()V", "CANNOT_CREATE_SDK_INSTANCE_ID_ERROR", "", "DD_APP_VERSION_TAG", "DD_NATIVE_SOURCE_TYPE", "DD_SDK_VERSION_TAG", "DD_SOURCE_TAG", "MESSAGE_ALREADY_INITIALIZED", "MESSAGE_SDK_NOT_INITIALIZED", "hashGenerator", "Lcom/datadog/android/core/internal/HashGenerator;", "getHashGenerator$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/HashGenerator;", "setHashGenerator$dd_sdk_android_core_release", "(Lcom/datadog/android/core/internal/HashGenerator;)V", "libraryVerbosity", "", "getLibraryVerbosity$dd_sdk_android_core_release", "()I", "setLibraryVerbosity$dd_sdk_android_core_release", "(I)V", "registry", "Lcom/datadog/android/core/internal/SdkCoreRegistry;", "getRegistry$dd_sdk_android_core_release", "()Lcom/datadog/android/core/internal/SdkCoreRegistry;", "_internalProxy", "Lcom/datadog/android/_InternalProxy;", "instanceName", "addUserProperties", "", "extraInfo", "", "sdkCore", "Lcom/datadog/android/api/SdkCore;", "clearAllData", "flushAndShutdownExecutors", "getInstance", "getVerbosity", "initialize", "context", "Landroid/content/Context;", "configuration", "Lcom/datadog/android/core/configuration/Configuration;", "trackingConsent", "Lcom/datadog/android/privacy/TrackingConsent;", "isInitialized", "", "setTrackingConsent", "consent", "setUserInfo", "id", "name", "email", "setVerbosity", FirebaseAnalytics.Param.LEVEL, "stopInstance", "dd-sdk-android-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class Datadog {
    private static final byte[] $$a = {14, 70, 6, -35, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 220;
    public static final Datadog b = new Datadog();
    private static final getPostviewResolutionSelector TuitionPaymentFragmentspecialinlinedviewModeldefault1 = new getPostviewResolutionSelector(resizeAveraging.b());
    private static getJpegQuality TuitionPaymentFragmentspecialinlinedviewModeldefault2 = new getRealtimeCaptureLatencyEstimate();
    private static int TuitionPaymentFragmentbindingInflater1 = Integer.MAX_VALUE;

    private static void a(short s, int i, byte b2, Object[] objArr) {
        byte[] bArr = $$a;
        int i2 = b2 * 52;
        int i3 = i + 4;
        int i4 = 103 - s;
        byte[] bArr2 = new byte[53 - i2];
        int i5 = 52 - i2;
        int i6 = -1;
        if (bArr == null) {
            i4 = (i5 + (-i4)) - 11;
            i3 = i3;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            int i8 = i3 + 1;
            if (i7 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 = (i4 + (-bArr[i8])) - 11;
            i3 = i8;
            i6 = i7;
        }
    }

    private Datadog() {
    }

    /* JADX WARN: Code duplicated, block: B:132:0x04cf A[Catch: all -> 0x0039, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x0039, blocks: (B:6:0x0024, B:13:0x0063, B:22:0x00a9, B:27:0x00b7, B:36:0x0139, B:38:0x013d, B:44:0x015e, B:47:0x01a8, B:50:0x01ae, B:52:0x01b4, B:53:0x01ba, B:55:0x01c0, B:60:0x01cf, B:81:0x027d, B:86:0x02d2, B:88:0x02f8, B:91:0x0341, B:93:0x0354, B:96:0x036c, B:98:0x0370, B:100:0x037b, B:102:0x038a, B:104:0x0393, B:106:0x03e1, B:108:0x03f0, B:109:0x0430, B:132:0x04cf, B:160:0x06ae, B:162:0x06b2, B:170:0x0707, B:173:0x0750, B:175:0x0776, B:178:0x07bd, B:180:0x07d0, B:183:0x07e8, B:185:0x07ec, B:187:0x07f7, B:189:0x0806, B:191:0x080f, B:192:0x0851, B:194:0x0860, B:195:0x08a4, B:204:0x091c, B:206:0x0922, B:207:0x0923, B:208:0x0924, B:210:0x092d, B:212:0x0934, B:213:0x0935, B:217:0x093f, B:118:0x04a6, B:120:0x04ac, B:121:0x04ad, B:122:0x04ae, B:124:0x04bb, B:126:0x04c2, B:127:0x04c3, B:39:0x0144, B:111:0x0438, B:113:0x044f, B:114:0x0497, B:176:0x0778, B:179:0x07bf, B:182:0x07d6, B:197:0x08ac, B:199:0x08c3, B:200:0x090d, B:89:0x02fa, B:92:0x0343, B:95:0x035a), top: B:450:0x0022, inners: #2, #7, #15, #17 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0529  */
    /* JADX WARN: Code duplicated, block: B:155:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:156:0x06a8  */
    /* JADX WARN: Code duplicated, block: B:164:0x06b7  */
    /* JADX WARN: Code duplicated, block: B:167:0x06c0 A[Catch: all -> 0x0e40, TRY_LEAVE, TryCatch #0 {all -> 0x0e40, blocks: (B:34:0x0105, B:42:0x014d, B:45:0x0167, B:66:0x01e2, B:70:0x01f1, B:74:0x0210, B:78:0x0228, B:84:0x02c9, B:130:0x04c9, B:133:0x0513, B:152:0x0601, B:165:0x06b8, B:167:0x06c0, B:171:0x0747, B:215:0x0939, B:218:0x0983, B:236:0x0a6f, B:77:0x0222, B:73:0x020a, B:69:0x01eb, B:65:0x01d8), top: B:427:0x0105 }] */
    /* JADX WARN: Code duplicated, block: B:169:0x0705  */
    /* JADX WARN: Code duplicated, block: B:173:0x0750 A[Catch: all -> 0x0039, TRY_ENTER, TryCatch #14 {all -> 0x0039, blocks: (B:6:0x0024, B:13:0x0063, B:22:0x00a9, B:27:0x00b7, B:36:0x0139, B:38:0x013d, B:44:0x015e, B:47:0x01a8, B:50:0x01ae, B:52:0x01b4, B:53:0x01ba, B:55:0x01c0, B:60:0x01cf, B:81:0x027d, B:86:0x02d2, B:88:0x02f8, B:91:0x0341, B:93:0x0354, B:96:0x036c, B:98:0x0370, B:100:0x037b, B:102:0x038a, B:104:0x0393, B:106:0x03e1, B:108:0x03f0, B:109:0x0430, B:132:0x04cf, B:160:0x06ae, B:162:0x06b2, B:170:0x0707, B:173:0x0750, B:175:0x0776, B:178:0x07bd, B:180:0x07d0, B:183:0x07e8, B:185:0x07ec, B:187:0x07f7, B:189:0x0806, B:191:0x080f, B:192:0x0851, B:194:0x0860, B:195:0x08a4, B:204:0x091c, B:206:0x0922, B:207:0x0923, B:208:0x0924, B:210:0x092d, B:212:0x0934, B:213:0x0935, B:217:0x093f, B:118:0x04a6, B:120:0x04ac, B:121:0x04ad, B:122:0x04ae, B:124:0x04bb, B:126:0x04c2, B:127:0x04c3, B:39:0x0144, B:111:0x0438, B:113:0x044f, B:114:0x0497, B:176:0x0778, B:179:0x07bf, B:182:0x07d6, B:197:0x08ac, B:199:0x08c3, B:200:0x090d, B:89:0x02fa, B:92:0x0343, B:95:0x035a), top: B:450:0x0022, inners: #2, #7, #15, #17 }] */
    /* JADX WARN: Code duplicated, block: B:175:0x0776 A[Catch: all -> 0x0039, TRY_LEAVE, TryCatch #14 {all -> 0x0039, blocks: (B:6:0x0024, B:13:0x0063, B:22:0x00a9, B:27:0x00b7, B:36:0x0139, B:38:0x013d, B:44:0x015e, B:47:0x01a8, B:50:0x01ae, B:52:0x01b4, B:53:0x01ba, B:55:0x01c0, B:60:0x01cf, B:81:0x027d, B:86:0x02d2, B:88:0x02f8, B:91:0x0341, B:93:0x0354, B:96:0x036c, B:98:0x0370, B:100:0x037b, B:102:0x038a, B:104:0x0393, B:106:0x03e1, B:108:0x03f0, B:109:0x0430, B:132:0x04cf, B:160:0x06ae, B:162:0x06b2, B:170:0x0707, B:173:0x0750, B:175:0x0776, B:178:0x07bd, B:180:0x07d0, B:183:0x07e8, B:185:0x07ec, B:187:0x07f7, B:189:0x0806, B:191:0x080f, B:192:0x0851, B:194:0x0860, B:195:0x08a4, B:204:0x091c, B:206:0x0922, B:207:0x0923, B:208:0x0924, B:210:0x092d, B:212:0x0934, B:213:0x0935, B:217:0x093f, B:118:0x04a6, B:120:0x04ac, B:121:0x04ad, B:122:0x04ae, B:124:0x04bb, B:126:0x04c2, B:127:0x04c3, B:39:0x0144, B:111:0x0438, B:113:0x044f, B:114:0x0497, B:176:0x0778, B:179:0x07bf, B:182:0x07d6, B:197:0x08ac, B:199:0x08c3, B:200:0x090d, B:89:0x02fa, B:92:0x0343, B:95:0x035a), top: B:450:0x0022, inners: #2, #7, #15, #17 }] */
    /* JADX WARN: Code duplicated, block: B:217:0x093f A[Catch: all -> 0x0039, TRY_ENTER, TRY_LEAVE, TryCatch #14 {all -> 0x0039, blocks: (B:6:0x0024, B:13:0x0063, B:22:0x00a9, B:27:0x00b7, B:36:0x0139, B:38:0x013d, B:44:0x015e, B:47:0x01a8, B:50:0x01ae, B:52:0x01b4, B:53:0x01ba, B:55:0x01c0, B:60:0x01cf, B:81:0x027d, B:86:0x02d2, B:88:0x02f8, B:91:0x0341, B:93:0x0354, B:96:0x036c, B:98:0x0370, B:100:0x037b, B:102:0x038a, B:104:0x0393, B:106:0x03e1, B:108:0x03f0, B:109:0x0430, B:132:0x04cf, B:160:0x06ae, B:162:0x06b2, B:170:0x0707, B:173:0x0750, B:175:0x0776, B:178:0x07bd, B:180:0x07d0, B:183:0x07e8, B:185:0x07ec, B:187:0x07f7, B:189:0x0806, B:191:0x080f, B:192:0x0851, B:194:0x0860, B:195:0x08a4, B:204:0x091c, B:206:0x0922, B:207:0x0923, B:208:0x0924, B:210:0x092d, B:212:0x0934, B:213:0x0935, B:217:0x093f, B:118:0x04a6, B:120:0x04ac, B:121:0x04ad, B:122:0x04ae, B:124:0x04bb, B:126:0x04c2, B:127:0x04c3, B:39:0x0144, B:111:0x0438, B:113:0x044f, B:114:0x0497, B:176:0x0778, B:179:0x07bf, B:182:0x07d6, B:197:0x08ac, B:199:0x08c3, B:200:0x090d, B:89:0x02fa, B:92:0x0343, B:95:0x035a), top: B:450:0x0022, inners: #2, #7, #15, #17 }] */
    /* JADX WARN: Code duplicated, block: B:221:0x0997  */
    /* JADX WARN: Code duplicated, block: B:240:0x0b12  */
    /* JADX WARN: Code duplicated, block: B:241:0x0b14  */
    /* JADX WARN: Code duplicated, block: B:248:0x0b23  */
    /* JADX WARN: Code duplicated, block: B:251:0x0b2c A[Catch: all -> 0x0e7a, TryCatch #16 {all -> 0x0e7a, blocks: (B:329:0x0e38, B:331:0x0e3e, B:332:0x0e3f, B:315:0x0e1b, B:317:0x0e21, B:318:0x0e22, B:238:0x0abd, B:245:0x0b1a, B:247:0x0b1e, B:249:0x0b24, B:251:0x0b2c, B:253:0x0b45, B:255:0x0b4b, B:257:0x0b77, B:259:0x0bb8, B:260:0x0bc2, B:261:0x0c0b, B:263:0x0c11, B:264:0x0c41, B:266:0x0c79, B:268:0x0c7d, B:270:0x0c81, B:274:0x0c8f, B:278:0x0c9a, B:281:0x0cdc, B:277:0x0c94, B:273:0x0c88, B:282:0x0cee, B:286:0x0d13, B:290:0x0d20, B:294:0x0d69, B:298:0x0d93, B:302:0x0da0, B:306:0x0de9, B:339:0x0e56, B:341:0x0e5a, B:343:0x0e63, B:347:0x0e70, B:354:0x0e86, B:356:0x0e8a, B:358:0x0e93, B:362:0x0e9e, B:361:0x0e98, B:365:0x0eaf, B:367:0x0eb3, B:369:0x0ebc, B:373:0x0ec7, B:372:0x0ec1, B:376:0x0ed2, B:379:0x0ee5, B:380:0x0eff, B:382:0x0f15, B:383:0x0f1b, B:387:0x0f21, B:389:0x0f36, B:346:0x0e6a, B:305:0x0de3, B:301:0x0d9a, B:297:0x0d8d, B:293:0x0d63, B:289:0x0d1a, B:285:0x0d0d, B:256:0x0b4e, B:309:0x0e10, B:311:0x0e16, B:312:0x0e17, B:319:0x0e23, B:320:0x0e29, B:323:0x0e2d, B:325:0x0e33, B:326:0x0e34), top: B:453:0x0103, inners: #21 }] */
    /* JADX WARN: Code duplicated, block: B:252:0x0b44  */
    /* JADX WARN: Code duplicated, block: B:255:0x0b4b A[Catch: all -> 0x0e7a, TryCatch #16 {all -> 0x0e7a, blocks: (B:329:0x0e38, B:331:0x0e3e, B:332:0x0e3f, B:315:0x0e1b, B:317:0x0e21, B:318:0x0e22, B:238:0x0abd, B:245:0x0b1a, B:247:0x0b1e, B:249:0x0b24, B:251:0x0b2c, B:253:0x0b45, B:255:0x0b4b, B:257:0x0b77, B:259:0x0bb8, B:260:0x0bc2, B:261:0x0c0b, B:263:0x0c11, B:264:0x0c41, B:266:0x0c79, B:268:0x0c7d, B:270:0x0c81, B:274:0x0c8f, B:278:0x0c9a, B:281:0x0cdc, B:277:0x0c94, B:273:0x0c88, B:282:0x0cee, B:286:0x0d13, B:290:0x0d20, B:294:0x0d69, B:298:0x0d93, B:302:0x0da0, B:306:0x0de9, B:339:0x0e56, B:341:0x0e5a, B:343:0x0e63, B:347:0x0e70, B:354:0x0e86, B:356:0x0e8a, B:358:0x0e93, B:362:0x0e9e, B:361:0x0e98, B:365:0x0eaf, B:367:0x0eb3, B:369:0x0ebc, B:373:0x0ec7, B:372:0x0ec1, B:376:0x0ed2, B:379:0x0ee5, B:380:0x0eff, B:382:0x0f15, B:383:0x0f1b, B:387:0x0f21, B:389:0x0f36, B:346:0x0e6a, B:305:0x0de3, B:301:0x0d9a, B:297:0x0d8d, B:293:0x0d63, B:289:0x0d1a, B:285:0x0d0d, B:256:0x0b4e, B:309:0x0e10, B:311:0x0e16, B:312:0x0e17, B:319:0x0e23, B:320:0x0e29, B:323:0x0e2d, B:325:0x0e33, B:326:0x0e34), top: B:453:0x0103, inners: #21 }] */
    /* JADX WARN: Code duplicated, block: B:256:0x0b4e A[Catch: all -> 0x0e7a, TryCatch #16 {all -> 0x0e7a, blocks: (B:329:0x0e38, B:331:0x0e3e, B:332:0x0e3f, B:315:0x0e1b, B:317:0x0e21, B:318:0x0e22, B:238:0x0abd, B:245:0x0b1a, B:247:0x0b1e, B:249:0x0b24, B:251:0x0b2c, B:253:0x0b45, B:255:0x0b4b, B:257:0x0b77, B:259:0x0bb8, B:260:0x0bc2, B:261:0x0c0b, B:263:0x0c11, B:264:0x0c41, B:266:0x0c79, B:268:0x0c7d, B:270:0x0c81, B:274:0x0c8f, B:278:0x0c9a, B:281:0x0cdc, B:277:0x0c94, B:273:0x0c88, B:282:0x0cee, B:286:0x0d13, B:290:0x0d20, B:294:0x0d69, B:298:0x0d93, B:302:0x0da0, B:306:0x0de9, B:339:0x0e56, B:341:0x0e5a, B:343:0x0e63, B:347:0x0e70, B:354:0x0e86, B:356:0x0e8a, B:358:0x0e93, B:362:0x0e9e, B:361:0x0e98, B:365:0x0eaf, B:367:0x0eb3, B:369:0x0ebc, B:373:0x0ec7, B:372:0x0ec1, B:376:0x0ed2, B:379:0x0ee5, B:380:0x0eff, B:382:0x0f15, B:383:0x0f1b, B:387:0x0f21, B:389:0x0f36, B:346:0x0e6a, B:305:0x0de3, B:301:0x0d9a, B:297:0x0d8d, B:293:0x0d63, B:289:0x0d1a, B:285:0x0d0d, B:256:0x0b4e, B:309:0x0e10, B:311:0x0e16, B:312:0x0e17, B:319:0x0e23, B:320:0x0e29, B:323:0x0e2d, B:325:0x0e33, B:326:0x0e34), top: B:453:0x0103, inners: #21 }] */
    /* JADX WARN: Code duplicated, block: B:259:0x0bb8 A[Catch: all -> 0x0e7a, TryCatch #16 {all -> 0x0e7a, blocks: (B:329:0x0e38, B:331:0x0e3e, B:332:0x0e3f, B:315:0x0e1b, B:317:0x0e21, B:318:0x0e22, B:238:0x0abd, B:245:0x0b1a, B:247:0x0b1e, B:249:0x0b24, B:251:0x0b2c, B:253:0x0b45, B:255:0x0b4b, B:257:0x0b77, B:259:0x0bb8, B:260:0x0bc2, B:261:0x0c0b, B:263:0x0c11, B:264:0x0c41, B:266:0x0c79, B:268:0x0c7d, B:270:0x0c81, B:274:0x0c8f, B:278:0x0c9a, B:281:0x0cdc, B:277:0x0c94, B:273:0x0c88, B:282:0x0cee, B:286:0x0d13, B:290:0x0d20, B:294:0x0d69, B:298:0x0d93, B:302:0x0da0, B:306:0x0de9, B:339:0x0e56, B:341:0x0e5a, B:343:0x0e63, B:347:0x0e70, B:354:0x0e86, B:356:0x0e8a, B:358:0x0e93, B:362:0x0e9e, B:361:0x0e98, B:365:0x0eaf, B:367:0x0eb3, B:369:0x0ebc, B:373:0x0ec7, B:372:0x0ec1, B:376:0x0ed2, B:379:0x0ee5, B:380:0x0eff, B:382:0x0f15, B:383:0x0f1b, B:387:0x0f21, B:389:0x0f36, B:346:0x0e6a, B:305:0x0de3, B:301:0x0d9a, B:297:0x0d8d, B:293:0x0d63, B:289:0x0d1a, B:285:0x0d0d, B:256:0x0b4e, B:309:0x0e10, B:311:0x0e16, B:312:0x0e17, B:319:0x0e23, B:320:0x0e29, B:323:0x0e2d, B:325:0x0e33, B:326:0x0e34), top: B:453:0x0103, inners: #21 }] */
    /* JADX WARN: Code duplicated, block: B:263:0x0c11 A[Catch: all -> 0x0e7a, LOOP:3: B:261:0x0c0b->B:263:0x0c11, LOOP_END, TryCatch #16 {all -> 0x0e7a, blocks: (B:329:0x0e38, B:331:0x0e3e, B:332:0x0e3f, B:315:0x0e1b, B:317:0x0e21, B:318:0x0e22, B:238:0x0abd, B:245:0x0b1a, B:247:0x0b1e, B:249:0x0b24, B:251:0x0b2c, B:253:0x0b45, B:255:0x0b4b, B:257:0x0b77, B:259:0x0bb8, B:260:0x0bc2, B:261:0x0c0b, B:263:0x0c11, B:264:0x0c41, B:266:0x0c79, B:268:0x0c7d, B:270:0x0c81, B:274:0x0c8f, B:278:0x0c9a, B:281:0x0cdc, B:277:0x0c94, B:273:0x0c88, B:282:0x0cee, B:286:0x0d13, B:290:0x0d20, B:294:0x0d69, B:298:0x0d93, B:302:0x0da0, B:306:0x0de9, B:339:0x0e56, B:341:0x0e5a, B:343:0x0e63, B:347:0x0e70, B:354:0x0e86, B:356:0x0e8a, B:358:0x0e93, B:362:0x0e9e, B:361:0x0e98, B:365:0x0eaf, B:367:0x0eb3, B:369:0x0ebc, B:373:0x0ec7, B:372:0x0ec1, B:376:0x0ed2, B:379:0x0ee5, B:380:0x0eff, B:382:0x0f15, B:383:0x0f1b, B:387:0x0f21, B:389:0x0f36, B:346:0x0e6a, B:305:0x0de3, B:301:0x0d9a, B:297:0x0d8d, B:293:0x0d63, B:289:0x0d1a, B:285:0x0d0d, B:256:0x0b4e, B:309:0x0e10, B:311:0x0e16, B:312:0x0e17, B:319:0x0e23, B:320:0x0e29, B:323:0x0e2d, B:325:0x0e33, B:326:0x0e34), top: B:453:0x0103, inners: #21 }] */
    /* JADX WARN: Code duplicated, block: B:266:0x0c79 A[Catch: all -> 0x0e7a, TryCatch #16 {all -> 0x0e7a, blocks: (B:329:0x0e38, B:331:0x0e3e, B:332:0x0e3f, B:315:0x0e1b, B:317:0x0e21, B:318:0x0e22, B:238:0x0abd, B:245:0x0b1a, B:247:0x0b1e, B:249:0x0b24, B:251:0x0b2c, B:253:0x0b45, B:255:0x0b4b, B:257:0x0b77, B:259:0x0bb8, B:260:0x0bc2, B:261:0x0c0b, B:263:0x0c11, B:264:0x0c41, B:266:0x0c79, B:268:0x0c7d, B:270:0x0c81, B:274:0x0c8f, B:278:0x0c9a, B:281:0x0cdc, B:277:0x0c94, B:273:0x0c88, B:282:0x0cee, B:286:0x0d13, B:290:0x0d20, B:294:0x0d69, B:298:0x0d93, B:302:0x0da0, B:306:0x0de9, B:339:0x0e56, B:341:0x0e5a, B:343:0x0e63, B:347:0x0e70, B:354:0x0e86, B:356:0x0e8a, B:358:0x0e93, B:362:0x0e9e, B:361:0x0e98, B:365:0x0eaf, B:367:0x0eb3, B:369:0x0ebc, B:373:0x0ec7, B:372:0x0ec1, B:376:0x0ed2, B:379:0x0ee5, B:380:0x0eff, B:382:0x0f15, B:383:0x0f1b, B:387:0x0f21, B:389:0x0f36, B:346:0x0e6a, B:305:0x0de3, B:301:0x0d9a, B:297:0x0d8d, B:293:0x0d63, B:289:0x0d1a, B:285:0x0d0d, B:256:0x0b4e, B:309:0x0e10, B:311:0x0e16, B:312:0x0e17, B:319:0x0e23, B:320:0x0e29, B:323:0x0e2d, B:325:0x0e33, B:326:0x0e34), top: B:453:0x0103, inners: #21 }] */
    /* JADX WARN: Code duplicated, block: B:267:0x0c7c  */
    /* JADX WARN: Code duplicated, block: B:270:0x0c81 A[Catch: all -> 0x0e7a, TryCatch #16 {all -> 0x0e7a, blocks: (B:329:0x0e38, B:331:0x0e3e, B:332:0x0e3f, B:315:0x0e1b, B:317:0x0e21, B:318:0x0e22, B:238:0x0abd, B:245:0x0b1a, B:247:0x0b1e, B:249:0x0b24, B:251:0x0b2c, B:253:0x0b45, B:255:0x0b4b, B:257:0x0b77, B:259:0x0bb8, B:260:0x0bc2, B:261:0x0c0b, B:263:0x0c11, B:264:0x0c41, B:266:0x0c79, B:268:0x0c7d, B:270:0x0c81, B:274:0x0c8f, B:278:0x0c9a, B:281:0x0cdc, B:277:0x0c94, B:273:0x0c88, B:282:0x0cee, B:286:0x0d13, B:290:0x0d20, B:294:0x0d69, B:298:0x0d93, B:302:0x0da0, B:306:0x0de9, B:339:0x0e56, B:341:0x0e5a, B:343:0x0e63, B:347:0x0e70, B:354:0x0e86, B:356:0x0e8a, B:358:0x0e93, B:362:0x0e9e, B:361:0x0e98, B:365:0x0eaf, B:367:0x0eb3, B:369:0x0ebc, B:373:0x0ec7, B:372:0x0ec1, B:376:0x0ed2, B:379:0x0ee5, B:380:0x0eff, B:382:0x0f15, B:383:0x0f1b, B:387:0x0f21, B:389:0x0f36, B:346:0x0e6a, B:305:0x0de3, B:301:0x0d9a, B:297:0x0d8d, B:293:0x0d63, B:289:0x0d1a, B:285:0x0d0d, B:256:0x0b4e, B:309:0x0e10, B:311:0x0e16, B:312:0x0e17, B:319:0x0e23, B:320:0x0e29, B:323:0x0e2d, B:325:0x0e33, B:326:0x0e34), top: B:453:0x0103, inners: #21 }] */
    /* JADX WARN: Code duplicated, block: B:272:0x0c85  */
    /* JADX WARN: Code duplicated, block: B:273:0x0c88 A[Catch: all -> 0x0e7a, TryCatch #16 {all -> 0x0e7a, blocks: (B:329:0x0e38, B:331:0x0e3e, B:332:0x0e3f, B:315:0x0e1b, B:317:0x0e21, B:318:0x0e22, B:238:0x0abd, B:245:0x0b1a, B:247:0x0b1e, B:249:0x0b24, B:251:0x0b2c, B:253:0x0b45, B:255:0x0b4b, B:257:0x0b77, B:259:0x0bb8, B:260:0x0bc2, B:261:0x0c0b, B:263:0x0c11, B:264:0x0c41, B:266:0x0c79, B:268:0x0c7d, B:270:0x0c81, B:274:0x0c8f, B:278:0x0c9a, B:281:0x0cdc, B:277:0x0c94, B:273:0x0c88, B:282:0x0cee, B:286:0x0d13, B:290:0x0d20, B:294:0x0d69, B:298:0x0d93, B:302:0x0da0, B:306:0x0de9, B:339:0x0e56, B:341:0x0e5a, B:343:0x0e63, B:347:0x0e70, B:354:0x0e86, B:356:0x0e8a, B:358:0x0e93, B:362:0x0e9e, B:361:0x0e98, B:365:0x0eaf, B:367:0x0eb3, B:369:0x0ebc, B:373:0x0ec7, B:372:0x0ec1, B:376:0x0ed2, B:379:0x0ee5, B:380:0x0eff, B:382:0x0f15, B:383:0x0f1b, B:387:0x0f21, B:389:0x0f36, B:346:0x0e6a, B:305:0x0de3, B:301:0x0d9a, B:297:0x0d8d, B:293:0x0d63, B:289:0x0d1a, B:285:0x0d0d, B:256:0x0b4e, B:309:0x0e10, B:311:0x0e16, B:312:0x0e17, B:319:0x0e23, B:320:0x0e29, B:323:0x0e2d, B:325:0x0e33, B:326:0x0e34), top: B:453:0x0103, inners: #21 }] */
    /* JADX WARN: Code duplicated, block: B:276:0x0c93  */
    /* JADX WARN: Code duplicated, block: B:277:0x0c94 A[Catch: all -> 0x0e7a, TryCatch #16 {all -> 0x0e7a, blocks: (B:329:0x0e38, B:331:0x0e3e, B:332:0x0e3f, B:315:0x0e1b, B:317:0x0e21, B:318:0x0e22, B:238:0x0abd, B:245:0x0b1a, B:247:0x0b1e, B:249:0x0b24, B:251:0x0b2c, B:253:0x0b45, B:255:0x0b4b, B:257:0x0b77, B:259:0x0bb8, B:260:0x0bc2, B:261:0x0c0b, B:263:0x0c11, B:264:0x0c41, B:266:0x0c79, B:268:0x0c7d, B:270:0x0c81, B:274:0x0c8f, B:278:0x0c9a, B:281:0x0cdc, B:277:0x0c94, B:273:0x0c88, B:282:0x0cee, B:286:0x0d13, B:290:0x0d20, B:294:0x0d69, B:298:0x0d93, B:302:0x0da0, B:306:0x0de9, B:339:0x0e56, B:341:0x0e5a, B:343:0x0e63, B:347:0x0e70, B:354:0x0e86, B:356:0x0e8a, B:358:0x0e93, B:362:0x0e9e, B:361:0x0e98, B:365:0x0eaf, B:367:0x0eb3, B:369:0x0ebc, B:373:0x0ec7, B:372:0x0ec1, B:376:0x0ed2, B:379:0x0ee5, B:380:0x0eff, B:382:0x0f15, B:383:0x0f1b, B:387:0x0f21, B:389:0x0f36, B:346:0x0e6a, B:305:0x0de3, B:301:0x0d9a, B:297:0x0d8d, B:293:0x0d63, B:289:0x0d1a, B:285:0x0d0d, B:256:0x0b4e, B:309:0x0e10, B:311:0x0e16, B:312:0x0e17, B:319:0x0e23, B:320:0x0e29, B:323:0x0e2d, B:325:0x0e33, B:326:0x0e34), top: B:453:0x0103, inners: #21 }] */
    /* JADX WARN: Code duplicated, block: B:280:0x0cda  */
    /* JADX WARN: Code duplicated, block: B:284:0x0d0b  */
    /* JADX WARN: Code duplicated, block: B:285:0x0d0d A[Catch: all -> 0x0e7a, TryCatch #16 {all -> 0x0e7a, blocks: (B:329:0x0e38, B:331:0x0e3e, B:332:0x0e3f, B:315:0x0e1b, B:317:0x0e21, B:318:0x0e22, B:238:0x0abd, B:245:0x0b1a, B:247:0x0b1e, B:249:0x0b24, B:251:0x0b2c, B:253:0x0b45, B:255:0x0b4b, B:257:0x0b77, B:259:0x0bb8, B:260:0x0bc2, B:261:0x0c0b, B:263:0x0c11, B:264:0x0c41, B:266:0x0c79, B:268:0x0c7d, B:270:0x0c81, B:274:0x0c8f, B:278:0x0c9a, B:281:0x0cdc, B:277:0x0c94, B:273:0x0c88, B:282:0x0cee, B:286:0x0d13, B:290:0x0d20, B:294:0x0d69, B:298:0x0d93, B:302:0x0da0, B:306:0x0de9, B:339:0x0e56, B:341:0x0e5a, B:343:0x0e63, B:347:0x0e70, B:354:0x0e86, B:356:0x0e8a, B:358:0x0e93, B:362:0x0e9e, B:361:0x0e98, B:365:0x0eaf, B:367:0x0eb3, B:369:0x0ebc, B:373:0x0ec7, B:372:0x0ec1, B:376:0x0ed2, B:379:0x0ee5, B:380:0x0eff, B:382:0x0f15, B:383:0x0f1b, B:387:0x0f21, B:389:0x0f36, B:346:0x0e6a, B:305:0x0de3, B:301:0x0d9a, B:297:0x0d8d, B:293:0x0d63, B:289:0x0d1a, B:285:0x0d0d, B:256:0x0b4e, B:309:0x0e10, B:311:0x0e16, B:312:0x0e17, B:319:0x0e23, B:320:0x0e29, B:323:0x0e2d, B:325:0x0e33, B:326:0x0e34), top: B:453:0x0103, inners: #21 }] */
    /* JADX WARN: Code duplicated, block: B:288:0x0d19  */
    /* JADX WARN: Code duplicated, block: B:289:0x0d1a A[Catch: all -> 0x0e7a, TryCatch #16 {all -> 0x0e7a, blocks: (B:329:0x0e38, B:331:0x0e3e, B:332:0x0e3f, B:315:0x0e1b, B:317:0x0e21, B:318:0x0e22, B:238:0x0abd, B:245:0x0b1a, B:247:0x0b1e, B:249:0x0b24, B:251:0x0b2c, B:253:0x0b45, B:255:0x0b4b, B:257:0x0b77, B:259:0x0bb8, B:260:0x0bc2, B:261:0x0c0b, B:263:0x0c11, B:264:0x0c41, B:266:0x0c79, B:268:0x0c7d, B:270:0x0c81, B:274:0x0c8f, B:278:0x0c9a, B:281:0x0cdc, B:277:0x0c94, B:273:0x0c88, B:282:0x0cee, B:286:0x0d13, B:290:0x0d20, B:294:0x0d69, B:298:0x0d93, B:302:0x0da0, B:306:0x0de9, B:339:0x0e56, B:341:0x0e5a, B:343:0x0e63, B:347:0x0e70, B:354:0x0e86, B:356:0x0e8a, B:358:0x0e93, B:362:0x0e9e, B:361:0x0e98, B:365:0x0eaf, B:367:0x0eb3, B:369:0x0ebc, B:373:0x0ec7, B:372:0x0ec1, B:376:0x0ed2, B:379:0x0ee5, B:380:0x0eff, B:382:0x0f15, B:383:0x0f1b, B:387:0x0f21, B:389:0x0f36, B:346:0x0e6a, B:305:0x0de3, B:301:0x0d9a, B:297:0x0d8d, B:293:0x0d63, B:289:0x0d1a, B:285:0x0d0d, B:256:0x0b4e, B:309:0x0e10, B:311:0x0e16, B:312:0x0e17, B:319:0x0e23, B:320:0x0e29, B:323:0x0e2d, B:325:0x0e33, B:326:0x0e34), top: B:453:0x0103, inners: #21 }] */
    /* JADX WARN: Code duplicated, block: B:292:0x0d62  */
    /* JADX WARN: Code duplicated, block: B:293:0x0d63 A[Catch: all -> 0x0e7a, TryCatch #16 {all -> 0x0e7a, blocks: (B:329:0x0e38, B:331:0x0e3e, B:332:0x0e3f, B:315:0x0e1b, B:317:0x0e21, B:318:0x0e22, B:238:0x0abd, B:245:0x0b1a, B:247:0x0b1e, B:249:0x0b24, B:251:0x0b2c, B:253:0x0b45, B:255:0x0b4b, B:257:0x0b77, B:259:0x0bb8, B:260:0x0bc2, B:261:0x0c0b, B:263:0x0c11, B:264:0x0c41, B:266:0x0c79, B:268:0x0c7d, B:270:0x0c81, B:274:0x0c8f, B:278:0x0c9a, B:281:0x0cdc, B:277:0x0c94, B:273:0x0c88, B:282:0x0cee, B:286:0x0d13, B:290:0x0d20, B:294:0x0d69, B:298:0x0d93, B:302:0x0da0, B:306:0x0de9, B:339:0x0e56, B:341:0x0e5a, B:343:0x0e63, B:347:0x0e70, B:354:0x0e86, B:356:0x0e8a, B:358:0x0e93, B:362:0x0e9e, B:361:0x0e98, B:365:0x0eaf, B:367:0x0eb3, B:369:0x0ebc, B:373:0x0ec7, B:372:0x0ec1, B:376:0x0ed2, B:379:0x0ee5, B:380:0x0eff, B:382:0x0f15, B:383:0x0f1b, B:387:0x0f21, B:389:0x0f36, B:346:0x0e6a, B:305:0x0de3, B:301:0x0d9a, B:297:0x0d8d, B:293:0x0d63, B:289:0x0d1a, B:285:0x0d0d, B:256:0x0b4e, B:309:0x0e10, B:311:0x0e16, B:312:0x0e17, B:319:0x0e23, B:320:0x0e29, B:323:0x0e2d, B:325:0x0e33, B:326:0x0e34), top: B:453:0x0103, inners: #21 }] */
    /* JADX WARN: Code duplicated, block: B:296:0x0d8b  */
    /* JADX WARN: Code duplicated, block: B:297:0x0d8d A[Catch: all -> 0x0e7a, TryCatch #16 {all -> 0x0e7a, blocks: (B:329:0x0e38, B:331:0x0e3e, B:332:0x0e3f, B:315:0x0e1b, B:317:0x0e21, B:318:0x0e22, B:238:0x0abd, B:245:0x0b1a, B:247:0x0b1e, B:249:0x0b24, B:251:0x0b2c, B:253:0x0b45, B:255:0x0b4b, B:257:0x0b77, B:259:0x0bb8, B:260:0x0bc2, B:261:0x0c0b, B:263:0x0c11, B:264:0x0c41, B:266:0x0c79, B:268:0x0c7d, B:270:0x0c81, B:274:0x0c8f, B:278:0x0c9a, B:281:0x0cdc, B:277:0x0c94, B:273:0x0c88, B:282:0x0cee, B:286:0x0d13, B:290:0x0d20, B:294:0x0d69, B:298:0x0d93, B:302:0x0da0, B:306:0x0de9, B:339:0x0e56, B:341:0x0e5a, B:343:0x0e63, B:347:0x0e70, B:354:0x0e86, B:356:0x0e8a, B:358:0x0e93, B:362:0x0e9e, B:361:0x0e98, B:365:0x0eaf, B:367:0x0eb3, B:369:0x0ebc, B:373:0x0ec7, B:372:0x0ec1, B:376:0x0ed2, B:379:0x0ee5, B:380:0x0eff, B:382:0x0f15, B:383:0x0f1b, B:387:0x0f21, B:389:0x0f36, B:346:0x0e6a, B:305:0x0de3, B:301:0x0d9a, B:297:0x0d8d, B:293:0x0d63, B:289:0x0d1a, B:285:0x0d0d, B:256:0x0b4e, B:309:0x0e10, B:311:0x0e16, B:312:0x0e17, B:319:0x0e23, B:320:0x0e29, B:323:0x0e2d, B:325:0x0e33, B:326:0x0e34), top: B:453:0x0103, inners: #21 }] */
    /* JADX WARN: Code duplicated, block: B:300:0x0d99  */
    /* JADX WARN: Code duplicated, block: B:301:0x0d9a A[Catch: all -> 0x0e7a, TryCatch #16 {all -> 0x0e7a, blocks: (B:329:0x0e38, B:331:0x0e3e, B:332:0x0e3f, B:315:0x0e1b, B:317:0x0e21, B:318:0x0e22, B:238:0x0abd, B:245:0x0b1a, B:247:0x0b1e, B:249:0x0b24, B:251:0x0b2c, B:253:0x0b45, B:255:0x0b4b, B:257:0x0b77, B:259:0x0bb8, B:260:0x0bc2, B:261:0x0c0b, B:263:0x0c11, B:264:0x0c41, B:266:0x0c79, B:268:0x0c7d, B:270:0x0c81, B:274:0x0c8f, B:278:0x0c9a, B:281:0x0cdc, B:277:0x0c94, B:273:0x0c88, B:282:0x0cee, B:286:0x0d13, B:290:0x0d20, B:294:0x0d69, B:298:0x0d93, B:302:0x0da0, B:306:0x0de9, B:339:0x0e56, B:341:0x0e5a, B:343:0x0e63, B:347:0x0e70, B:354:0x0e86, B:356:0x0e8a, B:358:0x0e93, B:362:0x0e9e, B:361:0x0e98, B:365:0x0eaf, B:367:0x0eb3, B:369:0x0ebc, B:373:0x0ec7, B:372:0x0ec1, B:376:0x0ed2, B:379:0x0ee5, B:380:0x0eff, B:382:0x0f15, B:383:0x0f1b, B:387:0x0f21, B:389:0x0f36, B:346:0x0e6a, B:305:0x0de3, B:301:0x0d9a, B:297:0x0d8d, B:293:0x0d63, B:289:0x0d1a, B:285:0x0d0d, B:256:0x0b4e, B:309:0x0e10, B:311:0x0e16, B:312:0x0e17, B:319:0x0e23, B:320:0x0e29, B:323:0x0e2d, B:325:0x0e33, B:326:0x0e34), top: B:453:0x0103, inners: #21 }] */
    /* JADX WARN: Code duplicated, block: B:304:0x0de2  */
    /* JADX WARN: Code duplicated, block: B:305:0x0de3 A[Catch: all -> 0x0e7a, TryCatch #16 {all -> 0x0e7a, blocks: (B:329:0x0e38, B:331:0x0e3e, B:332:0x0e3f, B:315:0x0e1b, B:317:0x0e21, B:318:0x0e22, B:238:0x0abd, B:245:0x0b1a, B:247:0x0b1e, B:249:0x0b24, B:251:0x0b2c, B:253:0x0b45, B:255:0x0b4b, B:257:0x0b77, B:259:0x0bb8, B:260:0x0bc2, B:261:0x0c0b, B:263:0x0c11, B:264:0x0c41, B:266:0x0c79, B:268:0x0c7d, B:270:0x0c81, B:274:0x0c8f, B:278:0x0c9a, B:281:0x0cdc, B:277:0x0c94, B:273:0x0c88, B:282:0x0cee, B:286:0x0d13, B:290:0x0d20, B:294:0x0d69, B:298:0x0d93, B:302:0x0da0, B:306:0x0de9, B:339:0x0e56, B:341:0x0e5a, B:343:0x0e63, B:347:0x0e70, B:354:0x0e86, B:356:0x0e8a, B:358:0x0e93, B:362:0x0e9e, B:361:0x0e98, B:365:0x0eaf, B:367:0x0eb3, B:369:0x0ebc, B:373:0x0ec7, B:372:0x0ec1, B:376:0x0ed2, B:379:0x0ee5, B:380:0x0eff, B:382:0x0f15, B:383:0x0f1b, B:387:0x0f21, B:389:0x0f36, B:346:0x0e6a, B:305:0x0de3, B:301:0x0d9a, B:297:0x0d8d, B:293:0x0d63, B:289:0x0d1a, B:285:0x0d0d, B:256:0x0b4e, B:309:0x0e10, B:311:0x0e16, B:312:0x0e17, B:319:0x0e23, B:320:0x0e29, B:323:0x0e2d, B:325:0x0e33, B:326:0x0e34), top: B:453:0x0103, inners: #21 }] */
    /* JADX WARN: Code duplicated, block: B:319:0x0e23 A[Catch: all -> 0x0e7a, TryCatch #16 {all -> 0x0e7a, blocks: (B:329:0x0e38, B:331:0x0e3e, B:332:0x0e3f, B:315:0x0e1b, B:317:0x0e21, B:318:0x0e22, B:238:0x0abd, B:245:0x0b1a, B:247:0x0b1e, B:249:0x0b24, B:251:0x0b2c, B:253:0x0b45, B:255:0x0b4b, B:257:0x0b77, B:259:0x0bb8, B:260:0x0bc2, B:261:0x0c0b, B:263:0x0c11, B:264:0x0c41, B:266:0x0c79, B:268:0x0c7d, B:270:0x0c81, B:274:0x0c8f, B:278:0x0c9a, B:281:0x0cdc, B:277:0x0c94, B:273:0x0c88, B:282:0x0cee, B:286:0x0d13, B:290:0x0d20, B:294:0x0d69, B:298:0x0d93, B:302:0x0da0, B:306:0x0de9, B:339:0x0e56, B:341:0x0e5a, B:343:0x0e63, B:347:0x0e70, B:354:0x0e86, B:356:0x0e8a, B:358:0x0e93, B:362:0x0e9e, B:361:0x0e98, B:365:0x0eaf, B:367:0x0eb3, B:369:0x0ebc, B:373:0x0ec7, B:372:0x0ec1, B:376:0x0ed2, B:379:0x0ee5, B:380:0x0eff, B:382:0x0f15, B:383:0x0f1b, B:387:0x0f21, B:389:0x0f36, B:346:0x0e6a, B:305:0x0de3, B:301:0x0d9a, B:297:0x0d8d, B:293:0x0d63, B:289:0x0d1a, B:285:0x0d0d, B:256:0x0b4e, B:309:0x0e10, B:311:0x0e16, B:312:0x0e17, B:319:0x0e23, B:320:0x0e29, B:323:0x0e2d, B:325:0x0e33, B:326:0x0e34), top: B:453:0x0103, inners: #21 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x014b  */
    /* JADX WARN: Code duplicated, block: B:434:0x0595 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:446:0x09ff A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v44 */
    /* JADX WARN: Type inference failed for: r13v45, types: [lambdasubmitStillCaptureRequest4] */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r15v0, types: [trySetFlashModeToCameraControl] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v29 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v33, types: [trySetFlashModeToCameraControl] */
    /* JADX WARN: Type inference failed for: r1v167 */
    /* JADX WARN: Type inference failed for: r1v171, types: [java.lang.Runtime] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r21v4 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v146 */
    /* JADX WARN: Type inference failed for: r2v159 */
    /* JADX WARN: Type inference failed for: r2v160, types: [lambdasubmitStillCaptureRequest4] */
    /* JADX WARN: Type inference failed for: r2v171, types: [java.lang.Thread] */
    /* JADX WARN: Type inference failed for: r2v173 */
    /* JADX WARN: Type inference failed for: r2v176 */
    /* JADX WARN: Type inference failed for: r2v184 */
    /* JADX WARN: Type inference failed for: r2v185, types: [lambdasubmitStillCaptureRequest4] */
    /* JADX WARN: Type inference failed for: r2v189 */
    /* JADX WARN: Type inference failed for: r2v190 */
    /* JADX WARN: Type inference failed for: r2v191 */
    /* JADX WARN: Type inference failed for: r2v193 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r31v4 */
    /* JADX WARN: Type inference failed for: r3v3, types: [getPostviewResolutionSelector] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51, types: [trySetFlashModeToCameraControl] */
    /* JADX WARN: Type inference failed for: r3v56, types: [trySetFlashModeToCameraControl] */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* JADX WARN: Type inference failed for: r5v101 */
    /* JADX WARN: Type inference failed for: r5v102, types: [lambdasubmitStillCaptureRequest4] */
    /* JADX WARN: Type inference failed for: r5v105 */
    /* JADX WARN: Type inference failed for: r5v106, types: [lambdasubmitStillCaptureRequest4] */
    /* JADX WARN: Type inference failed for: r5v108 */
    /* JADX WARN: Type inference failed for: r5v109 */
    /* JADX WARN: Type inference failed for: r6v61 */
    /* JADX WARN: Type inference failed for: r6v62, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r6v64 */
    /* JADX WARN: Type inference failed for: r6v65, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r6v66 */
    /* JADX WARN: Type inference failed for: r6v67 */
    @JvmStatic
    private static SdkCore b(Context context, final Configuration configuration, TrackingConsent trackingConsent) throws Throwable {
        ?? r2;
        Throwable th;
        Configuration configurationTuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String strValueOf;
        ActivityManager.RunningAppProcessInfo runningAppProcessInfo;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3;
        Throwable th2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4;
        Throwable th3;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5;
        Configuration configuration2;
        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest4;
        long j;
        int i;
        int i2;
        String string;
        int iIntValue;
        Method[] methodArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7;
        Throwable th4;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8;
        Throwable th5;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault9;
        int i3;
        int i4;
        String string2;
        String str;
        ConnectionSpec connectionSpecBuild;
        OkHttpClient.Builder builder;
        LinkedHashMap linkedHashMap;
        Iterator it;
        Object obj;
        String str2;
        File file;
        ?? r6;
        ImageReaderProxys imageReaderProxys;
        Object obj2;
        ImageReaderProxys imageReaderProxys2;
        Object obj3;
        File file2;
        ?? r7;
        ImageReaderProxys imageReaderProxys3;
        Object obj4;
        ImageReaderProxys imageReaderProxys4;
        Object obj5;
        File file3;
        ?? r21;
        ImageReaderProxys imageReaderProxys5;
        Object obj6;
        Method method;
        Method[] declaredMethods;
        int length;
        int i5;
        Method method2;
        Method method3;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        Object next;
        ?? r31;
        final ?? r3;
        ?? r4;
        Object obj7;
        ?? r13;
        ?? r5;
        ?? r8;
        ?? r9;
        ?? r10 = trackingConsent;
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(configuration, "");
        Intrinsics.checkNotNullParameter(r10, "");
        ?? trysetflashmodetocameracontrol = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        synchronized (trysetflashmodetocameracontrol) {
            try {
                SdkCore sdkCore = trysetflashmodetocameracontrol.b.get("_dd.sdk_core.default");
                try {
                    if (sdkCore != null) {
                        resizeAveraging.b().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.Datadog$initialize$1$1
                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                            public final String invoke() {
                                return "The Datadog library has already been initialized.";
                            }
                        }, null, false, null);
                        return sdkCore;
                    }
                    getJpegQuality getjpegquality = TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    String siteName = configuration.b.notify.getSiteName();
                    StringBuilder sb = new StringBuilder();
                    isSupportedRotationDegrees issupportedrotationdegrees = null;
                    sb.append((String) null);
                    sb.append("/");
                    sb.append(siteName);
                    String strTuitionPaymentFragmentspecialinlinedviewModeldefault1 = getjpegquality.TuitionPaymentFragmentspecialinlinedviewModeldefault1(sb.toString());
                    if (strTuitionPaymentFragmentspecialinlinedviewModeldefault1 == null) {
                        resizeAveraging.b().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.Datadog$initialize$1$2
                            @Override // kotlin.jvm.functions.Function0
                            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                            public final String invoke() {
                                return "Cannot create SDK instance ID, stopping SDK initialization.";
                            }
                        }, null, false, null);
                        return null;
                    }
                    final String str3 = "_dd.sdk_core.default";
                    trysetflashmodetocameracontrol = new trySetFlashModeToCameraControl(context, strTuitionPaymentFragmentspecialinlinedviewModeldefault1, str3, null, null, null, 56, null);
                    Intrinsics.checkNotNullParameter(configuration, "");
                    try {
                        if (!trySetFlashModeToCameraControl.a(configuration.TuitionPaymentFragmentspecialinlinedviewModeldefault2)) {
                            throw new IllegalArgumentException("The environment name should contain maximum 196 of the following allowed characters [a-zA-Z0-9_:./-] and should never finish with a semicolon.In this case the Datadog SDK will not be initialised.");
                        }
                        int i6 = 1;
                        if (trySetFlashModeToCameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(trysetflashmodetocameracontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3) && configuration.b.TuitionPaymentFragmentspecialinlinedviewModeldefault2) {
                            configurationTuitionPaymentFragmentspecialinlinedviewModeldefault1 = trySetFlashModeToCameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(configuration);
                            trysetflashmodetocameracontrol.cancelAll = true;
                            TuitionPaymentFragmentbindingInflater1 = 2;
                        } else {
                            configurationTuitionPaymentFragmentspecialinlinedviewModeldefault1 = configuration;
                        }
                        ImageReaderProxys.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3B = trysetflashmodetocameracontrol.asInterface;
                        if (tuitionPaymentFragmentspecialinlinedviewModeldefault3B == null) {
                            lambdasubmitStillCaptureRequest4.Companion companion = lambdasubmitStillCaptureRequest4.INSTANCE;
                            tuitionPaymentFragmentspecialinlinedviewModeldefault3B = lambdasubmitStillCaptureRequest4.Companion.b();
                        }
                        InternalLogger internalLogger = trysetflashmodetocameracontrol.asBinder;
                        ImageProcessingUtilExternalSyntheticLambda1 imageProcessingUtilExternalSyntheticLambda1 = new ImageProcessingUtilExternalSyntheticLambda1(issupportedrotationdegrees, i6, false ? 1 : 0);
                        lambdasubmitStillCaptureRequest4.Companion companion2 = lambdasubmitStillCaptureRequest4.INSTANCE;
                        lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest5 = new lambdasubmitStillCaptureRequest4(internalLogger, imageProcessingUtilExternalSyntheticLambda1, tuitionPaymentFragmentspecialinlinedviewModeldefault3B, lambdasubmitStillCaptureRequest4.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                        Intrinsics.checkNotNullParameter(lambdasubmitstillcapturerequest5, "");
                        trysetflashmodetocameracontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = lambdasubmitstillcapturerequest5;
                        final lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest6 = trysetflashmodetocameracontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        if (lambdasubmitstillcapturerequest6 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("");
                            lambdasubmitstillcapturerequest6 = null;
                        }
                        final Context context2 = trysetflashmodetocameracontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        String str4 = trysetflashmodetocameracontrol.d;
                        TrackingConsent trackingConsent2 = TrackingConsent.PENDING;
                        Intrinsics.checkNotNullParameter(context2, "");
                        Intrinsics.checkNotNullParameter(str4, "");
                        Intrinsics.checkNotNullParameter(configurationTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
                        Intrinsics.checkNotNullParameter(trackingConsent2, "");
                        try {
                            if (!lambdasubmitstillcapturerequest6.onTransact.get()) {
                                try {
                                    Configuration.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault3 = configurationTuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
                                    lambdasubmitstillcapturerequest6.asBinder = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                    lambdasubmitstillcapturerequest6.subscribe = tuitionPaymentFragmentspecialinlinedviewModeldefault3.INotificationSideChannel;
                                    lambdasubmitstillcapturerequest6.write = tuitionPaymentFragmentspecialinlinedviewModeldefault3.b;
                                    lambdasubmitstillcapturerequest6.disconnect = tuitionPaymentFragmentspecialinlinedviewModeldefault3.d;
                                    lambdasubmitstillcapturerequest6.com.google.firebase.analytics.FirebaseAnalytics.Event.SEARCH java.lang.String = tuitionPaymentFragmentspecialinlinedviewModeldefault3.notify;
                                    lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy = tuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentbindingInflater1;
                                    Intrinsics.checkNotNullParameter(lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy, "");
                                    lambdasubmitstillcapturerequest6.TuitionPaymentFragmentbindingInflater1 = lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy;
                                    lambdasubmitstillcapturerequest6.d = tuitionPaymentFragmentspecialinlinedviewModeldefault3.cancelAll;
                                    String packageName = context2.getPackageName();
                                    Intrinsics.checkNotNullExpressionValue(packageName, "");
                                    lambdasubmitstillcapturerequest6.getExtras = packageName;
                                    PackageInfo packageInfoTuitionPaymentFragmentspecialinlinedviewModeldefault2 = lambdasubmitstillcapturerequest6.TuitionPaymentFragmentspecialinlinedviewModeldefault2(context2);
                                    if (packageInfoTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
                                        strValueOf = "?";
                                    } else {
                                        strValueOf = packageInfoTuitionPaymentFragmentspecialinlinedviewModeldefault2.versionName;
                                        if (strValueOf == null) {
                                            strValueOf = String.valueOf(packageInfoTuitionPaymentFragmentspecialinlinedviewModeldefault2.versionCode);
                                        } else {
                                            Intrinsics.checkNotNullExpressionValue(strValueOf, "");
                                        }
                                        if (strValueOf == null) {
                                            strValueOf = "?";
                                        }
                                    }
                                    lambdasubmitstillcapturerequest6.getRoot = new copyBitmapToByteBuffer(strValueOf);
                                    lambdasubmitstillcapturerequest6.g = configurationTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1;
                                    String packageName2 = configurationTuitionPaymentFragmentspecialinlinedviewModeldefault1.asBinder;
                                    if (packageName2 == null) {
                                        packageName2 = context2.getPackageName();
                                        Intrinsics.checkNotNullExpressionValue(packageName2, "");
                                    }
                                    lambdasubmitstillcapturerequest6.sendCustomAction = packageName2;
                                    lambdasubmitstillcapturerequest6.INotificationSideChannel = configurationTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
                                    lambdasubmitstillcapturerequest6.onConnected = configurationTuitionPaymentFragmentspecialinlinedviewModeldefault1.asInterface;
                                    lambdasubmitstillcapturerequest6.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (String) lambdasubmitStillCaptureRequest4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), -1756059032, new Object[]{lambdasubmitstillcapturerequest6, context2}, 1756059032, SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1(), SearchBarAnimationHelper$$ExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1());
                                    lambdasubmitstillcapturerequest6.a = new WeakReference<>(context2);
                                    int iMyPid = Process.myPid();
                                    Object systemService = context2.getSystemService("activity");
                                    ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                                    if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null) {
                                        runningAppProcessInfo = null;
                                    } else {
                                        Iterator it2 = runningAppProcesses.iterator();
                                        do {
                                            if (!it2.hasNext()) {
                                                next = null;
                                                break;
                                            }
                                            next = it2.next();
                                        } while (((ActivityManager.RunningAppProcessInfo) next).pid != iMyPid);
                                        runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) next;
                                    }
                                    lambdasubmitstillcapturerequest6.INotificationSideChannelDefault = runningAppProcessInfo == null ? true : Intrinsics.areEqual(context2.getPackageName(), runningAppProcessInfo.processName);
                                    InternalLogger internalLogger2 = lambdasubmitstillcapturerequest6.INotificationSideChannelStub;
                                    lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy2 = lambdasubmitstillcapturerequest6.TuitionPaymentFragmentbindingInflater1;
                                    if (lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy2 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("");
                                        lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy2 = null;
                                    }
                                    rotateYUVInternal rotateyuvinternal = new rotateYUVInternal("upload", internalLogger2, lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy2);
                                    Intrinsics.checkNotNullParameter(rotateyuvinternal, "");
                                    lambdasubmitstillcapturerequest6.setCallbacksMessenger = rotateyuvinternal;
                                    ImageReaderProxys.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault4 = lambdasubmitstillcapturerequest6.cancel;
                                    InternalLogger internalLogger3 = lambdasubmitstillcapturerequest6.INotificationSideChannelStub;
                                    lambdanew1androidxcameracoreImageAnalysisNonBlockingAnalyzerCacheAnalyzingImageProxy lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy3 = lambdasubmitstillcapturerequest6.TuitionPaymentFragmentbindingInflater1;
                                    if (lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy3 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("");
                                        lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy3 = null;
                                    }
                                    ImageReaderProxys imageReaderProxysTuitionPaymentFragmentbindingInflater1 = tuitionPaymentFragmentspecialinlinedviewModeldefault4.TuitionPaymentFragmentbindingInflater1(internalLogger3, PlaceTypes.STORAGE, lambdanew1androidxcameracoreimageanalysisnonblockinganalyzercacheanalyzingimageproxy3);
                                    Intrinsics.checkNotNullParameter(imageReaderProxysTuitionPaymentFragmentbindingInflater1, "");
                                    lambdasubmitstillcapturerequest6.getNotifyChildrenChangedOptions = imageReaderProxysTuitionPaymentFragmentbindingInflater1;
                                    ImageReaderProxys imageReaderProxys6 = lambdasubmitstillcapturerequest6.getNotifyChildrenChangedOptions;
                                    if (imageReaderProxys6 == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException("");
                                        imageReaderProxys6 = null;
                                    }
                                    ImageProxyDownsampler.TuitionPaymentFragmentspecialinlinedviewModeldefault3(imageReaderProxys6, "NTP Sync initialization", resizeAveraging.b(), new Runnable() { // from class: isOutputFormatUltraHdr
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            lambdasubmitStillCaptureRequest4.TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdasubmitstillcapturerequest6, context2);
                                        }
                                    });
                                    Configuration.TuitionPaymentFragmentspecialinlinedviewModeldefault3 tuitionPaymentFragmentspecialinlinedviewModeldefault5 = configurationTuitionPaymentFragmentspecialinlinedviewModeldefault1.b;
                                    ArrayList arrayList = new ArrayList();
                                    Method[] methodArr2 = {OkHttpClient.Builder.class.getMethod("build", new Class[0])};
                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault10 == null) {
                                        char cLastIndexOf = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0));
                                        int iArgb = 2823 - Color.argb(0, 0, 0, 0);
                                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 23;
                                        byte[] bArr = $$a;
                                        Object[] objArr = new Object[1];
                                        a(bArr[10], (byte) (-bArr[5]), bArr[7], objArr);
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault10 = initSession.b(cLastIndexOf, iArgb, iLastIndexOf, 1814927978, false, (String) objArr[0], null);
                                    }
                                    if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault10).get(null) == null) {
                                        Method[] declaredMethods2 = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) (ViewConfiguration.getTouchSlop() >> 8), ((Process.getThreadPriority(0) + 20) >> 6) + 2823, 22 - Gravity.getAbsoluteGravity(0, 0))).getDeclaredMethods();
                                        int length2 = declaredMethods2.length;
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= length2) {
                                                str4 = str4;
                                                break;
                                            }
                                            Method method4 = declaredMethods2[i7];
                                            try {
                                                Method[] methodArr3 = declaredMethods2;
                                                int i8 = length2;
                                                if (((Boolean) Class.forName("java.lang.reflect.Modifier").getMethod("isNative", Integer.TYPE).invoke(null, Integer.valueOf(((Integer) Class.forName("java.lang.reflect.Method").getMethod("getModifiers", null).invoke(method4, null)).intValue()))).booleanValue() && Long.TYPE.equals(Class.forName("java.lang.reflect.Method").getMethod("getReturnType", null).invoke(method4, null))) {
                                                    Object[] objArr2 = (Object[]) Class.forName("java.lang.reflect.Method").getMethod("getParameterTypes", null).invoke(method4, null);
                                                    if (objArr2.length == 2 && Long.TYPE.equals(objArr2[0]) && Class.forName("java.lang.reflect.Method").equals(objArr2[1])) {
                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault11 == null) {
                                                            char c = (char) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)));
                                                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 2824;
                                                            int i9 = 23 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                            byte[] bArr2 = $$a;
                                                            Object[] objArr3 = new Object[1];
                                                            a(bArr2[10], (byte) (-bArr2[5]), bArr2[7], objArr3);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault11 = initSession.b(c, iIndexOf, i9, 1814927978, false, (String) objArr3[0], null);
                                                        }
                                                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault11).set(null, method4);
                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault12 == null) {
                                                            char keyRepeatDelay = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                                                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 2823;
                                                            int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 22;
                                                            byte[] bArr3 = $$a;
                                                            Object[] objArr4 = new Object[1];
                                                            a(bArr3[10], (byte) (-bArr3[5]), bArr3[7], objArr4);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault12 = initSession.b(keyRepeatDelay, iCombineMeasuredStates, scrollBarFadeDuration, 1814927978, false, (String) objArr4[0], null);
                                                        }
                                                        try {
                                                            Object[] objArr5 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault12).get(null)};
                                                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault13 == null) {
                                                                char cBlue = (char) Color.blue(0);
                                                                int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2823;
                                                                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 22;
                                                                byte[] bArr4 = $$a;
                                                                byte b2 = bArr4[7];
                                                                Object[] objArr6 = new Object[1];
                                                                a(b2, (byte) (b2 | 51), bArr4[5], objArr6);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault13 = initSession.b(cBlue, scrollBarFadeDuration2, jumpTapTimeout, -2137287382, false, (String) objArr6[0], new Class[]{Long.TYPE, Method.class});
                                                            }
                                                            ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault13).invoke(null, objArr5)).longValue();
                                                            break;
                                                        } catch (Throwable th6) {
                                                            Throwable cause = th6.getCause();
                                                            if (cause != null) {
                                                                throw cause;
                                                            }
                                                            throw th6;
                                                        }
                                                    }
                                                }
                                                i7++;
                                                declaredMethods2 = methodArr3;
                                                length2 = i8;
                                                str4 = str4;
                                            } catch (Throwable th7) {
                                                Throwable cause2 = th7.getCause();
                                                if (cause2 != null) {
                                                    throw cause2;
                                                }
                                                throw th7;
                                            }
                                        }
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char modifierMetaStateMask = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                                            int iRed = 2823 - Color.red(0);
                                            int i10 = 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                            byte[] bArr5 = $$a;
                                            Object[] objArr7 = new Object[1];
                                            a(bArr5[10], (byte) (-bArr5[5]), bArr5[7], objArr7);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(modifierMetaStateMask, iRed, i10, 1814927978, false, (String) objArr7[0], null);
                                        }
                                        try {
                                            Object[] objArr8 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null)};
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                                try {
                                                    char cRed = (char) Color.red(0);
                                                    int i11 = 2824 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                                    int threadPriority = 22 - ((Process.getThreadPriority(0) + 20) >> 6);
                                                    byte[] bArr6 = $$a;
                                                    Object[] objArr9 = new Object[1];
                                                    a((byte) (bArr6[2] - 1), (byte) 51, bArr6[5], objArr9);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed, i11, threadPriority, 1025296417, false, (String) objArr9[0], new Class[]{Object.class});
                                                } catch (Throwable th8) {
                                                    th2 = th8;
                                                    Throwable cause3 = th2.getCause();
                                                    if (cause3 != null) {
                                                        throw cause3;
                                                    }
                                                    throw th2;
                                                }
                                            }
                                            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr8);
                                            try {
                                                Object[] objArr10 = {0, methodArr2, null};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                                    try {
                                                        char c2 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 37657);
                                                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 2720;
                                                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 19;
                                                        byte[] bArr7 = $$a;
                                                        Object[] objArr11 = new Object[1];
                                                        a((byte) (bArr7[2] - 1), (byte) 51, bArr7[5], objArr11);
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c2, iResolveSizeAndState, offsetAfter, -1568796068, false, (String) objArr11[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                                                    } catch (Throwable th9) {
                                                        th3 = th9;
                                                        Throwable cause4 = th3.getCause();
                                                        if (cause4 != null) {
                                                            throw cause4;
                                                        }
                                                        throw th3;
                                                    }
                                                }
                                                long jLongValue = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr10)).longValue();
                                                long j2 = -101833356;
                                                long j3 = 628;
                                                long j4 = (j3 * j2) + (j3 * jLongValue);
                                                long j5 = -627;
                                                configuration2 = configurationTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                                long elapsedCpuTime = (int) Process.getElapsedCpuTime();
                                                lambdasubmitstillcapturerequest4 = lambdasubmitstillcapturerequest6;
                                                j = -1;
                                                long j6 = j4 + ((jLongValue | elapsedCpuTime | (j2 ^ j)) * j5) + (j5 * (j2 | (((jLongValue ^ j) | elapsedCpuTime) ^ j))) + (((long) 627) * ((((elapsedCpuTime ^ j) | jLongValue) ^ j) | ((elapsedCpuTime | j2) ^ j))) + ((long) (-1708572489));
                                                int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
                                                int i12 = ~elapsedCpuTime2;
                                                int i13 = ((int) (j6 >> 32)) & (1203769542 + (((~(1917427768 | i12)) | (~((-805830681) | elapsedCpuTime2))) * (-831)) + ((~((-134482437) | elapsedCpuTime2)) * (-1662)) + (((~(elapsedCpuTime2 | (-1917427769))) | (~(i12 | 940313116)) | (~((-940313117) | elapsedCpuTime2))) * 831));
                                                int i14 = (int) j6;
                                                int i15 = ~((int) SystemClock.uptimeMillis());
                                                int i16 = (i14 & ((-261820174) + ((~((-159383825) | i15)) * (-783)) + (((~(i15 | (-796950845))) | 640275565) * 783))) | i13;
                                                i = i16 >>> 24;
                                                int i17 = i16 & ViewCompat.MEASURED_SIZE_MASK;
                                                if (i != 0) {
                                                    i2 = 1;
                                                } else {
                                                    i2 = 0;
                                                }
                                                if (i2 != 0 || i17 >= 1 || (method3 = methodArr2[i17]) == null) {
                                                    string = null;
                                                } else {
                                                    string = method3.toString();
                                                }
                                                arrayList.add(string);
                                                if ((i + 6) * i2 == 0) {
                                                    throw new NullPointerException();
                                                }
                                                ArrayList arrayList2 = new ArrayList();
                                                iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, lambdasubmitstillcapturerequest4)).intValue();
                                                methodArr = new Method[]{OkHttpClient.Builder.class.getMethod("addInterceptor", Interceptor.class)};
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                                    char mirror = (char) (AndroidCharacter.getMirror('0') - '0');
                                                    int iRed2 = 2823 - Color.red(0);
                                                    int i18 = 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                                    byte[] bArr8 = $$a;
                                                    Object[] objArr12 = new Object[1];
                                                    a(bArr8[10], (byte) (-bArr8[5]), bArr8[7], objArr12);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mirror, iRed2, i18, 1814927978, false, (String) objArr12[0], null);
                                                }
                                                if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
                                                    declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - Process.getGidForName("")), 2823 - View.getDefaultSize(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 23)).getDeclaredMethods();
                                                    length = declaredMethods.length;
                                                    i5 = 0;
                                                    while (i5 < length) {
                                                        method2 = declaredMethods[i5];
                                                        try {
                                                            Method[] methodArr4 = declaredMethods;
                                                            if (!((Boolean) Class.forName("java.lang.reflect.Modifier").getMethod("isNative", Integer.TYPE).invoke(null, Integer.valueOf(((Integer) Class.forName("java.lang.reflect.Method").getMethod("getModifiers", null).invoke(method2, null)).intValue()))).booleanValue() && Long.TYPE.equals(Class.forName("java.lang.reflect.Method").getMethod("getReturnType", null).invoke(method2, null))) {
                                                                Object[] objArr13 = (Object[]) Class.forName("java.lang.reflect.Method").getMethod("getParameterTypes", null).invoke(method2, null);
                                                                if (objArr13.length == 2 && Long.TYPE.equals(objArr13[0]) && Class.forName("java.lang.reflect.Method").equals(objArr13[1])) {
                                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault14 == null) {
                                                                        char cKeyCodeFromString = (char) KeyEvent.keyCodeFromString("");
                                                                        int iResolveSize = 2823 - View.resolveSize(0, 0);
                                                                        int iIndexOf2 = 21 - TextUtils.indexOf((CharSequence) "", '0');
                                                                        byte[] bArr9 = $$a;
                                                                        Object[] objArr14 = new Object[1];
                                                                        a(bArr9[10], (byte) (-bArr9[5]), bArr9[7], objArr14);
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault14 = initSession.b(cKeyCodeFromString, iResolveSize, iIndexOf2, 1814927978, false, (String) objArr14[0], null);
                                                                    }
                                                                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault14).set(null, method2);
                                                                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault15 == null) {
                                                                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                                                                        int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 2823;
                                                                        int iIndexOf3 = 22 - TextUtils.indexOf("", "");
                                                                        byte[] bArr10 = $$a;
                                                                        Object[] objArr15 = new Object[1];
                                                                        a(bArr10[10], (byte) (-bArr10[5]), bArr10[7], objArr15);
                                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault15 = initSession.b(packedPositionType, offsetAfter2, iIndexOf3, 1814927978, false, (String) objArr15[0], null);
                                                                    }
                                                                    try {
                                                                        Object[] objArr16 = {0L, ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault15).get(null)};
                                                                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1678062333);
                                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault16 == null) {
                                                                            char c3 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                                                            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 2823;
                                                                            int capsMode = TextUtils.getCapsMode("", 0, 0) + 22;
                                                                            byte[] bArr11 = $$a;
                                                                            byte b3 = bArr11[7];
                                                                            Object[] objArr17 = new Object[1];
                                                                            a(b3, (byte) (b3 | 51), bArr11[5], objArr17);
                                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault16 = initSession.b(c3, touchSlop, capsMode, -2137287382, false, (String) objArr17[0], new Class[]{Long.TYPE, Method.class});
                                                                        }
                                                                        ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault16).invoke(null, objArr16)).longValue();
                                                                        break;
                                                                    } catch (Throwable th10) {
                                                                        Throwable cause5 = th10.getCause();
                                                                        if (cause5 != null) {
                                                                            throw cause5;
                                                                        }
                                                                        throw th10;
                                                                    }
                                                                }
                                                            }
                                                            i5++;
                                                            declaredMethods = methodArr4;
                                                        } catch (Throwable th11) {
                                                            Throwable cause6 = th11.getCause();
                                                            if (cause6 != null) {
                                                                throw cause6;
                                                            }
                                                            throw th11;
                                                        }
                                                    }
                                                }
                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                                    int iIndexOf4 = TextUtils.indexOf((CharSequence) "", '0', 0) + 2824;
                                                    int jumpTapTimeout2 = 22 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                    byte[] bArr12 = $$a;
                                                    Object[] objArr18 = new Object[1];
                                                    a(bArr12[10], (byte) (-bArr12[5]), bArr12[7], objArr18);
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity, iIndexOf4, jumpTapTimeout2, 1814927978, false, (String) objArr18[0], null);
                                                }
                                                try {
                                                    Object[] objArr19 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
                                                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                                                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                                        try {
                                                            char cRed2 = (char) Color.red(0);
                                                            int iNormalizeMetaState = 2823 - KeyEvent.normalizeMetaState(0);
                                                            int iMyPid2 = 22 - (Process.myPid() >> 22);
                                                            byte[] bArr13 = $$a;
                                                            Object[] objArr20 = new Object[1];
                                                            a((byte) (bArr13[2] - 1), (byte) 51, bArr13[5], objArr20);
                                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed2, iNormalizeMetaState, iMyPid2, 1025296417, false, (String) objArr20[0], new Class[]{Object.class});
                                                        } catch (Throwable th12) {
                                                            th4 = th12;
                                                            Throwable cause7 = th4.getCause();
                                                            if (cause7 != null) {
                                                                throw cause7;
                                                            }
                                                            throw th4;
                                                        }
                                                    }
                                                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr19);
                                                    try {
                                                        Object[] objArr21 = {0, methodArr, null};
                                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                                            try {
                                                                char windowTouchSlop = (char) (37657 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                                                                int i19 = 2720 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                                                int doubleTapTimeout = 19 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                                                byte[] bArr14 = $$a;
                                                                Object[] objArr22 = new Object[1];
                                                                a((byte) (bArr14[2] - 1), (byte) 51, bArr14[5], objArr22);
                                                                objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(windowTouchSlop, i19, doubleTapTimeout, -1568796068, false, (String) objArr22[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                                                            } catch (Throwable th13) {
                                                                th5 = th13;
                                                                Throwable cause8 = th5.getCause();
                                                                if (cause8 != null) {
                                                                    throw cause8;
                                                                }
                                                                throw th5;
                                                            }
                                                        }
                                                        long jLongValue2 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr21)).longValue();
                                                        long j7 = 102092587;
                                                        configurationTuitionPaymentFragmentspecialinlinedviewModeldefault1 = configuration2;
                                                        long j8 = -496;
                                                        long j9 = (j8 * j7) + (j8 * jLongValue2);
                                                        long j10 = 497;
                                                        long j11 = j7 ^ j;
                                                        long j12 = jLongValue2 ^ j;
                                                        long j13 = j11 | j12;
                                                        long jElapsedRealtime = (int) SystemClock.elapsedRealtime();
                                                        long j14 = jElapsedRealtime ^ j;
                                                        long j15 = j9 + ((j13 ^ j) * j10) + ((((j13 | jElapsedRealtime) ^ j) | (((j12 | j14) | j7) ^ j)) * j10) + (j10 * (((jElapsedRealtime | (j12 | j7)) ^ j) | ((j11 | j14) ^ j) | ((j11 | jLongValue2) ^ j))) + ((long) (-1912498432));
                                                        int i20 = (int) (j15 >> 32);
                                                        int i21 = (int) Runtime.getRuntime().totalMemory();
                                                        int i22 = (~((-363984441) | i21)) | 363877936;
                                                        int i23 = i20 & (1537498186 + (i22 * 992) + ((i22 | (~((~i21) | 1073348474))) * (-496)) + ((i21 | 1073241970) * 496));
                                                        int iMyUid = Process.myUid();
                                                        int i24 = ~iMyUid;
                                                        int i25 = (((int) j15) & ((-1729211613) + (((~(750419287 | i24)) | (~((-686807123) | iMyUid))) * 333) + (((~(iMyUid | 750419287)) | (~(i24 | (-686807123)))) * 333))) | i23;
                                                        i3 = i25 >>> 24;
                                                        int i26 = i25 & ViewCompat.MEASURED_SIZE_MASK;
                                                        if (i3 != 0) {
                                                            i4 = 1;
                                                        } else {
                                                            i4 = 0;
                                                        }
                                                        if (i4 != 0 || i26 >= 1 || (method = methodArr[i26]) == null) {
                                                            string2 = null;
                                                        } else {
                                                            string2 = method.toString();
                                                        }
                                                        arrayList2.add(string2);
                                                        if ((i3 + 6) * i4 != 0) {
                                                            int[] iArr = new int[iIntValue];
                                                            int i27 = iIntValue - 1;
                                                            iArr[i27] = 1;
                                                            str = null;
                                                            Toast.makeText((Context) null, iArr[((iIntValue * i27) % 2) - 1], 1).show();
                                                        } else {
                                                            str = null;
                                                        }
                                                        if (tuitionPaymentFragmentspecialinlinedviewModeldefault5.asBinder) {
                                                            connectionSpecBuild = ConnectionSpec.CLEARTEXT;
                                                        } else {
                                                            ConnectionSpec.Builder builderTlsVersions = new ConnectionSpec.Builder(ConnectionSpec.RESTRICTED_TLS).tlsVersions(TlsVersion.TLS_1_2, TlsVersion.TLS_1_3);
                                                            CipherSuite[] cipherSuiteArr = lambdasubmitStillCaptureRequest4.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                            connectionSpecBuild = builderTlsVersions.cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr, cipherSuiteArr.length)).build();
                                                        }
                                                        builder = new OkHttpClient.Builder();
                                                        long j16 = lambdasubmitStillCaptureRequest4.b;
                                                        builder.callTimeout(j16, TimeUnit.MILLISECONDS).writeTimeout(j16, TimeUnit.MILLISECONDS).protocols(CollectionsKt.listOf((Object[]) new Protocol[]{Protocol.HTTP_2, Protocol.HTTP_1_1})).connectionSpecs(CollectionsKt.listOf(connectionSpecBuild));
                                                        builder.addInterceptor(new isProcessingPipelineEnabled(lambdasubmitstillcapturerequest4.INotificationSideChannelStub));
                                                        if (tuitionPaymentFragmentspecialinlinedviewModeldefault5.f685a != null) {
                                                            builder.proxy(tuitionPaymentFragmentspecialinlinedviewModeldefault5.f685a);
                                                            builder.proxyAuthenticator(tuitionPaymentFragmentspecialinlinedviewModeldefault5.asInterface);
                                                        }
                                                        builder.dns(new takePicture(null, 0L, 3, null));
                                                        OkHttpClient okHttpClientBuild = builder.build();
                                                        Intrinsics.checkNotNullParameter(okHttpClientBuild, "");
                                                        lambdasubmitstillcapturerequest4.connect = okHttpClientBuild;
                                                        setIoExecutor setioexecutor = lambdasubmitstillcapturerequest4.cancelAll;
                                                        Map<String, Set<Object>> map = configurationTuitionPaymentFragmentspecialinlinedviewModeldefault1.b.g;
                                                        Intrinsics.checkNotNullParameter(map, "");
                                                        Map<String, ? extends Set<? extends Object>> map2 = setioexecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                                        Set<Map.Entry<String, Set<Object>>> setEntrySet = map.entrySet();
                                                        linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
                                                        it = setEntrySet.iterator();
                                                        while (it.hasNext()) {
                                                            Map.Entry entry = (Map.Entry) it.next();
                                                            String str5 = (String) entry.getKey();
                                                            Locale locale = Locale.US;
                                                            Intrinsics.checkNotNullExpressionValue(locale, "");
                                                            String lowerCase = str5.toLowerCase(locale);
                                                            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
                                                            Pair pair = TuplesKt.to(lowerCase, entry.getValue());
                                                            linkedHashMap.put(pair.getFirst(), pair.getSecond());
                                                        }
                                                        setioexecutor.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = MapsKt.plus(map2, linkedHashMap);
                                                        isSupportedYUVFormat issupportedyuvformat = new isSupportedYUVFormat(context2);
                                                        Intrinsics.checkNotNullParameter(issupportedyuvformat, "");
                                                        lambdasubmitstillcapturerequest4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = issupportedyuvformat;
                                                        final String str6 = str4;
                                                        File file4 = (File) abortImageCaptureRequests.TuitionPaymentFragmentbindingInflater1(new Function0<File>() { // from class: com.datadog.android.core.internal.CoreFeature$initialize$2
                                                            @Override // kotlin.jvm.functions.Function0
                                                            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                                                            public final File invoke() {
                                                                File cacheDir = context2.getCacheDir();
                                                                String str7 = String.format(Locale.US, "datadog-%s", Arrays.copyOf(new Object[]{str6}, 1));
                                                                Intrinsics.checkNotNullExpressionValue(str7, "");
                                                                return new File(cacheDir, str7);
                                                            }

                                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                            {
                                                                super(0);
                                                            }
                                                        });
                                                        Intrinsics.checkNotNullParameter(file4, "");
                                                        lambdasubmitstillcapturerequest4.isConnected = file4;
                                                        obj = configurationTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get("_dd.native_source_type");
                                                        if (obj instanceof String) {
                                                            str2 = (String) obj;
                                                        } else {
                                                            str2 = str;
                                                        }
                                                        if (lambdasubmitstillcapturerequest4.INotificationSideChannelDefault) {
                                                            file3 = lambdasubmitstillcapturerequest4.isConnected;
                                                            if (file3 != null) {
                                                                r21 = file3;
                                                            } else {
                                                                Intrinsics.throwUninitializedPropertyAccessException("");
                                                                r21 = str;
                                                            }
                                                            imageReaderProxys5 = lambdasubmitstillcapturerequest4.getNotifyChildrenChangedOptions;
                                                            if (imageReaderProxys5 != null) {
                                                                obj6 = imageReaderProxys5;
                                                            } else {
                                                                Intrinsics.throwUninitializedPropertyAccessException("");
                                                                obj6 = str;
                                                            }
                                                            ExecutorService executorService = (ExecutorService) obj6;
                                                            isDebugEnabled isdebugenabled = new isDebugEnabled(lambdasubmitstillcapturerequest4.INotificationSideChannelStub);
                                                            setOutputFormat setoutputformat = new setOutputFormat(lambdasubmitstillcapturerequest4.INotificationSideChannelStub);
                                                            ImageProcessorOutputFormats imageProcessorOutputFormats = new ImageProcessorOutputFormats(lambdasubmitstillcapturerequest4.INotificationSideChannelStub);
                                                            InternalLogger internalLogger4 = lambdasubmitstillcapturerequest4.INotificationSideChannelStub;
                                                            getImageCaptureError.Companion companion3 = getImageCaptureError.INSTANCE;
                                                            getImageCaptureError getimagecaptureerrorTuitionPaymentFragmentspecialinlinedviewModeldefault3 = getImageCaptureError.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdasubmitstillcapturerequest4.INotificationSideChannelStub, lambdasubmitstillcapturerequest4.write);
                                                            CoreFeature$prepareNdkCrashData$1 coreFeature$prepareNdkCrashData$1 = new CoreFeature$prepareNdkCrashData$1(lambdasubmitstillcapturerequest4);
                                                            if (str2 == null) {
                                                                str2 = "ndk";
                                                            }
                                                            Logger logger = new Logger(r21, executorService, isdebugenabled, setoutputformat, imageProcessorOutputFormats, internalLogger4, getimagecaptureerrorTuitionPaymentFragmentspecialinlinedviewModeldefault3, coreFeature$prepareNdkCrashData$1, str2);
                                                            lambdasubmitstillcapturerequest4.IconCompatParcelizer = logger;
                                                            logger.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                                        }
                                                        lambdasubmitstillcapturerequest4.handleMessage = new applyPixelShiftInternal(trackingConsent2);
                                                        BroadcastReceiverSystemInfoProvider broadcastReceiverSystemInfoProvider = new BroadcastReceiverSystemInfoProvider(lambdasubmitstillcapturerequest4.INotificationSideChannelStub);
                                                        lambdasubmitstillcapturerequest4.unsubscribe = broadcastReceiverSystemInfoProvider;
                                                        broadcastReceiverSystemInfoProvider.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context2);
                                                        file = lambdasubmitstillcapturerequest4.isConnected;
                                                        if (file != null) {
                                                            r6 = file;
                                                        } else {
                                                            Intrinsics.throwUninitializedPropertyAccessException("");
                                                            r6 = str;
                                                        }
                                                        convertYUVToRGBInternal convertyuvtorgbinternal = lambdasubmitstillcapturerequest4.handleMessage;
                                                        imageReaderProxys = lambdasubmitstillcapturerequest4.getNotifyChildrenChangedOptions;
                                                        if (imageReaderProxys != null) {
                                                            obj2 = imageReaderProxys;
                                                        } else {
                                                            Intrinsics.throwUninitializedPropertyAccessException("");
                                                            obj2 = str;
                                                        }
                                                        ExecutorService executorService2 = (ExecutorService) obj2;
                                                        getImageCaptureError.Companion companion4 = getImageCaptureError.INSTANCE;
                                                        isErrorEnabled iserrorenabled = new isErrorEnabled(r6, convertyuvtorgbinternal, executorService2, getImageCaptureError.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdasubmitstillcapturerequest4.INotificationSideChannelStub, lambdasubmitstillcapturerequest4.write), new getSavedUri(lambdasubmitstillcapturerequest4.INotificationSideChannelStub), lambdasubmitstillcapturerequest4.INotificationSideChannelStub, new getSaveCollection(lambdasubmitstillcapturerequest4.asBinder.getWindowDurationMs(), 0L, 0L, 0, 0L, 0L, 0L, 126, null));
                                                        imageReaderProxys2 = lambdasubmitstillcapturerequest4.getNotifyChildrenChangedOptions;
                                                        if (imageReaderProxys2 != null) {
                                                            obj3 = imageReaderProxys2;
                                                        } else {
                                                            Intrinsics.throwUninitializedPropertyAccessException("");
                                                            obj3 = str;
                                                        }
                                                        setPostviewEnabled setpostviewenabled = new setPostviewEnabled(new ImageCaptureExtKttakePicture41(iserrorenabled, (ExecutorService) obj3, lambdasubmitstillcapturerequest4.INotificationSideChannelStub), null, lambdasubmitstillcapturerequest4.INotificationSideChannelStub, 2, null);
                                                        lambdasubmitstillcapturerequest4.read = setpostviewenabled;
                                                        setpostviewenabled.b(context2);
                                                        file2 = lambdasubmitstillcapturerequest4.isConnected;
                                                        if (file2 != null) {
                                                            r7 = file2;
                                                        } else {
                                                            Intrinsics.throwUninitializedPropertyAccessException("");
                                                            r7 = str;
                                                        }
                                                        convertYUVToRGBInternal convertyuvtorgbinternal2 = lambdasubmitstillcapturerequest4.handleMessage;
                                                        imageReaderProxys3 = lambdasubmitstillcapturerequest4.getNotifyChildrenChangedOptions;
                                                        if (imageReaderProxys3 != null) {
                                                            obj4 = imageReaderProxys3;
                                                        } else {
                                                            Intrinsics.throwUninitializedPropertyAccessException("");
                                                            obj4 = str;
                                                        }
                                                        ExecutorService executorService3 = (ExecutorService) obj4;
                                                        getImageCaptureError.Companion companion5 = getImageCaptureError.INSTANCE;
                                                        isLogLevelEnabled isloglevelenabled = new isLogLevelEnabled(r7, convertyuvtorgbinternal2, executorService3, getImageCaptureError.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdasubmitstillcapturerequest4.INotificationSideChannelStub, lambdasubmitstillcapturerequest4.write), new getSavedUri(lambdasubmitstillcapturerequest4.INotificationSideChannelStub), lambdasubmitstillcapturerequest4.INotificationSideChannelStub, new getSaveCollection(lambdasubmitstillcapturerequest4.asBinder.getWindowDurationMs(), 0L, 0L, 0, 0L, 0L, 0L, 126, null));
                                                        imageReaderProxys4 = lambdasubmitstillcapturerequest4.getNotifyChildrenChangedOptions;
                                                        if (imageReaderProxys4 != null) {
                                                            obj5 = imageReaderProxys4;
                                                        } else {
                                                            Intrinsics.throwUninitializedPropertyAccessException("");
                                                            obj5 = str;
                                                        }
                                                        lambdasubmitstillcapturerequest4.MediaBrowserCompatConnectionCallback = new ImageProcessorRequest(new ImageCaptureExtKttakePicture41(isloglevelenabled, (ExecutorService) obj5, lambdasubmitstillcapturerequest4.INotificationSideChannelStub));
                                                        lambdasubmitstillcapturerequest4.onTransact.set(true);
                                                        lambdasubmitstillcapturerequest4.asInterface = new setScreenFlashToCameraControl(lambdasubmitstillcapturerequest4);
                                                        r31 = trysetflashmodetocameracontrol;
                                                    } catch (Throwable th14) {
                                                        th5 = th14;
                                                    }
                                                } catch (Throwable th15) {
                                                    th4 = th15;
                                                }
                                            } catch (Throwable th16) {
                                                th3 = th16;
                                            }
                                        } catch (Throwable th17) {
                                            th2 = th17;
                                        }
                                    } else {
                                        str4 = str4;
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                                            char modifierMetaStateMask2 = (char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                                            int iRed3 = 2823 - Color.red(0);
                                            int i110 = 23 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                            byte[] bArr15 = $$a;
                                            Object[] objArr23 = new Object[1];
                                            a(bArr15[10], (byte) (-bArr15[5]), bArr15[7], objArr23);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(modifierMetaStateMask2, iRed3, i110, 1814927978, false, (String) objArr23[0], null);
                                        }
                                        Object[] objArr24 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).get(null)};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                            char cRed3 = (char) Color.red(0);
                                            int i111 = 2824 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                            int threadPriority2 = 22 - ((Process.getThreadPriority(0) + 20) >> 6);
                                            byte[] bArr16 = $$a;
                                            Object[] objArr25 = new Object[1];
                                            a((byte) (bArr16[2] - 1), (byte) 51, bArr16[5], objArr25);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cRed3, i111, threadPriority2, 1025296417, false, (String) objArr25[0], new Class[]{Object.class});
                                        }
                                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr24);
                                        Object[] objArr110 = {0, methodArr2, null};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                                            char c4 = (char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 37657);
                                            int iResolveSizeAndState2 = View.resolveSizeAndState(0, 0, 0) + 2720;
                                            int offsetAfter3 = TextUtils.getOffsetAfter("", 0) + 19;
                                            byte[] bArr17 = $$a;
                                            Object[] objArr111 = new Object[1];
                                            a((byte) (bArr17[2] - 1), (byte) 51, bArr17[5], objArr111);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c4, iResolveSizeAndState2, offsetAfter3, -1568796068, false, (String) objArr111[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                                        }
                                        long jLongValue3 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr110)).longValue();
                                        long j17 = -101833356;
                                        long j18 = 628;
                                        long j19 = (j18 * j17) + (j18 * jLongValue3);
                                        long j20 = -627;
                                        configuration2 = configurationTuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                        long elapsedCpuTime3 = (int) Process.getElapsedCpuTime();
                                        lambdasubmitstillcapturerequest4 = lambdasubmitstillcapturerequest6;
                                        j = -1;
                                        long j21 = j19 + ((jLongValue3 | elapsedCpuTime3 | (j17 ^ j)) * j20) + (j20 * (j17 | (((jLongValue3 ^ j) | elapsedCpuTime3) ^ j))) + (((long) 627) * ((((elapsedCpuTime3 ^ j) | jLongValue3) ^ j) | ((elapsedCpuTime3 | j17) ^ j))) + ((long) (-1708572489));
                                        int elapsedCpuTime4 = (int) Process.getElapsedCpuTime();
                                        int i112 = ~elapsedCpuTime4;
                                        int i113 = ((int) (j21 >> 32)) & (1203769542 + (((~(1917427768 | i112)) | (~((-805830681) | elapsedCpuTime4))) * (-831)) + ((~((-134482437) | elapsedCpuTime4)) * (-1662)) + (((~(elapsedCpuTime4 | (-1917427769))) | (~(i112 | 940313116)) | (~((-940313117) | elapsedCpuTime4))) * 831));
                                        int i114 = (int) j21;
                                        int i115 = ~((int) SystemClock.uptimeMillis());
                                        int i116 = (i114 & ((-261820174) + ((~((-159383825) | i115)) * (-783)) + (((~(i115 | (-796950845))) | 640275565) * 783))) | i113;
                                        i = i116 >>> 24;
                                        int i117 = i116 & ViewCompat.MEASURED_SIZE_MASK;
                                        if (i != 0) {
                                            i2 = 1;
                                        } else {
                                            i2 = 0;
                                        }
                                        if (i2 != 0) {
                                            string = null;
                                        } else {
                                            string = null;
                                        }
                                        arrayList.add(string);
                                        if ((i + 6) * i2 == 0) {
                                            throw new NullPointerException();
                                        }
                                        ArrayList arrayList3 = new ArrayList();
                                        iIntValue = ((Integer) Class.forName("java.lang.System").getMethod("identityHashCode", Object.class).invoke(null, lambdasubmitstillcapturerequest4)).intValue();
                                        methodArr = new Method[]{OkHttpClient.Builder.class.getMethod("addInterceptor", Interceptor.class)};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                                            char mirror2 = (char) (AndroidCharacter.getMirror('0') - '0');
                                            int iRed4 = 2823 - Color.red(0);
                                            int i118 = 23 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1));
                                            byte[] bArr18 = $$a;
                                            Object[] objArr112 = new Object[1];
                                            a(bArr18[10], (byte) (-bArr18[5]), bArr18[7], objArr112);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(mirror2, iRed4, i118, 1814927978, false, (String) objArr112[0], null);
                                        }
                                        if (((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).get(null) == null) {
                                            declaredMethods = ((Class) initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault2((char) ((-1) - Process.getGidForName("")), 2823 - View.getDefaultSize(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 23)).getDeclaredMethods();
                                            length = declaredMethods.length;
                                            i5 = 0;
                                            while (i5 < length) {
                                                method2 = declaredMethods[i5];
                                                Method[] methodArr5 = declaredMethods;
                                                if (!((Boolean) Class.forName("java.lang.reflect.Modifier").getMethod("isNative", Integer.TYPE).invoke(null, Integer.valueOf(((Integer) Class.forName("java.lang.reflect.Method").getMethod("getModifiers", null).invoke(method2, null)).intValue()))).booleanValue()) {
                                                }
                                                i5++;
                                                declaredMethods = methodArr5;
                                            }
                                        }
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-2001519171);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                                            char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                            int iIndexOf5 = TextUtils.indexOf((CharSequence) "", '0', 0) + 2824;
                                            int jumpTapTimeout3 = 22 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                            byte[] bArr19 = $$a;
                                            Object[] objArr113 = new Object[1];
                                            a(bArr19[10], (byte) (-bArr19[5]), bArr19[7], objArr113);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(minimumFlingVelocity2, iIndexOf5, jumpTapTimeout3, 1814927978, false, (String) objArr113[0], null);
                                        }
                                        Object[] objArr114 = {((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).get(null)};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-645763082);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                                            char cRed4 = (char) Color.red(0);
                                            int iNormalizeMetaState2 = 2823 - KeyEvent.normalizeMetaState(0);
                                            int iMyPid3 = 22 - (Process.myPid() >> 22);
                                            byte[] bArr110 = $$a;
                                            Object[] objArr26 = new Object[1];
                                            a((byte) (bArr110[2] - 1), (byte) 51, bArr110[5], objArr26);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cRed4, iNormalizeMetaState2, iMyPid3, 1025296417, false, (String) objArr26[0], new Class[]{Object.class});
                                        }
                                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr114);
                                        Object[] objArr27 = {0, methodArr, null};
                                        objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1189131659);
                                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault9 == null) {
                                            char windowTouchSlop2 = (char) (37657 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                                            int i119 = 2720 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1));
                                            int doubleTapTimeout2 = 19 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                                            byte[] bArr111 = $$a;
                                            Object[] objArr28 = new Object[1];
                                            a((byte) (bArr111[2] - 1), (byte) 51, bArr111[5], objArr28);
                                            objTuitionPaymentFragmentspecialinlinedviewModeldefault9 = initSession.b(windowTouchSlop2, i119, doubleTapTimeout2, -1568796068, false, (String) objArr28[0], new Class[]{Integer.TYPE, Method[].class, List.class});
                                        }
                                        long jLongValue4 = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault9).invoke(null, objArr27)).longValue();
                                        long j22 = 102092587;
                                        configurationTuitionPaymentFragmentspecialinlinedviewModeldefault1 = configuration2;
                                        long j23 = -496;
                                        long j24 = (j23 * j22) + (j23 * jLongValue4);
                                        long j110 = 497;
                                        long j111 = j22 ^ j;
                                        long j112 = jLongValue4 ^ j;
                                        long j113 = j111 | j112;
                                        long jElapsedRealtime2 = (int) SystemClock.elapsedRealtime();
                                        long j114 = jElapsedRealtime2 ^ j;
                                        long j115 = j24 + ((j113 ^ j) * j110) + ((((j113 | jElapsedRealtime2) ^ j) | (((j112 | j114) | j22) ^ j)) * j110) + (j110 * (((jElapsedRealtime2 | (j112 | j22)) ^ j) | ((j111 | j114) ^ j) | ((j111 | jLongValue4) ^ j))) + ((long) (-1912498432));
                                        int i28 = (int) (j115 >> 32);
                                        int i29 = (int) Runtime.getRuntime().totalMemory();
                                        int i210 = (~((-363984441) | i29)) | 363877936;
                                        int i211 = i28 & (1537498186 + (i210 * 992) + ((i210 | (~((~i29) | 1073348474))) * (-496)) + ((i29 | 1073241970) * 496));
                                        int iMyUid2 = Process.myUid();
                                        int i212 = ~iMyUid2;
                                        int i213 = (((int) j115) & ((-1729211613) + (((~(750419287 | i212)) | (~((-686807123) | iMyUid2))) * 333) + (((~(iMyUid2 | 750419287)) | (~(i212 | (-686807123)))) * 333))) | i211;
                                        i3 = i213 >>> 24;
                                        int i214 = i213 & ViewCompat.MEASURED_SIZE_MASK;
                                        if (i3 != 0) {
                                            i4 = 1;
                                        } else {
                                            i4 = 0;
                                        }
                                        if (i4 != 0) {
                                            string2 = null;
                                        } else {
                                            string2 = null;
                                        }
                                        arrayList3.add(string2);
                                        if ((i3 + 6) * i4 != 0) {
                                            int[] iArr2 = new int[iIntValue];
                                            int i215 = iIntValue - 1;
                                            iArr2[i215] = 1;
                                            str = null;
                                            Toast.makeText((Context) null, iArr2[((iIntValue * i215) % 2) - 1], 1).show();
                                        } else {
                                            str = null;
                                        }
                                        if (tuitionPaymentFragmentspecialinlinedviewModeldefault5.asBinder) {
                                            connectionSpecBuild = ConnectionSpec.CLEARTEXT;
                                        } else {
                                            ConnectionSpec.Builder builderTlsVersions2 = new ConnectionSpec.Builder(ConnectionSpec.RESTRICTED_TLS).tlsVersions(TlsVersion.TLS_1_2, TlsVersion.TLS_1_3);
                                            CipherSuite[] cipherSuiteArr2 = lambdasubmitStillCaptureRequest4.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                            connectionSpecBuild = builderTlsVersions2.cipherSuites((CipherSuite[]) Arrays.copyOf(cipherSuiteArr2, cipherSuiteArr2.length)).build();
                                        }
                                        builder = new OkHttpClient.Builder();
                                        long j116 = lambdasubmitStillCaptureRequest4.b;
                                        builder.callTimeout(j116, TimeUnit.MILLISECONDS).writeTimeout(j116, TimeUnit.MILLISECONDS).protocols(CollectionsKt.listOf((Object[]) new Protocol[]{Protocol.HTTP_2, Protocol.HTTP_1_1})).connectionSpecs(CollectionsKt.listOf(connectionSpecBuild));
                                        builder.addInterceptor(new isProcessingPipelineEnabled(lambdasubmitstillcapturerequest4.INotificationSideChannelStub));
                                        if (tuitionPaymentFragmentspecialinlinedviewModeldefault5.f685a != null) {
                                            builder.proxy(tuitionPaymentFragmentspecialinlinedviewModeldefault5.f685a);
                                            builder.proxyAuthenticator(tuitionPaymentFragmentspecialinlinedviewModeldefault5.asInterface);
                                        }
                                        builder.dns(new takePicture(null, 0L, 3, null));
                                        OkHttpClient okHttpClientBuild2 = builder.build();
                                        Intrinsics.checkNotNullParameter(okHttpClientBuild2, "");
                                        lambdasubmitstillcapturerequest4.connect = okHttpClientBuild2;
                                        setIoExecutor setioexecutor2 = lambdasubmitstillcapturerequest4.cancelAll;
                                        Map<String, Set<Object>> map3 = configurationTuitionPaymentFragmentspecialinlinedviewModeldefault1.b.g;
                                        Intrinsics.checkNotNullParameter(map3, "");
                                        Map<String, ? extends Set<? extends Object>> map4 = setioexecutor2.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                        Set<Map.Entry<String, Set<Object>>> setEntrySet2 = map3.entrySet();
                                        linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet2, 10)), 16));
                                        it = setEntrySet2.iterator();
                                        while (it.hasNext()) {
                                            Map.Entry entry2 = (Map.Entry) it.next();
                                            String str7 = (String) entry2.getKey();
                                            Locale locale2 = Locale.US;
                                            Intrinsics.checkNotNullExpressionValue(locale2, "");
                                            String lowerCase2 = str7.toLowerCase(locale2);
                                            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
                                            Pair pair2 = TuplesKt.to(lowerCase2, entry2.getValue());
                                            linkedHashMap.put(pair2.getFirst(), pair2.getSecond());
                                        }
                                        setioexecutor2.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = MapsKt.plus(map4, linkedHashMap);
                                        isSupportedYUVFormat issupportedyuvformat2 = new isSupportedYUVFormat(context2);
                                        Intrinsics.checkNotNullParameter(issupportedyuvformat2, "");
                                        lambdasubmitstillcapturerequest4.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = issupportedyuvformat2;
                                        final String str8 = str4;
                                        File file5 = (File) abortImageCaptureRequests.TuitionPaymentFragmentbindingInflater1(new Function0<File>() { // from class: com.datadog.android.core.internal.CoreFeature$initialize$2
                                            @Override // kotlin.jvm.functions.Function0
                                            /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: merged with bridge method [inline-methods] */
                                            public final File invoke() {
                                                File cacheDir = context2.getCacheDir();
                                                String str9 = String.format(Locale.US, "datadog-%s", Arrays.copyOf(new Object[]{str8}, 1));
                                                Intrinsics.checkNotNullExpressionValue(str9, "");
                                                return new File(cacheDir, str9);
                                            }

                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            {
                                                super(0);
                                            }
                                        });
                                        Intrinsics.checkNotNullParameter(file5, "");
                                        lambdasubmitstillcapturerequest4.isConnected = file5;
                                        obj = configurationTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3.get("_dd.native_source_type");
                                        if (obj instanceof String) {
                                            str2 = (String) obj;
                                        } else {
                                            str2 = str;
                                        }
                                        if (lambdasubmitstillcapturerequest4.INotificationSideChannelDefault) {
                                            file3 = lambdasubmitstillcapturerequest4.isConnected;
                                            if (file3 != null) {
                                                r21 = file3;
                                            } else {
                                                Intrinsics.throwUninitializedPropertyAccessException("");
                                                r21 = str;
                                            }
                                            imageReaderProxys5 = lambdasubmitstillcapturerequest4.getNotifyChildrenChangedOptions;
                                            if (imageReaderProxys5 != null) {
                                                obj6 = imageReaderProxys5;
                                            } else {
                                                Intrinsics.throwUninitializedPropertyAccessException("");
                                                obj6 = str;
                                            }
                                            ExecutorService executorService4 = (ExecutorService) obj6;
                                            isDebugEnabled isdebugenabled2 = new isDebugEnabled(lambdasubmitstillcapturerequest4.INotificationSideChannelStub);
                                            setOutputFormat setoutputformat2 = new setOutputFormat(lambdasubmitstillcapturerequest4.INotificationSideChannelStub);
                                            ImageProcessorOutputFormats imageProcessorOutputFormats2 = new ImageProcessorOutputFormats(lambdasubmitstillcapturerequest4.INotificationSideChannelStub);
                                            InternalLogger internalLogger5 = lambdasubmitstillcapturerequest4.INotificationSideChannelStub;
                                            getImageCaptureError.Companion companion6 = getImageCaptureError.INSTANCE;
                                            getImageCaptureError getimagecaptureerrorTuitionPaymentFragmentspecialinlinedviewModeldefault4 = getImageCaptureError.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdasubmitstillcapturerequest4.INotificationSideChannelStub, lambdasubmitstillcapturerequest4.write);
                                            CoreFeature$prepareNdkCrashData$1 coreFeature$prepareNdkCrashData$2 = new CoreFeature$prepareNdkCrashData$1(lambdasubmitstillcapturerequest4);
                                            if (str2 == null) {
                                                str2 = "ndk";
                                            }
                                            Logger logger2 = new Logger(r21, executorService4, isdebugenabled2, setoutputformat2, imageProcessorOutputFormats2, internalLogger5, getimagecaptureerrorTuitionPaymentFragmentspecialinlinedviewModeldefault4, coreFeature$prepareNdkCrashData$2, str2);
                                            lambdasubmitstillcapturerequest4.IconCompatParcelizer = logger2;
                                            logger2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                                        }
                                        lambdasubmitstillcapturerequest4.handleMessage = new applyPixelShiftInternal(trackingConsent2);
                                        BroadcastReceiverSystemInfoProvider broadcastReceiverSystemInfoProvider2 = new BroadcastReceiverSystemInfoProvider(lambdasubmitstillcapturerequest4.INotificationSideChannelStub);
                                        lambdasubmitstillcapturerequest4.unsubscribe = broadcastReceiverSystemInfoProvider2;
                                        broadcastReceiverSystemInfoProvider2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(context2);
                                        file = lambdasubmitstillcapturerequest4.isConnected;
                                        if (file != null) {
                                            r6 = file;
                                        } else {
                                            Intrinsics.throwUninitializedPropertyAccessException("");
                                            r6 = str;
                                        }
                                        convertYUVToRGBInternal convertyuvtorgbinternal3 = lambdasubmitstillcapturerequest4.handleMessage;
                                        imageReaderProxys = lambdasubmitstillcapturerequest4.getNotifyChildrenChangedOptions;
                                        if (imageReaderProxys != null) {
                                            obj2 = imageReaderProxys;
                                        } else {
                                            Intrinsics.throwUninitializedPropertyAccessException("");
                                            obj2 = str;
                                        }
                                        ExecutorService executorService5 = (ExecutorService) obj2;
                                        getImageCaptureError.Companion companion7 = getImageCaptureError.INSTANCE;
                                        isErrorEnabled iserrorenabled2 = new isErrorEnabled(r6, convertyuvtorgbinternal3, executorService5, getImageCaptureError.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdasubmitstillcapturerequest4.INotificationSideChannelStub, lambdasubmitstillcapturerequest4.write), new getSavedUri(lambdasubmitstillcapturerequest4.INotificationSideChannelStub), lambdasubmitstillcapturerequest4.INotificationSideChannelStub, new getSaveCollection(lambdasubmitstillcapturerequest4.asBinder.getWindowDurationMs(), 0L, 0L, 0, 0L, 0L, 0L, 126, null));
                                        imageReaderProxys2 = lambdasubmitstillcapturerequest4.getNotifyChildrenChangedOptions;
                                        if (imageReaderProxys2 != null) {
                                            obj3 = imageReaderProxys2;
                                        } else {
                                            Intrinsics.throwUninitializedPropertyAccessException("");
                                            obj3 = str;
                                        }
                                        setPostviewEnabled setpostviewenabled2 = new setPostviewEnabled(new ImageCaptureExtKttakePicture41(iserrorenabled2, (ExecutorService) obj3, lambdasubmitstillcapturerequest4.INotificationSideChannelStub), null, lambdasubmitstillcapturerequest4.INotificationSideChannelStub, 2, null);
                                        lambdasubmitstillcapturerequest4.read = setpostviewenabled2;
                                        setpostviewenabled2.b(context2);
                                        file2 = lambdasubmitstillcapturerequest4.isConnected;
                                        if (file2 != null) {
                                            r7 = file2;
                                        } else {
                                            Intrinsics.throwUninitializedPropertyAccessException("");
                                            r7 = str;
                                        }
                                        convertYUVToRGBInternal convertyuvtorgbinternal4 = lambdasubmitstillcapturerequest4.handleMessage;
                                        imageReaderProxys3 = lambdasubmitstillcapturerequest4.getNotifyChildrenChangedOptions;
                                        if (imageReaderProxys3 != null) {
                                            obj4 = imageReaderProxys3;
                                        } else {
                                            Intrinsics.throwUninitializedPropertyAccessException("");
                                            obj4 = str;
                                        }
                                        ExecutorService executorService6 = (ExecutorService) obj4;
                                        getImageCaptureError.Companion companion8 = getImageCaptureError.INSTANCE;
                                        isLogLevelEnabled isloglevelenabled2 = new isLogLevelEnabled(r7, convertyuvtorgbinternal4, executorService6, getImageCaptureError.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault3(lambdasubmitstillcapturerequest4.INotificationSideChannelStub, lambdasubmitstillcapturerequest4.write), new getSavedUri(lambdasubmitstillcapturerequest4.INotificationSideChannelStub), lambdasubmitstillcapturerequest4.INotificationSideChannelStub, new getSaveCollection(lambdasubmitstillcapturerequest4.asBinder.getWindowDurationMs(), 0L, 0L, 0, 0L, 0L, 0L, 126, null));
                                        imageReaderProxys4 = lambdasubmitstillcapturerequest4.getNotifyChildrenChangedOptions;
                                        if (imageReaderProxys4 != null) {
                                            obj5 = imageReaderProxys4;
                                        } else {
                                            Intrinsics.throwUninitializedPropertyAccessException("");
                                            obj5 = str;
                                        }
                                        lambdasubmitstillcapturerequest4.MediaBrowserCompatConnectionCallback = new ImageProcessorRequest(new ImageCaptureExtKttakePicture41(isloglevelenabled2, (ExecutorService) obj5, lambdasubmitstillcapturerequest4.INotificationSideChannelStub));
                                        lambdasubmitstillcapturerequest4.onTransact.set(true);
                                        lambdasubmitstillcapturerequest4.asInterface = new setScreenFlashToCameraControl(lambdasubmitstillcapturerequest4);
                                        r31 = trysetflashmodetocameracontrol;
                                    }
                                } catch (Throwable th18) {
                                    th = th18;
                                    trysetflashmodetocameracontrol = trysetflashmodetocameracontrol;
                                    th = th;
                                    r2 = trysetflashmodetocameracontrol;
                                    throw th;
                                }
                                throw th;
                            }
                            r31 = trysetflashmodetocameracontrol;
                            str = null;
                            try {
                                Map<String, Object> map5 = configurationTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                Object obj8 = map5.get("_dd.source");
                                if (obj8 == null || !(obj8 instanceof String) || StringsKt.isBlank((CharSequence) obj8)) {
                                    r3 = r31;
                                } else {
                                    ?? r11 = r31;
                                    lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest7 = r11.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    if (lambdasubmitstillcapturerequest7 != null) {
                                        r9 = lambdasubmitstillcapturerequest7;
                                    } else {
                                        Intrinsics.throwUninitializedPropertyAccessException("");
                                        r9 = str;
                                    }
                                    String str9 = (String) obj8;
                                    Intrinsics.checkNotNullParameter(str9, "");
                                    r9.getSessionToken = str9;
                                    r3 = r11;
                                }
                                Object obj9 = map5.get("_dd.sdk_version");
                                if (obj9 != null && (obj9 instanceof String) && !StringsKt.isBlank((CharSequence) obj9)) {
                                    lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest8 = r3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    if (lambdasubmitstillcapturerequest8 != null) {
                                        r8 = lambdasubmitstillcapturerequest8;
                                    } else {
                                        Intrinsics.throwUninitializedPropertyAccessException("");
                                        r8 = str;
                                    }
                                    String str10 = (String) obj9;
                                    Intrinsics.checkNotNullParameter(str10, "");
                                    r8.getServiceComponent = str10;
                                }
                                Object obj10 = map5.get("_dd.version");
                                if (obj10 != null && (obj10 instanceof String) && !StringsKt.isBlank((CharSequence) obj10)) {
                                    lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest9 = r3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                    if (lambdasubmitstillcapturerequest9 != null) {
                                        r5 = lambdasubmitstillcapturerequest9;
                                    } else {
                                        Intrinsics.throwUninitializedPropertyAccessException("");
                                        r5 = str;
                                    }
                                    r5.getRoot.TuitionPaymentFragmentspecialinlinedviewModeldefault2((String) obj10);
                                }
                                if (configurationTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
                                    r3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(new InitializationException((ImageAnalysisBlockingAnalyzer) r3));
                                }
                                Context context3 = r3.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                                if (context3 instanceof Application) {
                                    ImageCaptureExternalSyntheticLambda3 imageCaptureExternalSyntheticLambda3 = new ImageCaptureExternalSyntheticLambda3(new unlockFlashMode(context3, r3.INotificationSideChannel, r3.asBinder));
                                    ((Application) context3).registerActivityLifecycleCallbacks(imageCaptureExternalSyntheticLambda3);
                                    r3.INotificationSideChannelStub = imageCaptureExternalSyntheticLambda3;
                                }
                                try {
                                    try {
                                        r3.INotificationSideChannelDefault = new Thread(new Runnable() { // from class: enforceSoftwareJpegConstraints
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                trySetFlashModeToCameraControl.b(r3);
                                            }
                                        }, "datadog_shutdown");
                                        ?? runtime = Runtime.getRuntime();
                                        Thread thread = r3.INotificationSideChannelDefault;
                                        ?? r12 = thread;
                                        if (thread == null) {
                                            Intrinsics.throwUninitializedPropertyAccessException("");
                                            r12 = str;
                                        }
                                        runtime.addShutdownHook(r12);
                                    } catch (IllegalStateException e2) {
                                        r3.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.DatadogCore$setupShutdownHook$1
                                            @Override // kotlin.jvm.functions.Function0
                                            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                                            public final String invoke() {
                                                return "Unable to add shutdown hook, Runtime is already shutting down";
                                            }
                                        }, e2, false, null);
                                        r3.INotificationSideChannelStub();
                                    }
                                } catch (IllegalArgumentException e3) {
                                    r3.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.DatadogCore$setupShutdownHook$2
                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                                        public final String invoke() {
                                            return "Shutdown hook was rejected";
                                        }
                                    }, e3, false, null);
                                } catch (SecurityException e4) {
                                    r3.asBinder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.ERROR, InternalLogger.Target.MAINTAINER, new Function0<String>() { // from class: com.datadog.android.core.internal.DatadogCore$setupShutdownHook$3
                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: merged with bridge method [inline-methods] */
                                        public final String invoke() {
                                            return "Security Manager denied adding shutdown hook ";
                                        }
                                    }, e4, false, null);
                                }
                                Runnable runnable = new Runnable() { // from class: takePictureInternal
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        trySetFlashModeToCameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault1(r3, configuration);
                                    }
                                };
                                lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest10 = r3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                if (lambdasubmitstillcapturerequest10 != null) {
                                    r4 = lambdasubmitstillcapturerequest10;
                                } else {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                    r4 = str;
                                }
                                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = r4.setCallbacksMessenger;
                                if (scheduledThreadPoolExecutor != null) {
                                    obj7 = scheduledThreadPoolExecutor;
                                } else {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                    obj7 = str;
                                }
                                ImageProxyDownsampler.TuitionPaymentFragmentbindingInflater1((ScheduledExecutorService) obj7, "Configuration telemetry", trySetFlashModeToCameraControl.TuitionPaymentFragmentspecialinlinedviewModeldefault3, TimeUnit.MILLISECONDS, r3.asBinder, runnable);
                                Intrinsics.checkNotNullParameter(trackingConsent, "");
                                lambdasubmitStillCaptureRequest4 lambdasubmitstillcapturerequest11 = r3.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                                if (lambdasubmitstillcapturerequest11 != null) {
                                    r13 = lambdasubmitstillcapturerequest11;
                                } else {
                                    Intrinsics.throwUninitializedPropertyAccessException("");
                                    r13 = str;
                                }
                                r13.handleMessage.TuitionPaymentFragmentspecialinlinedviewModeldefault1(trackingConsent);
                                SdkCore sdkCore2 = (SdkCore) r3;
                                Intrinsics.checkNotNullParameter(sdkCore2, "");
                                if (trysetflashmodetocameracontrol.b.containsKey("_dd.sdk_core.default")) {
                                    trysetflashmodetocameracontrol.TuitionPaymentFragmentspecialinlinedviewModeldefault3.TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Function0<String>() { // from class: com.datadog.android.core.internal.SdkCoreRegistry$register$1
                                        @Override // kotlin.jvm.functions.Function0
                                        /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: merged with bridge method [inline-methods] */
                                        public final String invoke() {
                                            String str11 = str3;
                                            StringBuilder sb2 = new StringBuilder("An SdkCode with name ");
                                            sb2.append(str11);
                                            sb2.append(" has already been registered.");
                                            return sb2.toString();
                                        }

                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(0);
                                        }
                                    }, null, false, null);
                                } else {
                                    trysetflashmodetocameracontrol.b.put("_dd.sdk_core.default", sdkCore2);
                                }
                                return (SdkCore) r3;
                            } catch (Throwable th19) {
                                th = th19;
                                r10 = trysetflashmodetocameracontrol;
                                th = th;
                                r2 = r10;
                                throw th;
                            }
                        } catch (Throwable th20) {
                            th = th20;
                        }
                    } catch (Throwable th21) {
                        th = th21;
                    }
                } catch (Throwable th22) {
                    th = th22;
                    r2 = trysetflashmodetocameracontrol;
                }
            } catch (Throwable th23) {
                th = th23;
                r10 = trysetflashmodetocameracontrol;
            }
        }
    }

    @JvmStatic
    public static final SdkCore initialize(Context context, Configuration configuration, TrackingConsent trackingConsent) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(configuration, "");
        Intrinsics.checkNotNullParameter(trackingConsent, "");
        return b(context, configuration, trackingConsent);
    }

    @JvmStatic
    public static final SdkCore TuitionPaymentFragmentspecialinlinedviewModeldefault1(String str) {
        getCaptureMode getcapturemode;
        getPostviewResolutionSelector getpostviewresolutionselector = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        synchronized (getpostviewresolutionselector) {
            if (str == null) {
                str = "_dd.sdk_core.default";
            }
            getcapturemode = getpostviewresolutionselector.b.get(str == null ? "_dd.sdk_core.default" : str);
            if (getcapturemode == null) {
                resizeAveraging.b().TuitionPaymentFragmentspecialinlinedviewModeldefault3(InternalLogger.Level.WARN, InternalLogger.Target.USER, new Datadog$getInstance$1$1(str, new Throwable().fillInStackTrace()), null, false, null);
                getcapturemode = getCaptureMode.INSTANCE;
            }
        }
        return getcapturemode;
    }

    @JvmStatic
    private static boolean b(String str) {
        boolean z;
        getPostviewResolutionSelector getpostviewresolutionselector = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        synchronized (getpostviewresolutionselector) {
            z = getpostviewresolutionselector.b.get("_dd.sdk_core.default") != null;
        }
        return z;
    }

    @JvmStatic
    public static final int TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        return TuitionPaymentFragmentbindingInflater1;
    }

    @JvmStatic
    public static final void clearAllData() {
        SdkCore sdkCoreTuitionPaymentFragmentspecialinlinedviewModeldefault1 = TuitionPaymentFragmentspecialinlinedviewModeldefault1(null);
        Intrinsics.checkNotNullParameter(sdkCoreTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
        sdkCoreTuitionPaymentFragmentspecialinlinedviewModeldefault1.TuitionPaymentFragmentbindingInflater1();
    }

    @JvmStatic
    public static final boolean isInitialized() {
        return b(null);
    }
}
