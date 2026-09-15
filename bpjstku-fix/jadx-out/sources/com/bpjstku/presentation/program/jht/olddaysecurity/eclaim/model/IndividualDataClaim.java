package com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.model;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import defpackage.abortCapture;
import defpackage.initSession;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b0\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\bN\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0005\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\b\b\u0002\u0010%\u001a\u00020\u0002\u0012\b\b\u0002\u0010&\u001a\u00020\u0002\u0012\b\b\u0002\u0010'\u001a\u00020\u0002\u0012\b\b\u0002\u0010(\u001a\u00020\u0002\u0012\b\b\u0002\u0010)\u001a\u00020\u0002\u0012\b\b\u0002\u0010*\u001a\u00020\u0002\u0012\b\b\u0002\u0010+\u001a\u00020\u0002\u0012\b\b\u0002\u0010,\u001a\u00020\u0002\u0012\b\b\u0002\u0010-\u001a\u00020\u0002\u0012\b\b\u0002\u0010.\u001a\u00020\u0002\u0012\b\b\u0002\u0010/\u001a\u00020\u0002\u0012\b\b\u0002\u00100\u001a\u00020\u0002\u0012\b\b\u0002\u00101\u001a\u00020\u0002\u0012\b\b\u0002\u00102\u001a\u00020\u0002\u0012\b\b\u0002\u00103\u001a\u00020\u0002\u0012\b\b\u0002\u00104\u001a\u00020\u0002\u0012\b\b\u0002\u00105\u001a\u00020\u0002\u0012\b\b\u0002\u00106\u001a\u00020\u0002\u0012\b\b\u0002\u00107\u001a\u00020\u0002\u0012\b\b\u0002\u00108\u001a\u00020\u0002\u0012\b\b\u0002\u00109\u001a\u00020\u0002\u0012\b\b\u0002\u0010:\u001a\u00020\u0002\u0012\b\b\u0002\u0010;\u001a\u00020\u0002\u0012\b\b\u0002\u0010<\u001a\u00020\u0002\u0012\b\b\u0002\u0010=\u001a\u00020\u0002\u0012\b\b\u0002\u0010>\u001a\u00020\u0002\u0012\b\b\u0002\u0010?\u001a\u00020\u0002\u0012\b\b\u0002\u0010@\u001a\u00020\u0002\u0012\b\b\u0002\u0010A\u001a\u00020\u0002\u0012\b\b\u0002\u0010B\u001a\u00020\u0002\u0012\b\b\u0002\u0010C\u001a\u00020\u0002\u0012\b\b\u0002\u0010D\u001a\u00020\u0002\u0012\b\b\u0002\u0010E\u001a\u00020\u001e\u0012\b\b\u0002\u0010F\u001a\u00020\u0002\u0012\b\b\u0002\u0010G\u001a\u00020\u0002\u0012\b\b\u0002\u0010H\u001a\u00020\u0002\u0012\b\b\u0002\u0010I\u001a\u00020\u0002\u0012\b\b\u0002\u0010J\u001a\u00020\u0002\u0012\b\b\u0002\u0010K\u001a\u00020\u0002\u0012\b\b\u0002\u0010L\u001a\u00020\u0002¢\u0006\u0004\bM\u0010NJ\r\u0010P\u001a\u00020O¢\u0006\u0004\bP\u0010QJ\u001a\u0010S\u001a\u00020\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010RHÖ\u0003¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020OHÖ\u0001¢\u0006\u0004\bU\u0010QJ\u0010\u0010V\u001a\u00020\u0002H×\u0001¢\u0006\u0004\bV\u0010WJ\u001d\u0010Z\u001a\u00020Y2\u0006\u0010\u0003\u001a\u00020X2\u0006\u0010\u0004\u001a\u00020O¢\u0006\u0004\bZ\u0010[R\u0014\u0010^\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010`\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b_\u0010]R\u0014\u0010b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\ba\u0010]R\u0014\u0010d\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bc\u0010]R\u0014\u0010f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\be\u0010]R\u0014\u0010h\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bg\u0010]R\u0014\u0010j\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bi\u0010]R\u0014\u0010l\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bk\u0010]R\u0014\u0010i\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bm\u0010]R\u0014\u0010o\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bn\u0010]R\u0014\u0010q\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bp\u0010]R\u0014\u0010s\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\br\u0010]R\u0014\u0010u\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bt\u0010]R\u0014\u0010v\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b^\u0010]R\u0014\u0010n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bb\u0010]R\u0014\u0010_\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b`\u0010]R\u0016\u0010y\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0016\u0010\\\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bz\u0010xR\u0016\u0010|\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b{\u0010xR\u0016\u0010~\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b}\u0010xR\u0017\u0010g\u001a\u0004\u0018\u00010\u00188\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0018\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010xR\u0016\u0010\u0084\u0001\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010]R\u0016\u0010\u0086\u0001\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010]R\u0016\u0010\u0088\u0001\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010]R\u0017\u0010\u008b\u0001\u001a\u00020\u001e8\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0016\u0010\u008d\u0001\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010]R\u0016\u0010\u008f\u0001\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010]R\u0016\u0010\u0091\u0001\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010]R\u0015\u0010\u0092\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bh\u0010]R\u0015\u0010\u0093\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bu\u0010]R\u0015\u0010\u0094\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bo\u0010]R\u0016\u0010\u0096\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010]R\u0016\u0010\u0098\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010]R\u0015\u0010\u0099\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bl\u0010]R\u0015\u0010\u009a\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bf\u0010]R\u0015\u0010\u009b\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bd\u0010]R\u001c\u0010\u009d\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\r\n\u0005\b\u009c\u0001\u0010]\u001a\u0004\bd\u0010WR\u0016\u0010\u009f\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u009e\u0001\u0010]R\u0015\u0010\u0095\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b|\u0010]R\u0017\u0010 \u0001\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\bq\u0010]R\u0015\u0010m\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010]R\u0016\u0010¢\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b¡\u0001\u0010]R\u0016\u0010¡\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b£\u0001\u0010]R\u0014\u0010k\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bv\u0010]R\u001c\u0010\u009e\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\r\n\u0005\b¤\u0001\u0010]\u001a\u0004\b^\u0010WR\u0015\u0010\u007f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010]R\u0016\u0010¥\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010]R\u0016\u0010\u0097\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b¥\u0001\u0010]R\u0016\u0010¦\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010]R\u0016\u0010£\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010]R\u0015\u0010a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010]R\u0016\u0010\u0090\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u009d\u0001\u0010]R\u0015\u0010t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010]R\u0016\u0010\u0081\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010]R\u0015\u0010p\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010]R\u0016\u0010\u008c\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010]R\u0015\u0010c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u009f\u0001\u0010]R\u0016\u0010¤\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b¢\u0001\u0010]R\u0016\u0010\u008e\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b \u0001\u0010]R\u0014\u0010z\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\by\u0010]R\u0014\u0010}\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\b~\u0010]R\u0015\u0010\u0089\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0006\n\u0004\bs\u0010]R\u0015\u0010e\u001a\u00020\u001e8\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\bj\u0010\u008a\u0001R\u0015\u0010w\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b¦\u0001\u0010]R\u0016\u0010\u0083\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010]R\u0016\u0010\u009c\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010]R\u0016\u0010\u0085\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010]R\u0016\u0010\u0087\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010]R\u0015\u0010{\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010]R\u0016\u0010§\u0001\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010]"}, d2 = {"Lcom/bpjstku/presentation/program/jht/olddaysecurity/eclaim/model/IndividualDataClaim;", "Landroid/os/Parcelable;", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "Ljava/io/File;", "p16", "p17", "p18", "p19", "", "p20", "p21", "p22", "p23", "p24", "", "p25", "p26", "p27", "p28", "p29", "p30", "p31", "p32", "p33", "p34", "p35", "p36", "p37", "p38", "p39", "p40", "p41", "p42", "p43", "p44", "p45", "p46", "p47", "p48", "p49", "p50", "p51", "p52", "p53", "p54", "p55", "p56", "p57", "p58", "p59", "p60", "p61", "p62", "p63", "p64", "p65", "p66", "p67", "p68", "p69", "p70", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Ljava/io/File;Ljava/io/File;Ljava/io/File;[BLjava/io/File;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "INotificationSideChannelStub", "Ljava/lang/String;", "b", "RemoteActionCompatParcelizer", "TuitionPaymentFragmentspecialinlinedviewModeldefault3", "MediaBrowserCompatCustomActionResultReceiver", "TuitionPaymentFragmentspecialinlinedviewModeldefault2", "MediaBrowserCompatItemReceiver", "TuitionPaymentFragmentbindingInflater1", "MediaBrowserCompatMediaBrowserImplApi212", "TuitionPaymentFragmentspecialinlinedviewModeldefault1", "IconCompatParcelizer", "asBinder", "d", "g", "onConnectionFailed", "a", "onConnected", "cancelAll", "asInterface", "onLoadChildren", "INotificationSideChannel", "isCurrent", "cancel", "onResult", "notify", "onTransact", "onServiceConnected", "Ljava/io/File;", "INotificationSideChannelDefault", "MediaBrowserCompatMediaBrowserImplApi213", "MediaBrowserCompatMediaBrowserImplApi215", "getInterfaceDescriptor", "run", "INotificationSideChannelStubProxy", "MediaBrowserCompatConnectionCallbackConnectionCallbackInternal", "[B", "onItemLoaded", "connect", "MediaBrowserCompatMediaBrowserImplApi214", "write", "MediaBrowserCompatMediaBrowserImplApi23", "read", "MediaBrowserCompatMediaBrowserImplApi217", "MediaBrowserCompat", "MediaBrowserCompatMediaBrowserImplApi211", "Z", "getRoot", "MediaBrowserCompatMediaBrowserImplApi21", "getNotifyChildrenChangedOptions", "MediaBrowserCompatItemCallbackStubApi23", "disconnect", "MediaBrowserCompatItemCallback", "getExtras", "getItem", "isConnected", "getServiceComponent", "handleMessage", "getSessionToken", "MediaBrowserCompatConnectionCallbackStubApi21", "sendCustomAction", FirebaseAnalytics.Event.SEARCH, "unsubscribe", "MediaBrowserCompatCallbackHandler", "MediaBrowserCompatMediaBrowserImplApi216", "setCallbacksMessenger", "onError", "subscribe", "MediaBrowserCompatConnectionCallback", "setInternalConnectionCallback", "onConnectionSuspended", "onReceiveResult", "MediaBrowserCompatMediaBrowserImpl", "onProgressUpdate", "MediaBrowserCompatCustomActionCallback", "getStateLabel"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class IndividualDataClaim implements Parcelable {
    public static final Parcelable.Creator<IndividualDataClaim> CREATOR;
    private static int MediaBrowserCompatMediaBrowserImplBase;
    private static long dump;

    /* JADX INFO: renamed from: INotificationSideChannel, reason: from kotlin metadata */
    public String MediaBrowserCompatConnectionCallback;

    /* JADX INFO: renamed from: INotificationSideChannelDefault, reason: from kotlin metadata */
    public final String MediaBrowserCompatMediaBrowserImplApi213;

    /* JADX INFO: renamed from: INotificationSideChannelStub, reason: from kotlin metadata */
    public final String b;

    /* JADX INFO: renamed from: INotificationSideChannelStubProxy, reason: from kotlin metadata */
    public final String run;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public final String asBinder;

    /* JADX INFO: renamed from: MediaBrowserCompat, reason: from kotlin metadata */
    public final String MediaBrowserCompatMediaBrowserImplApi21;

    /* JADX INFO: renamed from: MediaBrowserCompatCallbackHandler, reason: from kotlin metadata */
    public final String onReceiveResult;

    /* JADX INFO: renamed from: MediaBrowserCompatConnectionCallback, reason: from kotlin metadata */
    public final String MediaBrowserCompatItemCallbackStubApi23;

    /* JADX INFO: renamed from: MediaBrowserCompatConnectionCallbackConnectionCallbackInternal, reason: from kotlin metadata */
    public final byte[] IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatConnectionCallbackStubApi21, reason: from kotlin metadata */
    public final String sendCustomAction;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionCallback, reason: from kotlin metadata */
    public final String onServiceConnected;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    /* JADX INFO: renamed from: MediaBrowserCompatItemCallback, reason: from kotlin metadata */
    private final String getExtras;

    /* JADX INFO: renamed from: MediaBrowserCompatItemCallbackStubApi23, reason: from kotlin metadata */
    private final String disconnect;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentbindingInflater1;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaBrowserImpl, reason: from kotlin metadata */
    private final String onError;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaBrowserImplApi21, reason: from kotlin metadata */
    private final String getNotifyChildrenChangedOptions;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaBrowserImplApi211, reason: from kotlin metadata */
    private final boolean getRoot;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaBrowserImplApi212, reason: from kotlin metadata */
    private final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaBrowserImplApi213, reason: from kotlin metadata */
    private final File INotificationSideChannelStub;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaBrowserImplApi214, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaBrowserImplApi215, reason: from kotlin metadata */
    private final File getInterfaceDescriptor;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaBrowserImplApi216, reason: from kotlin metadata */
    private final String setCallbacksMessenger;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaBrowserImplApi217, reason: from kotlin metadata */
    private final String MediaBrowserCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaBrowserImplApi23, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault3;

    /* JADX INFO: renamed from: TuitionPaymentFragmentbindingInflater1, reason: from kotlin metadata */
    public final String MediaBrowserCompatCallbackHandler;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault1, reason: from kotlin metadata */
    public final String unsubscribe;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault2, reason: from kotlin metadata */
    public final String cancelAll;

    /* JADX INFO: renamed from: TuitionPaymentFragmentspecialinlinedviewModeldefault3, reason: from kotlin metadata */
    public final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String search;

    /* JADX INFO: renamed from: asBinder, reason: from kotlin metadata */
    public final String getItem;

    /* JADX INFO: renamed from: asInterface, reason: from kotlin metadata */
    public final String getServiceComponent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final String onTransact;

    /* JADX INFO: renamed from: cancel, reason: from kotlin metadata */
    public final String MediaBrowserCompatMediaBrowserImplApi211;

    /* JADX INFO: renamed from: cancelAll, reason: from kotlin metadata */
    public final String asInterface;

    /* JADX INFO: renamed from: connect, reason: from kotlin metadata */
    public final String MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final String g;

    /* JADX INFO: renamed from: disconnect, reason: from kotlin metadata */
    public final String MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final boolean MediaBrowserCompatMediaBrowserImplApi212;

    /* JADX INFO: renamed from: getExtras, reason: from kotlin metadata */
    public final String onProgressUpdate;

    /* JADX INFO: renamed from: getInterfaceDescriptor, reason: from kotlin metadata */
    public final String handleMessage;

    /* JADX INFO: renamed from: getItem, reason: from kotlin metadata */
    public final String MediaBrowserCompatMediaBrowserImplApi214;

    /* JADX INFO: renamed from: getNotifyChildrenChangedOptions, reason: from kotlin metadata */
    public final String onConnected;

    /* JADX INFO: renamed from: getRoot, reason: from kotlin metadata */
    public final String MediaBrowserCompatMediaBrowserImplApi217;

    /* JADX INFO: renamed from: getServiceComponent, reason: from kotlin metadata */
    public final String MediaBrowserCompatMediaBrowserImplApi23;

    /* JADX INFO: renamed from: getSessionToken, reason: from kotlin metadata */
    public final String getStateLabel;

    /* JADX INFO: renamed from: handleMessage, reason: from kotlin metadata */
    public final String getSessionToken;

    /* JADX INFO: renamed from: isConnected, reason: from kotlin metadata */
    public final String MediaBrowserCompatMediaBrowserImplApi215;

    /* JADX INFO: renamed from: isCurrent, reason: from kotlin metadata */
    private final String cancel;

    /* JADX INFO: renamed from: notify, reason: from kotlin metadata */
    public final String isConnected;

    /* JADX INFO: renamed from: onConnected, reason: from kotlin metadata */
    public final String d;

    /* JADX INFO: renamed from: onConnectionFailed, reason: from kotlin metadata */
    public final String a;

    /* JADX INFO: renamed from: onConnectionSuspended, reason: from kotlin metadata */
    public final String MediaBrowserCompatMediaBrowserImpl;

    /* JADX INFO: renamed from: onError, reason: from kotlin metadata */
    public final String subscribe;

    /* JADX INFO: renamed from: onItemLoaded, reason: from kotlin metadata */
    private final File connect;

    /* JADX INFO: renamed from: onLoadChildren, reason: from kotlin metadata */
    private final String INotificationSideChannel;

    /* JADX INFO: renamed from: onProgressUpdate, reason: from kotlin metadata */
    public final String MediaBrowserCompatConnectionCallbackStubApi21;

    /* JADX INFO: renamed from: onReceiveResult, reason: from kotlin metadata */
    public final String setInternalConnectionCallback;

    /* JADX INFO: renamed from: onResult, reason: from kotlin metadata */
    private final String notify;

    /* JADX INFO: renamed from: onServiceConnected, reason: from kotlin metadata */
    private final File INotificationSideChannelDefault;

    /* JADX INFO: renamed from: onTransact, reason: from kotlin metadata */
    public final String onConnectionFailed;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public final String MediaBrowserCompatCustomActionCallback;

    /* JADX INFO: renamed from: run, reason: from kotlin metadata */
    private final File INotificationSideChannelStubProxy;

    /* JADX INFO: renamed from: search, reason: from kotlin metadata */
    public final String onItemLoaded;

    /* JADX INFO: renamed from: sendCustomAction, reason: from kotlin metadata */
    public final String onResult;

    /* JADX INFO: renamed from: setCallbacksMessenger, reason: from kotlin metadata */
    public final String MediaBrowserCompatItemCallback;

    /* JADX INFO: renamed from: setInternalConnectionCallback, reason: from kotlin metadata */
    public final String onConnectionSuspended;

    /* JADX INFO: renamed from: subscribe, reason: from kotlin metadata */
    public final String MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: unsubscribe, reason: from kotlin metadata */
    public final String onLoadChildren;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public final String MediaBrowserCompatMediaBrowserImplApi216;
    private static final byte[] $$c = {12, -88, 33, 118};
    private static final int $$f = 115;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {93, -77, 2, Base64.padSymbol, 12, -16, 1, 2, 8, -4, -12, 65, 3, -52, -4, 2, -16, -5, 14, -14, 67, -69, -7, 13, 8, -22, 20, 46, 3, -21, -46, 10, -22, 41, -20, -18, 13, -14, -5, 20, -2, -11, 6, -34, 11, -12, 10, -7, 0, 29, -18, -25, 11, 7, -10, -7, 45, -45, 16, -7, -7, 7, -10, -7, 17, -8, -6, 9, -6, -6, 6, 29, -38, 7, -7, 10, -20, 14, -14, 64, -13, 1, 62, -53, -15, 5, -10, -2, 8, -11, 70, -55, 2, -20, 18, 50, -67, -3, 2, 1, -3, 64, -35, -35, 2, 1, -3, 42, -30, -20, 18, 13, -34, 4, -4, 12, 64, -1, -34, -52, 3, 14, -14, 3, 12, -12, 24, -39, 10, -7, 11, 2, -16, 10, 5, 22, -22, -13, 10, -3, 2, 44, -34, 11, -12, 10, -7, 0, 29, -18, -25, 11, 7, -10, -7, 45, -45, 16, -7, -7, 7, -10, -7, 0, 2, 10, 1, -7, 7, -12, 2, -6, 1, 2, -6, 8, 0, -19, 12, 3, -19, 41, -35, 10, -2, -8, 7, -2, -2, 4, -21, 8, -9, 66};
    private static final int $$e = 77;
    private static final byte[] $$a = {58, -51, 54, -115, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, 7, -18, -16, -1, -16, -16, -4, 19, -48, -3, -17, 0, -30, 4, -24, 54, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 56};
    private static final int $$b = 198;
    private static int MediaBrowserCompatMediaBrowserImplApi26 = 0;
    private static int MediaBrowserCompatMediaBrowserImplBase2 = 1;
    private static int getStateLabel = 0;

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = 103 - r8
            int r0 = 53 - r6
            byte[] r1 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.model.IndividualDataClaim.$$a
            byte[] r0 = new byte[r0]
            int r6 = 52 - r6
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-11)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.model.IndividualDataClaim.c(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0022  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 15
            int r8 = r8 + 84
            int r7 = r7 + 4
            int r6 = r6 + 38
            byte[] r0 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.model.IndividualDataClaim.$$d
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r4 = r0[r7]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r7 = r7 + 1
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-1)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.model.IndividualDataClaim.f(byte, int, byte, java.lang.Object[]):void");
    }

    public IndividualDataClaim(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, File file, File file2, File file3, File file4, byte[] bArr, File file5, String str17, String str18, String str19, boolean z, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, boolean z2, String str57, String str58, String str59, String str60, String str61, String str62, String str63) {
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
        Intrinsics.checkNotNullParameter(str33, "");
        Intrinsics.checkNotNullParameter(str34, "");
        Intrinsics.checkNotNullParameter(str35, "");
        Intrinsics.checkNotNullParameter(str36, "");
        Intrinsics.checkNotNullParameter(str37, "");
        Intrinsics.checkNotNullParameter(str38, "");
        Intrinsics.checkNotNullParameter(str39, "");
        Intrinsics.checkNotNullParameter(str40, "");
        Intrinsics.checkNotNullParameter(str41, "");
        Intrinsics.checkNotNullParameter(str42, "");
        Intrinsics.checkNotNullParameter(str43, "");
        Intrinsics.checkNotNullParameter(str44, "");
        Intrinsics.checkNotNullParameter(str45, "");
        Intrinsics.checkNotNullParameter(str46, "");
        Intrinsics.checkNotNullParameter(str47, "");
        Intrinsics.checkNotNullParameter(str48, "");
        Intrinsics.checkNotNullParameter(str49, "");
        Intrinsics.checkNotNullParameter(str50, "");
        Intrinsics.checkNotNullParameter(str51, "");
        Intrinsics.checkNotNullParameter(str52, "");
        Intrinsics.checkNotNullParameter(str53, "");
        Intrinsics.checkNotNullParameter(str54, "");
        Intrinsics.checkNotNullParameter(str55, "");
        Intrinsics.checkNotNullParameter(str56, "");
        Intrinsics.checkNotNullParameter(str57, "");
        Intrinsics.checkNotNullParameter(str58, "");
        Intrinsics.checkNotNullParameter(str59, "");
        Intrinsics.checkNotNullParameter(str60, "");
        Intrinsics.checkNotNullParameter(str61, "");
        Intrinsics.checkNotNullParameter(str62, "");
        Intrinsics.checkNotNullParameter(str63, "");
        this.b = str;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = str2;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = str3;
        this.TuitionPaymentFragmentbindingInflater1 = str4;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str5;
        this.asBinder = str6;
        this.g = str7;
        this.a = str8;
        this.d = str9;
        this.asInterface = str10;
        this.INotificationSideChannel = str11;
        this.cancel = str12;
        this.notify = str13;
        this.onTransact = str14;
        this.cancelAll = str15;
        this.RemoteActionCompatParcelizer = str16;
        this.INotificationSideChannelDefault = file;
        this.INotificationSideChannelStub = file2;
        this.getInterfaceDescriptor = file3;
        this.INotificationSideChannelStubProxy = file4;
        this.IconCompatParcelizer = bArr;
        this.connect = file5;
        this.write = str17;
        this.read = str18;
        this.MediaBrowserCompat = str19;
        this.getRoot = z;
        this.getNotifyChildrenChangedOptions = str20;
        this.disconnect = str21;
        this.getExtras = str22;
        this.getItem = str23;
        this.isConnected = str24;
        this.getServiceComponent = str25;
        this.getSessionToken = str26;
        this.sendCustomAction = str27;
        this.search = str28;
        this.unsubscribe = str29;
        this.MediaBrowserCompatCallbackHandler = str30;
        this.setCallbacksMessenger = str31;
        this.subscribe = str32;
        this.handleMessage = str33;
        this.MediaBrowserCompatConnectionCallback = str34;
        this.onConnected = str35;
        this.onConnectionSuspended = str36;
        this.setInternalConnectionCallback = str37;
        this.onConnectionFailed = str38;
        this.onError = str39;
        this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal = str40;
        this.onProgressUpdate = str41;
        this.MediaBrowserCompatConnectionCallbackStubApi21 = str42;
        this.MediaBrowserCompatCustomActionCallback = str43;
        this.onReceiveResult = str44;
        this.MediaBrowserCompatCustomActionResultReceiver = str45;
        this.MediaBrowserCompatItemCallback = str46;
        this.onResult = str47;
        this.onItemLoaded = str48;
        this.onLoadChildren = str49;
        this.MediaBrowserCompatMediaBrowserImplApi21 = str50;
        this.MediaBrowserCompatItemReceiver = str51;
        this.MediaBrowserCompatMediaBrowserImpl = str52;
        this.MediaBrowserCompatItemCallbackStubApi23 = str53;
        this.MediaBrowserCompatMediaBrowserImplApi213 = str54;
        this.run = str55;
        this.MediaBrowserCompatMediaBrowserImplApi211 = str56;
        this.MediaBrowserCompatMediaBrowserImplApi212 = z2;
        this.onServiceConnected = str57;
        this.MediaBrowserCompatMediaBrowserImplApi214 = str58;
        this.MediaBrowserCompatMediaBrowserImplApi216 = str59;
        this.MediaBrowserCompatMediaBrowserImplApi23 = str60;
        this.MediaBrowserCompatMediaBrowserImplApi217 = str61;
        this.MediaBrowserCompatMediaBrowserImplApi215 = str62;
        this.getStateLabel = str63;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ IndividualDataClaim(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, File file, File file2, File file3, File file4, byte[] bArr, File file5, String str17, String str18, String str19, boolean z, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, boolean z2, String str57, String str58, String str59, String str60, String str61, String str62, String str63, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        String str64;
        String str65;
        String str66;
        String str67;
        byte[] bArr2;
        String str68;
        int i4;
        String str69;
        String str70;
        String str71;
        String str72;
        String str73;
        String str74;
        String str75;
        String str76 = (i & 1) != 0 ? "" : str;
        String str77 = (i & 2) != 0 ? "" : str2;
        String str78 = (i & 4) != 0 ? "" : str3;
        String str79 = (i & 8) != 0 ? "" : str4;
        if ((i & 16) != 0) {
            int i5 = MediaBrowserCompatMediaBrowserImplApi26;
            int i6 = i5 + 11;
            MediaBrowserCompatMediaBrowserImplBase2 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 8 / 0;
            }
            int i8 = i5 + 99;
            MediaBrowserCompatMediaBrowserImplBase2 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 2 % 2;
            str64 = "";
        } else {
            str64 = str5;
        }
        String str80 = (i & 32) != 0 ? "" : str6;
        String str81 = (i & 64) != 0 ? "" : str7;
        String str82 = (i & 128) != 0 ? "" : str8;
        if ((i & 256) != 0) {
            int i11 = MediaBrowserCompatMediaBrowserImplBase2 + 69;
            MediaBrowserCompatMediaBrowserImplApi26 = i11 % 128;
            int i12 = i11 % 2;
            str65 = "";
        } else {
            str65 = str9;
        }
        String str83 = (i & 512) != 0 ? "" : str10;
        String str84 = (i & 1024) != 0 ? "" : str11;
        String str85 = (i & 2048) != 0 ? "" : str12;
        String str86 = (i & 4096) != 0 ? "" : str13;
        if ((i & 8192) != 0) {
            int i13 = MediaBrowserCompatMediaBrowserImplBase2 + 75;
            MediaBrowserCompatMediaBrowserImplApi26 = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 82 / 0;
            }
            str66 = "";
        } else {
            str66 = str14;
        }
        String str87 = (i & 16384) != 0 ? "" : str15;
        Object obj = null;
        if ((i & 32768) != 0) {
            int i15 = MediaBrowserCompatMediaBrowserImplApi26 + 67;
            MediaBrowserCompatMediaBrowserImplBase2 = i15 % 128;
            if (i15 % 2 == 0) {
                throw null;
            }
            str67 = "";
        } else {
            str67 = str16;
        }
        File file6 = (i & 65536) != 0 ? null : file;
        File file7 = (i & 131072) != 0 ? null : file2;
        File file8 = (i & 262144) != 0 ? null : file3;
        File file9 = (i & 524288) != 0 ? null : file4;
        if ((i & 1048576) != 0) {
            bArr2 = new byte[0];
            int i16 = 2 % 2;
        } else {
            bArr2 = bArr;
        }
        File file10 = (i & 2097152) != 0 ? null : file5;
        String str88 = (i & 4194304) != 0 ? "" : str17;
        if ((i & 8388608) != 0) {
            int i17 = MediaBrowserCompatMediaBrowserImplBase2 + 17;
            MediaBrowserCompatMediaBrowserImplApi26 = i17 % 128;
            if (i17 % 2 != 0) {
                obj.hashCode();
                throw null;
            }
            str68 = "";
        } else {
            str68 = str18;
        }
        String str89 = (16777216 & i) != 0 ? "" : str19;
        boolean z3 = (i & 33554432) != 0 ? false : z;
        String str90 = (i & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? "" : str20;
        if ((i & 134217728) != 0) {
            int i18 = MediaBrowserCompatMediaBrowserImplBase2 + 21;
            MediaBrowserCompatMediaBrowserImplApi26 = i18 % 128;
            i4 = 2;
            if (i18 % 2 != 0) {
                throw null;
            }
            str69 = "";
        } else {
            i4 = 2;
            str69 = str21;
        }
        if ((i & 268435456) != 0) {
            int i19 = i4 % i4;
            str70 = "";
        } else {
            str70 = str22;
        }
        String str91 = (i & 536870912) != 0 ? "" : str23;
        String str92 = (i & BasicMeasure.EXACTLY) != 0 ? "" : str24;
        String str93 = (i & Integer.MIN_VALUE) != 0 ? "" : str25;
        String str94 = (i2 & 1) != 0 ? "" : str26;
        String str95 = (i2 & 2) != 0 ? "" : str27;
        if ((i2 & 4) != 0) {
            int i20 = 2 % 2;
            str71 = "";
        } else {
            str71 = str28;
        }
        String str96 = (i2 & 8) != 0 ? "" : str29;
        String str97 = (i2 & 16) != 0 ? "" : str30;
        String str98 = (i2 & 32) != 0 ? "" : str31;
        if ((i2 & 64) != 0) {
            int i21 = MediaBrowserCompatMediaBrowserImplApi26 + 105;
            MediaBrowserCompatMediaBrowserImplBase2 = i21 % 128;
            int i22 = i21 % 2;
            str72 = "";
        } else {
            str72 = str32;
        }
        String str99 = (i2 & 128) != 0 ? "" : str33;
        String str100 = (i2 & 256) != 0 ? "" : str34;
        String str101 = (i2 & 512) != 0 ? "" : str35;
        String str102 = (i2 & 1024) != 0 ? "" : str36;
        String str103 = (i2 & 2048) != 0 ? "" : str37;
        String str104 = (i2 & 4096) != 0 ? "" : str38;
        String str105 = (i2 & 8192) != 0 ? "" : str39;
        String str106 = (i2 & 16384) != 0 ? "" : str40;
        if ((i2 & 32768) != 0) {
            int i23 = MediaBrowserCompatMediaBrowserImplApi26 + 37;
            MediaBrowserCompatMediaBrowserImplBase2 = i23 % 128;
            int i24 = i23 % 2;
            str73 = "";
        } else {
            str73 = str41;
        }
        String str107 = (65536 & i2) != 0 ? "" : str42;
        String str108 = (i2 & 131072) != 0 ? "" : str43;
        String str109 = (i2 & 262144) != 0 ? "" : str44;
        String str110 = (i2 & 524288) != 0 ? "" : str45;
        String str111 = (i2 & 1048576) != 0 ? "" : str46;
        String str112 = (i2 & 2097152) != 0 ? "" : str47;
        String str113 = (i2 & 4194304) != 0 ? "" : str48;
        String str114 = (i2 & 8388608) != 0 ? "" : str49;
        String str115 = (i2 & 16777216) != 0 ? "" : str50;
        String str116 = (i2 & 33554432) != 0 ? "" : str51;
        String str117 = (i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? "" : str52;
        String str118 = (i2 & 134217728) != 0 ? "" : str53;
        if ((i2 & 268435456) != 0) {
            int i25 = MediaBrowserCompatMediaBrowserImplBase2 + 99;
            MediaBrowserCompatMediaBrowserImplApi26 = i25 % 128;
            if (i25 % 2 != 0) {
                throw null;
            }
            str74 = "";
        } else {
            str74 = str54;
        }
        String str119 = (536870912 & i2) != 0 ? "" : str55;
        String str120 = (i2 & BasicMeasure.EXACTLY) != 0 ? "" : str56;
        boolean z4 = (i2 & Integer.MIN_VALUE) != 0 ? false : z2;
        String str121 = (i3 & 1) != 0 ? "" : str57;
        String str122 = (i3 & 2) != 0 ? "" : str58;
        String str123 = (i3 & 4) != 0 ? "" : str59;
        String str124 = (i3 & 8) != 0 ? "" : str60;
        if ((i3 & 16) != 0) {
            int i26 = 2 % 2;
            str75 = "";
        } else {
            str75 = str61;
        }
        this(str76, str77, str78, str79, str64, str80, str81, str82, str65, str83, str84, str85, str86, str66, str87, str67, file6, file7, file8, file9, bArr2, file10, str88, str68, str89, z3, str90, str69, str70, str91, str92, str93, str94, str95, str71, str96, str97, str98, str72, str99, str100, str101, str102, str103, str104, str105, str106, str73, str107, str108, str109, str110, str111, str112, str113, str114, str115, str116, str117, str118, str74, str119, str120, z4, str121, str122, str123, str124, str75, (i3 & 32) != 0 ? "" : str62, (i3 & 64) != 0 ? "" : str63);
    }

    private static void e(char[] cArr, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        abortCapture abortcapture = new abortCapture();
        char[] cArrB = abortCapture.b(dump ^ (-2687588926731523482L), cArr, i);
        abortcapture.b = 4;
        int i3 = $11 + 113;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (abortcapture.b < cArrB.length) {
            int i5 = $11 + 31;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = abortcapture.b - 4;
            int i7 = abortcapture.b;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[abortcapture.b] ^ cArrB[abortcapture.b % 4]), Long.valueOf(abortcapture.TuitionPaymentFragmentspecialinlinedviewModeldefault1), Long.valueOf(dump)};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-774687567);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (Color.blue(0) + 64838), 1356 - Color.green(0), 38 - Drawable.resolveOpacity(0, 0), 894276454, false, $$g(b, b2, b2), new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrB[i7] = ((Character) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {abortcapture, abortcapture};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-772308768);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 47773), 467 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 13 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 896083767, false, "n", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrB, 4, cArrB.length - 4);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x01ea  */
    public final String TuitionPaymentFragmentbindingInflater1() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char maximumDrawingCacheSize = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int iIndexOf = 875 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 10;
            Object[] objArr2 = new Object[1];
            c((byte) 52, (short) 140, (byte) ($$a[19] - 1), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(maximumDrawingCacheSize, iIndexOf, offsetAfter, 252381699, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{52582, 12802, 16334, 52487, 47220, 35354, 11162, 5152, 58729, 32787, 826, 19612, 40393, 59561, 23312, 25921, 46143, 12617, 45802, 40215, 27787, 6617, 35346, 46525, 1253, 24977}, MotionEvent.axisFromString("") + 1, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{59519, 15167, 54032, 59418, 45387, 4327, 51009, 36575, 49260, 35106, 61412, 54813, 47322, 57734, 46988, 65435, 37174, 14442, 24101}, 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
            int i2 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 876;
            int keyRepeatTimeout = 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            byte[] bArr = $$a;
            byte b = bArr[7];
            Object[] objArr5 = new Object[1];
            c(b, (short) (b | 140), bArr[10], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cMakeMeasureSpec, i2, keyRepeatTimeout, 2009631821, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 876;
                int i3 = 11 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                Object[] objArr6 = new Object[1];
                c((byte) 52, (short) ($$b & PointerIconCompat.TYPE_TEXT), $$a[7], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(packedPositionGroup, edgeSlop, i3, 256017550, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i4 = ~iIdentityHashCode;
            int i5 = (~(951814815 | i4)) | 50339936;
            int i6 = ~(iIdentityHashCode | (-10029708));
            int i7 = ((((i5 | i6) * (-252)) - 158927788) + ((i6 | (~(i4 | 1002154751))) * 252)) - 1953102402;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{62976, 27084, 34288, 63073, 58298, 51180, 37284, 22998, 56847, 56285, 47364, 362, 42657, 45924, 57712, 10442, 36705, 27287, 2260, 53485, 22518, 16957, 12340, 63581, 16308, 14940, 23442, 44961, 1057, 5616}, ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{16350, 56312, 18671, 16317, 20885, 27500, 23725, 62806, 6107, 27118, 29707, 44421, 28526, 336, 11379, 33805, 18077, 55457, 50635, 31853, 40497, 61454}, TextUtils.indexOf("", "", 0, 0), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (applicationContext instanceof ContextWrapper) {
                    int i10 = MediaBrowserCompatMediaBrowserImplBase2 + 55;
                    MediaBrowserCompatMediaBrowserImplApi26 = i10 % 128;
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
            e(new char[]{21537, 7641, 22347, 21579, 38816, 5526, 17165, 35775, 31855, 45005, 27578, 54096, 1158, 50991, 13288, 64231, 11634, 7829, 55934, 659}, Drawable.resolveOpacity(0, 0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{12617, '%', 39715, 12576, 35417, 3769, 36726, 37023, 6493, 45620, 42951, 51304, 25025, 55964, 65440, 57817, 18474, 882, 5655, 6580}, ExpandableListView.getPackedPositionGroup(0L), objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i12 = MediaBrowserCompatMediaBrowserImplApi26 + 71;
            MediaBrowserCompatMediaBrowserImplBase2 = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), -1953102402};
                byte[] bArr2 = $$d;
                Object[] objArr13 = new Object[1];
                f((byte) (-bArr2[51]), (short) ($$e - 1), bArr2[6], objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                f((byte) (-bArr2[84]), (short) 138, bArr2[48], objArr14);
                objArr = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    int i14 = MediaBrowserCompatMediaBrowserImplBase2 + 95;
                    MediaBrowserCompatMediaBrowserImplApi26 = i14 % 128;
                    int i15 = i14 % 2;
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-337894567);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int mode = 876 - View.MeasureSpec.getMode(0);
                        int i16 = (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 10;
                        Object[] objArr15 = new Object[1];
                        c((byte) 52, (short) ($$b & PointerIconCompat.TYPE_TEXT), $$a[7], objArr15);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(packedPositionType, mode, i16, 256017550, false, (String) objArr15[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr16 = new Object[1];
                        e(new char[]{52582, 12802, 16334, 52487, 47220, 35354, 11162, 5152, 58729, 32787, 826, 19612, 40393, 59561, 23312, 25921, 46143, 12617, 45802, 40215, 27787, 6617, 35346, 46525, 1253, 24977}, ExpandableListView.getPackedPositionType(0L), objArr16);
                        Class<?> cls5 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        e(new char[]{59519, 15167, 54032, 59418, 45387, 4327, 51009, 36575, 49260, 35106, 61412, 54813, 47322, 57734, 46988, 65435, 37174, 14442, 24101}, ViewConfiguration.getEdgeSlop() >> 16, objArr17);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr17[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1823069286);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                            int iBlue = Color.blue(0) + 876;
                            int iGreen = Color.green(0) + 10;
                            byte[] bArr3 = $$a;
                            byte b2 = bArr3[7];
                            Object[] objArr18 = new Object[1];
                            c(b2, (short) (b2 | 140), bArr3[10], objArr18);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(c, iBlue, iGreen, 2009631821, false, (String) objArr18[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-342512172);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c2 = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                            int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 876;
                            int packedPositionType2 = 10 - ExpandableListView.getPackedPositionType(0L);
                            Object[] objArr19 = new Object[1];
                            c((byte) 52, (short) 140, (byte) ($$a[19] - 1), objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c2, packedPositionGroup2, packedPositionType2, 252381699, false, (String) objArr19[0], null);
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
        int i17 = ((int[]) objArr[2])[0];
        int i18 = ((int[]) objArr[0])[0];
        if (i18 == i17) {
            int i19 = MediaBrowserCompatMediaBrowserImplBase2 + 79;
            MediaBrowserCompatMediaBrowserImplApi26 = i19 % 128;
            int i20 = i19 % 2;
            int i21 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i22 = i21 + (-107268064) + (((~(1015792691 | iIdentityHashCode2)) | (-1056102921)) * (-964)) + (((~((~iIdentityHashCode2) | 1015792691)) | (-1056693820)) * (-964));
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr20[1])[0] = i24 ^ (i24 << 5);
            int i25 = MediaBrowserCompatMediaBrowserImplApi26 + 59;
            MediaBrowserCompatMediaBrowserImplBase2 = i25 % 128;
            int i26 = i25 % 2;
        } else {
            int[] iArr = new int[i18];
            int i27 = i18 - 1;
            iArr[i27] = 1;
            Toast.makeText((Context) null, iArr[((i18 * i27) % 2) - 1], 1).show();
            int i28 = ((int[]) objArr[1])[0];
            Object[] objArr21 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iUptimeMillis = (int) SystemClock.uptimeMillis();
            int i29 = ~iUptimeMillis;
            int i30 = i28 + 1908943716 + ((iUptimeMillis | 198741442) * (-859)) + (((~(iUptimeMillis | (-42502147))) | (~(198741442 | i29))) * 859) + (((~(158431213 | i29)) | (-200933360)) * 859);
            int i31 = (i30 << 13) ^ i30;
            int i32 = i31 ^ (i31 >>> 17);
            ((int[]) objArr21[1])[0] = i32 ^ (i32 << 5);
        }
        return this.setCallbacksMessenger;
    }

    public final String b() throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
            int edgeSlop = 2267 - (ViewConfiguration.getEdgeSlop() >> 16);
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 33;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c(bArr[7], bArr[132], bArr[10], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(minimumFlingVelocity, edgeSlop, windowTouchSlop, -887667012, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(new char[]{52582, 12802, 16334, 52487, 47220, 35354, 11162, 5152, 58729, 32787, 826, 19612, 40393, 59561, 23312, 25921, 46143, 12617, 45802, 40215, 27787, 6617, 35346, 46525, 1253, 24977}, (-1) - Process.getGidForName(""), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{59519, 15167, 54032, 59418, 45387, 4327, 51009, 36575, 49260, 35106, 61412, 54813, 47322, 57734, 46988, 65435, 37174, 14442, 24101}, (-1) - TextUtils.indexOf((CharSequence) "", '0'), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
            int i2 = 2268 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 34;
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c(bArr2[7], (short) (-bArr2[1]), bArr2[10], objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout, i2, iLastIndexOf, -874156483, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                int scrollBarSize = 2267 - (ViewConfiguration.getScrollBarSize() >> 8);
                int iBlue = Color.blue(0) + 33;
                Object[] objArr6 = new Object[1];
                c((byte) 15, (short) 103, $$a[10], objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(deadChar, scrollBarSize, iBlue, -654680577, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{i}, strArr, new int[1], new int[]{i}};
            int i3 = ((int[]) objArr7[0])[0];
            int i4 = ((int[]) objArr7[3])[0];
            String[] strArr = (String[]) objArr7[1];
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i5 = ~iElapsedRealtime;
            int i6 = 896770125 + (((~((-208191044) | i5)) | 201898499) * (-108)) + (((~(i5 | 1016904359)) | (~((-1016904360) | iElapsedRealtime)) | (-1023196904)) * 54) + ((iElapsedRealtime | (-1023196904)) * 54) + 1865412152;
            int i7 = (i6 << 13) ^ i6;
            int i8 = i7 ^ (i7 >>> 17);
            ((int[]) objArr[2])[0] = i8 ^ (i8 << 5);
            c = 3;
        } else {
            Object[] objArr8 = new Object[1];
            e(new char[]{62976, 27084, 34288, 63073, 58298, 51180, 37284, 22998, 56847, 56285, 47364, 362, 42657, 45924, 57712, 10442, 36705, 27287, 2260, 53485, 22518, 16957, 12340, 63581, 16308, 14940, 23442, 44961, 1057, 5616}, (-1) - MotionEvent.axisFromString(""), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(new char[]{16350, 56312, 18671, 16317, 20885, 27500, 23725, 62806, 6107, 27118, 29707, 44421, 28526, 336, 11379, 33805, 18077, 55457, 50635, 31853, 40497, 61454}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(new char[]{21537, 7641, 22347, 21579, 38816, 5526, 17165, 35775, 31855, 45005, 27578, 54096, 1158, 50991, 13288, 64231, 11634, 7829, 55934, 659}, (-1) - ImageFormat.getBitsPerPixel(0), objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(new char[]{12617, '%', 39715, 12576, 35417, 3769, 36726, 37023, 6493, 45620, 42951, 51304, 25025, 55964, 65440, 57817, 18474, 882, 5655, 6580}, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            int i9 = MediaBrowserCompatMediaBrowserImplBase2 + 75;
            MediaBrowserCompatMediaBrowserImplApi26 = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr12 = {applicationContext, Integer.valueOf(iIntValue), 0, 1865412152};
                byte[] bArr3 = $$d;
                byte b = bArr3[2];
                Object[] objArr13 = new Object[1];
                f(b, bArr3[48], b, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                byte b2 = bArr3[48];
                Object[] objArr14 = new Object[1];
                f(b2, (short) (-bArr3[127]), b2, objArr14);
                Object[] objArr15 = (Object[]) cls4.getMethod((String) objArr14[0], Context.class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr12);
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1013250600);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "", 0, 0);
                        int trimmedLength = TextUtils.getTrimmedLength("") + 2267;
                        int iIndexOf = TextUtils.indexOf("", "") + 33;
                        Object[] objArr16 = new Object[1];
                        c((byte) 15, (short) 103, $$a[10], objArr16);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(cIndexOf, trimmedLength, iIndexOf, -654680577, false, (String) objArr16[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr15);
                    try {
                        Object[] objArr17 = new Object[1];
                        e(new char[]{52582, 12802, 16334, 52487, 47220, 35354, 11162, 5152, 58729, 32787, 826, 19612, 40393, 59561, 23312, 25921, 46143, 12617, 45802, 40215, 27787, 6617, 35346, 46525, 1253, 24977}, Drawable.resolveOpacity(0, 0), objArr17);
                        Class<?> cls5 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        e(new char[]{59519, 15167, 54032, 59418, 45387, 4327, 51009, 36575, 49260, 35106, 61412, 54813, 47322, 57734, 46988, 65435, 37174, 14442, 24101}, ViewConfiguration.getFadingEdgeLength() >> 16, objArr18);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr18[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(796641770);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2267;
                            int i11 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 34;
                            byte[] bArr4 = $$a;
                            Object[] objArr19 = new Object[1];
                            c(bArr4[7], (short) (-bArr4[1]), bArr4[10], objArr19);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(maximumFlingVelocity, iKeyCodeFromString, i11, -874156483, false, (String) objArr19[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(797565291);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
                            int jumpTapTimeout = 2267 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 33;
                            byte[] bArr5 = $$a;
                            Object[] objArr20 = new Object[1];
                            c(bArr5[7], bArr5[132], bArr5[10], objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cResolveOpacity, jumpTapTimeout, iResolveOpacity, -887667012, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                        int i12 = MediaBrowserCompatMediaBrowserImplApi26 + 3;
                        MediaBrowserCompatMediaBrowserImplBase2 = i12 % 128;
                        int i13 = i12 % 2;
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
                objArr = objArr15;
                c = 3;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        if (((int[]) objArr[0])[0] != ((int[]) objArr[c])[0]) {
            ArrayList arrayList = new ArrayList();
            String[] strArr2 = (String[]) objArr[1];
            if (strArr2 == null) {
                throw null;
            }
            for (String str : strArr2) {
                arrayList.add(str);
            }
            throw null;
        }
        Object[] objArr21 = {new int[]{i}, strArr, new int[1], new int[]{i}};
        int i14 = ((int[]) objArr[2])[0];
        int i15 = ((int[]) objArr[0])[0];
        int i16 = ((int[]) objArr[3])[0];
        String[] strArr3 = (String[]) objArr[1];
        int iIdentityHashCode = System.identityHashCode(this);
        int i17 = ~iIdentityHashCode;
        int i18 = i14 + (-2145090193) + ((iIdentityHashCode | 178798610) * 988) + (((~(451698202 | i17)) | 84115521) * (-1976)) + (((~(iIdentityHashCode | (-357015114))) | 178798610 | (~(357015113 | i17))) * 988);
        int i19 = (i18 << 13) ^ i18;
        int i20 = i19 ^ (i19 >>> 17);
        ((int[]) objArr21[2])[0] = i20 ^ (i20 << 5);
        return this.onError;
    }

    public static final class TuitionPaymentFragmentspecialinlinedviewModeldefault1 implements Parcelable.Creator<IndividualDataClaim> {
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IndividualDataClaim createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "");
            return new IndividualDataClaim(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (File) parcel.readSerializable(), (File) parcel.readSerializable(), (File) parcel.readSerializable(), (File) parcel.readSerializable(), parcel.createByteArray(), (File) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IndividualDataClaim[] newArray(int i) {
            return new IndividualDataClaim[i];
        }
    }

    public static /* synthetic */ IndividualDataClaim TuitionPaymentFragmentspecialinlinedviewModeldefault1(IndividualDataClaim individualDataClaim, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, File file, File file2, File file3, File file4, byte[] bArr, File file5, String str17, String str18, String str19, boolean z, String str20, String str21, String str22, String str23, String str24, String str25, String str26, String str27, String str28, String str29, String str30, String str31, String str32, String str33, String str34, String str35, String str36, String str37, String str38, String str39, String str40, String str41, String str42, String str43, String str44, String str45, String str46, String str47, String str48, String str49, String str50, String str51, String str52, String str53, String str54, String str55, String str56, boolean z2, String str57, String str58, String str59, String str60, String str61, String str62, String str63, int i, int i2, int i3, Object obj) {
        String str64;
        String str65;
        String str66;
        String str67;
        boolean z3;
        String str68;
        String str69;
        String str70;
        String str71;
        String str72;
        String str73;
        String str74;
        int i4 = 2 % 2;
        String str75 = (i & 1) != 0 ? individualDataClaim.b : str;
        String str76 = (i & 2) != 0 ? individualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault3 : str2;
        String str77 = (i & 4) != 0 ? individualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault2 : str3;
        String str78 = (i & 8) != 0 ? individualDataClaim.TuitionPaymentFragmentbindingInflater1 : str4;
        String str79 = (i & 16) != 0 ? individualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1 : str5;
        String str80 = (i & 32) != 0 ? individualDataClaim.asBinder : str6;
        if ((i & 64) != 0) {
            int i5 = MediaBrowserCompatMediaBrowserImplApi26 + 49;
            MediaBrowserCompatMediaBrowserImplBase2 = i5 % 128;
            int i6 = i5 % 2;
            str64 = individualDataClaim.g;
        } else {
            str64 = str7;
        }
        String str81 = (i & 128) != 0 ? individualDataClaim.a : str8;
        if ((i & 256) != 0) {
            int i7 = MediaBrowserCompatMediaBrowserImplBase2 + 7;
            MediaBrowserCompatMediaBrowserImplApi26 = i7 % 128;
            int i8 = i7 % 2;
            str65 = individualDataClaim.d;
        } else {
            str65 = str9;
        }
        if ((i & 512) != 0) {
            int i9 = MediaBrowserCompatMediaBrowserImplApi26 + 65;
            MediaBrowserCompatMediaBrowserImplBase2 = i9 % 128;
            int i10 = i9 % 2;
            str66 = individualDataClaim.asInterface;
        } else {
            str66 = str10;
        }
        String str82 = (i & 1024) != 0 ? individualDataClaim.INotificationSideChannel : str11;
        String str83 = (i & 2048) != 0 ? individualDataClaim.cancel : str12;
        if ((i & 4096) != 0) {
            int i11 = MediaBrowserCompatMediaBrowserImplApi26 + 9;
            MediaBrowserCompatMediaBrowserImplBase2 = i11 % 128;
            int i12 = i11 % 2;
            str67 = individualDataClaim.notify;
        } else {
            str67 = str13;
        }
        String str84 = (i & 8192) != 0 ? individualDataClaim.onTransact : str14;
        String str85 = (i & 16384) != 0 ? individualDataClaim.cancelAll : str15;
        String str86 = (i & 32768) != 0 ? individualDataClaim.RemoteActionCompatParcelizer : str16;
        File file6 = (i & 65536) != 0 ? individualDataClaim.INotificationSideChannelDefault : file;
        File file7 = (i & 131072) != 0 ? individualDataClaim.INotificationSideChannelStub : file2;
        File file8 = (i & 262144) != 0 ? individualDataClaim.getInterfaceDescriptor : file3;
        File file9 = (i & 524288) != 0 ? individualDataClaim.INotificationSideChannelStubProxy : file4;
        byte[] bArr2 = (i & 1048576) != 0 ? individualDataClaim.IconCompatParcelizer : bArr;
        File file10 = (i & 2097152) != 0 ? individualDataClaim.connect : file5;
        String str87 = (i & 4194304) != 0 ? individualDataClaim.write : str17;
        String str88 = (i & 8388608) != 0 ? individualDataClaim.read : str18;
        String str89 = (i & 16777216) != 0 ? individualDataClaim.MediaBrowserCompat : str19;
        Object obj2 = null;
        if ((i & 33554432) != 0) {
            int i13 = MediaBrowserCompatMediaBrowserImplApi26 + 103;
            MediaBrowserCompatMediaBrowserImplBase2 = i13 % 128;
            if (i13 % 2 == 0) {
                boolean z4 = individualDataClaim.getRoot;
                obj2.hashCode();
                throw null;
            }
            z3 = individualDataClaim.getRoot;
        } else {
            z3 = z;
        }
        String str90 = (67108864 & i) != 0 ? individualDataClaim.getNotifyChildrenChangedOptions : str20;
        boolean z5 = z3;
        String str91 = (i & 134217728) != 0 ? individualDataClaim.disconnect : str21;
        String str92 = (i & 268435456) != 0 ? individualDataClaim.getExtras : str22;
        String str93 = (i & 536870912) != 0 ? individualDataClaim.getItem : str23;
        String str94 = (i & BasicMeasure.EXACTLY) != 0 ? individualDataClaim.isConnected : str24;
        String str95 = (i & Integer.MIN_VALUE) != 0 ? individualDataClaim.getServiceComponent : str25;
        if ((i2 & 1) != 0) {
            int i14 = MediaBrowserCompatMediaBrowserImplApi26 + 75;
            MediaBrowserCompatMediaBrowserImplBase2 = i14 % 128;
            if (i14 % 2 == 0) {
                String str96 = individualDataClaim.getSessionToken;
                throw null;
            }
            str68 = individualDataClaim.getSessionToken;
        } else {
            str68 = str26;
        }
        String str97 = (i2 & 2) != 0 ? individualDataClaim.sendCustomAction : str27;
        String str98 = (i2 & 4) != 0 ? individualDataClaim.search : str28;
        String str99 = (i2 & 8) != 0 ? individualDataClaim.unsubscribe : str29;
        String str100 = (i2 & 16) != 0 ? individualDataClaim.MediaBrowserCompatCallbackHandler : str30;
        String str101 = (i2 & 32) != 0 ? individualDataClaim.setCallbacksMessenger : str31;
        String str102 = (i2 & 64) != 0 ? individualDataClaim.subscribe : str32;
        String str103 = (i2 & 128) != 0 ? individualDataClaim.handleMessage : str33;
        String str104 = (i2 & 256) != 0 ? individualDataClaim.MediaBrowserCompatConnectionCallback : str34;
        String str105 = (i2 & 512) != 0 ? individualDataClaim.onConnected : str35;
        if ((i2 & 1024) != 0) {
            int i15 = MediaBrowserCompatMediaBrowserImplBase2 + 31;
            MediaBrowserCompatMediaBrowserImplApi26 = i15 % 128;
            if (i15 % 2 != 0) {
                String str106 = individualDataClaim.onConnectionSuspended;
                throw null;
            }
            str69 = individualDataClaim.onConnectionSuspended;
        } else {
            str69 = str36;
        }
        String str107 = (i2 & 2048) != 0 ? individualDataClaim.setInternalConnectionCallback : str37;
        String str108 = (i2 & 4096) != 0 ? individualDataClaim.onConnectionFailed : str38;
        String str109 = (i2 & 8192) != 0 ? individualDataClaim.onError : str39;
        String str110 = (i2 & 16384) != 0 ? individualDataClaim.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal : str40;
        String str111 = (i2 & 32768) != 0 ? individualDataClaim.onProgressUpdate : str41;
        String str112 = (i2 & 65536) != 0 ? individualDataClaim.MediaBrowserCompatConnectionCallbackStubApi21 : str42;
        if ((i2 & 131072) != 0) {
            str71 = str112;
            int i16 = MediaBrowserCompatMediaBrowserImplBase2 + 69;
            str70 = str69;
            MediaBrowserCompatMediaBrowserImplApi26 = i16 % 128;
            int i17 = i16 % 2;
            str72 = individualDataClaim.MediaBrowserCompatCustomActionCallback;
            if (i17 != 0) {
                int i18 = 28 / 0;
            }
        } else {
            str70 = str69;
            str71 = str112;
            str72 = str43;
        }
        String str113 = (i2 & 262144) != 0 ? individualDataClaim.onReceiveResult : str44;
        String str114 = (i2 & 524288) != 0 ? individualDataClaim.MediaBrowserCompatCustomActionResultReceiver : str45;
        String str115 = (i2 & 1048576) != 0 ? individualDataClaim.MediaBrowserCompatItemCallback : str46;
        String str116 = (i2 & 2097152) != 0 ? individualDataClaim.onResult : str47;
        String str117 = (i2 & 4194304) != 0 ? individualDataClaim.onItemLoaded : str48;
        String str118 = (i2 & 8388608) != 0 ? individualDataClaim.onLoadChildren : str49;
        String str119 = (i2 & 16777216) != 0 ? individualDataClaim.MediaBrowserCompatMediaBrowserImplApi21 : str50;
        String str120 = (i2 & 33554432) != 0 ? individualDataClaim.MediaBrowserCompatItemReceiver : str51;
        String str121 = (i2 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? individualDataClaim.MediaBrowserCompatMediaBrowserImpl : str52;
        String str122 = (i2 & 134217728) != 0 ? individualDataClaim.MediaBrowserCompatItemCallbackStubApi23 : str53;
        String str123 = (i2 & 268435456) != 0 ? individualDataClaim.MediaBrowserCompatMediaBrowserImplApi213 : str54;
        String str124 = (i2 & 536870912) != 0 ? individualDataClaim.run : str55;
        if ((i2 & BasicMeasure.EXACTLY) != 0) {
            int i19 = MediaBrowserCompatMediaBrowserImplApi26 + 51;
            MediaBrowserCompatMediaBrowserImplBase2 = i19 % 128;
            if (i19 % 2 == 0) {
                String str125 = individualDataClaim.MediaBrowserCompatMediaBrowserImplApi211;
                throw null;
            }
            str73 = individualDataClaim.MediaBrowserCompatMediaBrowserImplApi211;
        } else {
            str73 = str56;
        }
        boolean z6 = (i2 & Integer.MIN_VALUE) != 0 ? individualDataClaim.MediaBrowserCompatMediaBrowserImplApi212 : z2;
        String str126 = (i3 & 1) != 0 ? individualDataClaim.onServiceConnected : str57;
        boolean z7 = z6;
        String str127 = (i3 & 2) != 0 ? individualDataClaim.MediaBrowserCompatMediaBrowserImplApi214 : str58;
        String str128 = (i3 & 4) != 0 ? individualDataClaim.MediaBrowserCompatMediaBrowserImplApi216 : str59;
        String str129 = (i3 & 8) != 0 ? individualDataClaim.MediaBrowserCompatMediaBrowserImplApi23 : str60;
        if ((i3 & 16) != 0) {
            int i20 = MediaBrowserCompatMediaBrowserImplApi26 + 31;
            MediaBrowserCompatMediaBrowserImplBase2 = i20 % 128;
            int i21 = i20 % 2;
            str74 = individualDataClaim.MediaBrowserCompatMediaBrowserImplApi217;
        } else {
            str74 = str61;
        }
        String str130 = (i3 & 32) != 0 ? individualDataClaim.MediaBrowserCompatMediaBrowserImplApi215 : str62;
        String str131 = (i3 & 64) != 0 ? individualDataClaim.getStateLabel : str63;
        Intrinsics.checkNotNullParameter(str75, "");
        Intrinsics.checkNotNullParameter(str76, "");
        Intrinsics.checkNotNullParameter(str77, "");
        Intrinsics.checkNotNullParameter(str78, "");
        Intrinsics.checkNotNullParameter(str79, "");
        Intrinsics.checkNotNullParameter(str80, "");
        Intrinsics.checkNotNullParameter(str64, "");
        Intrinsics.checkNotNullParameter(str81, "");
        Intrinsics.checkNotNullParameter(str65, "");
        Intrinsics.checkNotNullParameter(str66, "");
        Intrinsics.checkNotNullParameter(str82, "");
        String str132 = str82;
        Intrinsics.checkNotNullParameter(str83, "");
        Intrinsics.checkNotNullParameter(str67, "");
        Intrinsics.checkNotNullParameter(str84, "");
        Intrinsics.checkNotNullParameter(str85, "");
        Intrinsics.checkNotNullParameter(str86, "");
        Intrinsics.checkNotNullParameter(str87, "");
        Intrinsics.checkNotNullParameter(str88, "");
        Intrinsics.checkNotNullParameter(str89, "");
        Intrinsics.checkNotNullParameter(str90, "");
        String str133 = str90;
        Intrinsics.checkNotNullParameter(str91, "");
        Intrinsics.checkNotNullParameter(str92, "");
        Intrinsics.checkNotNullParameter(str93, "");
        Intrinsics.checkNotNullParameter(str94, "");
        Intrinsics.checkNotNullParameter(str95, "");
        Intrinsics.checkNotNullParameter(str68, "");
        Intrinsics.checkNotNullParameter(str97, "");
        Intrinsics.checkNotNullParameter(str98, "");
        Intrinsics.checkNotNullParameter(str99, "");
        Intrinsics.checkNotNullParameter(str100, "");
        Intrinsics.checkNotNullParameter(str101, "");
        Intrinsics.checkNotNullParameter(str102, "");
        Intrinsics.checkNotNullParameter(str103, "");
        Intrinsics.checkNotNullParameter(str104, "");
        Intrinsics.checkNotNullParameter(str105, "");
        Intrinsics.checkNotNullParameter(str70, "");
        Intrinsics.checkNotNullParameter(str107, "");
        Intrinsics.checkNotNullParameter(str108, "");
        Intrinsics.checkNotNullParameter(str109, "");
        Intrinsics.checkNotNullParameter(str110, "");
        Intrinsics.checkNotNullParameter(str111, "");
        Intrinsics.checkNotNullParameter(str71, "");
        Intrinsics.checkNotNullParameter(str72, "");
        Intrinsics.checkNotNullParameter(str113, "");
        Intrinsics.checkNotNullParameter(str114, "");
        Intrinsics.checkNotNullParameter(str115, "");
        Intrinsics.checkNotNullParameter(str116, "");
        Intrinsics.checkNotNullParameter(str117, "");
        Intrinsics.checkNotNullParameter(str118, "");
        Intrinsics.checkNotNullParameter(str119, "");
        Intrinsics.checkNotNullParameter(str120, "");
        Intrinsics.checkNotNullParameter(str121, "");
        Intrinsics.checkNotNullParameter(str122, "");
        Intrinsics.checkNotNullParameter(str123, "");
        Intrinsics.checkNotNullParameter(str124, "");
        Intrinsics.checkNotNullParameter(str73, "");
        String str134 = str73;
        Intrinsics.checkNotNullParameter(str126, "");
        Intrinsics.checkNotNullParameter(str127, "");
        Intrinsics.checkNotNullParameter(str128, "");
        Intrinsics.checkNotNullParameter(str129, "");
        Intrinsics.checkNotNullParameter(str74, "");
        Intrinsics.checkNotNullParameter(str130, "");
        String str135 = str130;
        String str136 = str131;
        Intrinsics.checkNotNullParameter(str136, "");
        return new IndividualDataClaim(str75, str76, str77, str78, str79, str80, str64, str81, str65, str66, str132, str83, str67, str84, str85, str86, file6, file7, file8, file9, bArr2, file10, str87, str88, str89, z5, str133, str91, str92, str93, str94, str95, str68, str97, str98, str99, str100, str101, str102, str103, str104, str105, str70, str107, str108, str109, str110, str111, str71, str72, str113, str114, str115, str116, str117, str118, str119, str120, str121, str122, str123, str124, str134, z7, str126, str127, str128, str129, str74, str135, str136);
    }

    static {
        MediaBrowserCompatMediaBrowserImplBase = 1;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        CREATOR = new TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        int i = getStateLabel + 7;
        MediaBrowserCompatMediaBrowserImplBase = i % 128;
        int i2 = i % 2;
    }

    public IndividualDataClaim() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, -1, -1, 127, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplApi26 + 73;
        int i3 = i2 % 128;
        MediaBrowserCompatMediaBrowserImplBase2 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 9;
        MediaBrowserCompatMediaBrowserImplApi26 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 63 / 0;
        }
        return 0;
    }

    public final boolean equals(Object p0) {
        int i = 2 % 2;
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof IndividualDataClaim)) {
            return false;
        }
        IndividualDataClaim individualDataClaim = (IndividualDataClaim) p0;
        if (!Intrinsics.areEqual(this.b, individualDataClaim.b) || !Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3, individualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault3) || !Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2, individualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault2) || !Intrinsics.areEqual(this.TuitionPaymentFragmentbindingInflater1, individualDataClaim.TuitionPaymentFragmentbindingInflater1) || !Intrinsics.areEqual(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1, individualDataClaim.TuitionPaymentFragmentspecialinlinedviewModeldefault1) || !Intrinsics.areEqual(this.asBinder, individualDataClaim.asBinder) || !Intrinsics.areEqual(this.g, individualDataClaim.g) || !Intrinsics.areEqual(this.a, individualDataClaim.a) || !Intrinsics.areEqual(this.d, individualDataClaim.d) || !Intrinsics.areEqual(this.asInterface, individualDataClaim.asInterface) || !Intrinsics.areEqual(this.INotificationSideChannel, individualDataClaim.INotificationSideChannel) || !Intrinsics.areEqual(this.cancel, individualDataClaim.cancel) || !Intrinsics.areEqual(this.notify, individualDataClaim.notify)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onTransact, individualDataClaim.onTransact)) {
            int i2 = MediaBrowserCompatMediaBrowserImplBase2 + 79;
            MediaBrowserCompatMediaBrowserImplApi26 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.cancelAll, individualDataClaim.cancelAll)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.RemoteActionCompatParcelizer, individualDataClaim.RemoteActionCompatParcelizer)) {
            int i4 = MediaBrowserCompatMediaBrowserImplBase2 + 117;
            MediaBrowserCompatMediaBrowserImplApi26 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.INotificationSideChannelDefault, individualDataClaim.INotificationSideChannelDefault)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.INotificationSideChannelStub, individualDataClaim.INotificationSideChannelStub)) {
            int i6 = MediaBrowserCompatMediaBrowserImplBase2 + 113;
            MediaBrowserCompatMediaBrowserImplApi26 = i6 % 128;
            int i7 = i6 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.getInterfaceDescriptor, individualDataClaim.getInterfaceDescriptor) || !Intrinsics.areEqual(this.INotificationSideChannelStubProxy, individualDataClaim.INotificationSideChannelStubProxy) || !Intrinsics.areEqual(this.IconCompatParcelizer, individualDataClaim.IconCompatParcelizer) || !Intrinsics.areEqual(this.connect, individualDataClaim.connect) || !Intrinsics.areEqual(this.write, individualDataClaim.write) || !Intrinsics.areEqual(this.read, individualDataClaim.read)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.MediaBrowserCompat, individualDataClaim.MediaBrowserCompat)) {
            int i8 = MediaBrowserCompatMediaBrowserImplApi26 + 91;
            MediaBrowserCompatMediaBrowserImplBase2 = i8 % 128;
            int i9 = i8 % 2;
            return false;
        }
        if (this.getRoot != individualDataClaim.getRoot || !Intrinsics.areEqual(this.getNotifyChildrenChangedOptions, individualDataClaim.getNotifyChildrenChangedOptions) || !Intrinsics.areEqual(this.disconnect, individualDataClaim.disconnect) || !Intrinsics.areEqual(this.getExtras, individualDataClaim.getExtras) || !Intrinsics.areEqual(this.getItem, individualDataClaim.getItem)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.isConnected, individualDataClaim.isConnected)) {
            int i10 = MediaBrowserCompatMediaBrowserImplApi26 + 51;
            MediaBrowserCompatMediaBrowserImplBase2 = i10 % 128;
            int i11 = i10 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.getServiceComponent, individualDataClaim.getServiceComponent)) {
            int i12 = MediaBrowserCompatMediaBrowserImplApi26 + 107;
            MediaBrowserCompatMediaBrowserImplBase2 = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.getSessionToken, individualDataClaim.getSessionToken) || !Intrinsics.areEqual(this.sendCustomAction, individualDataClaim.sendCustomAction) || !Intrinsics.areEqual(this.search, individualDataClaim.search) || !Intrinsics.areEqual(this.unsubscribe, individualDataClaim.unsubscribe) || !Intrinsics.areEqual(this.MediaBrowserCompatCallbackHandler, individualDataClaim.MediaBrowserCompatCallbackHandler) || !Intrinsics.areEqual(this.setCallbacksMessenger, individualDataClaim.setCallbacksMessenger) || !Intrinsics.areEqual(this.subscribe, individualDataClaim.subscribe) || !Intrinsics.areEqual(this.handleMessage, individualDataClaim.handleMessage) || !Intrinsics.areEqual(this.MediaBrowserCompatConnectionCallback, individualDataClaim.MediaBrowserCompatConnectionCallback) || !Intrinsics.areEqual(this.onConnected, individualDataClaim.onConnected) || !Intrinsics.areEqual(this.onConnectionSuspended, individualDataClaim.onConnectionSuspended) || !Intrinsics.areEqual(this.setInternalConnectionCallback, individualDataClaim.setInternalConnectionCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onConnectionFailed, individualDataClaim.onConnectionFailed)) {
            int i14 = MediaBrowserCompatMediaBrowserImplApi26 + 77;
            MediaBrowserCompatMediaBrowserImplBase2 = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.onError, individualDataClaim.onError) || !Intrinsics.areEqual(this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal, individualDataClaim.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal) || !Intrinsics.areEqual(this.onProgressUpdate, individualDataClaim.onProgressUpdate) || !Intrinsics.areEqual(this.MediaBrowserCompatConnectionCallbackStubApi21, individualDataClaim.MediaBrowserCompatConnectionCallbackStubApi21) || !Intrinsics.areEqual(this.MediaBrowserCompatCustomActionCallback, individualDataClaim.MediaBrowserCompatCustomActionCallback)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.onReceiveResult, individualDataClaim.onReceiveResult)) {
            int i16 = MediaBrowserCompatMediaBrowserImplBase2 + 17;
            MediaBrowserCompatMediaBrowserImplApi26 = i16 % 128;
            int i17 = i16 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.MediaBrowserCompatCustomActionResultReceiver, individualDataClaim.MediaBrowserCompatCustomActionResultReceiver) || !Intrinsics.areEqual(this.MediaBrowserCompatItemCallback, individualDataClaim.MediaBrowserCompatItemCallback) || !Intrinsics.areEqual(this.onResult, individualDataClaim.onResult) || !Intrinsics.areEqual(this.onItemLoaded, individualDataClaim.onItemLoaded) || !Intrinsics.areEqual(this.onLoadChildren, individualDataClaim.onLoadChildren) || !Intrinsics.areEqual(this.MediaBrowserCompatMediaBrowserImplApi21, individualDataClaim.MediaBrowserCompatMediaBrowserImplApi21) || !Intrinsics.areEqual(this.MediaBrowserCompatItemReceiver, individualDataClaim.MediaBrowserCompatItemReceiver) || !Intrinsics.areEqual(this.MediaBrowserCompatMediaBrowserImpl, individualDataClaim.MediaBrowserCompatMediaBrowserImpl)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.MediaBrowserCompatItemCallbackStubApi23, individualDataClaim.MediaBrowserCompatItemCallbackStubApi23)) {
            int i18 = MediaBrowserCompatMediaBrowserImplBase2 + 83;
            MediaBrowserCompatMediaBrowserImplApi26 = i18 % 128;
            int i19 = i18 % 2;
            return false;
        }
        if (!Intrinsics.areEqual(this.MediaBrowserCompatMediaBrowserImplApi213, individualDataClaim.MediaBrowserCompatMediaBrowserImplApi213) || !Intrinsics.areEqual(this.run, individualDataClaim.run) || !Intrinsics.areEqual(this.MediaBrowserCompatMediaBrowserImplApi211, individualDataClaim.MediaBrowserCompatMediaBrowserImplApi211) || this.MediaBrowserCompatMediaBrowserImplApi212 != individualDataClaim.MediaBrowserCompatMediaBrowserImplApi212 || !Intrinsics.areEqual(this.onServiceConnected, individualDataClaim.onServiceConnected) || !Intrinsics.areEqual(this.MediaBrowserCompatMediaBrowserImplApi214, individualDataClaim.MediaBrowserCompatMediaBrowserImplApi214) || !Intrinsics.areEqual(this.MediaBrowserCompatMediaBrowserImplApi216, individualDataClaim.MediaBrowserCompatMediaBrowserImplApi216) || !Intrinsics.areEqual(this.MediaBrowserCompatMediaBrowserImplApi23, individualDataClaim.MediaBrowserCompatMediaBrowserImplApi23) || !Intrinsics.areEqual(this.MediaBrowserCompatMediaBrowserImplApi217, individualDataClaim.MediaBrowserCompatMediaBrowserImplApi217) || !Intrinsics.areEqual(this.MediaBrowserCompatMediaBrowserImplApi215, individualDataClaim.MediaBrowserCompatMediaBrowserImplApi215)) {
            return false;
        }
        if (Intrinsics.areEqual(this.getStateLabel, individualDataClaim.getStateLabel)) {
            return true;
        }
        int i20 = MediaBrowserCompatMediaBrowserImplApi26 + 11;
        MediaBrowserCompatMediaBrowserImplBase2 = i20 % 128;
        int i21 = i20 % 2;
        return false;
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        int iHashCode3 = this.b.hashCode();
        int iHashCode4 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3.hashCode();
        int iHashCode5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2.hashCode();
        int iHashCode6 = this.TuitionPaymentFragmentbindingInflater1.hashCode();
        int iHashCode7 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1.hashCode();
        int iHashCode8 = this.asBinder.hashCode();
        int iHashCode9 = this.g.hashCode();
        int iHashCode10 = this.a.hashCode();
        int iHashCode11 = this.d.hashCode();
        int iHashCode12 = this.asInterface.hashCode();
        int iHashCode13 = this.INotificationSideChannel.hashCode();
        int iHashCode14 = this.cancel.hashCode();
        int iHashCode15 = this.notify.hashCode();
        int iHashCode16 = this.onTransact.hashCode();
        int iHashCode17 = this.cancelAll.hashCode();
        int iHashCode18 = this.RemoteActionCompatParcelizer.hashCode();
        File file = this.INotificationSideChannelDefault;
        if (file == null) {
            int i2 = MediaBrowserCompatMediaBrowserImplBase2 + 77;
            MediaBrowserCompatMediaBrowserImplApi26 = i2 % 128;
            int i3 = i2 % 2;
            iHashCode = 0;
        } else {
            iHashCode = file.hashCode();
        }
        File file2 = this.INotificationSideChannelStub;
        int iHashCode19 = file2 == null ? 0 : file2.hashCode();
        File file3 = this.getInterfaceDescriptor;
        int iHashCode20 = file3 == null ? 0 : file3.hashCode();
        File file4 = this.INotificationSideChannelStubProxy;
        int iHashCode21 = file4 == null ? 0 : file4.hashCode();
        byte[] bArr = this.IconCompatParcelizer;
        if (bArr == null) {
            int i4 = MediaBrowserCompatMediaBrowserImplApi26 + 75;
            MediaBrowserCompatMediaBrowserImplBase2 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode2 = 0;
        } else {
            iHashCode2 = Arrays.hashCode(bArr);
        }
        File file5 = this.connect;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode3 * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode2) * 31) + (file5 != null ? file5.hashCode() : 0)) * 31) + this.write.hashCode()) * 31) + this.read.hashCode()) * 31) + this.MediaBrowserCompat.hashCode()) * 31) + Boolean.hashCode(this.getRoot)) * 31) + this.getNotifyChildrenChangedOptions.hashCode()) * 31) + this.disconnect.hashCode()) * 31) + this.getExtras.hashCode()) * 31) + this.getItem.hashCode()) * 31) + this.isConnected.hashCode()) * 31) + this.getServiceComponent.hashCode()) * 31) + this.getSessionToken.hashCode()) * 31) + this.sendCustomAction.hashCode()) * 31) + this.search.hashCode()) * 31) + this.unsubscribe.hashCode()) * 31) + this.MediaBrowserCompatCallbackHandler.hashCode()) * 31) + this.setCallbacksMessenger.hashCode()) * 31) + this.subscribe.hashCode()) * 31) + this.handleMessage.hashCode()) * 31) + this.MediaBrowserCompatConnectionCallback.hashCode()) * 31) + this.onConnected.hashCode()) * 31) + this.onConnectionSuspended.hashCode()) * 31) + this.setInternalConnectionCallback.hashCode()) * 31) + this.onConnectionFailed.hashCode()) * 31) + this.onError.hashCode()) * 31) + this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal.hashCode()) * 31) + this.onProgressUpdate.hashCode()) * 31) + this.MediaBrowserCompatConnectionCallbackStubApi21.hashCode()) * 31) + this.MediaBrowserCompatCustomActionCallback.hashCode()) * 31) + this.onReceiveResult.hashCode()) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + this.MediaBrowserCompatItemCallback.hashCode()) * 31) + this.onResult.hashCode()) * 31) + this.onItemLoaded.hashCode()) * 31) + this.onLoadChildren.hashCode()) * 31) + this.MediaBrowserCompatMediaBrowserImplApi21.hashCode()) * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + this.MediaBrowserCompatMediaBrowserImpl.hashCode()) * 31) + this.MediaBrowserCompatItemCallbackStubApi23.hashCode()) * 31) + this.MediaBrowserCompatMediaBrowserImplApi213.hashCode()) * 31) + this.run.hashCode()) * 31) + this.MediaBrowserCompatMediaBrowserImplApi211.hashCode()) * 31) + Boolean.hashCode(this.MediaBrowserCompatMediaBrowserImplApi212)) * 31) + this.onServiceConnected.hashCode()) * 31) + this.MediaBrowserCompatMediaBrowserImplApi214.hashCode()) * 31) + this.MediaBrowserCompatMediaBrowserImplApi216.hashCode()) * 31) + this.MediaBrowserCompatMediaBrowserImplApi23.hashCode()) * 31) + this.MediaBrowserCompatMediaBrowserImplApi217.hashCode()) * 31) + this.MediaBrowserCompatMediaBrowserImplApi215.hashCode()) * 31) + this.getStateLabel.hashCode();
    }

    public final String toString() {
        int i = 2 % 2;
        String str = this.b;
        String str2 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
        String str3 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault2;
        String str4 = this.TuitionPaymentFragmentbindingInflater1;
        String str5 = this.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
        String str6 = this.asBinder;
        String str7 = this.g;
        String str8 = this.a;
        String str9 = this.d;
        String str10 = this.asInterface;
        String str11 = this.INotificationSideChannel;
        String str12 = this.cancel;
        String str13 = this.notify;
        String str14 = this.onTransact;
        String str15 = this.cancelAll;
        String str16 = this.RemoteActionCompatParcelizer;
        File file = this.INotificationSideChannelDefault;
        File file2 = this.INotificationSideChannelStub;
        File file3 = this.getInterfaceDescriptor;
        File file4 = this.INotificationSideChannelStubProxy;
        String string = Arrays.toString(this.IconCompatParcelizer);
        File file5 = this.connect;
        String str17 = this.write;
        String str18 = this.read;
        String str19 = this.MediaBrowserCompat;
        boolean z = this.getRoot;
        String str20 = this.getNotifyChildrenChangedOptions;
        String str21 = this.disconnect;
        String str22 = this.getExtras;
        String str23 = this.getItem;
        String str24 = this.isConnected;
        String str25 = this.getServiceComponent;
        String str26 = this.getSessionToken;
        String str27 = this.sendCustomAction;
        String str28 = this.search;
        String str29 = this.unsubscribe;
        String str30 = this.MediaBrowserCompatCallbackHandler;
        String str31 = this.setCallbacksMessenger;
        String str32 = this.subscribe;
        String str33 = this.handleMessage;
        String str34 = this.MediaBrowserCompatConnectionCallback;
        String str35 = this.onConnected;
        String str36 = this.onConnectionSuspended;
        String str37 = this.setInternalConnectionCallback;
        String str38 = this.onConnectionFailed;
        String str39 = this.onError;
        String str40 = this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal;
        String str41 = this.onProgressUpdate;
        String str42 = this.MediaBrowserCompatConnectionCallbackStubApi21;
        String str43 = this.MediaBrowserCompatCustomActionCallback;
        String str44 = this.onReceiveResult;
        String str45 = this.MediaBrowserCompatCustomActionResultReceiver;
        String str46 = this.MediaBrowserCompatItemCallback;
        String str47 = this.onResult;
        String str48 = this.onItemLoaded;
        String str49 = this.onLoadChildren;
        String str50 = this.MediaBrowserCompatMediaBrowserImplApi21;
        String str51 = this.MediaBrowserCompatItemReceiver;
        String str52 = this.MediaBrowserCompatMediaBrowserImpl;
        String str53 = this.MediaBrowserCompatItemCallbackStubApi23;
        String str54 = this.MediaBrowserCompatMediaBrowserImplApi213;
        String str55 = this.run;
        String str56 = this.MediaBrowserCompatMediaBrowserImplApi211;
        boolean z2 = this.MediaBrowserCompatMediaBrowserImplApi212;
        String str57 = this.onServiceConnected;
        String str58 = this.MediaBrowserCompatMediaBrowserImplApi214;
        String str59 = this.MediaBrowserCompatMediaBrowserImplApi216;
        String str60 = this.MediaBrowserCompatMediaBrowserImplApi23;
        String str61 = this.MediaBrowserCompatMediaBrowserImplApi217;
        String str62 = this.MediaBrowserCompatMediaBrowserImplApi215;
        String str63 = this.getStateLabel;
        StringBuilder sb = new StringBuilder("IndividualDataClaim(b=");
        sb.append(str);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault3=");
        sb.append(str2);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault2=");
        sb.append(str3);
        sb.append(", TuitionPaymentFragmentbindingInflater1=");
        sb.append(str4);
        sb.append(", TuitionPaymentFragmentspecialinlinedviewModeldefault1=");
        sb.append(str5);
        sb.append(", asBinder=");
        sb.append(str6);
        sb.append(", g=");
        sb.append(str7);
        sb.append(", a=");
        sb.append(str8);
        sb.append(", d=");
        sb.append(str9);
        sb.append(", asInterface=");
        sb.append(str10);
        sb.append(", INotificationSideChannel=");
        sb.append(str11);
        sb.append(", cancel=");
        sb.append(str12);
        sb.append(", notify=");
        sb.append(str13);
        sb.append(", onTransact=");
        sb.append(str14);
        sb.append(", cancelAll=");
        sb.append(str15);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str16);
        sb.append(", INotificationSideChannelDefault=");
        sb.append(file);
        sb.append(", INotificationSideChannelStub=");
        sb.append(file2);
        sb.append(", getInterfaceDescriptor=");
        sb.append(file3);
        sb.append(", INotificationSideChannelStubProxy=");
        sb.append(file4);
        sb.append(", IconCompatParcelizer=");
        sb.append(string);
        sb.append(", connect=");
        sb.append(file5);
        sb.append(", write=");
        sb.append(str17);
        sb.append(", read=");
        sb.append(str18);
        sb.append(", MediaBrowserCompat=");
        sb.append(str19);
        sb.append(", getRoot=");
        sb.append(z);
        sb.append(", getNotifyChildrenChangedOptions=");
        sb.append(str20);
        sb.append(", disconnect=");
        sb.append(str21);
        sb.append(", getExtras=");
        sb.append(str22);
        sb.append(", getItem=");
        sb.append(str23);
        sb.append(", isConnected=");
        sb.append(str24);
        sb.append(", getServiceComponent=");
        sb.append(str25);
        sb.append(", getSessionToken=");
        sb.append(str26);
        sb.append(", sendCustomAction=");
        sb.append(str27);
        sb.append(", search=");
        sb.append(str28);
        sb.append(", unsubscribe=");
        sb.append(str29);
        sb.append(", MediaBrowserCompatCallbackHandler=");
        sb.append(str30);
        sb.append(", setCallbacksMessenger=");
        sb.append(str31);
        sb.append(", subscribe=");
        sb.append(str32);
        sb.append(", handleMessage=");
        sb.append(str33);
        sb.append(", MediaBrowserCompatConnectionCallback=");
        sb.append(str34);
        sb.append(", onConnected=");
        sb.append(str35);
        sb.append(", onConnectionSuspended=");
        sb.append(str36);
        sb.append(", setInternalConnectionCallback=");
        sb.append(str37);
        sb.append(", onConnectionFailed=");
        sb.append(str38);
        sb.append(", onError=");
        sb.append(str39);
        sb.append(", MediaBrowserCompatConnectionCallbackConnectionCallbackInternal=");
        sb.append(str40);
        sb.append(", onProgressUpdate=");
        sb.append(str41);
        sb.append(", MediaBrowserCompatConnectionCallbackStubApi21=");
        sb.append(str42);
        sb.append(", MediaBrowserCompatCustomActionCallback=");
        sb.append(str43);
        sb.append(", onReceiveResult=");
        sb.append(str44);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(str45);
        sb.append(", MediaBrowserCompatItemCallback=");
        sb.append(str46);
        sb.append(", onResult=");
        sb.append(str47);
        sb.append(", onItemLoaded=");
        sb.append(str48);
        sb.append(", onLoadChildren=");
        sb.append(str49);
        sb.append(", MediaBrowserCompatMediaBrowserImplApi21=");
        sb.append(str50);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(str51);
        sb.append(", MediaBrowserCompatMediaBrowserImpl=");
        sb.append(str52);
        sb.append(", MediaBrowserCompatItemCallbackStubApi23=");
        sb.append(str53);
        sb.append(", MediaBrowserCompatMediaBrowserImplApi213=");
        sb.append(str54);
        sb.append(", run=");
        sb.append(str55);
        sb.append(", MediaBrowserCompatMediaBrowserImplApi211=");
        sb.append(str56);
        sb.append(", MediaBrowserCompatMediaBrowserImplApi212=");
        sb.append(z2);
        sb.append(", onServiceConnected=");
        sb.append(str57);
        sb.append(", MediaBrowserCompatMediaBrowserImplApi214=");
        sb.append(str58);
        sb.append(", MediaBrowserCompatMediaBrowserImplApi216=");
        sb.append(str59);
        sb.append(", MediaBrowserCompatMediaBrowserImplApi23=");
        sb.append(str60);
        sb.append(", MediaBrowserCompatMediaBrowserImplApi217=");
        sb.append(str61);
        sb.append(", MediaBrowserCompatMediaBrowserImplApi215=");
        sb.append(str62);
        sb.append(", getStateLabel=");
        sb.append(str63);
        sb.append(")");
        String string2 = sb.toString();
        int i2 = MediaBrowserCompatMediaBrowserImplApi26 + 75;
        MediaBrowserCompatMediaBrowserImplBase2 = i2 % 128;
        if (i2 % 2 != 0) {
            return string2;
        }
        throw null;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaBrowserImplBase2 + 71;
        MediaBrowserCompatMediaBrowserImplApi26 = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(p0, "");
        p0.writeString(this.b);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault3);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        p0.writeString(this.TuitionPaymentFragmentbindingInflater1);
        p0.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        p0.writeString(this.asBinder);
        p0.writeString(this.g);
        p0.writeString(this.a);
        p0.writeString(this.d);
        p0.writeString(this.asInterface);
        p0.writeString(this.INotificationSideChannel);
        p0.writeString(this.cancel);
        p0.writeString(this.notify);
        p0.writeString(this.onTransact);
        p0.writeString(this.cancelAll);
        p0.writeString(this.RemoteActionCompatParcelizer);
        p0.writeSerializable(this.INotificationSideChannelDefault);
        p0.writeSerializable(this.INotificationSideChannelStub);
        p0.writeSerializable(this.getInterfaceDescriptor);
        p0.writeSerializable(this.INotificationSideChannelStubProxy);
        p0.writeByteArray(this.IconCompatParcelizer);
        p0.writeSerializable(this.connect);
        p0.writeString(this.write);
        p0.writeString(this.read);
        p0.writeString(this.MediaBrowserCompat);
        p0.writeInt(this.getRoot ? 1 : 0);
        p0.writeString(this.getNotifyChildrenChangedOptions);
        p0.writeString(this.disconnect);
        p0.writeString(this.getExtras);
        p0.writeString(this.getItem);
        p0.writeString(this.isConnected);
        p0.writeString(this.getServiceComponent);
        p0.writeString(this.getSessionToken);
        p0.writeString(this.sendCustomAction);
        p0.writeString(this.search);
        p0.writeString(this.unsubscribe);
        p0.writeString(this.MediaBrowserCompatCallbackHandler);
        p0.writeString(this.setCallbacksMessenger);
        p0.writeString(this.subscribe);
        p0.writeString(this.handleMessage);
        p0.writeString(this.MediaBrowserCompatConnectionCallback);
        p0.writeString(this.onConnected);
        p0.writeString(this.onConnectionSuspended);
        p0.writeString(this.setInternalConnectionCallback);
        p0.writeString(this.onConnectionFailed);
        p0.writeString(this.onError);
        p0.writeString(this.MediaBrowserCompatConnectionCallbackConnectionCallbackInternal);
        p0.writeString(this.onProgressUpdate);
        p0.writeString(this.MediaBrowserCompatConnectionCallbackStubApi21);
        p0.writeString(this.MediaBrowserCompatCustomActionCallback);
        p0.writeString(this.onReceiveResult);
        p0.writeString(this.MediaBrowserCompatCustomActionResultReceiver);
        p0.writeString(this.MediaBrowserCompatItemCallback);
        p0.writeString(this.onResult);
        p0.writeString(this.onItemLoaded);
        p0.writeString(this.onLoadChildren);
        p0.writeString(this.MediaBrowserCompatMediaBrowserImplApi21);
        p0.writeString(this.MediaBrowserCompatItemReceiver);
        p0.writeString(this.MediaBrowserCompatMediaBrowserImpl);
        p0.writeString(this.MediaBrowserCompatItemCallbackStubApi23);
        p0.writeString(this.MediaBrowserCompatMediaBrowserImplApi213);
        p0.writeString(this.run);
        p0.writeString(this.MediaBrowserCompatMediaBrowserImplApi211);
        p0.writeInt(this.MediaBrowserCompatMediaBrowserImplApi212 ? 1 : 0);
        p0.writeString(this.onServiceConnected);
        p0.writeString(this.MediaBrowserCompatMediaBrowserImplApi214);
        p0.writeString(this.MediaBrowserCompatMediaBrowserImplApi216);
        p0.writeString(this.MediaBrowserCompatMediaBrowserImplApi23);
        p0.writeString(this.MediaBrowserCompatMediaBrowserImplApi217);
        p0.writeString(this.MediaBrowserCompatMediaBrowserImplApi215);
        p0.writeString(this.getStateLabel);
        int i4 = MediaBrowserCompatMediaBrowserImplApi26 + 49;
        MediaBrowserCompatMediaBrowserImplBase2 = i4 % 128;
        int i5 = i4 % 2;
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        dump = -35263166739488642L;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r5, short r6, byte r7) {
        /*
            int r5 = r5 * 3
            int r5 = r5 + 4
            int r7 = r7 * 4
            int r0 = 1 - r7
            byte[] r1 = com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.model.IndividualDataClaim.$$c
            int r6 = r6 * 4
            int r6 = 107 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            r4 = r1[r5]
            int r3 = r3 + 1
        L28:
            int r4 = -r4
            int r6 = r6 + r4
            int r5 = r5 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bpjstku.presentation.program.jht.olddaysecurity.eclaim.model.IndividualDataClaim.$$g(short, short, byte):java.lang.String");
    }
}
