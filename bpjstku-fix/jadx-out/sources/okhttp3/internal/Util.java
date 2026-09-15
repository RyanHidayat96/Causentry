package okhttp3.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.SieveCacheKt;
import androidx.exifinterface.media.ExifInterface;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListener;
import defpackage.RotationProviderListenerWrapper;
import defpackage.SurfaceViewImplementationApi24Impl;
import defpackage.lambdagetPreviewBitmap1;
import defpackage.tryToComplete;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import kotlin.ExceptionsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http2.Header;
import okhttp3.internal.io.FileSystem;
import okio.ByteString;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Æ\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b\u001a%\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0003\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\f\"\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0011\u001a\u00020\t2\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a/\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u00132\u0012\u0010\u0001\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\f\"\u00028\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a3\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0001\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u001a2\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0017H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a)\u0010 \u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\t0\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b \u0010!\u001a'\u0010$\u001a\u00020\t\"\u0004\b\u0000\u0010\"*\b\u0012\u0004\u0012\u00028\u00000#2\u0006\u0010\u0001\u001a\u00028\u0000H\u0000¢\u0006\u0004\b$\u0010%\u001a\u001c\u0010'\u001a\u00020\u0006*\u00020&2\u0006\u0010\u0001\u001a\u00020\u0006H\u0086\u0004¢\u0006\u0004\b'\u0010(\u001a\u001c\u0010'\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0002H\u0086\u0004¢\u0006\u0004\b'\u0010)\u001a\u001c\u0010'\u001a\u00020\u0006*\u00020*2\u0006\u0010\u0001\u001a\u00020\u0006H\u0086\u0004¢\u0006\u0004\b'\u0010+\u001a\u0013\u0010.\u001a\u00020-*\u00020,H\u0007¢\u0006\u0004\b.\u0010/\u001a\u0014\u00100\u001a\u00020\t*\u00020\rH\u0080\b¢\u0006\u0004\b0\u00101\u001a\u0014\u00102\u001a\u00020\t*\u00020\rH\u0080\b¢\u0006\u0004\b2\u00101\u001a\u0011\u00103\u001a\u00020\u0017*\u00020\u0000¢\u0006\u0004\b3\u0010\u0019\u001a\u0019\u00105\u001a\u00020\u0017*\u0002042\u0006\u0010\u0001\u001a\u000204¢\u0006\u0004\b5\u00106\u001a\u0011\u00108\u001a\u00020\t*\u000207¢\u0006\u0004\b8\u00109\u001a\u0011\u00108\u001a\u00020\t*\u00020:¢\u0006\u0004\b8\u0010;\u001a\u0011\u00108\u001a\u00020\t*\u00020<¢\u0006\u0004\b8\u0010=\u001a'\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00000\f*\b\u0012\u0004\u0012\u00020\u00000\f2\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b>\u0010?\u001a-\u0010A\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0001\u001a\u00020@2\b\b\u0002\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\bA\u0010B\u001a-\u0010A\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\bA\u0010C\u001a!\u0010E\u001a\u00020\u0017*\u00020D2\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\bE\u0010F\u001aB\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00000G2\u0017\u0010\u0001\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00170H¢\u0006\u0002\bIH\u0087\bø\u0001\u0000¢\u0006\u0004\bJ\u0010K\u001a7\u0010M\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00000\f2\u000e\u0010\u0001\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\f2\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00000L¢\u0006\u0004\bM\u0010N\u001a\u0011\u0010P\u001a\u00020\u0002*\u00020O¢\u0006\u0004\bP\u0010Q\u001a-\u0010R\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00000\f2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000L¢\u0006\u0004\bR\u0010S\u001a\u0011\u0010T\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\bT\u0010U\u001a%\u0010V\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\bV\u0010W\u001a%\u0010X\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\bX\u0010W\u001a\u001b\u0010Y\u001a\u00020\u0006*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u0006¢\u0006\u0004\bY\u0010Z\u001a=\u0010[\u001a\b\u0012\u0004\u0012\u00020\u00000\f*\b\u0012\u0004\u0012\u00020\u00000\f2\f\u0010\u0001\u001a\b\u0012\u0004\u0012\u00020\u00000\f2\u000e\u0010\u0003\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00000LH\u0007¢\u0006\u0004\b[\u0010\\\u001a\u0019\u0010_\u001a\u00020\u0017*\u00020]2\u0006\u0010\u0001\u001a\u00020^¢\u0006\u0004\b_\u0010`\u001a\u0019\u0010b\u001a\u00020\u0017*\u00020<2\u0006\u0010\u0001\u001a\u00020a¢\u0006\u0004\bb\u0010c\u001a\u0014\u0010d\u001a\u00020\t*\u00020\rH\u0086\b¢\u0006\u0004\bd\u00101\u001a\u0014\u0010e\u001a\u00020\t*\u00020\rH\u0086\b¢\u0006\u0004\be\u00101\u001a\u0011\u0010f\u001a\u00020\u0006*\u00020@¢\u0006\u0004\bf\u0010g\u001a\u0013\u0010h\u001a\u00020\u0000*\u00020<H\u0007¢\u0006\u0004\bh\u0010i\u001a\u001b\u0010k\u001a\u00020j*\u00020a2\u0006\u0010\u0001\u001a\u00020jH\u0007¢\u0006\u0004\bk\u0010l\u001a\u0011\u0010m\u001a\u00020\u0006*\u00020a¢\u0006\u0004\bm\u0010n\u001a\u0019\u0010p\u001a\u00020\u0006*\u00020o2\u0006\u0010\u0001\u001a\u00020&¢\u0006\u0004\bp\u0010q\u001a!\u0010p\u001a\u00020\u0017*\u00020D2\u0006\u0010\u0001\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\bp\u0010F\u001a\u0019\u0010t\u001a\b\u0012\u0004\u0012\u00020s0\u0014*\u00020rH\u0007¢\u0006\u0004\bt\u0010u\u001a\u0019\u0010v\u001a\u00020r*\b\u0012\u0004\u0012\u00020s0\u0014H\u0007¢\u0006\u0004\bv\u0010w\u001a\u0013\u0010x\u001a\u00020\u0000*\u00020\u0006H\u0007¢\u0006\u0004\bx\u0010y\u001a\u0013\u0010x\u001a\u00020\u0000*\u00020\u0002H\u0007¢\u0006\u0004\bx\u0010z\u001a\u001d\u0010{\u001a\u00020\u0000*\u0002042\b\b\u0002\u0010\u0001\u001a\u00020\u0017H\u0007¢\u0006\u0004\b{\u0010|\u001a%\u0010}\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014\"\u0004\b\u0000\u0010\u0013*\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0007¢\u0006\u0004\b}\u0010~\u001a=\u0010\u0082\u0001\u001a\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0081\u0001\"\u0004\b\u0000\u0010\u007f\"\u0005\b\u0001\u0010\u0080\u0001*\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0081\u0001H\u0007¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u001c\u0010\u0084\u0001\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u001d\u0010\u0086\u0001\u001a\u00020\u0006*\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0006¢\u0006\u0005\b\u0086\u0001\u0010Z\u001a*\u0010\u0087\u0001\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0001\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u0006H\u0007¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0016\u0010\u0089\u0001\u001a\u00020\t*\u00020\rH\u0086\b¢\u0006\u0005\b\u0089\u0001\u00101\u001a1\u0010\u008d\u0001\u001a\u00030\u008c\u0001*\b0\u008a\u0001j\u0003`\u008b\u00012\u0012\u0010\u0001\u001a\u000e\u0012\n\u0012\b0\u008a\u0001j\u0003`\u008b\u00010\u0014H\u0007¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001\u001a\u001d\u0010\u0090\u0001\u001a\u00020\t*\u00030\u008f\u00012\u0006\u0010\u0001\u001a\u00020\u0006¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0018\u0010\u0093\u0001\u001a\u00030\u0092\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0093\u0001\u0010\u0094\u0001\"\u0017\u0010\u0095\u0001\u001a\u00020r8\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0018\u0010\u0098\u0001\u001a\u00030\u0097\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0018\u0010\u009b\u0001\u001a\u00030\u009a\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0018\u0010\u009e\u0001\u001a\u00030\u009d\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0018\u0010¡\u0001\u001a\u00030 \u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001\"\u0018\u0010¤\u0001\u001a\u00030£\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b¤\u0001\u0010¥\u0001\"\u0017\u0010¦\u0001\u001a\u00020\u00178\u0000X\u0081\u0004¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001\"\u0017\u0010¨\u0001\u001a\u00020\u00008\u0000X\u0081\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001\"\u0017\u0010ª\u0001\u001a\u00020\u00008\u0006X\u0087T¢\u0006\b\n\u0006\bª\u0001\u0010©\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001"}, d2 = {"", "p0", "", "p1", "Ljava/util/concurrent/TimeUnit;", "p2", "", "checkDuration", "(Ljava/lang/String;JLjava/util/concurrent/TimeUnit;)I", "", "checkOffsetAndCount", "(JJJ)V", "", "", "format", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Lkotlin/Function0;", "ignoreIoExceptions", "(Lkotlin/jvm/functions/Function0;)V", ExifInterface.GPS_DIRECTION_TRUE, "", "immutableListOf", "([Ljava/lang/Object;)Ljava/util/List;", "", "isSensitiveHeader", "(Ljava/lang/String;)Z", "Ljava/lang/Class;", "readFieldOrNull", "(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;", "threadName", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", ExifInterface.LONGITUDE_EAST, "", "addIfAbsent", "(Ljava/util/List;Ljava/lang/Object;)V", "", "and", "(BI)I", "(IJ)J", "", "(SI)I", "Lokhttp3/EventListener;", "Lokhttp3/EventListener$Factory;", "asFactory", "(Lokhttp3/EventListener;)Lokhttp3/EventListener$Factory;", "assertThreadDoesntHoldLock", "(Ljava/lang/Object;)V", "assertThreadHoldsLock", "canParseAsIpAddress", "Lokhttp3/HttpUrl;", "canReuseConnectionFor", "(Lokhttp3/HttpUrl;Lokhttp3/HttpUrl;)Z", "Ljava/io/Closeable;", "closeQuietly", "(Ljava/io/Closeable;)V", "Ljava/net/ServerSocket;", "(Ljava/net/ServerSocket;)V", "Ljava/net/Socket;", "(Ljava/net/Socket;)V", "concat", "([Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "", "delimiterOffset", "(Ljava/lang/String;CII)I", "(Ljava/lang/String;Ljava/lang/String;II)I", "LtryToComplete;", "discard", "(LtryToComplete;ILjava/util/concurrent/TimeUnit;)Z", "", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "filterList", "(Ljava/lang/Iterable;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "Ljava/util/Comparator;", "hasIntersection", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)Z", "Lokhttp3/Response;", "headersContentLength", "(Lokhttp3/Response;)J", "indexOf", "([Ljava/lang/String;Ljava/lang/String;Ljava/util/Comparator;)I", "indexOfControlOrNonAscii", "(Ljava/lang/String;)I", "indexOfFirstNonAsciiWhitespace", "(Ljava/lang/String;II)I", "indexOfLastNonAsciiWhitespace", "indexOfNonWhitespace", "(Ljava/lang/String;I)I", "intersect", "([Ljava/lang/String;[Ljava/lang/String;Ljava/util/Comparator;)[Ljava/lang/String;", "Lokhttp3/internal/io/FileSystem;", "Ljava/io/File;", "isCivilized", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;)Z", "LRotationProvider1;", "isHealthy", "(Ljava/net/Socket;LRotationProvider1;)Z", "notify", "notifyAll", "parseHexDigit", "(C)I", "peerName", "(Ljava/net/Socket;)Ljava/lang/String;", "Ljava/nio/charset/Charset;", "readBomAsCharset", "(LRotationProvider1;Ljava/nio/charset/Charset;)Ljava/nio/charset/Charset;", "readMedium", "(LRotationProvider1;)I", "LRotationProviderListenerWrapper;", "skipAll", "(LRotationProviderListenerWrapper;B)I", "Lokhttp3/Headers;", "Lokhttp3/internal/http2/Header;", "toHeaderList", "(Lokhttp3/Headers;)Ljava/util/List;", "toHeaders", "(Ljava/util/List;)Lokhttp3/Headers;", "toHexString", "(I)Ljava/lang/String;", "(J)Ljava/lang/String;", "toHostHeader", "(Lokhttp3/HttpUrl;Z)Ljava/lang/String;", "toImmutableList", "(Ljava/util/List;)Ljava/util/List;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "toImmutableMap", "(Ljava/util/Map;)Ljava/util/Map;", "toLongOrDefault", "(Ljava/lang/String;J)J", "toNonNegativeInt", "trimSubstring", "(Ljava/lang/String;II)Ljava/lang/String;", "wait", "Ljava/lang/Exception;", "Lkotlin/TuitionPaymentFragmentspecialinlinedviewModeldefault3;", "", "withSuppressed", "(Ljava/lang/Exception;Ljava/util/List;)Ljava/lang/Throwable;", "LRotationProviderListener;", "writeMedium", "(LRotationProviderListener;I)V", "", "EMPTY_BYTE_ARRAY", "[B", "EMPTY_HEADERS", "Lokhttp3/Headers;", "Lokhttp3/RequestBody;", "EMPTY_REQUEST", "Lokhttp3/RequestBody;", "Lokhttp3/ResponseBody;", "EMPTY_RESPONSE", "Lokhttp3/ResponseBody;", "LlambdagetPreviewBitmap1;", "UNICODE_BOMS", "LlambdagetPreviewBitmap1;", "Ljava/util/TimeZone;", "UTC", "Ljava/util/TimeZone;", "Lkotlin/text/Regex;", "VERIFY_AS_IP_ADDRESS", "Lkotlin/text/Regex;", "assertionsEnabled", "Z", "okHttpName", "Ljava/lang/String;", "userAgent"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class Util {
    public static final byte[] EMPTY_BYTE_ARRAY;
    public static final Headers EMPTY_HEADERS = Headers.INSTANCE.of(new String[0]);
    public static final RequestBody EMPTY_REQUEST;
    public static final ResponseBody EMPTY_RESPONSE;
    private static final lambdagetPreviewBitmap1 UNICODE_BOMS;
    public static final TimeZone UTC;
    private static final Regex VERIFY_AS_IP_ADDRESS;
    public static final boolean assertionsEnabled;
    public static final String okHttpName;
    public static final String userAgent = "okhttp/4.12.0";

    public static final int and(byte b, int i) {
        return b & i;
    }

    public static final int and(short s, int i) {
        return s & i;
    }

    public static final long and(int i, long j) {
        return ((long) i) & j;
    }

    public static final int parseHexDigit(char c) {
        if ('0' <= c && c < ':') {
            return c - '0';
        }
        if ('a' <= c && c < 'g') {
            return c - 'W';
        }
        if ('A' > c || c >= 'G') {
            return -1;
        }
        return c - '7';
    }

    static {
        byte[] bArr = new byte[0];
        EMPTY_BYTE_ARRAY = bArr;
        EMPTY_RESPONSE = ResponseBody.Companion.create$default(ResponseBody.INSTANCE, bArr, (MediaType) null, 1, (Object) null);
        EMPTY_REQUEST = RequestBody.Companion.create$default(RequestBody.INSTANCE, bArr, (MediaType) null, 0, 0, 7, (Object) null);
        lambdagetPreviewBitmap1.Companion companion = lambdagetPreviewBitmap1.INSTANCE;
        ByteString.Companion companion2 = ByteString.INSTANCE;
        ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2 = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2("efbbbf");
        ByteString.Companion companion3 = ByteString.INSTANCE;
        ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3 = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2("feff");
        ByteString.Companion companion4 = ByteString.INSTANCE;
        ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault4 = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2("fffe");
        ByteString.Companion companion5 = ByteString.INSTANCE;
        ByteString byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault5 = ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2("0000ffff");
        ByteString.Companion companion6 = ByteString.INSTANCE;
        UNICODE_BOMS = companion.b(byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault2, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault3, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault4, byteStringTuitionPaymentFragmentspecialinlinedviewModeldefault5, ByteString.Companion.TuitionPaymentFragmentspecialinlinedviewModeldefault2("ffff0000"));
        TimeZone timeZone = TimeZone.getTimeZone("GMT");
        Intrinsics.checkNotNull(timeZone);
        UTC = timeZone;
        VERIFY_AS_IP_ADDRESS = new Regex("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
        assertionsEnabled = false;
        String name = OkHttpClient.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "");
        okHttpName = StringsKt.removeSuffix(StringsKt.removePrefix(name, (CharSequence) "okhttp3."), (CharSequence) "Client");
    }

    public static final void checkOffsetAndCount(long j, long j2, long j3) {
        if ((j2 | j3) < 0 || j2 > j || j - j2 < j3) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static final ThreadFactory threadFactory(final String str, final boolean z) {
        Intrinsics.checkNotNullParameter(str, "");
        return new ThreadFactory() { // from class: okhttp3.internal.Util$$ExternalSyntheticLambda1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return Util.threadFactory$lambda$1(str, z, runnable);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread threadFactory$lambda$1(String str, boolean z, Runnable runnable) {
        Intrinsics.checkNotNullParameter(str, "");
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }

    public static final String[] intersect(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(strArr2, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            for (String str2 : strArr2) {
                if (comparator.compare(str, str2) == 0) {
                    arrayList.add(str);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static final boolean hasIntersection(String[] strArr, String[] strArr2, Comparator<? super String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        if (strArr.length != 0 && strArr2 != null && strArr2.length != 0) {
            for (String str : strArr) {
                Iterator it = ArrayIteratorKt.iterator(strArr2);
                while (it.hasNext()) {
                    if (comparator.compare(str, (String) it.next()) == 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static /* synthetic */ String toHostHeader$default(HttpUrl httpUrl, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toHostHeader(httpUrl, z);
    }

    public static final String toHostHeader(HttpUrl httpUrl, boolean z) {
        String strHost;
        Intrinsics.checkNotNullParameter(httpUrl, "");
        if (StringsKt.contains$default((CharSequence) httpUrl.host(), (CharSequence) ":", false, 2, (Object) null)) {
            StringBuilder sb = new StringBuilder("[");
            sb.append(httpUrl.host());
            sb.append(']');
            strHost = sb.toString();
        } else {
            strHost = httpUrl.host();
        }
        if (!z && httpUrl.port() == HttpUrl.INSTANCE.defaultPort(httpUrl.scheme())) {
            return strHost;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strHost);
        sb2.append(':');
        sb2.append(httpUrl.port());
        return sb2.toString();
    }

    public static final String[] concat(String[] strArr, String str) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        Object[] objArrCopyOf = Arrays.copyOf(strArr, strArr.length + 1);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
        String[] strArr2 = (String[]) objArrCopyOf;
        strArr2[ArraysKt.getLastIndex(strArr2)] = str;
        return strArr2;
    }

    public static /* synthetic */ int indexOfFirstNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfFirstNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfFirstNonAsciiWhitespace(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        while (i < i2) {
            char cCharAt = str.charAt(i);
            if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int indexOfLastNonAsciiWhitespace$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return indexOfLastNonAsciiWhitespace(str, i, i2);
    }

    public static final int indexOfLastNonAsciiWhitespace(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        int i3 = i2 - 1;
        if (i <= i3) {
            while (true) {
                char cCharAt = str.charAt(i3);
                if (cCharAt != '\t' && cCharAt != '\n' && cCharAt != '\f' && cCharAt != '\r' && cCharAt != ' ') {
                    return i3 + 1;
                }
                if (i3 == i) {
                    break;
                }
                i3--;
            }
        }
        return i;
    }

    public static /* synthetic */ String trimSubstring$default(String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return trimSubstring(str, i, i2);
    }

    public static final String trimSubstring(String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        int iIndexOfFirstNonAsciiWhitespace = indexOfFirstNonAsciiWhitespace(str, i, i2);
        String strSubstring = str.substring(iIndexOfFirstNonAsciiWhitespace, indexOfLastNonAsciiWhitespace(str, iIndexOfFirstNonAsciiWhitespace, i2));
        Intrinsics.checkNotNullExpressionValue(strSubstring, "");
        return strSubstring;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, str2, i, i2);
    }

    public static final int delimiterOffset(String str, String str2, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        while (i < i2) {
            if (StringsKt.contains$default((CharSequence) str2, str.charAt(i), false, 2, (Object) null)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static /* synthetic */ int delimiterOffset$default(String str, char c, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = str.length();
        }
        return delimiterOffset(str, c, i, i2);
    }

    public static final int delimiterOffset(String str, char c, int i, int i2) {
        Intrinsics.checkNotNullParameter(str, "");
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final int indexOfControlOrNonAscii(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Intrinsics.compare((int) cCharAt, 31) <= 0 || Intrinsics.compare((int) cCharAt, 127) >= 0) {
                return i;
            }
        }
        return -1;
    }

    public static final boolean canParseAsIpAddress(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return VERIFY_AS_IP_ADDRESS.matches(str);
    }

    public static final boolean isSensitiveHeader(String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return StringsKt.equals(str, "Authorization", true) || StringsKt.equals(str, "Cookie", true) || StringsKt.equals(str, "Proxy-Authorization", true) || StringsKt.equals(str, "Set-Cookie", true);
    }

    public static final String format(String str, Object... objArr) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(objArr, "");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "");
        return str2;
    }

    public static final Charset readBomAsCharset(RotationProvider1 rotationProvider1, Charset charset) throws IOException {
        Intrinsics.checkNotNullParameter(rotationProvider1, "");
        Intrinsics.checkNotNullParameter(charset, "");
        int iTuitionPaymentFragmentbindingInflater1 = rotationProvider1.TuitionPaymentFragmentbindingInflater1(UNICODE_BOMS);
        if (iTuitionPaymentFragmentbindingInflater1 == -1) {
            return charset;
        }
        if (iTuitionPaymentFragmentbindingInflater1 == 0) {
            Charset charset2 = StandardCharsets.UTF_8;
            Intrinsics.checkNotNullExpressionValue(charset2, "");
            return charset2;
        }
        if (iTuitionPaymentFragmentbindingInflater1 == 1) {
            Charset charset3 = StandardCharsets.UTF_16BE;
            Intrinsics.checkNotNullExpressionValue(charset3, "");
            return charset3;
        }
        if (iTuitionPaymentFragmentbindingInflater1 == 2) {
            Charset charset4 = StandardCharsets.UTF_16LE;
            Intrinsics.checkNotNullExpressionValue(charset4, "");
            return charset4;
        }
        if (iTuitionPaymentFragmentbindingInflater1 == 3) {
            return Charsets.INSTANCE.UTF32_BE();
        }
        if (iTuitionPaymentFragmentbindingInflater1 == 4) {
            return Charsets.INSTANCE.UTF32_LE();
        }
        throw new AssertionError();
    }

    public static final int checkDuration(String str, long j, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(str, "");
        if (j < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" < 0");
            throw new IllegalStateException(sb.toString().toString());
        }
        if (timeUnit == null) {
            throw new IllegalStateException("unit == null".toString());
        }
        long millis = timeUnit.toMillis(j);
        if (millis > SieveCacheKt.NodeLinkMask) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(" too large.");
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        if (millis != 0 || j <= 0) {
            return (int) millis;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str);
        sb3.append(" too small.");
        throw new IllegalArgumentException(sb3.toString().toString());
    }

    public static final Headers toHeaders(List<Header> list) {
        Intrinsics.checkNotNullParameter(list, "");
        Headers.Builder builder = new Headers.Builder();
        for (Header header : list) {
            ByteString byteStringComponent1 = header.component1();
            ByteString byteStringComponent2 = header.component2();
            String str = byteStringComponent1.utf8;
            if (str == null) {
                byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1 = byteStringComponent1.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                Intrinsics.checkNotNullParameter(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, "");
                String str2 = new String(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault1, Charsets.UTF_8);
                byteStringComponent1.utf8 = str2;
                str = str2;
            }
            String str3 = byteStringComponent2.utf8;
            if (str3 == null) {
                byte[] bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2 = byteStringComponent2.TuitionPaymentFragmentspecialinlinedviewModeldefault1();
                Intrinsics.checkNotNullParameter(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, "");
                String str4 = new String(bArrTuitionPaymentFragmentspecialinlinedviewModeldefault2, Charsets.UTF_8);
                byteStringComponent2.utf8 = str4;
                str3 = str4;
            }
            builder.addLenient$okhttp(str, str3);
        }
        return builder.build();
    }

    public static final List<Header> toHeaderList(Headers headers) {
        Intrinsics.checkNotNullParameter(headers, "");
        IntRange intRangeUntil = RangesKt.until(0, headers.size());
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeUntil, 10));
        Iterator<Integer> it = intRangeUntil.iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            arrayList.add(new Header(headers.name(iNextInt), headers.value(iNextInt)));
        }
        return arrayList;
    }

    public static final boolean canReuseConnectionFor(HttpUrl httpUrl, HttpUrl httpUrl2) {
        Intrinsics.checkNotNullParameter(httpUrl, "");
        Intrinsics.checkNotNullParameter(httpUrl2, "");
        return Intrinsics.areEqual(httpUrl.host(), httpUrl2.host()) && httpUrl.port() == httpUrl2.port() && Intrinsics.areEqual(httpUrl.scheme(), httpUrl2.scheme());
    }

    public static final EventListener.Factory asFactory(final EventListener eventListener) {
        Intrinsics.checkNotNullParameter(eventListener, "");
        return new EventListener.Factory() { // from class: okhttp3.internal.Util$$ExternalSyntheticLambda0
            @Override // okhttp3.EventListener.Factory
            public final EventListener create(Call call) {
                return Util.asFactory$lambda$8(eventListener, call);
            }
        };
    }

    public static final void writeMedium(RotationProviderListener rotationProviderListener, int i) throws IOException {
        Intrinsics.checkNotNullParameter(rotationProviderListener, "");
        rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3((i >>> 16) & 255);
        rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3((i >>> 8) & 255);
        rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i & 255);
    }

    public static final int readMedium(RotationProvider1 rotationProvider1) throws IOException {
        Intrinsics.checkNotNullParameter(rotationProvider1, "");
        return and(rotationProvider1.cancel(), 255) | (and(rotationProvider1.cancel(), 255) << 16) | (and(rotationProvider1.cancel(), 255) << 8);
    }

    public static final boolean skipAll(tryToComplete trytocomplete, int i, TimeUnit timeUnit) throws IOException {
        Intrinsics.checkNotNullParameter(trytocomplete, "");
        Intrinsics.checkNotNullParameter(timeUnit, "");
        long jNanoTime = System.nanoTime();
        long jDeadlineNanoTime = trytocomplete.timeout().getHasDeadline() ? trytocomplete.timeout().deadlineNanoTime() - jNanoTime : Long.MAX_VALUE;
        trytocomplete.timeout().deadlineNanoTime(Math.min(jDeadlineNanoTime, timeUnit.toNanos(i)) + jNanoTime);
        try {
            RotationProviderListenerWrapper rotationProviderListenerWrapper = new RotationProviderListenerWrapper();
            while (trytocomplete.read(rotationProviderListenerWrapper, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1) {
                rotationProviderListenerWrapper.g(rotationProviderListenerWrapper.size);
            }
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                trytocomplete.timeout().clearDeadline();
                return true;
            }
            trytocomplete.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return true;
        } catch (InterruptedIOException unused) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                trytocomplete.timeout().clearDeadline();
                return false;
            }
            trytocomplete.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            return false;
        } catch (Throwable th) {
            if (jDeadlineNanoTime == Long.MAX_VALUE) {
                trytocomplete.timeout().clearDeadline();
            } else {
                trytocomplete.timeout().deadlineNanoTime(jNanoTime + jDeadlineNanoTime);
            }
            throw th;
        }
    }

    public static final boolean discard(tryToComplete trytocomplete, int i, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter(trytocomplete, "");
        Intrinsics.checkNotNullParameter(timeUnit, "");
        try {
            return skipAll(trytocomplete, i, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String peerName(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "");
        SocketAddress remoteSocketAddress = socket.getRemoteSocketAddress();
        if (!(remoteSocketAddress instanceof InetSocketAddress)) {
            return remoteSocketAddress.toString();
        }
        String hostName = ((InetSocketAddress) remoteSocketAddress).getHostName();
        Intrinsics.checkNotNullExpressionValue(hostName, "");
        return hostName;
    }

    public static final boolean isHealthy(Socket socket, RotationProvider1 rotationProvider1) {
        Intrinsics.checkNotNullParameter(socket, "");
        Intrinsics.checkNotNullParameter(rotationProvider1, "");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !rotationProvider1.d();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final void ignoreIoExceptions(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "");
        try {
            function0.invoke();
        } catch (IOException unused) {
        }
    }

    public static final void threadName(String str, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(function0, "");
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(str);
        try {
            function0.invoke();
        } finally {
            threadCurrentThread.setName(name);
        }
    }

    public static /* synthetic */ int indexOfNonWhitespace$default(String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return indexOfNonWhitespace(str, i);
    }

    public static final int indexOfNonWhitespace(String str, int i) {
        Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        while (i < length) {
            char cCharAt = str.charAt(i);
            if (cCharAt != ' ' && cCharAt != '\t') {
                return i;
            }
            i++;
        }
        return str.length();
    }

    public static final long headersContentLength(Response response) {
        Intrinsics.checkNotNullParameter(response, "");
        String str = response.headers().get("Content-Length");
        if (str != null) {
            return toLongOrDefault(str, -1L);
        }
        return -1L;
    }

    public static final long toLongOrDefault(String str, long j) {
        Intrinsics.checkNotNullParameter(str, "");
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return j;
        }
    }

    public static final int toNonNegativeInt(String str, int i) {
        if (str != null) {
            try {
                long j = Long.parseLong(str);
                if (j > SieveCacheKt.NodeLinkMask) {
                    return Integer.MAX_VALUE;
                }
                if (j < 0) {
                    return 0;
                }
                return (int) j;
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    public static final <T> List<T> toImmutableList(List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "");
        List<T> listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.toMutableList((Collection) list));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "");
        return listUnmodifiableList;
    }

    @SafeVarargs
    public static final <T> List<T> immutableListOf(T... tArr) {
        Intrinsics.checkNotNullParameter(tArr, "");
        Object[] objArr = (Object[]) tArr.clone();
        List<T> listUnmodifiableList = Collections.unmodifiableList(CollectionsKt.listOf(Arrays.copyOf(objArr, objArr.length)));
        Intrinsics.checkNotNullExpressionValue(listUnmodifiableList, "");
        return listUnmodifiableList;
    }

    public static final <K, V> Map<K, V> toImmutableMap(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "");
        if (map.isEmpty()) {
            return MapsKt.emptyMap();
        }
        Map<K, V> mapUnmodifiableMap = Collections.unmodifiableMap(new LinkedHashMap(map));
        Intrinsics.checkNotNullExpressionValue(mapUnmodifiableMap, "");
        return mapUnmodifiableMap;
    }

    public static final void closeQuietly(Closeable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "");
        try {
            closeable.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(Socket socket) {
        Intrinsics.checkNotNullParameter(socket, "");
        try {
            socket.close();
        } catch (AssertionError e2) {
            throw e2;
        } catch (RuntimeException e3) {
            if (!Intrinsics.areEqual(e3.getMessage(), "bio == null")) {
                throw e3;
            }
        } catch (Exception unused) {
        }
    }

    public static final void closeQuietly(ServerSocket serverSocket) {
        Intrinsics.checkNotNullParameter(serverSocket, "");
        try {
            serverSocket.close();
        } catch (RuntimeException e2) {
            throw e2;
        } catch (Exception unused) {
        }
    }

    public static final boolean isCivilized(FileSystem fileSystem, File file) throws IOException {
        Intrinsics.checkNotNullParameter(fileSystem, "");
        Intrinsics.checkNotNullParameter(file, "");
        SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24ImplSink = fileSystem.sink(file);
        try {
            SurfaceViewImplementationApi24Impl surfaceViewImplementationApi24Impl = surfaceViewImplementationApi24ImplSink;
            try {
                fileSystem.delete(file);
                CloseableKt.closeFinally(surfaceViewImplementationApi24ImplSink, null);
                return true;
            } catch (IOException unused) {
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(surfaceViewImplementationApi24ImplSink, null);
                fileSystem.delete(file);
                return false;
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(surfaceViewImplementationApi24ImplSink, th);
                throw th2;
            }
        }
    }

    public static final String toHexString(long j) {
        String hexString = Long.toHexString(j);
        Intrinsics.checkNotNullExpressionValue(hexString, "");
        return hexString;
    }

    public static final String toHexString(int i) {
        String hexString = Integer.toHexString(i);
        Intrinsics.checkNotNullExpressionValue(hexString, "");
        return hexString;
    }

    public static final void wait(Object obj) throws InterruptedException {
        Intrinsics.checkNotNullParameter(obj, "");
        obj.wait();
    }

    public static final void notify(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        obj.notify();
    }

    public static final void notifyAll(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        obj.notifyAll();
    }

    public static final <T> T readFieldOrNull(Object obj, Class<T> cls, String str) {
        do {
            Intrinsics.checkNotNullParameter(obj, "");
            Intrinsics.checkNotNullParameter(cls, "");
            Intrinsics.checkNotNullParameter(str, "");
            Class<?> superclass = obj.getClass();
            while (true) {
                T tCast = null;
                if (!Intrinsics.areEqual(superclass, Object.class)) {
                    try {
                        Field declaredField = superclass.getDeclaredField(str);
                        declaredField.setAccessible(true);
                        Object obj2 = declaredField.get(obj);
                        if (cls.isInstance(obj2)) {
                            tCast = cls.cast(obj2);
                        }
                        return tCast;
                    } catch (NoSuchFieldException unused) {
                        superclass = superclass.getSuperclass();
                        Intrinsics.checkNotNullExpressionValue(superclass, "");
                    }
                }
            }
            if (Intrinsics.areEqual(str, "delegate")) {
                break;
            }
            obj = readFieldOrNull(obj, Object.class, "delegate");
        } while (obj != null);
        return null;
    }

    public static final <E> void addIfAbsent(List<E> list, E e2) {
        Intrinsics.checkNotNullParameter(list, "");
        if (list.contains(e2)) {
            return;
        }
        list.add(e2);
    }

    public static final void assertThreadHoldsLock(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        if (!assertionsEnabled || Thread.holdsLock(obj)) {
            return;
        }
        StringBuilder sb = new StringBuilder("Thread ");
        sb.append(Thread.currentThread().getName());
        sb.append(" MUST hold lock on ");
        sb.append(obj);
        throw new AssertionError(sb.toString());
    }

    public static final void assertThreadDoesntHoldLock(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "");
        if (assertionsEnabled && Thread.holdsLock(obj)) {
            StringBuilder sb = new StringBuilder("Thread ");
            sb.append(Thread.currentThread().getName());
            sb.append(" MUST NOT hold lock on ");
            sb.append(obj);
            throw new AssertionError(sb.toString());
        }
    }

    public static final Throwable withSuppressed(Exception exc, List<? extends Exception> list) {
        Intrinsics.checkNotNullParameter(exc, "");
        Intrinsics.checkNotNullParameter(list, "");
        Iterator<? extends Exception> it = list.iterator();
        while (it.hasNext()) {
            ExceptionsKt.addSuppressed(exc, it.next());
        }
        return exc;
    }

    public static final <T> List<T> filterList(Iterable<? extends T> iterable, Function1<? super T, Boolean> function1) {
        Intrinsics.checkNotNullParameter(iterable, "");
        Intrinsics.checkNotNullParameter(function1, "");
        ArrayList arrayListEmptyList = CollectionsKt.emptyList();
        for (T t : iterable) {
            if (function1.invoke(t).booleanValue()) {
                if (arrayListEmptyList.isEmpty()) {
                    arrayListEmptyList = new ArrayList();
                }
                Intrinsics.checkNotNull(arrayListEmptyList, "");
                TypeIntrinsics.asMutableList(arrayListEmptyList).add(t);
            }
        }
        return arrayListEmptyList;
    }

    public static final int indexOf(String[] strArr, String str, Comparator<String> comparator) {
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(comparator, "");
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static final int skipAll(RotationProviderListenerWrapper rotationProviderListenerWrapper, byte b) throws EOFException {
        Intrinsics.checkNotNullParameter(rotationProviderListenerWrapper, "");
        int i = 0;
        while (rotationProviderListenerWrapper.size != 0 && rotationProviderListenerWrapper.TuitionPaymentFragmentspecialinlinedviewModeldefault3(0L) == b) {
            i++;
            rotationProviderListenerWrapper.cancel();
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventListener asFactory$lambda$8(EventListener eventListener, Call call) {
        Intrinsics.checkNotNullParameter(eventListener, "");
        Intrinsics.checkNotNullParameter(call, "");
        return eventListener;
    }
}
