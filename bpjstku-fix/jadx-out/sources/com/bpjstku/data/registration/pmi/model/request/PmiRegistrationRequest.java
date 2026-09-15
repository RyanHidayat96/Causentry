package com.bpjstku.data.registration.pmi.model.request;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Toast;
import androidx.autofill.HintConstants;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.exifinterface.media.ExifInterface;
import com.bpjstku.data.lib.model.BaseRequest;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.annotations.SerializedName;
import defpackage.createCameraSelectorById;
import defpackage.getSupportedPostviewSize;
import defpackage.initSession;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\bI\b\u0087\b\u0018\u00002\u00020\u0001B\u009b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010%\u001a\u0004\u0018\u00010#¢\u0006\u0004\b&\u0010'J\u001b\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020)\u0018\u00010(¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b.\u0010-J\u0010\u0010/\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b/\u0010-J\u0010\u00100\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b0\u0010-J\u0010\u00101\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b1\u0010-J\u0010\u00102\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b2\u0010-J\u0010\u00103\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b3\u0010-J\u0010\u00104\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b4\u0010-J\u0010\u00105\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b5\u0010-J\u0010\u00106\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b6\u0010-J\u0010\u00107\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b7\u0010-J\u0010\u00108\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b8\u0010-J\u0010\u00109\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b9\u0010-J\u0010\u0010:\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b:\u0010-J\u0010\u0010;\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b;\u0010-J\u0010\u0010<\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b<\u0010-J\u0010\u0010=\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b=\u0010-J\u0010\u0010>\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b>\u0010-J\u0010\u0010?\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b?\u0010-J\u0010\u0010@\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\b@\u0010-J\u0010\u0010A\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\bA\u0010-J\u0010\u0010B\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\bB\u0010-J\u0010\u0010C\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\bC\u0010-J\u0010\u0010D\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\bD\u0010-J\u0010\u0010E\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\bE\u0010-J\u0010\u0010F\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\bF\u0010-J\u0010\u0010G\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\bG\u0010-J\u0010\u0010H\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\bH\u0010-J\u0010\u0010I\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\bI\u0010-J\u0010\u0010J\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\bJ\u0010-J\u0010\u0010K\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\bK\u0010-J\u0010\u0010L\u001a\u00020\u0002HÇ\u0003¢\u0006\u0004\bL\u0010-J\u0012\u0010M\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\bO\u0010NJè\u0002\u0010P\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010#HÇ\u0001¢\u0006\u0004\bP\u0010QJ\u001a\u0010T\u001a\u00020S2\b\u0010\u0003\u001a\u0004\u0018\u00010RHÖ\u0003¢\u0006\u0004\bT\u0010UJ\u0010\u0010W\u001a\u00020VHÖ\u0001¢\u0006\u0004\bW\u0010XJ\u0010\u0010Y\u001a\u00020\u0002H×\u0001¢\u0006\u0004\bY\u0010-R\u001a\u0010Z\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010-R\u001a\u0010]\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010[\u001a\u0004\b^\u0010-R\u001a\u0010_\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010[\u001a\u0004\b`\u0010-R\u001a\u0010a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\ba\u0010[\u001a\u0004\bb\u0010-R\u001a\u0010c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bc\u0010[\u001a\u0004\bd\u0010-R\u001a\u0010e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\be\u0010[\u001a\u0004\bf\u0010-R\u001a\u0010g\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bg\u0010[\u001a\u0004\bh\u0010-R\u001a\u0010i\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bi\u0010[\u001a\u0004\bj\u0010-R\u001a\u0010k\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bk\u0010[\u001a\u0004\bl\u0010-R\u001a\u0010m\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bm\u0010[\u001a\u0004\bn\u0010-R\u001a\u0010o\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bo\u0010[\u001a\u0004\bp\u0010-R\u001a\u0010q\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bq\u0010[\u001a\u0004\br\u0010-R\u001a\u0010s\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bs\u0010[\u001a\u0004\bt\u0010-R\u001a\u0010u\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bu\u0010[\u001a\u0004\bv\u0010-R\u001a\u0010w\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bw\u0010[\u001a\u0004\bx\u0010-R\u001a\u0010y\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\by\u0010[\u001a\u0004\bz\u0010-R\u001a\u0010{\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b{\u0010[\u001a\u0004\b|\u0010-R\u001a\u0010}\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b}\u0010[\u001a\u0004\b~\u0010-R\u001b\u0010\u007f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\r\n\u0004\b\u007f\u0010[\u001a\u0005\b\u0080\u0001\u0010-R\u001d\u0010\u0081\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010[\u001a\u0005\b\u0082\u0001\u0010-R\u001d\u0010\u0083\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010[\u001a\u0005\b\u0084\u0001\u0010-R\u001d\u0010\u0085\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010[\u001a\u0005\b\u0086\u0001\u0010-R\u001d\u0010\u0087\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010[\u001a\u0005\b\u0088\u0001\u0010-R\u001d\u0010\u0089\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010[\u001a\u0005\b\u008a\u0001\u0010-R\u001d\u0010\u008b\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010[\u001a\u0005\b\u008c\u0001\u0010-R\u001d\u0010\u008d\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010[\u001a\u0005\b\u008e\u0001\u0010-R\u001d\u0010\u008f\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010[\u001a\u0005\b\u0090\u0001\u0010-R\u001d\u0010\u0091\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010[\u001a\u0005\b\u0092\u0001\u0010-R\u001d\u0010\u0093\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010[\u001a\u0005\b\u0094\u0001\u0010-R\u001d\u0010\u0095\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010[\u001a\u0005\b\u0096\u0001\u0010-R\u001d\u0010\u0097\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010[\u001a\u0005\b\u0098\u0001\u0010-R\u001d\u0010\u0099\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010[\u001a\u0005\b\u009a\u0001\u0010-R \u0010\u009b\u0001\u001a\u0004\u0018\u00010#8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0005\b\u009d\u0001\u0010NR \u0010\u009e\u0001\u001a\u0004\u0018\u00010#8\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u009e\u0001\u0010\u009c\u0001\u001a\u0005\b\u009f\u0001\u0010N"}, d2 = {"Lcom/bpjstku/data/registration/pmi/model/request/PmiRegistrationRequest;", "Lcom/bpjstku/data/lib/model/BaseRequest;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "p24", "p25", "p26", "p27", "p28", "p29", "p30", "p31", "Ljava/io/File;", "p32", "p33", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;)V", "", "Lokhttp3/RequestBody;", "getPartMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "()Ljava/io/File;", "component34", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;)Lcom/bpjstku/data/registration/pmi/model/request/PmiRegistrationRequest;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "nik", "Ljava/lang/String;", "getNik", "birthDate", "getBirthDate", "birthPlace", "getBirthPlace", PlaceTypes.ADDRESS, "getAddress", "cityCode", "getCityCode", "cityName", "getCityName", "fullName", "getFullName", "passportNumber", "getPassportNumber", "passportIssueDate", "getPassportIssueDate", HintConstants.AUTOFILL_HINT_GENDER, "getGender", "motherName", "getMotherName", "fatherName", "getFatherName", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "getCountryCode", "countryName", "getCountryName", "jobSector", "getJobSector", "jobTitleCode", "getJobTitleCode", "jobTitle", "getJobTitle", "jobEmployerId", "getJobEmployerId", "jobEmployerName", "getJobEmployerName", "jobEmploymentCity", "getJobEmploymentCity", "jobEmployerPhoneNumber", "getJobEmployerPhoneNumber", "visaNumber", "getVisaNumber", "visaIssuedDate", "getVisaIssuedDate", "jobAgreementNumber", "getJobAgreementNumber", "jobAgreementStartDate", "getJobAgreementStartDate", "jobAgreementEndDate", "getJobAgreementEndDate", "jhtPaymentCode", "getJhtPaymentCode", "email", "getEmail", HintConstants.AUTOFILL_HINT_PHONE_NUMBER, "getPhoneNumber", "pptkisReferenceCode", "getPptkisReferenceCode", "branchOfficeName", "getBranchOfficeName", "branchOfficeCode", "getBranchOfficeCode", "identityImageFile", "Ljava/io/File;", "getIdentityImageFile", "pksImageFile", "getPksImageFile"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class PmiRegistrationRequest extends BaseRequest {
    public static final int $stable = 8;
    private static char[] TuitionPaymentFragmentbindingInflater1;
    private static boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static boolean b;
    private static int d;

    @SerializedName("alamat")
    private final String address;

    @SerializedName("tglLahir")
    private final String birthDate;

    @SerializedName("tempatLahir")
    private final String birthPlace;

    @SerializedName("kodeKantor")
    private final String branchOfficeCode;

    @SerializedName("namaDivisi")
    private final String branchOfficeName;

    @SerializedName("kodeKabupaten")
    private final String cityCode;

    @SerializedName("namaKabupaten")
    private final String cityName;

    @SerializedName("kodeNegara")
    private final String countryCode;

    @SerializedName("namaNegara")
    private final String countryName;

    @SerializedName("email")
    private final String email;

    @SerializedName("namaAyah")
    private final String fatherName;

    @SerializedName("namaLengkap")
    private final String fullName;

    @SerializedName("jenisKelamin")
    private final String gender;
    private final transient File identityImageFile;

    @SerializedName("kodeTarif")
    private final String jhtPaymentCode;

    @SerializedName("tglAkhirPerjanjianKerja")
    private final String jobAgreementEndDate;

    @SerializedName("nomorPerjanjian")
    private final String jobAgreementNumber;

    @SerializedName("tglAwalPerjanjianKerja")
    private final String jobAgreementStartDate;

    @SerializedName("noIdPemberiKerja")
    private final String jobEmployerId;

    @SerializedName("namaPemberiKerja")
    private final String jobEmployerName;

    @SerializedName("teleponPemberiKerja")
    private final String jobEmployerPhoneNumber;

    @SerializedName("kotaPemberiKerja")
    private final String jobEmploymentCity;

    @SerializedName("sektorPekerjaan")
    private final String jobSector;

    @SerializedName("namaPekerjaan")
    private final String jobTitle;

    @SerializedName("kodePekerjaan")
    private final String jobTitleCode;

    @SerializedName("namaIbu")
    private final String motherName;

    @SerializedName("nik")
    private final String nik;

    @SerializedName("tglTerbitPasspor")
    private final String passportIssueDate;

    @SerializedName("nomorPasspor")
    private final String passportNumber;

    @SerializedName("noHp")
    private final String phoneNumber;
    private final transient File pksImageFile;

    @SerializedName("kodeRefPptkis")
    private final String pptkisReferenceCode;

    @SerializedName("tglTerbitVisa")
    private final String visaIssuedDate;

    @SerializedName("nomorVisa")
    private final String visaNumber;
    private static final byte[] $$c = {81, 125, 2, 46};
    private static final int $$f = 24;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {84, 10, 24, -102, -12, 2, 63, -69, 4, 9, 5, -10, 2, -5, 7, 1, -9, -3, 13, -17, 17, -13, 68, -51, -13, 13, -11, -13, 5, 11, 6, -16, 69, -55, -19, 21, -2, -11, -4, 11, -6, 1, -5, 69, -23, -49, 17, -9, -6, 38, -33, -5, 32, -30, 17, -2, -8, 6, 1, 31, -51, 21, -2, -11, -4, 11, -6, 1, -33, 12, -11, 11, -6, 1, 30, -17, -24, 12, 8, -9, -6, 46, -44, 17, -6, -6, 8, -9, -6, 18, -7, -5, 10, -5, -5, 7, 30, -37, 8, -6, 11, -19, 15, -13, 65};
    private static final int $$e = 36;
    private static final byte[] $$a = {67, -127, -109, 9, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -55, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -54};
    private static final int $$b = 174;
    private static int asBinder = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f407a = 1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 52
            int r0 = 53 - r6
            int r8 = r8 * 14
            int r8 = 98 - r8
            byte[] r1 = com.bpjstku.data.registration.pmi.model.request.PmiRegistrationRequest.$$a
            int r7 = r7 * 52
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L19
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r7 = r7 + r4
            int r8 = r8 + 1
            int r7 = r7 + (-11)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.pmi.model.request.PmiRegistrationRequest.c(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 64
            int r8 = 68 - r8
            byte[] r0 = com.bpjstku.data.registration.pmi.model.request.PmiRegistrationRequest.$$d
            int r6 = r6 * 15
            int r6 = r6 + 84
            int r7 = r7 * 27
            int r1 = 65 - r7
            byte[] r1 = new byte[r1]
            int r7 = 64 - r7
            r2 = 0
            if (r0 != 0) goto L19
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2e:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.pmi.model.request.PmiRegistrationRequest.f(short, short, int, java.lang.Object[]):void");
    }

    public final String getNik() {
        int i = 2 % 2;
        int i2 = f407a;
        int i3 = i2 + 121;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.nik;
        int i5 = i2 + 37;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBirthDate() {
        String str;
        int i = 2 % 2;
        int i2 = asBinder + 89;
        int i3 = i2 % 128;
        f407a = i3;
        if (i2 % 2 == 0) {
            str = this.birthDate;
            int i4 = 11 / 0;
        } else {
            str = this.birthDate;
        }
        int i5 = i3 + 57;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getBirthPlace() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        int i3 = i2 % 128;
        f407a = i3;
        int i4 = i2 % 2;
        String str = this.birthPlace;
        int i5 = i3 + 95;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getAddress() {
        int i = 2 % 2;
        int i2 = asBinder + 59;
        int i3 = i2 % 128;
        f407a = i3;
        int i4 = i2 % 2;
        String str = this.address;
        int i5 = i3 + 9;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getCityCode() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 75;
        f407a = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.cityCode;
        int i4 = i2 + 33;
        f407a = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 70 / 0;
        }
        return str;
    }

    public final String getCityName() {
        int i = 2 % 2;
        int i2 = f407a + 3;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.cityName;
        if (i3 != 0) {
            int i4 = 18 / 0;
        }
        return str;
    }

    public final String getFullName() {
        int i = 2 % 2;
        int i2 = asBinder + 33;
        f407a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.fullName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getPassportNumber() {
        int i = 2 % 2;
        int i2 = asBinder + 89;
        int i3 = i2 % 128;
        f407a = i3;
        if (i2 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.passportNumber;
        int i4 = i3 + 91;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String getPassportIssueDate() {
        String str;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 3;
        f407a = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.passportIssueDate;
            int i4 = 4 / 0;
        } else {
            str = this.passportIssueDate;
        }
        int i5 = i2 + 83;
        f407a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getGender() {
        int i = 2 % 2;
        int i2 = f407a + 117;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.gender;
        if (i3 != 0) {
            int i4 = 10 / 0;
        }
        return str;
    }

    public final String getMotherName() {
        int i = 2 % 2;
        int i2 = f407a + 45;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.motherName;
        int i5 = i3 + 11;
        f407a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getFatherName() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        f407a = i2 % 128;
        int i3 = i2 % 2;
        String str = this.fatherName;
        if (i3 == 0) {
            int i4 = 47 / 0;
        }
        return str;
    }

    public final String getCountryCode() {
        int i = 2 % 2;
        int i2 = asBinder + 17;
        f407a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.countryCode;
        }
        throw null;
    }

    public final String getCountryName() {
        int i = 2 % 2;
        int i2 = f407a;
        int i3 = i2 + 1;
        asBinder = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.countryName;
        int i4 = i2 + 25;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        obj.hashCode();
        throw null;
    }

    public final String getJobSector() {
        int i = 2 % 2;
        int i2 = f407a + 29;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.jobSector;
        int i5 = i3 + 63;
        f407a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getJobTitleCode() {
        int i = 2 % 2;
        int i2 = f407a;
        int i3 = i2 + 59;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.jobTitleCode;
        int i4 = i2 + 97;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public PmiRegistrationRequest(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, File file, File file2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(str6, "");
        Intrinsics.checkNotNullParameter(str7, "");
        Intrinsics.checkNotNullParameter(str8, "");
        Intrinsics.checkNotNullParameter(str9, "");
        Intrinsics.checkNotNullParameter(str10, "");
        Intrinsics.checkNotNullParameter(str11, "");
        Intrinsics.checkNotNullParameter(str12, "");
        Intrinsics.checkNotNullParameter(str13, "");
        Intrinsics.checkNotNullParameter(str14, "");
        Intrinsics.checkNotNullParameter(str15, "");
        Intrinsics.checkNotNullParameter(str16, "");
        Intrinsics.checkNotNullParameter(str17, "");
        Intrinsics.checkNotNullParameter(str18, "");
        Intrinsics.checkNotNullParameter(str19, "");
        Intrinsics.checkNotNullParameter(str20, "");
        Intrinsics.checkNotNullParameter(str21, "");
        Intrinsics.checkNotNullParameter(str22, "");
        Intrinsics.checkNotNullParameter(str23, "");
        Intrinsics.checkNotNullParameter(str24, "");
        Intrinsics.checkNotNullParameter(str25, "");
        Intrinsics.checkNotNullParameter(str26, "");
        Intrinsics.checkNotNullParameter(str27, "");
        Intrinsics.checkNotNullParameter(str28, "");
        Intrinsics.checkNotNullParameter(str29, "");
        Intrinsics.checkNotNullParameter(str30, "");
        Intrinsics.checkNotNullParameter(str31, "");
        Intrinsics.checkNotNullParameter(str32, "");
        this.nik = str;
        this.birthDate = str2;
        this.birthPlace = str3;
        this.address = str4;
        this.cityCode = str5;
        this.cityName = str6;
        this.fullName = str7;
        this.passportNumber = str8;
        this.passportIssueDate = str9;
        this.gender = str10;
        this.motherName = str11;
        this.fatherName = str12;
        this.countryCode = str13;
        this.countryName = str14;
        this.jobSector = str15;
        this.jobTitleCode = str16;
        this.jobTitle = str17;
        this.jobEmployerId = str18;
        this.jobEmployerName = str19;
        this.jobEmploymentCity = str20;
        this.jobEmployerPhoneNumber = str21;
        this.visaNumber = str22;
        this.visaIssuedDate = str23;
        this.jobAgreementNumber = str24;
        this.jobAgreementStartDate = str25;
        this.jobAgreementEndDate = str26;
        this.jhtPaymentCode = str27;
        this.email = str28;
        this.phoneNumber = str29;
        this.pptkisReferenceCode = str30;
        this.branchOfficeName = str31;
        this.branchOfficeCode = str32;
        this.identityImageFile = file;
        this.pksImageFile = file2;
    }

    private static void e(char[] cArr, int[] iArr, int i, byte[] bArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        getSupportedPostviewSize getsupportedpostviewsize = new getSupportedPostviewSize();
        char[] cArr2 = TuitionPaymentFragmentbindingInflater1;
        int i3 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i3] = Integer.valueOf(cArr2[i4]);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1561626312);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                        byte b2 = (byte) i3;
                        byte b3 = (byte) (b2 + 1);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((ViewConfiguration.getTapTimeout() >> 16) + 31339), TextUtils.lastIndexOf("", '0') + 2995, TextUtils.indexOf((CharSequence) "", '0', i3, i3) + 18, 1182129903, false, $$g(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                    i4++;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-499324958);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (43325 - Color.red(0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 253, 22 - ((Process.getThreadPriority(0) + 20) >> 6), 111296565, false, ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
        long j = 0;
        int i5 = 33602;
        if (b) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = bArr.length;
            char[] cArr4 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                int i6 = $11 + 75;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                cArr4[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[bArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] + i] - iIntValue);
                Object[] objArr4 = {getsupportedpostviewsize, getsupportedpostviewsize};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                    char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 33602);
                    int iNormalizeMetaState = 3085 - KeyEvent.normalizeMetaState(0);
                    int i8 = 27 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1));
                    byte b4 = (byte) 0;
                    byte b5 = b4;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(absoluteGravity, iNormalizeMetaState, i8, -2146875848, false, $$g(b4, b5, b5), new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4);
                j = 0;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!TuitionPaymentFragmentspecialinlinedviewModeldefault1) {
            getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = iArr.length;
            char[] cArr5 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
            getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
            while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
                cArr5[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[iArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
                getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1++;
                int i9 = $10 + 81;
                $11 = i9 % 128;
                int i10 = i9 % 2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 = cArr.length;
        char[] cArr6 = new char[getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1];
        getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = 0;
        while (getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1 < getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1) {
            int i11 = $10 + 81;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr6[getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] = (char) (cArr2[cArr[(getsupportedpostviewsize.TuitionPaymentFragmentbindingInflater1 - 1) - getsupportedpostviewsize.TuitionPaymentFragmentspecialinlinedviewModeldefault1] - i] - iIntValue);
            Object[] objArr5 = {getsupportedpostviewsize, getsupportedpostviewsize};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1687675375);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                byte b6 = (byte) 0;
                byte b7 = b6;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + i5), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 3084, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26, -2146875848, false, $$g(b6, b7, b7), new Class[]{Object.class, Object.class});
            }
            ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
            i5 = 33602;
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0202  */
    public final String getJobTitle() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = asBinder + 87;
        f407a = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumFlingVelocity = (char) (37567 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
            int i4 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 624;
            int scrollBarFadeDuration = 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            byte[] bArr = $$a;
            byte b2 = (byte) (-bArr[5]);
            byte b3 = bArr[7];
            Object[] objArr2 = new Object[1];
            c(b2, b3, b3, objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumFlingVelocity, i4, scrollBarFadeDuration, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(null, null, View.combineMeasuredStates(0, 0) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(null, null, 128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 37568);
            int iGreen = Color.green(0) + 625;
            int iMakeMeasureSpec = 14 - View.MeasureSpec.makeMeasureSpec(0, 0);
            byte[] bArr2 = $$a;
            byte b4 = bArr2[7];
            Object[] objArr5 = new Object[1];
            c(b4, b4, (byte) (-bArr2[5]), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cAxisFromString, iGreen, iMakeMeasureSpec, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 37566);
                int scrollBarSize = 625 - (ViewConfiguration.getScrollBarSize() >> 8);
                int scrollBarSize2 = (ViewConfiguration.getScrollBarSize() >> 8) + 14;
                byte[] bArr3 = $$a;
                byte b5 = bArr3[7];
                byte b6 = (byte) (-bArr3[5]);
                Object[] objArr6 = new Object[1];
                c(b5, b6, b6, objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(c, scrollBarSize, scrollBarSize2, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i5 = ((int[]) objArr7[2])[0];
            int i6 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i5};
            int iIdentityHashCode = System.identityHashCode(this);
            int i7 = (-1467116776) + (((~(1364871896 | iIdentityHashCode)) | 167883808) * (-140)) + ((~(1532755704 | iIdentityHashCode)) * 70) + (((~(iIdentityHashCode | 458866224)) | 1241773288) * 70) + 147377101;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{new int[]{i6}, new int[1], iArr, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e(null, null, MotionEvent.axisFromString("") + 128, new byte[]{-125, -127, -116, -124, -105, -106, -118, -117, -122, -107, -122, -117, -112, -108, -121, -110, -110, -127, -121, -125, -122, -123, -124, -125, -126, -127}, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(null, null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), new byte[]{-126, -123, -122, -117, -127, -112, -122, -113, -110, -110, -108, -117, -126, -116, -124, -124, -104, -112}, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i10 = asBinder + 19;
                    f407a = i10 % 128;
                    int i11 = i10 % 2;
                    if (((ContextWrapper) applicationContext).getBaseContext() != null) {
                        applicationContext = applicationContext.getApplicationContext();
                    } else {
                        applicationContext = null;
                    }
                } else {
                    applicationContext = applicationContext.getApplicationContext();
                }
            }
            Object[] objArr10 = new Object[1];
            e(null, null, 127 - (ViewConfiguration.getEdgeSlop() >> 16), new byte[]{-115, -116, -117, -120, -118, -119, -121, -102, -126, -127, -113, -121, -127, -107, -127, -103}, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(null, null, 127 - TextUtils.getOffsetBefore("", 0), new byte[]{-116, -125, -123, -114, -105, -120, -127, -101, -118, -117, -122, -117, -126, -116, -125, -122}, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            e(null, null, 128 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new byte[]{-98, -100, -99, -98, -98, -91, -90, -96, -98, -100, -90, -91, -127, -90, -89, -127, -95, -92, -116, -99, -90, -91, -95, -99, -127, -90, -93, -93, -96, -100, -127, -96, -96, -91, -125, -92, -93, -98, -94, -116, -98, -94, -94, -95, -116, -97, -93, -94, -95, -127, -116, -116, -95, -99, -99, -96, -97, -99, -98, -127, -127, -99, -116, -100}, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            e(null, null, 128 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), new byte[]{-99, -97, -89, -127, -91, -100, -99, -112, -100, -92, -91, -98, -96, -96, -112, -96, -92, -92, -91, -94, -97, -99, -116, -100, -100, -127, -116, -91, -93, -95, -98, -96, -90, -96, -96, -92, -96, -98, -91, -98, -97, -99, -94, -95, -92, -97, -92, -100, -91, -99, -100, -116, -98, -89, -99, -116, -94, -98, -95, -89, -97, -125, -127, -112}, objArr13);
            String[] strArr2 = {str, (String) objArr13[0]};
            int i12 = asBinder + 109;
            f407a = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr14 = {applicationContext, strArr2, Integer.valueOf(iIntValue), 17, 147377101};
                byte[] bArr4 = $$d;
                byte b7 = bArr4[15];
                byte b8 = b7;
                Object[] objArr15 = new Object[1];
                f(b8, (byte) (b8 - 1), b7, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b9 = bArr4[15];
                byte b10 = (byte) (b9 - 1);
                byte b11 = b9;
                Object[] objArr16 = new Object[1];
                f(b10, b11, (byte) (b11 - 1), objArr16);
                objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i14 = ((int[]) objArr[0])[0];
                int i15 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 37567);
                        int absoluteGravity = 625 - Gravity.getAbsoluteGravity(0, 0);
                        int scrollBarSize3 = (ViewConfiguration.getScrollBarSize() >> 8) + 14;
                        byte[] bArr5 = $$a;
                        byte b12 = bArr5[7];
                        byte b13 = (byte) (-bArr5[5]);
                        Object[] objArr17 = new Object[1];
                        c(b12, b13, b13, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cResolveSizeAndState, absoluteGravity, scrollBarSize3, -973632554, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr18 = new Object[1];
                        e(null, null, View.combineMeasuredStates(0, 0) + 127, new byte[]{-111, -112, -123, -113, -114, -115, -116, -117, -120, -118, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        e(null, null, TextUtils.indexOf((CharSequence) "", '0', 0) + 128, new byte[]{-116, -115, -122, -117, -113, -127, -116, -109, -125, -116, -120, -110, -127, -113, -116}, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cAxisFromString2 = (char) (37566 - MotionEvent.axisFromString(""));
                            int i16 = (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 624;
                            int iMakeMeasureSpec2 = 14 - View.MeasureSpec.makeMeasureSpec(0, 0);
                            byte[] bArr6 = $$a;
                            byte b14 = bArr6[7];
                            Object[] objArr20 = new Object[1];
                            c(b14, b14, (byte) (-bArr6[5]), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cAxisFromString2, i16, iMakeMeasureSpec2, -976899241, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char defaultSize = (char) (37567 - View.getDefaultSize(0, 0));
                            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 625;
                            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 14;
                            byte[] bArr7 = $$a;
                            byte b15 = (byte) (-bArr7[5]);
                            byte b16 = bArr7[7];
                            Object[] objArr21 = new Object[1];
                            c(b15, b16, b16, objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(defaultSize, doubleTapTimeout, tapTimeout, -477065106, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i17 = ((int[]) objArr[0])[0];
        int i18 = ((int[]) objArr[2])[0];
        if (i18 == i17) {
            int i19 = ((int[]) objArr[1])[0];
            int i20 = ((int[]) objArr[2])[0];
            int i21 = ((int[]) objArr[0])[0];
            String[] strArr3 = (String[]) objArr[3];
            int[] iArr2 = {i20};
            int i22 = (int) Runtime.getRuntime().totalMemory();
            int i23 = ~i22;
            int i24 = i19 + 144344408 + (((~((-1661953460) | i23)) | (~((-161784662) | i22))) * 1900) + (((~(i23 | 161784661)) | (~(i22 | 1661953459))) * (-950)) + (((~(i22 | 161784661)) | (~(i23 | 1661953459))) * 950);
            int i25 = (i24 << 13) ^ i24;
            int i26 = i25 ^ (i25 >>> 17);
            ((int[]) objArr[1])[0] = i26 ^ (i26 << 5);
            Object[] objArr22 = {new int[]{i21}, new int[1], iArr2, strArr3};
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr4 = (String[]) objArr[3];
            if (strArr4 != null) {
                int i27 = asBinder + 3;
                f407a = i27 % 128;
                int i28 = 2;
                int i29 = i27 % 2;
                int i30 = 0;
                while (i30 < strArr4.length) {
                    int i31 = asBinder + 17;
                    f407a = i31 % 128;
                    if (i31 % i28 == 0) {
                        arrayList.add(strArr4[i30]);
                        i30 += 102;
                    } else {
                        arrayList.add(strArr4[i30]);
                        i30++;
                    }
                    i28 = 2;
                }
            }
            Toast.makeText((Context) null, i18 / (((i18 - 1) * i18) % 2), 0).show();
            int i32 = ((int[]) objArr[1])[0];
            int i33 = ((int[]) objArr[2])[0];
            int i34 = ((int[]) objArr[0])[0];
            String[] strArr5 = (String[]) objArr[3];
            int[] iArr3 = {i33};
            int iMyPid = Process.myPid();
            int i35 = i32 + (-1936090097) + (((~((~iMyPid) | (-63013564))) | 1760724557) * (-235)) + (((~((-63013564) | iMyPid)) | 1760724557) * (-470)) + (((~(iMyPid | (-50397363))) | 1748108356) * 235);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr[1])[0] = i37 ^ (i37 << 5);
            Object[] objArr23 = {new int[]{i34}, new int[1], iArr3, strArr5};
        }
        return this.jobTitle;
    }

    public final String getJobEmployerId() {
        int i = 2 % 2;
        int i2 = f407a + 109;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.jobEmployerId;
        int i5 = i3 + 57;
        f407a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getJobEmployerName() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 105;
        f407a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.jobEmployerName;
        int i5 = i2 + 89;
        f407a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getJobEmploymentCity() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 5;
        f407a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.jobEmploymentCity;
        int i5 = i2 + 59;
        f407a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getJobEmployerPhoneNumber() {
        int i = 2 % 2;
        int i2 = asBinder + 95;
        int i3 = i2 % 128;
        f407a = i3;
        int i4 = i2 % 2;
        String str = this.jobEmployerPhoneNumber;
        int i5 = i3 + 91;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 97 / 0;
        }
        return str;
    }

    public final String getVisaNumber() {
        int i = 2 % 2;
        int i2 = f407a + 7;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.visaNumber;
        int i5 = i3 + 45;
        f407a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getVisaIssuedDate() {
        int i = 2 % 2;
        int i2 = asBinder + 23;
        int i3 = i2 % 128;
        f407a = i3;
        int i4 = i2 % 2;
        String str = this.visaIssuedDate;
        int i5 = i3 + 119;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String getJobAgreementNumber() {
        int i = 2 % 2;
        int i2 = f407a + 59;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.jobAgreementNumber;
        }
        throw null;
    }

    public final String getJobAgreementStartDate() {
        int i = 2 % 2;
        int i2 = asBinder + 79;
        f407a = i2 % 128;
        int i3 = i2 % 2;
        String str = this.jobAgreementStartDate;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return str;
    }

    public final String getJobAgreementEndDate() {
        int i = 2 % 2;
        int i2 = f407a + 73;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.jobAgreementEndDate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getJhtPaymentCode() {
        int i = 2 % 2;
        int i2 = f407a + 103;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.jhtPaymentCode;
        int i5 = i3 + 95;
        f407a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getEmail() {
        int i = 2 % 2;
        int i2 = f407a + 3;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.email;
        int i5 = i3 + 97;
        f407a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String getPhoneNumber() {
        int i = 2 % 2;
        int i2 = f407a;
        int i3 = i2 + 21;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.phoneNumber;
        int i5 = i2 + 107;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String getPptkisReferenceCode() {
        int i = 2 % 2;
        int i2 = f407a + 69;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.pptkisReferenceCode;
        }
        throw null;
    }

    public final String getBranchOfficeName() {
        int i = 2 % 2;
        int i2 = f407a;
        int i3 = i2 + 3;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.branchOfficeName;
        int i5 = i2 + 63;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String getBranchOfficeCode() {
        int i = 2 % 2;
        int i2 = asBinder + 41;
        int i3 = i2 % 128;
        f407a = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        String str = this.branchOfficeCode;
        int i4 = i3 + 47;
        asBinder = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 13 / 0;
        }
        return str;
    }

    public final File getIdentityImageFile() {
        int i = 2 % 2;
        int i2 = asBinder + 39;
        int i3 = i2 % 128;
        f407a = i3;
        int i4 = i2 % 2;
        File file = this.identityImageFile;
        int i5 = i3 + 77;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return file;
    }

    public final File getPksImageFile() {
        int i = 2 % 2;
        int i2 = f407a;
        int i3 = i2 + 59;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        File file = this.pksImageFile;
        int i4 = i2 + 63;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return file;
    }

    public final Map<String, RequestBody> getPartMap() {
        int i = 2 % 2;
        Map<String, Object> mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 = createCameraSelectorById.TuitionPaymentFragmentspecialinlinedviewModeldefault2(this);
        if (mapTuitionPaymentFragmentspecialinlinedviewModeldefault2 == null) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.size()));
        Iterator<T> it = mapTuitionPaymentFragmentspecialinlinedviewModeldefault2.entrySet().iterator();
        while (it.hasNext()) {
            int i2 = f407a + 45;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            Intrinsics.checkNotNullParameter(value, "");
            linkedHashMap.put(key, RequestBody.INSTANCE.create((String) value, MediaType.INSTANCE.parse("text/plain")));
            int i4 = asBinder + 115;
            f407a = i4 % 128;
            int i5 = i4 % 2;
        }
        return linkedHashMap;
    }

    static {
        d = 1;
        b();
        int i = TuitionPaymentFragmentspecialinlinedviewModeldefault3 + 95;
        d = i % 128;
        int i2 = i % 2;
    }

    public static /* synthetic */ PmiRegistrationRequest copy$default(PmiRegistrationRequest pmiRegistrationRequest, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, File file, File file2, int i, int i2, Object obj) {
        String str33;
        String str34;
        String str35;
        String str36;
        String str37;
        String str38;
        String str39;
        String str40;
        String str41;
        String str42;
        int i3 = 2 % 2;
        String str43 = (i & 1) != 0 ? pmiRegistrationRequest.nik : str;
        Object obj2 = null;
        if ((i & 2) != 0) {
            int i4 = f407a + 103;
            asBinder = i4 % 128;
            if (i4 % 2 != 0) {
                String str44 = pmiRegistrationRequest.birthDate;
                obj2.hashCode();
                throw null;
            }
            str33 = pmiRegistrationRequest.birthDate;
        } else {
            str33 = str2;
        }
        if ((i & 4) != 0) {
            int i5 = f407a + 77;
            asBinder = i5 % 128;
            if (i5 % 2 != 0) {
                String str45 = pmiRegistrationRequest.birthPlace;
                throw null;
            }
            str34 = pmiRegistrationRequest.birthPlace;
        } else {
            str34 = str3;
        }
        String str46 = (i & 8) != 0 ? pmiRegistrationRequest.address : str4;
        String str47 = (i & 16) != 0 ? pmiRegistrationRequest.cityCode : str5;
        if ((i & 32) != 0) {
            str35 = pmiRegistrationRequest.cityName;
            int i6 = asBinder + 101;
            f407a = i6 % 128;
            int i7 = i6 % 2;
        } else {
            str35 = str6;
        }
        String str48 = (i & 64) != 0 ? pmiRegistrationRequest.fullName : str7;
        String str49 = (i & 128) != 0 ? pmiRegistrationRequest.passportNumber : str8;
        String str50 = (i & 256) != 0 ? pmiRegistrationRequest.passportIssueDate : str9;
        if ((i & 512) != 0) {
            int i8 = f407a + 61;
            asBinder = i8 % 128;
            int i9 = i8 % 2;
            str36 = pmiRegistrationRequest.gender;
        } else {
            str36 = str10;
        }
        if ((i & 1024) != 0) {
            str37 = pmiRegistrationRequest.motherName;
            int i10 = asBinder + 61;
            f407a = i10 % 128;
            int i11 = i10 % 2;
        } else {
            str37 = str11;
        }
        if ((i & 2048) != 0) {
            int i12 = f407a + 41;
            asBinder = i12 % 128;
            int i13 = i12 % 2;
            str38 = pmiRegistrationRequest.fatherName;
        } else {
            str38 = str12;
        }
        String str51 = (i & 4096) != 0 ? pmiRegistrationRequest.countryCode : str13;
        String str52 = (i & 8192) != 0 ? pmiRegistrationRequest.countryName : str14;
        String str53 = (i & 16384) != 0 ? pmiRegistrationRequest.jobSector : str15;
        if ((i & 32768) != 0) {
            int i14 = asBinder + 73;
            f407a = i14 % 128;
            if (i14 % 2 == 0) {
                String str54 = pmiRegistrationRequest.jobTitleCode;
                throw null;
            }
            str39 = pmiRegistrationRequest.jobTitleCode;
        } else {
            str39 = str16;
        }
        String str55 = (65536 & i) != 0 ? pmiRegistrationRequest.jobTitle : str17;
        String str56 = (i & 131072) != 0 ? pmiRegistrationRequest.jobEmployerId : str18;
        String str57 = (i & 262144) != 0 ? pmiRegistrationRequest.jobEmployerName : str19;
        if ((i & 524288) != 0) {
            int i15 = asBinder + 21;
            f407a = i15 % 128;
            if (i15 % 2 == 0) {
                String str58 = pmiRegistrationRequest.jobEmploymentCity;
                Object obj3 = null;
                obj3.hashCode();
                throw null;
            }
            str40 = pmiRegistrationRequest.jobEmploymentCity;
        } else {
            str40 = str20;
        }
        String str59 = (1048576 & i) != 0 ? pmiRegistrationRequest.jobEmployerPhoneNumber : str21;
        String str60 = (i & 2097152) != 0 ? pmiRegistrationRequest.visaNumber : str22;
        if ((i & 4194304) != 0) {
            int i16 = f407a + 81;
            asBinder = i16 % 128;
            if (i16 % 2 != 0) {
                String str61 = pmiRegistrationRequest.visaIssuedDate;
                throw null;
            }
            str41 = pmiRegistrationRequest.visaIssuedDate;
        } else {
            str41 = str23;
        }
        String str62 = (8388608 & i) != 0 ? pmiRegistrationRequest.jobAgreementNumber : str24;
        String str63 = (i & 16777216) != 0 ? pmiRegistrationRequest.jobAgreementStartDate : str25;
        String str64 = (i & 33554432) != 0 ? pmiRegistrationRequest.jobAgreementEndDate : str26;
        String str65 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? pmiRegistrationRequest.jhtPaymentCode : str27;
        if ((i & 134217728) != 0) {
            int i17 = asBinder + 123;
            f407a = i17 % 128;
            if (i17 % 2 == 0) {
                String str66 = pmiRegistrationRequest.email;
                Object obj4 = null;
                obj4.hashCode();
                throw null;
            }
            str42 = pmiRegistrationRequest.email;
        } else {
            str42 = str28;
        }
        return pmiRegistrationRequest.copy(str43, str33, str34, str46, str47, str35, str48, str49, str50, str36, str37, str38, str51, str52, str53, str39, str55, str56, str57, str40, str59, str60, str41, str62, str63, str64, str65, str42, (268435456 & i) != 0 ? pmiRegistrationRequest.phoneNumber : str29, (i & 536870912) != 0 ? pmiRegistrationRequest.pptkisReferenceCode : str30, (i & BasicMeasure.EXACTLY) != 0 ? pmiRegistrationRequest.branchOfficeName : str31, (i & Integer.MIN_VALUE) != 0 ? pmiRegistrationRequest.branchOfficeCode : str32, (i2 & 1) != 0 ? pmiRegistrationRequest.identityImageFile : file, (i2 & 2) != 0 ? pmiRegistrationRequest.pksImageFile : file2);
    }

    public final String component1() {
        String str;
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 117;
        f407a = i3 % 128;
        if (i3 % 2 == 0) {
            str = this.nik;
            int i4 = 59 / 0;
        } else {
            str = this.nik;
        }
        int i5 = i2 + 11;
        f407a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component10() {
        int i = 2 % 2;
        int i2 = asBinder + 113;
        f407a = i2 % 128;
        int i3 = i2 % 2;
        String str = this.gender;
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
        return str;
    }

    public final String component11() {
        int i = 2 % 2;
        int i2 = asBinder + 51;
        f407a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.motherName;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component12() {
        int i = 2 % 2;
        int i2 = f407a + 33;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.fatherName;
        if (i3 != 0) {
            int i4 = 51 / 0;
        }
        return str;
    }

    public final String component13() {
        int i = 2 % 2;
        int i2 = f407a;
        int i3 = i2 + 119;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.countryCode;
        int i5 = i2 + 51;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component14() {
        int i = 2 % 2;
        int i2 = asBinder + 63;
        f407a = i2 % 128;
        int i3 = i2 % 2;
        String str = this.countryName;
        if (i3 == 0) {
            int i4 = 30 / 0;
        }
        return str;
    }

    public final String component15() {
        int i = 2 % 2;
        int i2 = asBinder + 47;
        f407a = i2 % 128;
        int i3 = i2 % 2;
        String str = this.jobSector;
        if (i3 == 0) {
            int i4 = 21 / 0;
        }
        return str;
    }

    public final String component16() {
        int i = 2 % 2;
        int i2 = f407a;
        int i3 = i2 + 83;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.jobTitleCode;
        int i5 = i2 + 47;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component17() {
        int i = 2 % 2;
        int i2 = f407a;
        int i3 = i2 + 27;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.jobTitle;
        int i4 = i2 + 85;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component18() {
        int i = 2 % 2;
        int i2 = f407a;
        int i3 = i2 + 1;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.jobEmployerId;
        int i5 = i2 + 95;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component19() {
        int i = 2 % 2;
        int i2 = asBinder + 61;
        int i3 = i2 % 128;
        f407a = i3;
        int i4 = i2 % 2;
        String str = this.jobEmployerName;
        int i5 = i3 + 29;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component2() {
        int i = 2 % 2;
        int i2 = f407a;
        int i3 = i2 + 53;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.birthDate;
        int i5 = i2 + 41;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component20() {
        int i = 2 % 2;
        int i2 = f407a;
        int i3 = i2 + 85;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.jobEmploymentCity;
        int i5 = i2 + 53;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return str;
    }

    public final String component21() {
        int i = 2 % 2;
        int i2 = f407a;
        int i3 = i2 + 43;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.jobEmployerPhoneNumber;
        int i5 = i2 + 13;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        return str;
    }

    public final String component22() {
        int i = 2 % 2;
        int i2 = f407a;
        int i3 = i2 + 95;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.visaNumber;
        int i4 = i2 + 9;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final String component23() {
        int i = 2 % 2;
        int i2 = asBinder + 43;
        int i3 = i2 % 128;
        f407a = i3;
        int i4 = i2 % 2;
        String str = this.visaIssuedDate;
        int i5 = i3 + 69;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 59 / 0;
        }
        return str;
    }

    public final String component24() {
        int i = 2 % 2;
        int i2 = asBinder + 103;
        f407a = i2 % 128;
        int i3 = i2 % 2;
        String str = this.jobAgreementNumber;
        if (i3 == 0) {
            int i4 = 39 / 0;
        }
        return str;
    }

    public final String component25() {
        int i = 2 % 2;
        int i2 = f407a + 67;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.jobAgreementStartDate;
        }
        throw null;
    }

    public final String component26() {
        int i = 2 % 2;
        int i2 = f407a + 109;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.jobAgreementEndDate;
        int i5 = i3 + 103;
        f407a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component27() {
        int i = 2 % 2;
        int i2 = f407a + 69;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        String str = this.jhtPaymentCode;
        int i5 = i3 + 79;
        f407a = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component28() {
        int i = 2 % 2;
        int i2 = asBinder;
        int i3 = i2 + 43;
        f407a = i3 % 128;
        int i4 = i3 % 2;
        String str = this.email;
        int i5 = i2 + 101;
        f407a = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        throw null;
    }

    public final String component29() {
        int i = 2 % 2;
        int i2 = asBinder + 85;
        int i3 = i2 % 128;
        f407a = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        String str = this.phoneNumber;
        int i4 = i3 + 57;
        asBinder = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        throw null;
    }

    public final String component3() {
        int i = 2 % 2;
        int i2 = f407a;
        int i3 = i2 + 65;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.birthPlace;
        int i5 = i2 + 105;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component30() {
        int i = 2 % 2;
        int i2 = asBinder + 5;
        f407a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.pptkisReferenceCode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component31() {
        int i = 2 % 2;
        int i2 = asBinder + 73;
        int i3 = i2 % 128;
        f407a = i3;
        int i4 = i2 % 2;
        String str = this.branchOfficeName;
        int i5 = i3 + 101;
        asBinder = i5 % 128;
        if (i5 % 2 == 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final String component32() {
        int i = 2 % 2;
        int i2 = f407a;
        int i3 = i2 + 97;
        asBinder = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        String str = this.branchOfficeCode;
        int i4 = i2 + 125;
        asBinder = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    public final File component33() {
        int i = 2 % 2;
        int i2 = f407a + 49;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return this.identityImageFile;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final File component34() {
        int i = 2 % 2;
        int i2 = f407a + 125;
        int i3 = i2 % 128;
        asBinder = i3;
        int i4 = i2 % 2;
        File file = this.pksImageFile;
        int i5 = i3 + 55;
        f407a = i5 % 128;
        int i6 = i5 % 2;
        return file;
    }

    public final String component4() {
        int i = 2 % 2;
        int i2 = asBinder + 111;
        int i3 = i2 % 128;
        f407a = i3;
        int i4 = i2 % 2;
        String str = this.address;
        int i5 = i3 + 29;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return str;
    }

    public final String component5() {
        int i = 2 % 2;
        int i2 = asBinder + 83;
        int i3 = i2 % 128;
        f407a = i3;
        int i4 = i2 % 2;
        String str = this.cityCode;
        int i5 = i3 + 67;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final String component6() {
        int i = 2 % 2;
        int i2 = asBinder + 13;
        f407a = i2 % 128;
        if (i2 % 2 != 0) {
            return this.cityName;
        }
        throw null;
    }

    public final String component7() {
        String str;
        int i = 2 % 2;
        int i2 = asBinder + 3;
        int i3 = i2 % 128;
        f407a = i3;
        if (i2 % 2 == 0) {
            str = this.fullName;
            int i4 = 83 / 0;
        } else {
            str = this.fullName;
        }
        int i5 = i3 + 17;
        asBinder = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 58 / 0;
        }
        return str;
    }

    public final String component8() {
        int i = 2 % 2;
        int i2 = f407a + 99;
        asBinder = i2 % 128;
        int i3 = i2 % 2;
        String str = this.passportNumber;
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
        return str;
    }

    public final String component9() {
        int i = 2 % 2;
        int i2 = f407a;
        int i3 = i2 + 121;
        asBinder = i3 % 128;
        int i4 = i3 % 2;
        String str = this.passportIssueDate;
        int i5 = i2 + 83;
        asBinder = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public final PmiRegistrationRequest copy(String p0, String p1, String p2, String p3, String p4, String p5, String p6, String p7, String p8, String p9, String p10, String p11, String p12, String p13, String p14, String p15, String p16, String p17, String p18, String p19, String p20, String p21, String p22, String p23, String p24, String p25, String p26, String p27, String p28, String p29, String p30, String p31, File p32, File p33) {
        int i = 2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        Intrinsics.checkNotNullParameter(p2, "");
        Intrinsics.checkNotNullParameter(p3, "");
        Intrinsics.checkNotNullParameter(p4, "");
        Intrinsics.checkNotNullParameter(p5, "");
        Intrinsics.checkNotNullParameter(p6, "");
        Intrinsics.checkNotNullParameter(p7, "");
        Intrinsics.checkNotNullParameter(p8, "");
        Intrinsics.checkNotNullParameter(p9, "");
        Intrinsics.checkNotNullParameter(p10, "");
        Intrinsics.checkNotNullParameter(p11, "");
        Intrinsics.checkNotNullParameter(p12, "");
        Intrinsics.checkNotNullParameter(p13, "");
        Intrinsics.checkNotNullParameter(p14, "");
        Intrinsics.checkNotNullParameter(p15, "");
        Intrinsics.checkNotNullParameter(p16, "");
        Intrinsics.checkNotNullParameter(p17, "");
        Intrinsics.checkNotNullParameter(p18, "");
        Intrinsics.checkNotNullParameter(p19, "");
        Intrinsics.checkNotNullParameter(p20, "");
        Intrinsics.checkNotNullParameter(p21, "");
        Intrinsics.checkNotNullParameter(p22, "");
        Intrinsics.checkNotNullParameter(p23, "");
        Intrinsics.checkNotNullParameter(p24, "");
        Intrinsics.checkNotNullParameter(p25, "");
        Intrinsics.checkNotNullParameter(p26, "");
        Intrinsics.checkNotNullParameter(p27, "");
        Intrinsics.checkNotNullParameter(p28, "");
        Intrinsics.checkNotNullParameter(p29, "");
        Intrinsics.checkNotNullParameter(p30, "");
        Intrinsics.checkNotNullParameter(p31, "");
        PmiRegistrationRequest pmiRegistrationRequest = new PmiRegistrationRequest(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p33);
        int i2 = asBinder + 75;
        f407a = i2 % 128;
        if (i2 % 2 != 0) {
            return pmiRegistrationRequest;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PmiRegistrationRequest)) {
            return false;
        }
        PmiRegistrationRequest pmiRegistrationRequest = (PmiRegistrationRequest) p0;
        if (!Intrinsics.areEqual(this.nik, pmiRegistrationRequest.nik) || !Intrinsics.areEqual(this.birthDate, pmiRegistrationRequest.birthDate) || (!Intrinsics.areEqual(this.birthPlace, pmiRegistrationRequest.birthPlace)) || !Intrinsics.areEqual(this.address, pmiRegistrationRequest.address)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.cityCode, pmiRegistrationRequest.cityCode)) {
            int i2 = f407a + 37;
            asBinder = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.cityName, pmiRegistrationRequest.cityName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.fullName, pmiRegistrationRequest.fullName)) {
            int i4 = f407a + 89;
            int i5 = i4 % 128;
            asBinder = i5;
            boolean z = i4 % 2 != 0;
            int i6 = i5 + 117;
            f407a = i6 % 128;
            int i7 = i6 % 2;
            return z;
        }
        if (!Intrinsics.areEqual(this.passportNumber, pmiRegistrationRequest.passportNumber)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.passportIssueDate, pmiRegistrationRequest.passportIssueDate)) {
            int i8 = asBinder + 107;
            f407a = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.gender, pmiRegistrationRequest.gender) || !Intrinsics.areEqual(this.motherName, pmiRegistrationRequest.motherName) || !Intrinsics.areEqual(this.fatherName, pmiRegistrationRequest.fatherName) || !Intrinsics.areEqual(this.countryCode, pmiRegistrationRequest.countryCode) || !Intrinsics.areEqual(this.countryName, pmiRegistrationRequest.countryName)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.jobSector, pmiRegistrationRequest.jobSector)) {
            int i10 = f407a + 63;
            asBinder = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.jobTitleCode, pmiRegistrationRequest.jobTitleCode)) {
            int i12 = f407a + 91;
            asBinder = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.jobTitle, pmiRegistrationRequest.jobTitle) || !Intrinsics.areEqual(this.jobEmployerId, pmiRegistrationRequest.jobEmployerId)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.jobEmployerName, pmiRegistrationRequest.jobEmployerName)) {
            int i14 = asBinder + 79;
            f407a = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 34 / 0;
            }
            return false;
        }
        if (!Intrinsics.areEqual(this.jobEmploymentCity, pmiRegistrationRequest.jobEmploymentCity) || !Intrinsics.areEqual(this.jobEmployerPhoneNumber, pmiRegistrationRequest.jobEmployerPhoneNumber) || !Intrinsics.areEqual(this.visaNumber, pmiRegistrationRequest.visaNumber) || !Intrinsics.areEqual(this.visaIssuedDate, pmiRegistrationRequest.visaIssuedDate)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.jobAgreementNumber, pmiRegistrationRequest.jobAgreementNumber)) {
            int i16 = asBinder + 99;
            f407a = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.jobAgreementStartDate, pmiRegistrationRequest.jobAgreementStartDate)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.jobAgreementEndDate, pmiRegistrationRequest.jobAgreementEndDate)) {
            int i18 = asBinder + 3;
            f407a = i18 % 128;
            return i18 % 2 == 0;
        }
        if (!Intrinsics.areEqual(this.jhtPaymentCode, pmiRegistrationRequest.jhtPaymentCode) || !Intrinsics.areEqual(this.email, pmiRegistrationRequest.email) || !Intrinsics.areEqual(this.phoneNumber, pmiRegistrationRequest.phoneNumber) || !Intrinsics.areEqual(this.pptkisReferenceCode, pmiRegistrationRequest.pptkisReferenceCode)) {
            return false;
        }
        if (Intrinsics.areEqual(this.branchOfficeName, pmiRegistrationRequest.branchOfficeName)) {
            return Intrinsics.areEqual(this.branchOfficeCode, pmiRegistrationRequest.branchOfficeCode) && Intrinsics.areEqual(this.identityImageFile, pmiRegistrationRequest.identityImageFile) && Intrinsics.areEqual(this.pksImageFile, pmiRegistrationRequest.pksImageFile);
        }
        int i19 = asBinder + 65;
        f407a = i19 % 128;
        int i20 = i19 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = asBinder + 81;
        f407a = i2 % 128;
        int i3 = i2 % 2;
        int iHashCode2 = this.nik.hashCode();
        int iHashCode3 = this.birthDate.hashCode();
        int iHashCode4 = this.birthPlace.hashCode();
        int iHashCode5 = this.address.hashCode();
        int iHashCode6 = this.cityCode.hashCode();
        int iHashCode7 = this.cityName.hashCode();
        int iHashCode8 = this.fullName.hashCode();
        int iHashCode9 = this.passportNumber.hashCode();
        int iHashCode10 = this.passportIssueDate.hashCode();
        int iHashCode11 = this.gender.hashCode();
        int iHashCode12 = this.motherName.hashCode();
        int iHashCode13 = this.fatherName.hashCode();
        int iHashCode14 = this.countryCode.hashCode();
        int iHashCode15 = this.countryName.hashCode();
        int iHashCode16 = this.jobSector.hashCode();
        int iHashCode17 = this.jobTitleCode.hashCode();
        int iHashCode18 = this.jobTitle.hashCode();
        int iHashCode19 = this.jobEmployerId.hashCode();
        int iHashCode20 = this.jobEmployerName.hashCode();
        int iHashCode21 = this.jobEmploymentCity.hashCode();
        int iHashCode22 = this.jobEmployerPhoneNumber.hashCode();
        int iHashCode23 = this.visaNumber.hashCode();
        int iHashCode24 = this.visaIssuedDate.hashCode();
        int iHashCode25 = this.jobAgreementNumber.hashCode();
        int iHashCode26 = this.jobAgreementStartDate.hashCode();
        int iHashCode27 = this.jobAgreementEndDate.hashCode();
        int iHashCode28 = this.jhtPaymentCode.hashCode();
        int iHashCode29 = this.email.hashCode();
        int iHashCode30 = this.phoneNumber.hashCode();
        int iHashCode31 = this.pptkisReferenceCode.hashCode();
        int iHashCode32 = this.branchOfficeName.hashCode();
        int iHashCode33 = this.branchOfficeCode.hashCode();
        File file = this.identityImageFile;
        int iHashCode34 = 0;
        if (file == null) {
            int i4 = asBinder;
            int i5 = i4 + 39;
            f407a = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 49;
            f407a = i7 % 128;
            int i8 = i7 % 2;
            iHashCode = 0;
        } else {
            iHashCode = file.hashCode();
        }
        File file2 = this.pksImageFile;
        if (file2 != null) {
            int i9 = f407a + 119;
            asBinder = i9 % 128;
            if (i9 % 2 != 0) {
                int iHashCode35 = file2.hashCode();
                int i10 = 47 / 0;
                iHashCode34 = iHashCode35;
            } else {
                iHashCode34 = file2.hashCode();
            }
        }
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode2 * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + iHashCode30) * 31) + iHashCode31) * 31) + iHashCode32) * 31) + iHashCode33) * 31) + iHashCode) * 31) + iHashCode34;
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.nik;
        String str2 = this.birthDate;
        String str3 = this.birthPlace;
        String str4 = this.address;
        String str5 = this.cityCode;
        String str6 = this.cityName;
        String str7 = this.fullName;
        String str8 = this.passportNumber;
        String str9 = this.passportIssueDate;
        String str10 = this.gender;
        String str11 = this.motherName;
        String str12 = this.fatherName;
        String str13 = this.countryCode;
        String str14 = this.countryName;
        String str15 = this.jobSector;
        String str16 = this.jobTitleCode;
        String str17 = this.jobTitle;
        String str18 = this.jobEmployerId;
        String str19 = this.jobEmployerName;
        String str20 = this.jobEmploymentCity;
        String str21 = this.jobEmployerPhoneNumber;
        String str22 = this.visaNumber;
        String str23 = this.visaIssuedDate;
        String str24 = this.jobAgreementNumber;
        String str25 = this.jobAgreementStartDate;
        String str26 = this.jobAgreementEndDate;
        String str27 = this.jhtPaymentCode;
        String str28 = this.email;
        String str29 = this.phoneNumber;
        String str30 = this.pptkisReferenceCode;
        String str31 = this.branchOfficeName;
        String str32 = this.branchOfficeCode;
        File file = this.identityImageFile;
        File file2 = this.pksImageFile;
        StringBuilder sb = new StringBuilder("PmiRegistrationRequest(nik=");
        sb.append(str);
        sb.append(", birthDate=");
        sb.append(str2);
        sb.append(", birthPlace=");
        sb.append(str3);
        sb.append(", address=");
        sb.append(str4);
        sb.append(", cityCode=");
        sb.append(str5);
        sb.append(", cityName=");
        sb.append(str6);
        sb.append(", fullName=");
        sb.append(str7);
        sb.append(", passportNumber=");
        sb.append(str8);
        sb.append(", passportIssueDate=");
        sb.append(str9);
        sb.append(", gender=");
        sb.append(str10);
        sb.append(", motherName=");
        sb.append(str11);
        sb.append(", fatherName=");
        sb.append(str12);
        sb.append(", countryCode=");
        sb.append(str13);
        sb.append(", countryName=");
        sb.append(str14);
        sb.append(", jobSector=");
        sb.append(str15);
        sb.append(", jobTitleCode=");
        sb.append(str16);
        sb.append(", jobTitle=");
        sb.append(str17);
        sb.append(", jobEmployerId=");
        sb.append(str18);
        sb.append(", jobEmployerName=");
        sb.append(str19);
        sb.append(", jobEmploymentCity=");
        sb.append(str20);
        sb.append(", jobEmployerPhoneNumber=");
        sb.append(str21);
        sb.append(", visaNumber=");
        sb.append(str22);
        sb.append(", visaIssuedDate=");
        sb.append(str23);
        sb.append(", jobAgreementNumber=");
        sb.append(str24);
        sb.append(", jobAgreementStartDate=");
        sb.append(str25);
        sb.append(", jobAgreementEndDate=");
        sb.append(str26);
        sb.append(", jhtPaymentCode=");
        sb.append(str27);
        sb.append(", email=");
        sb.append(str28);
        sb.append(", phoneNumber=");
        sb.append(str29);
        sb.append(", pptkisReferenceCode=");
        sb.append(str30);
        sb.append(", branchOfficeName=");
        sb.append(str31);
        sb.append(", branchOfficeCode=");
        sb.append(str32);
        sb.append(", identityImageFile=");
        sb.append(file);
        sb.append(", pksImageFile=");
        sb.append(file2);
        sb.append(")");
        String string = sb.toString();
        int i2 = f407a + 99;
        asBinder = i2 % 128;
        if (i2 % 2 == 0) {
            return string;
        }
        throw null;
    }

    static void b() {
        TuitionPaymentFragmentbindingInflater1 = new char[]{47473, 47460, 47470, 47456, 47459, 47465, 47396, 47519, 47487, 47513, 47518, 47469, 47461, 47439, 47462, 47471, 47463, 47458, 47424, 47441, 47516, 47486, 47466, 47517, 47464, 47467, 47434, 47392, 47468, 47472, 47452, 47449, 47453, 47451, 47393, 47455, 47454, 47450, 47394};
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = 2047719698;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1 = true;
        b = true;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0025
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(byte r7, byte r8, int r9) {
        /*
            int r7 = r7 * 2
            int r7 = 3 - r7
            byte[] r0 = com.bpjstku.data.registration.pmi.model.request.PmiRegistrationRequest.$$c
            int r8 = r8 + 67
            int r9 = r9 * 4
            int r9 = 1 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2c
        L14:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2c:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.data.registration.pmi.model.request.PmiRegistrationRequest.$$g(byte, byte, int):java.lang.String");
    }
}
