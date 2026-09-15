package okhttp3.internal.cache;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import defpackage.RotationProvider1;
import defpackage.RotationProviderListener;
import defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0;
import defpackage.SessionConfigValidatingBuilderExternalSyntheticLambda0;
import defpackage.SurfaceViewImplementation;
import defpackage.SurfaceViewImplementationApi24Impl;
import defpackage.initSession;
import defpackage.tryToComplete;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.encoding.Base64;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import okhttp3.internal.Util;
import okhttp3.internal.concurrent.Task;
import okhttp3.internal.concurrent.TaskQueue;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 h2\u00020\u00012\u00020\u0002:\u0004hijkB9\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J#\u0010\u0016\u001a\u00020\u00102\n\u0010\u0004\u001a\u00060\u0014R\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0018\u0010\u0012J'\u0010\u001a\u001a\b\u0018\u00010\u0014R\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00192\b\b\u0002\u0010\u0006\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0010¢\u0006\u0004\b\u001c\u0010\u0012J\u000f\u0010\u001d\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001d\u0010\u0012J\u001e\u0010\u001f\u001a\b\u0018\u00010\u001eR\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0019H\u0086\u0002¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\u0012J\r\u0010\"\u001a\u00020\u0015¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0015H\u0002¢\u0006\u0004\b$\u0010#J\u000f\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0010H\u0002¢\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u00020\u0010H\u0002¢\u0006\u0004\b)\u0010\u0012J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0019H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0010H\u0000¢\u0006\u0004\b,\u0010\u0012J\u0015\u0010-\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0019¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u00020\u00152\n\u0010\u0004\u001a\u00060/R\u00020\u0000H\u0000¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0015H\u0002¢\u0006\u0004\b2\u0010#J\r\u00103\u001a\u00020\n¢\u0006\u0004\b3\u00104J\u0019\u00106\u001a\f\u0012\b\u0012\u00060\u001eR\u00020\u000005H\u0007¢\u0006\u0004\b6\u00107J\r\u00108\u001a\u00020\u0010¢\u0006\u0004\b8\u0010\u0012J\u0017\u00109\u001a\u00020\u00102\u0006\u0010\u0004\u001a\u00020\u0019H\u0002¢\u0006\u0004\b9\u0010+R\u0014\u0010:\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010<\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020>8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\"\u0010D\u001a\u00020\u00158\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bD\u0010=\u001a\u0004\bE\u0010#\"\u0004\bF\u0010GR\u001a\u0010H\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010L\u001a\u00020\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR\u0016\u0010P\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bP\u0010=R\u0016\u0010Q\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bQ\u0010=R\u0014\u0010R\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bR\u0010IR\u0014\u0010S\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bS\u0010IR\u0014\u0010T\u001a\u00020\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bT\u0010IR\u0018\u0010U\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bU\u0010VR*\u0010X\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\b\u0012\u00060/R\u00020\u00000W8\u0001X\u0081\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[R*\u0010\\\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\n8G@GX\u0087\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u00104\"\u0004\b_\u0010`R\u0016\u0010a\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\ba\u0010=R\u0016\u0010b\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bb\u0010=R\u0016\u0010c\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bc\u0010]R\u0016\u0010d\u001a\u00020\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bd\u0010;R\u0016\u00103\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u0010]R\u001a\u0010e\u001a\u00020\u00078\u0001X\u0081\u0004¢\u0006\f\n\u0004\be\u0010;\u001a\u0004\bf\u0010g"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokhttp3/internal/io/FileSystem;", "p0", "Ljava/io/File;", "p1", "", "p2", "p3", "", "p4", "Lokhttp3/internal/concurrent/TaskRunner;", "p5", "<init>", "(Lokhttp3/internal/io/FileSystem;Ljava/io/File;IIJLokhttp3/internal/concurrent/TaskRunner;)V", "", "checkNotClosed", "()V", "close", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "completeEdit$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;Z)V", "delete", "", "edit", "(Ljava/lang/String;J)Lokhttp3/internal/cache/DiskLruCache$Editor;", "evictAll", "flush", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "get", "(Ljava/lang/String;)Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "initialize", "isClosed", "()Z", "journalRebuildRequired", "LRotationProviderListener;", "newJournalWriter", "()LRotationProviderListener;", "processJournal", "readJournal", "readJournalLine", "(Ljava/lang/String;)V", "rebuildJournal$okhttp", "remove", "(Ljava/lang/String;)Z", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "removeEntry$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Entry;)Z", "removeOldestEntry", "size", "()J", "", "snapshots", "()Ljava/util/Iterator;", "trimToSize", "validateKey", RemoteConfigConstants.RequestFieldKey.APP_VERSION, "I", "civilizedFileSystem", "Z", "Lokhttp3/internal/concurrent/TaskQueue;", "cleanupQueue", "Lokhttp3/internal/concurrent/TaskQueue;", "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "cleanupTask", "Lokhttp3/internal/cache/DiskLruCache$cleanupTask$1;", "closed", "getClosed$okhttp", "setClosed$okhttp", "(Z)V", "directory", "Ljava/io/File;", "getDirectory", "()Ljava/io/File;", "fileSystem", "Lokhttp3/internal/io/FileSystem;", "getFileSystem$okhttp", "()Lokhttp3/internal/io/FileSystem;", "hasJournalErrors", "initialized", "journalFile", "journalFileBackup", "journalFileTmp", "journalWriter", "LRotationProviderListener;", "Ljava/util/LinkedHashMap;", "lruEntries", "Ljava/util/LinkedHashMap;", "getLruEntries$okhttp", "()Ljava/util/LinkedHashMap;", "maxSize", "J", "getMaxSize", "setMaxSize", "(J)V", "mostRecentRebuildFailed", "mostRecentTrimFailed", "nextSequenceNumber", "redundantOpCount", "valueCount", "getValueCount$okhttp", "()I", "Companion", "Editor", "Entry", "Snapshot"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DiskLruCache implements Closeable, Flushable {
    public static final long ANY_SEQUENCE_NUMBER;
    public static final String CLEAN;
    public static final String DIRTY;
    public static final String JOURNAL_FILE;
    public static final String JOURNAL_FILE_BACKUP;
    public static final String JOURNAL_FILE_TEMP;
    public static final Regex LEGAL_KEY_PATTERN;
    public static final String MAGIC;
    public static final String READ;
    public static final String REMOVE;
    private static int TuitionPaymentFragmentbindingInflater1;
    private static short[] TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public static final String VERSION_1;
    private static int asBinder;
    private static byte[] b;
    private final int appVersion;
    private boolean civilizedFileSystem;
    private final TaskQueue cleanupQueue;
    private final DiskLruCache$cleanupTask$1 cleanupTask;
    private boolean closed;
    private final File directory;
    private final FileSystem fileSystem;
    private boolean hasJournalErrors;
    private boolean initialized;
    private final File journalFile;
    private final File journalFileBackup;
    private final File journalFileTmp;
    private RotationProviderListener journalWriter;
    private final LinkedHashMap<String, Entry> lruEntries;
    private long maxSize;
    private boolean mostRecentRebuildFailed;
    private boolean mostRecentTrimFailed;
    private long nextSequenceNumber;
    private int redundantOpCount;
    private long size;
    private final int valueCount;
    private static final byte[] $$c = {60, 80, 13, 34};
    private static final int $$f = 251;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {31, 115, -100, -11, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 60, -15, 12, 0, -72, 60, -1, -14, -2, 4, -65, 73, -3, -11, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -70, 9, -5, -66, 54, 5, -3, -11, 2, -10, -58, 48, 10, -13, 11, -6, -9, -8, -57, 54, 3, 3, -72, 56, 2, 3, -18, 10, -7, -16, 8, -65, 60, -4, -4, -5, 8, -24, 1, 9, -5, -3, -1, -4, -67, 73, -3, -27, 13, 30, -15, 8, -14, 3, -4, -33, 14, 21, -15, -11, 6, 3, -49, 41, -20, 3, 3, -11, 6, 3, -4, -6, -14, -5, 3, -11, 8, -6, 2, -5, -6, 2, -12, -4, 15, -16, -7, 15, -45, 31, -14, -2, 4, -11, -2, -2, -8, 17, -12, 5, -69};
    private static final int $$e = 194;
    private static final byte[] $$a = {21, -108, 100, 114, -29, 31, -48, -17, 4, -24, 1, -6, -13, -13, -29, 38, -50, -16, -1, -12, -24, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 55, -44, 1, -22, 0, -17, -10, 19, -28, -35, 1, -3, -20, -17, 35, -55, 6, -17, -17, -3, -20, -17, -10, -8, 0, -9, -17, -3, -22, -8, -16, -9, -8, -16, -2, -10, -29, 2, -7, -29, 31, -45, 0, -12, -18, -3, -12, -12, -6, -31, -2, -19, 54};
    private static final int $$b = 231;
    private static int g = 0;
    private static int d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f1287a = 1;

    /* JADX WARN: Code duplicated, block: B:10:0x0020  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r6 = r6 + 84
            int r0 = r7 + 1
            byte[] r1 = okhttp3.internal.cache.DiskLruCache.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L28
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L20:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-11)
            r8 = r3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.c(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void f(short r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 4
            int r8 = 139 - r8
            byte[] r0 = okhttp3.internal.cache.DiskLruCache.$$d
            int r9 = r9 * 4
            int r9 = 53 - r9
            int r7 = r7 * 15
            int r7 = r7 + 84
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r7 = r9
            r5 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2e:
            int r7 = r7 + r8
            int r7 = r7 + 3
            r8 = r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.f(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [okhttp3.internal.cache.DiskLruCache$cleanupTask$1] */
    public DiskLruCache(FileSystem fileSystem, File file, int i, int i2, long j, TaskRunner taskRunner) {
        Intrinsics.checkNotNullParameter(fileSystem, "");
        Intrinsics.checkNotNullParameter(file, "");
        Intrinsics.checkNotNullParameter(taskRunner, "");
        this.fileSystem = fileSystem;
        this.directory = file;
        this.appVersion = i;
        this.valueCount = i2;
        this.maxSize = j;
        this.lruEntries = new LinkedHashMap<>(0, 0.75f, true);
        this.cleanupQueue = taskRunner.newQueue();
        StringBuilder sb = new StringBuilder();
        sb.append(Util.okHttpName);
        sb.append(" Cache");
        final String string = sb.toString();
        this.cleanupTask = new Task(string) { // from class: okhttp3.internal.cache.DiskLruCache$cleanupTask$1
            @Override // okhttp3.internal.concurrent.Task
            public final long runOnce() {
                DiskLruCache diskLruCache = this.this$0;
                synchronized (diskLruCache) {
                    if (!DiskLruCache.access$getInitialized$p(diskLruCache) || diskLruCache.getClosed$okhttp()) {
                        return -1L;
                    }
                    try {
                        diskLruCache.trimToSize();
                    } catch (IOException unused) {
                        DiskLruCache.access$setMostRecentTrimFailed$p(diskLruCache, true);
                    }
                    try {
                        if (DiskLruCache.access$journalRebuildRequired(diskLruCache)) {
                            diskLruCache.rebuildJournal$okhttp();
                            DiskLruCache.access$setRedundantOpCount$p(diskLruCache, 0);
                        }
                    } catch (IOException unused2) {
                        DiskLruCache.access$setMostRecentRebuildFailed$p(diskLruCache, true);
                        DiskLruCache.access$setJournalWriter$p(diskLruCache, SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3()));
                    }
                    return -1L;
                }
            }
        };
        if (j <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0".toString());
        }
        this.journalFile = new File(file, JOURNAL_FILE);
        this.journalFileTmp = new File(file, JOURNAL_FILE_TEMP);
        this.journalFileBackup = new File(file, JOURNAL_FILE_BACKUP);
        int i3 = g + 111;
        d = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 50 / 0;
        }
    }

    public static final /* synthetic */ boolean access$getCivilizedFileSystem$p(DiskLruCache diskLruCache) {
        int i = 2 % 2;
        int i2 = g + 31;
        d = i2 % 128;
        int i3 = i2 % 2;
        boolean z = diskLruCache.civilizedFileSystem;
        if (i3 == 0) {
            int i4 = 17 / 0;
        }
        return z;
    }

    public static final /* synthetic */ boolean access$getInitialized$p(DiskLruCache diskLruCache) {
        int i = 2 % 2;
        int i2 = g + 15;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        boolean z = diskLruCache.initialized;
        int i5 = i3 + 107;
        g = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    public static final /* synthetic */ boolean access$journalRebuildRequired(DiskLruCache diskLruCache) {
        int i = 2 % 2;
        int i2 = g + 69;
        d = i2 % 128;
        if (i2 % 2 == 0) {
            diskLruCache.journalRebuildRequired();
            throw null;
        }
        boolean zJournalRebuildRequired = diskLruCache.journalRebuildRequired();
        int i3 = d + 105;
        g = i3 % 128;
        int i4 = i3 % 2;
        return zJournalRebuildRequired;
    }

    public static final /* synthetic */ void access$setHasJournalErrors$p(DiskLruCache diskLruCache, boolean z) {
        int i = 2 % 2;
        int i2 = g + 119;
        d = i2 % 128;
        int i3 = i2 % 2;
        diskLruCache.hasJournalErrors = z;
        if (i3 == 0) {
            int i4 = 37 / 0;
        }
    }

    public static final /* synthetic */ void access$setJournalWriter$p(DiskLruCache diskLruCache, RotationProviderListener rotationProviderListener) {
        int i = 2 % 2;
        int i2 = g + 77;
        int i3 = i2 % 128;
        d = i3;
        int i4 = i2 % 2;
        diskLruCache.journalWriter = rotationProviderListener;
        int i5 = i3 + 75;
        g = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void access$setMostRecentRebuildFailed$p(DiskLruCache diskLruCache, boolean z) {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 59;
        g = i3 % 128;
        int i4 = i3 % 2;
        diskLruCache.mostRecentRebuildFailed = z;
        int i5 = i2 + 33;
        g = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void access$setMostRecentTrimFailed$p(DiskLruCache diskLruCache, boolean z) {
        int i = 2 % 2;
        int i2 = d + 115;
        int i3 = i2 % 128;
        g = i3;
        int i4 = i2 % 2;
        diskLruCache.mostRecentTrimFailed = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i3 + 29;
        d = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 58 / 0;
        }
    }

    public static final /* synthetic */ void access$setRedundantOpCount$p(DiskLruCache diskLruCache, int i) {
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = i3 + 105;
        g = i4 % 128;
        int i5 = i4 % 2;
        diskLruCache.redundantOpCount = i;
        int i6 = i3 + 51;
        g = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public final FileSystem getFileSystem$okhttp() {
        int i = 2 % 2;
        int i2 = g;
        int i3 = i2 + 95;
        d = i3 % 128;
        int i4 = i3 % 2;
        FileSystem fileSystem = this.fileSystem;
        int i5 = i2 + 119;
        d = i5 % 128;
        if (i5 % 2 != 0) {
            return fileSystem;
        }
        throw null;
    }

    public final File getDirectory() {
        int i = 2 % 2;
        int i2 = d + 33;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            return this.directory;
        }
        throw null;
    }

    public final int getValueCount$okhttp() {
        int i = 2 % 2;
        int i2 = d + 7;
        int i3 = i2 % 128;
        g = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        int i4 = this.valueCount;
        int i5 = i3 + 97;
        d = i5 % 128;
        int i6 = i5 % 2;
        return i4;
    }

    public final long getMaxSize() {
        long j;
        synchronized (this) {
            j = this.maxSize;
        }
        return j;
    }

    public final void setMaxSize(long j) {
        synchronized (this) {
            this.maxSize = j;
            if (this.initialized) {
                TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            }
        }
    }

    public final LinkedHashMap<String, Entry> getLruEntries$okhttp() {
        int i = 2 % 2;
        int i2 = d;
        int i3 = i2 + 103;
        g = i3 % 128;
        int i4 = i3 % 2;
        LinkedHashMap<String, Entry> linkedHashMap = this.lruEntries;
        int i5 = i2 + 85;
        g = i5 % 128;
        int i6 = i5 % 2;
        return linkedHashMap;
    }

    private static void e(int i, int i2, short s, byte b2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5 = 2 % 2;
        SessionConfigValidatingBuilderExternalSyntheticLambda0 sessionConfigValidatingBuilderExternalSyntheticLambda0 = new SessionConfigValidatingBuilderExternalSyntheticLambda0();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(TuitionPaymentFragmentbindingInflater1)};
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                byte b3 = (byte) 0;
                byte b4 = b3;
                objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) ((-1) - ImageFormat.getBitsPerPixel(0)), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 2266, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33, 1387473586, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            long j = 0;
            if (i6 != 0) {
                byte[] bArr = b;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i7 = 0;
                    while (i7 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i7])};
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(632534666);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b5 = (byte) 0;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1))), 3358 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 18 - View.resolveSizeAndState(0, 0, 0), -1054011043, false, $$g(b5, b5, (byte) $$c.length), new Class[]{Integer.TYPE});
                            }
                            bArr2[i7] = ((Byte) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).byteValue();
                            i7++;
                            j = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = b;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault2)};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1238528667);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.getTrimmedLength("") + 2267, 32 - ((byte) KeyEvent.getModifierMetaStateMask()), 1387473586, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue()]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                        i4 = 2;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    iIntValue = (short) (((short) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault1[i3 + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L))]) ^ 3046761265686732006L)) + ((int) (((long) TuitionPaymentFragmentbindingInflater1) ^ 3046761265686732006L)));
                    int i8 = $11 + 125;
                    $10 = i8 % 128;
                    i4 = 2;
                    int i9 = i8 % 2;
                }
            } else {
                i4 = 2;
            }
            if (iIntValue > 0) {
                sessionConfigValidatingBuilderExternalSyntheticLambda0.b = ((i3 + iIntValue) - i4) + ((int) (((long) TuitionPaymentFragmentspecialinlinedviewModeldefault2) ^ 3046761265686732006L)) + i6;
                Object[] objArr5 = {sessionConfigValidatingBuilderExternalSyntheticLambda0, Integer.valueOf(i), Integer.valueOf(TuitionPaymentFragmentspecialinlinedviewModeldefault3), sb};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1079014435);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    byte b8 = (byte) 0;
                    byte b9 = b8;
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (55904 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 2854 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 13, -1529949196, false, $$g(b8, b9, (byte) (b9 + 1)), new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                byte[] bArr4 = b;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i10 = 0; i10 < length2; i10++) {
                        int i11 = $11 + 23;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        bArr5[i10] = (byte) (((long) bArr4[i10]) ^ 3046761265686732006L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
                while (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3 < iIntValue) {
                    if (z) {
                        byte[] bArr6 = b;
                        int i13 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i13 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((byte) (((byte) (((long) bArr6[i13]) ^ 3046761265686732006L)) + s)) ^ b2));
                    } else {
                        short[] sArr = TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                        int i14 = sessionConfigValidatingBuilderExternalSyntheticLambda0.b;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.b = i14 - 1;
                        sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = (char) (sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 + (((short) (((short) (((long) sArr[i14]) ^ 3046761265686732006L)) + s)) ^ b2));
                    }
                    sb.append(sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault1;
                    sessionConfigValidatingBuilderExternalSyntheticLambda0.TuitionPaymentFragmentspecialinlinedviewModeldefault3++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    public final boolean getClosed$okhttp() throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = d + 93;
        g = i2 % 128;
        int i3 = i2 % 2;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char cMyPid = (char) (Process.myPid() >> 22);
            int deadChar = 876 - KeyEvent.getDeadChar(0, 0);
            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) (-bArr[12]), (byte) (-bArr[26]), bArr[18], objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(cMyPid, deadChar, keyRepeatDelay, -1199417970, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(1660169654 - KeyEvent.getDeadChar(0, 0), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 92, (short) (Color.argb(0, 0, 0, 0) + 113), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 117), (-419626876) + (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1660169658, (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 99, (short) ((-30) - View.resolveSizeAndState(0, 0, 0)), (byte) (83 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (-419626855) - TextUtils.indexOf("", ""), objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char cResolveOpacity = (char) Drawable.resolveOpacity(0, 0);
            int iMyPid = (Process.myPid() >> 22) + 876;
            int iResolveOpacity = 10 - Drawable.resolveOpacity(0, 0);
            byte[] bArr2 = $$a;
            Object[] objArr5 = new Object[1];
            c((byte) (-bArr2[17]), bArr2[24], (byte) (-bArr2[45]), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(cResolveOpacity, iMyPid, iResolveOpacity, 254769921, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char capsMode = (char) TextUtils.getCapsMode("", 0, 0);
                int absoluteGravity = 876 - Gravity.getAbsoluteGravity(0, 0);
                int i4 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                byte[] bArr3 = $$a;
                Object[] objArr6 = new Object[1];
                c((byte) (-bArr3[12]), (byte) (-bArr3[58]), (byte) (-bArr3[45]), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(capsMode, absoluteGravity, i4, 1324201839, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            objArr = new Object[]{new int[]{((int[]) objArr7[0])[0]}, new int[1], new int[]{((int[]) objArr7[2])[0]}, (String[]) objArr7[3]};
            int iIdentityHashCode = System.identityHashCode(this);
            int i5 = 456129926 + (((~((~iIdentityHashCode) | 224422976)) | (-266858070)) * (-245));
            int i6 = ~(iIdentityHashCode | 224422976);
            int i7 = ((i5 + (i6 * (-245))) + ((i6 | 264733205) * 245)) - 707269105;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[1])[0] = i9 ^ (i9 << 5);
        } else {
            Object[] objArr8 = new Object[1];
            e(1660169663 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (-98) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) ((-28) - Color.blue(0)), (byte) (122 - Color.green(0)), (ViewConfiguration.getTouchSlop() >> 8) - 419626841, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1660169663, (-99) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (short) (TextUtils.indexOf("", "") - 3), (byte) (View.MeasureSpec.getMode(0) - 114), (Process.myTid() >> 22) - 419626826, objArr9);
            int iIntValue = ((Integer) cls2.getMethod((String) objArr9[0], Object.class).invoke(null, this)).intValue();
            int i10 = g + 125;
            d = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr10 = {Integer.valueOf(iIntValue), -707269105};
                byte[] bArr4 = $$d;
                Object[] objArr11 = new Object[1];
                f(bArr4[129], (byte) 34, bArr4[35], objArr11);
                Class<?> cls3 = Class.forName((String) objArr11[0]);
                byte b2 = bArr4[29];
                byte b3 = b2;
                Object[] objArr12 = new Object[1];
                f(b3, (byte) (b3 | 25), b2, objArr12);
                Object[] objArr13 = (Object[]) cls3.getMethod((String) objArr12[0], Integer.TYPE, Integer.TYPE).invoke(null, objArr10);
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1435299656);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                    char c = (char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                    int iMyTid = (Process.myTid() >> 22) + 876;
                    int iGreen = Color.green(0) + 10;
                    byte[] bArr5 = $$a;
                    Object[] objArr14 = new Object[1];
                    c((byte) (-bArr5[12]), (byte) (-bArr5[58]), (byte) (-bArr5[45]), objArr14);
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(c, iMyTid, iGreen, 1324201839, false, (String) objArr14[0], null);
                }
                ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr13);
                try {
                    Object[] objArr15 = new Object[1];
                    e((Process.myTid() >> 22) + 1660169654, (-92) - TextUtils.getTrimmedLength(""), (short) ((ViewConfiguration.getScrollBarSize() >> 8) + 113), (byte) (116 - Color.red(0)), (-419626876) - Drawable.resolveOpacity(0, 0), objArr15);
                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    e((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1660169658, (-99) - View.resolveSize(0, 0), (short) ((-30) - (ViewConfiguration.getLongPressTimeout() >> 16)), (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 82), (-419626855) - TextUtils.getCapsMode("", 0, 0), objArr16);
                    long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue2);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-340665130);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                        char offsetBefore = (char) TextUtils.getOffsetBefore("", 0);
                        int i12 = 876 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1));
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 10;
                        byte[] bArr6 = $$a;
                        byte b4 = (byte) (-bArr6[17]);
                        byte b5 = bArr6[24];
                        byte b6 = (byte) (-bArr6[45]);
                        Object[] objArr17 = new Object[1];
                        c(b4, b5, b6, objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(offsetBefore, i12, jumpTapTimeout, 254769921, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1545400921);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                        char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                        int iRed = Color.red(0) + 876;
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 10;
                        byte[] bArr7 = $$a;
                        Object[] objArr18 = new Object[1];
                        c((byte) (-bArr7[12]), (byte) (-bArr7[26]), bArr7[18], objArr18);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(cNormalizeMetaState, iRed, packedPositionGroup, -1199417970, false, (String) objArr18[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    objArr = objArr13;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i13 = ((int[]) objArr[2])[0];
        int i14 = ((int[]) objArr[0])[0];
        if (i14 == i13) {
            int i15 = ((int[]) objArr[1])[0];
            Object[] objArr19 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i16 = i15 + (-208210156) + (((~((-457241546) | iIdentityHashCode2)) | 50340361) * 1504) + ((~(iIdentityHashCode2 | (-406901185))) * (-1504)) + 1846028768;
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr19[1])[0] = i18 ^ (i18 << 5);
            int i19 = g + 55;
            d = i19 % 128;
            int i20 = i19 % 2;
        } else {
            ArrayList arrayList = new ArrayList();
            String[] strArr = (String[]) objArr[3];
            if (strArr != null) {
                int i21 = d + 23;
                g = i21 % 128;
                int i22 = i21 % 2;
                for (String str : strArr) {
                    arrayList.add(str);
                }
            }
            int[] iArr = new int[i14];
            int i23 = i14 - 1;
            iArr[i23] = 1;
            Toast.makeText((Context) null, iArr[((i14 * i23) % 2) - 1], 1).show();
            int i24 = ((int[]) objArr[1])[0];
            Object[] objArr20 = {new int[]{((int[]) objArr[0])[0]}, new int[1], new int[]{((int[]) objArr[2])[0]}, (String[]) objArr[3]};
            int iElapsedRealtime = (int) SystemClock.elapsedRealtime();
            int i25 = i24 + (-849164672) + (((~(1028182661 | iElapsedRealtime)) | 1068492890) * (-366)) + (((~(iElapsedRealtime | 1072691935)) | 1023983616) * 366);
            int i26 = (i25 << 13) ^ i25;
            int i27 = i26 ^ (i26 >>> 17);
            ((int[]) objArr20[1])[0] = i27 ^ (i27 << 5);
        }
        return this.closed;
    }

    public final void setClosed$okhttp(boolean z) {
        int i = 2 % 2;
        int i2 = g + 25;
        d = i2 % 128;
        int i3 = i2 % 2;
        this.closed = z;
        if (i3 == 0) {
            int i4 = 92 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0085 A[EXC_TOP_SPLITTER, LOOP:0: B:37:0x0085->B:20:0x008c, LOOP_START, PHI: r10
  0x0085: PHI (r10v2 int) = (r10v1 int), (r10v4 int) binds: [B:18:0x0083, B:20:0x008c] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    private final void readJournal() throws IOException {
        int i = 2 % 2;
        int i2 = g + 69;
        d = i2 % 128;
        int i3 = i2 % 2;
        RotationProvider1 rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3 = SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3(this.fileSystem.source(this.journalFile));
        try {
            RotationProvider1 rotationProvider1 = rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3;
            String strIconCompatParcelizer = rotationProvider1.IconCompatParcelizer();
            String strIconCompatParcelizer2 = rotationProvider1.IconCompatParcelizer();
            String strIconCompatParcelizer3 = rotationProvider1.IconCompatParcelizer();
            String strIconCompatParcelizer4 = rotationProvider1.IconCompatParcelizer();
            String strIconCompatParcelizer5 = rotationProvider1.IconCompatParcelizer();
            if (Intrinsics.areEqual(MAGIC, strIconCompatParcelizer)) {
                int i4 = g + 13;
                d = i4 % 128;
                int i5 = 0;
                if (i4 % 2 == 0) {
                    int i6 = 42 / 0;
                    if (Intrinsics.areEqual(VERSION_1, strIconCompatParcelizer2)) {
                        if (Intrinsics.areEqual(String.valueOf(this.appVersion), strIconCompatParcelizer3) && Intrinsics.areEqual(String.valueOf(this.valueCount), strIconCompatParcelizer4)) {
                            int i7 = g + 29;
                            d = i7 % 128;
                            int i8 = i7 % 2;
                            if (strIconCompatParcelizer5.length() <= 0) {
                                while (true) {
                                    try {
                                        readJournalLine(rotationProvider1.IconCompatParcelizer());
                                        i5++;
                                    } catch (EOFException unused) {
                                        this.redundantOpCount = i5 - this.lruEntries.size();
                                        if (rotationProvider1.d()) {
                                            this.journalWriter = newJournalWriter();
                                            int i9 = g + 71;
                                            d = i9 % 128;
                                            int i10 = i9 % 2;
                                        } else {
                                            rebuildJournal$okhttp();
                                        }
                                        Unit unit = Unit.INSTANCE;
                                        CloseableKt.closeFinally(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3, null);
                                        return;
                                    }
                                }
                            }
                        }
                    }
                } else if (Intrinsics.areEqual(VERSION_1, strIconCompatParcelizer2)) {
                    if (Intrinsics.areEqual(String.valueOf(this.appVersion), strIconCompatParcelizer3)) {
                        int i11 = g + 29;
                        d = i11 % 128;
                        int i12 = i11 % 2;
                        if (strIconCompatParcelizer5.length() <= 0) {
                            while (true) {
                                readJournalLine(rotationProvider1.IconCompatParcelizer());
                                i5++;
                            }
                        }
                    }
                }
            }
            StringBuilder sb = new StringBuilder("unexpected journal header: [");
            sb.append(strIconCompatParcelizer);
            sb.append(", ");
            sb.append(strIconCompatParcelizer2);
            sb.append(", ");
            sb.append(strIconCompatParcelizer4);
            sb.append(", ");
            sb.append(strIconCompatParcelizer5);
            sb.append(']');
            throw new IOException(sb.toString());
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                CloseableKt.closeFinally(rotationProvider1TuitionPaymentFragmentspecialinlinedviewModeldefault3, th);
                throw th2;
            }
        }
    }

    private final RotationProviderListener newJournalWriter() throws FileNotFoundException {
        int i = 2 % 2;
        RotationProviderListener rotationProviderListenerTuitionPaymentFragmentbindingInflater1 = SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(new FaultHidingSink(this.fileSystem.appendingSink(this.journalFile), new Function1<IOException, Unit>() { // from class: okhttp3.internal.cache.DiskLruCache$newJournalWriter$faultHidingSink$1
            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(IOException iOException) {
                invoke2(iOException);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(IOException iOException) {
                Intrinsics.checkNotNullParameter(iOException, "");
                DiskLruCache diskLruCache = this.this$0;
                if (!Util.assertionsEnabled || Thread.holdsLock(diskLruCache)) {
                    DiskLruCache.access$setHasJournalErrors$p(this.this$0, true);
                    return;
                }
                StringBuilder sb = new StringBuilder("Thread ");
                sb.append(Thread.currentThread().getName());
                sb.append(" MUST hold lock on ");
                sb.append(diskLruCache);
                throw new AssertionError(sb.toString());
            }

            {
                super(1);
            }
        }));
        int i2 = g + 1;
        d = i2 % 128;
        if (i2 % 2 != 0) {
            return rotationProviderListenerTuitionPaymentFragmentbindingInflater1;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0049 A[PHI: r3 r4
  0x0049: PHI (r3v4 int) = (r3v3 int), (r3v10 int) binds: [B:10:0x0047, B:7:0x0034] A[DONT_GENERATE, DONT_INLINE]
  0x0049: PHI (r4v6 int) = (r4v5 int), (r4v26 int) binds: [B:10:0x0047, B:7:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:13:0x0054  */
    /* JADX WARN: Code duplicated, block: B:19:0x0078  */
    /* JADX WARN: Code duplicated, block: B:21:0x0085 A[PHI: r3 r4
  0x0085: PHI (r3v9 int) = (r3v3 int), (r3v10 int) binds: [B:10:0x0047, B:7:0x0034] A[DONT_GENERATE, DONT_INLINE]
  0x0085: PHI (r4v23 int) = (r4v5 int), (r4v26 int) binds: [B:10:0x0047, B:7:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    private final void readJournalLine(String p0) throws IOException {
        int iIndexOf$default;
        int i;
        int i2;
        String strSubstring;
        String str;
        int i3 = 2 % 2;
        String str2 = p0;
        int iIndexOf$default2 = StringsKt.indexOf$default((CharSequence) str2, ' ', 0, false, 6, (Object) null);
        if (iIndexOf$default2 == -1) {
            throw new IOException("unexpected journal line: ".concat(String.valueOf(p0)));
        }
        int i4 = d + 71;
        g = i4 % 128;
        if (i4 % 2 != 0) {
            iIndexOf$default = StringsKt.indexOf$default((CharSequence) str2, (char) 0, iIndexOf$default2, false, 5, (Object) null);
            i = iIndexOf$default2;
            if (iIndexOf$default == -1) {
                i2 = g + 121;
                d = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullExpressionValue(p0.substring(i), "");
                    REMOVE.length();
                    throw null;
                }
                strSubstring = p0.substring(i);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                str = REMOVE;
                if (iIndexOf$default2 == str.length() && StringsKt.startsWith$default(p0, str, false, 2, (Object) null)) {
                    int i5 = g + 23;
                    d = i5 % 128;
                    int i6 = i5 % 2;
                    this.lruEntries.remove(strSubstring);
                    return;
                }
            } else {
                strSubstring = p0.substring(i, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            }
        } else {
            int i7 = iIndexOf$default2 + 1;
            iIndexOf$default = StringsKt.indexOf$default((CharSequence) str2, ' ', i7, false, 4, (Object) null);
            i = i7;
            if (iIndexOf$default == -1) {
                i2 = g + 121;
                d = i2 % 128;
                if (i2 % 2 != 0) {
                    Intrinsics.checkNotNullExpressionValue(p0.substring(i), "");
                    REMOVE.length();
                    throw null;
                }
                strSubstring = p0.substring(i);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
                str = REMOVE;
                if (iIndexOf$default2 == str.length()) {
                    int i8 = g + 23;
                    d = i8 % 128;
                    int i9 = i8 % 2;
                    this.lruEntries.remove(strSubstring);
                    return;
                }
            } else {
                strSubstring = p0.substring(i, iIndexOf$default);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "");
            }
        }
        Entry entry = this.lruEntries.get(strSubstring);
        if (entry == null) {
            entry = new Entry(this, strSubstring);
            this.lruEntries.put(strSubstring, entry);
        }
        if (iIndexOf$default != -1) {
            int i10 = g + 59;
            d = i10 % 128;
            int i11 = i10 % 2;
            String str3 = CLEAN;
            if (iIndexOf$default2 == str3.length() && StringsKt.startsWith$default(p0, str3, false, 2, (Object) null)) {
                int i12 = g + 7;
                d = i12 % 128;
                int i13 = i12 % 2;
                String strSubstring2 = p0.substring(iIndexOf$default + 1);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "");
                List<String> listSplit$default = StringsKt.split$default((CharSequence) strSubstring2, new char[]{' '}, false, 0, 6, (Object) null);
                entry.setReadable$okhttp(true);
                entry.setCurrentEditor$okhttp(null);
                entry.setLengths$okhttp(listSplit$default);
                return;
            }
        }
        if (iIndexOf$default == -1) {
            int i14 = g + 71;
            d = i14 % 128;
            int i15 = i14 % 2;
            String str4 = DIRTY;
            if (iIndexOf$default2 == str4.length() && StringsKt.startsWith$default(p0, str4, false, 2, (Object) null)) {
                entry.setCurrentEditor$okhttp(new Editor(this, entry));
                return;
            }
        }
        if (iIndexOf$default == -1) {
            String str5 = READ;
            if (iIndexOf$default2 == str5.length() && StringsKt.startsWith$default(p0, str5, false, 2, (Object) null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(String.valueOf(p0)));
    }

    private final void processJournal() throws IOException {
        int i = 2 % 2;
        this.fileSystem.delete(this.journalFileTmp);
        Iterator<Entry> it = this.lruEntries.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            Intrinsics.checkNotNullExpressionValue(next, "");
            Entry entry = next;
            int i2 = 0;
            if (entry.getCurrentEditor() == null) {
                int i3 = d + 83;
                g = i3 % 128;
                int i4 = i3 % 2;
                int i5 = this.valueCount;
                while (i2 < i5) {
                    this.size += entry.getLengths()[i2];
                    i2++;
                }
            } else {
                entry.setCurrentEditor$okhttp(null);
                int i6 = this.valueCount;
                while (i2 < i6) {
                    int i7 = g + 115;
                    d = i7 % 128;
                    int i8 = i7 % 2;
                    this.fileSystem.delete(entry.getCleanFiles$okhttp().get(i2));
                    this.fileSystem.delete(entry.getDirtyFiles$okhttp().get(i2));
                    i2++;
                    int i9 = g + 69;
                    d = i9 % 128;
                    int i10 = i9 % 2;
                }
                it.remove();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r9v3, types: [boolean, int] */
    public final void rebuildJournal$okhttp() throws Throwable {
        Object[] objArr;
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
            char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 37567);
            int packedPositionChild = 624 - ExpandableListView.getPackedPositionChild(0L);
            int bitsPerPixel = 13 - ImageFormat.getBitsPerPixel(0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            c((byte) 14, bArr[24], (byte) (-bArr[17]), objArr2);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b(scrollDefaultDelay, packedPositionChild, bitsPerPixel, -477065106, false, (String) objArr2[0], null);
        }
        long j = ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).getLong(null);
        Object[] objArr3 = new Object[1];
        e(1660169653 - ExpandableListView.getPackedPositionChild(0L), Gravity.getAbsoluteGravity(0, 0) - 92, (short) (TextUtils.lastIndexOf("", '0') + 114), (byte) (View.getDefaultSize(0, 0) + 116), (-419626877) - TextUtils.indexOf((CharSequence) "", '0', 0), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1660169657, (-100) - ImageFormat.getBitsPerPixel(0), (short) ((ViewConfiguration.getPressedStateDuration() >> 16) - 30), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 84), Color.red(0) - 419626855, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
            char longPressTimeout = (char) (37567 - (ViewConfiguration.getLongPressTimeout() >> 16));
            int iAlpha = Color.alpha(0) + 625;
            int iKeyCodeFromString = 14 - KeyEvent.keyCodeFromString("");
            byte[] bArr2 = $$a;
            byte b2 = bArr2[24];
            Object[] objArr5 = new Object[1];
            c(b2, (byte) (b2 | 52), (byte) (-bArr2[17]), objArr5);
            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b(longPressTimeout, iAlpha, iKeyCodeFromString, -976899241, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 37567);
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 625;
                int iKeyCodeFromString2 = 14 - KeyEvent.keyCodeFromString("");
                byte b3 = $$a[24];
                Object[] objArr6 = new Object[1];
                c(b3, (byte) (b3 | 52), (byte) ($$b & 348), objArr6);
                objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b(fadingEdgeLength, touchSlop, iKeyCodeFromString2, -973632554, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).get(null);
            int i = ((int[]) objArr7[2])[0];
            int i2 = ((int[]) objArr7[0])[0];
            String[] strArr = (String[]) objArr7[3];
            int[] iArr = {i2};
            int iIdentityHashCode = System.identityHashCode(this);
            int i3 = (~((-82361044) | iIdentityHashCode)) | 80218641;
            int i4 = ((((-807237240) + (i3 * 992)) + ((i3 | (~((~iIdentityHashCode) | 1743519479))) * (-496))) + ((iIdentityHashCode | 1741377077) * 496)) - 694760057;
            int i5 = (i4 << 13) ^ i4;
            int i6 = i5 ^ (i5 >>> 17);
            ((int[]) objArr[1])[0] = i6 ^ (i6 << 5);
            objArr = new Object[]{iArr, new int[1], new int[]{i}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            e(1660169653 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) - 88, (short) ((-74) - (ViewConfiguration.getTapTimeout() >> 16)), (byte) (61 - Color.red(0)), (-419626812) - ExpandableListView.getPackedPositionChild(0L), objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            e(MotionEvent.axisFromString("") + 1660169657, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) - 96, (short) ((-120) - KeyEvent.getDeadChar(0, 0)), (byte) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 4), (-419626787) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            e(Color.argb(0, 0, 0, 0) + 1660169663, (-98) - Color.green(0), (short) ((ViewConfiguration.getTouchSlop() >> 8) - 28), (byte) (View.resolveSize(0, 0) + 122), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 419626841, objArr10);
            Class<?> cls3 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            e(KeyEvent.getDeadChar(0, 0) + 1660169662, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 98, (short) ((-4) - TextUtils.lastIndexOf("", '0', 0)), (byte) ((-114) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 419626826, objArr11);
            int iIntValue = ((Integer) cls3.getMethod((String) objArr11[0], Object.class).invoke(null, this)).intValue();
            Object[] objArr12 = new Object[1];
            e(1660169608 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (-50) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (View.getDefaultSize(0, 0) - 112), (byte) ((-31) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), TextUtils.getOffsetAfter("", 0) - 419626769, objArr12);
            String str = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            e((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1660169656, (-50) - TextUtils.getTrimmedLength(""), (short) (((Process.getThreadPriority(0) + 20) >> 6) - 116), (byte) (TextUtils.indexOf("", "", 0) - 124), (ViewConfiguration.getLongPressTimeout() >> 16) - 419626706, objArr13);
            try {
                Object[] objArr14 = {applicationContext, new String[]{str, (String) objArr13[0]}, Integer.valueOf(iIntValue), 17, -694760057};
                byte[] bArr3 = $$d;
                byte b4 = bArr3[129];
                Object[] objArr15 = new Object[1];
                f(b4, bArr3[28], b4, objArr15);
                Class<?> cls4 = Class.forName((String) objArr15[0]);
                byte b5 = bArr3[29];
                byte b6 = b5;
                Object[] objArr16 = new Object[1];
                f(b5, b6, b6, objArr16);
                objArr = (Object[]) cls4.getMethod((String) objArr16[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr14);
                int i7 = ((int[]) objArr[0])[0];
                int i8 = ((int[]) objArr[2])[0];
                if (applicationContext != null) {
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(560540673);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 37567);
                        int i9 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 624;
                        int i10 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13;
                        byte b7 = $$a[24];
                        Object[] objArr17 = new Object[1];
                        c(b7, (byte) (b7 | 52), (byte) ($$b & 348), objArr17);
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b(maximumDrawingCacheSize, i9, i10, -973632554, false, (String) objArr17[0], null);
                    }
                    ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).set(null, objArr);
                    try {
                        Object[] objArr18 = new Object[1];
                        e(Color.argb(0, 0, 0, 0) + 1660169654, (-92) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (short) (TextUtils.lastIndexOf("", '0') + 114), (byte) (116 - ExpandableListView.getPackedPositionType(0L)), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 419626876, objArr18);
                        Class<?> cls5 = Class.forName((String) objArr18[0]);
                        Object[] objArr19 = new Object[1];
                        e(1660169658 - (ViewConfiguration.getTouchSlop() >> 8), (-99) - View.getDefaultSize(0, 0), (short) ((ViewConfiguration.getLongPressTimeout() >> 16) - 30), (byte) (83 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) - 419626855, objArr19);
                        long jLongValue2 = ((Long) cls5.getDeclaredMethod((String) objArr19[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(559617152);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            char cRgb = (char) (Color.rgb(0, 0, 0) + 16814783);
                            int iKeyCodeFromString3 = 625 - KeyEvent.keyCodeFromString("");
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 14;
                            byte[] bArr4 = $$a;
                            byte b8 = bArr4[24];
                            Object[] objArr20 = new Object[1];
                            c(b8, (byte) (b8 | 52), (byte) (-bArr4[17]), objArr20);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b(cRgb, iKeyCodeFromString3, keyRepeatDelay, -976899241, false, (String) objArr20[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(118372281);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                            char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 37566);
                            int iResolveSize = View.resolveSize(0, 0) + 625;
                            int iAxisFromString = 13 - MotionEvent.axisFromString("");
                            byte[] bArr5 = $$a;
                            Object[] objArr21 = new Object[1];
                            c((byte) 14, bArr5[24], (byte) (-bArr5[17]), objArr21);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b(c, iResolveSize, iAxisFromString, -477065106, false, (String) objArr21[0], null);
                        }
                        ((Field) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i11 = ((int[]) objArr[0])[0];
        int i12 = ((int[]) objArr[2])[0];
        if (i12 == i11) {
            int i13 = ((int[]) objArr[1])[0];
            int i14 = ((int[]) objArr[2])[0];
            int i15 = ((int[]) objArr[0])[0];
            String[] strArr2 = (String[]) objArr[3];
            int iIdentityHashCode2 = System.identityHashCode(this);
            int i16 = i13 + 1246116578 + (((~((~iIdentityHashCode2) | (-49472259))) | 1774265862) * (-235)) + (((~((-49472259) | iIdentityHashCode2)) | 1774265862) * (-470)) + (((~(iIdentityHashCode2 | (-36880641))) | 1761674244) * 235);
            int i17 = (i16 << 13) ^ i16;
            int i18 = i17 ^ (i17 >>> 17);
            ((int[]) objArr[1])[0] = i18 ^ (i18 << 5);
            Object[] objArr22 = {new int[]{i15}, new int[1], new int[]{i14}, strArr2};
            synchronized (this) {
                RotationProviderListener rotationProviderListener = this.journalWriter;
                if (rotationProviderListener != null) {
                    rotationProviderListener.close();
                }
                RotationProviderListener rotationProviderListenerTuitionPaymentFragmentbindingInflater1 = SurfaceViewImplementation.TuitionPaymentFragmentbindingInflater1(this.fileSystem.sink(this.journalFileTmp));
                try {
                    RotationProviderListener rotationProviderListener2 = rotationProviderListenerTuitionPaymentFragmentbindingInflater1;
                    rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(MAGIC).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                    rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(VERSION_1).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                    rotationProviderListener2.a(this.appVersion).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                    rotationProviderListener2.a(this.valueCount).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                    rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                    for (Entry entry : this.lruEntries.values()) {
                        if (entry.getCurrentEditor() != null) {
                            rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DIRTY).TuitionPaymentFragmentspecialinlinedviewModeldefault3(32);
                            rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(entry.getKey());
                            rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                        } else {
                            rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CLEAN).TuitionPaymentFragmentspecialinlinedviewModeldefault3(32);
                            rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault1(entry.getKey());
                            entry.writeLengths$okhttp(rotationProviderListener2);
                            rotationProviderListener2.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(rotationProviderListenerTuitionPaymentFragmentbindingInflater1, null);
                    if (this.fileSystem.exists(this.journalFile)) {
                        this.fileSystem.rename(this.journalFile, this.journalFileBackup);
                    }
                    this.fileSystem.rename(this.journalFileTmp, this.journalFile);
                    this.fileSystem.delete(this.journalFileBackup);
                    this.journalWriter = newJournalWriter();
                    this.hasJournalErrors = false;
                    int i19 = ((int[]) objArr22[1])[0];
                    int i20 = i19 * i19;
                    int i21 = -(509974190 * i19);
                    int i22 = (i20 & i21) + (i20 | i21);
                    int i23 = -(i19 * (-409362538));
                    int i24 = (i22 & i23) + (i23 | i22);
                    int i25 = (i24 & (-205639548)) + ((-205639548) | i24);
                    int i26 = ((i25 >> 23) - 1023) / 512;
                    int i27 = ((i26 | 1) << 1) - (i26 ^ 1);
                    int i28 = (i25 ^ i27) + ((i27 & i25) << 1);
                    int i29 = i25 >> 21;
                    int i30 = (((i29 | (-4095)) << 1) - (i29 ^ (-4095))) / 2048;
                    int i31 = (-(i28 ^ ((i30 & 1) + (i30 | 1)))) + 4;
                    int i32 = i31 >> 21;
                    this.mostRecentRebuildFailed = 0 / ((i31 & (-((((i32 & (-4095)) + (i32 | (-4095))) / 2048) + 2))) * 596);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(rotationProviderListenerTuitionPaymentFragmentbindingInflater1, th2);
                        throw th3;
                    }
                }
            }
            return;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr3 = (String[]) objArr[3];
        if (strArr3 != null) {
            for (String str2 : strArr3) {
                arrayList.add(str2);
            }
        }
        throw new RuntimeException(String.valueOf(i12));
    }

    /* JADX INFO: renamed from: okhttp3.internal.cache.DiskLruCache$snapshots$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u000b\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\u0007\u001a\u00060\u0002R\u00020\u0003H\u0097\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR&\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e*\u00060\fR\u00020\u00030\fR\u00020\u00030\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\b\u0018\u00010\u0002R\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\b\u0018\u00010\u0002R\u00020\u00038\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$snapshots$1;", "", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "", "hasNext", "()Z", "next", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "", "remove", "()V", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "delegate", "Ljava/util/Iterator;", "nextSnapshot", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "removeSnapshot"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass1 implements Iterator<Snapshot>, KMutableIterator {
        private final Iterator<Entry> delegate;
        private Snapshot nextSnapshot;
        private Snapshot removeSnapshot;

        AnonymousClass1() {
            Iterator<Entry> it = new ArrayList(DiskLruCache.this.getLruEntries$okhttp().values()).iterator();
            Intrinsics.checkNotNullExpressionValue(it, "");
            this.delegate = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            Snapshot snapshotSnapshot$okhttp;
            if (this.nextSnapshot != null) {
                return true;
            }
            DiskLruCache diskLruCache = DiskLruCache.this;
            synchronized (diskLruCache) {
                if (diskLruCache.getClosed$okhttp()) {
                    return false;
                }
                while (this.delegate.hasNext()) {
                    Entry next = this.delegate.next();
                    if (next != null && (snapshotSnapshot$okhttp = next.snapshot$okhttp()) != null) {
                        this.nextSnapshot = snapshotSnapshot$okhttp;
                        return true;
                    }
                }
                Unit unit = Unit.INSTANCE;
                return false;
            }
        }

        @Override // java.util.Iterator
        public final Snapshot next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Snapshot snapshot = this.nextSnapshot;
            this.removeSnapshot = snapshot;
            this.nextSnapshot = null;
            Intrinsics.checkNotNull(snapshot);
            return snapshot;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Snapshot snapshot = this.removeSnapshot;
            if (snapshot == null) {
                throw new IllegalStateException("remove() before next()".toString());
            }
            try {
                DiskLruCache.this.remove(snapshot.getKey());
            } catch (IOException unused) {
            } finally {
                this.removeSnapshot = null;
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0004\u0018\u00002\u00020\u0001B/\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0012\u001a\b\u0018\u00010\u0010R\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010!"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Ljava/io/Closeable;", "", "p0", "", "p1", "", "LtryToComplete;", "p2", "", "p3", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;JLjava/util/List;[J)V", "", "close", "()V", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "edit", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "getLength", "(I)J", "getSource", "(I)LtryToComplete;", "key", "()Ljava/lang/String;", "Ljava/lang/String;", "lengths", "[J", "sequenceNumber", "J", "sources", "Ljava/util/List;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Snapshot implements Closeable {
        private final String key;
        private final long[] lengths;
        private final long sequenceNumber;
        private final List<tryToComplete> sources;
        final /* synthetic */ DiskLruCache this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public Snapshot(DiskLruCache diskLruCache, String str, long j, List<? extends tryToComplete> list, long[] jArr) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(list, "");
            Intrinsics.checkNotNullParameter(jArr, "");
            this.this$0 = diskLruCache;
            this.key = str;
            this.sequenceNumber = j;
            this.sources = list;
            this.lengths = jArr;
        }

        /* JADX INFO: renamed from: key, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        public final Editor edit() throws IOException {
            return this.this$0.edit(this.key, this.sequenceNumber);
        }

        public final tryToComplete getSource(int p0) {
            return this.sources.get(p0);
        }

        public final long getLength(int p0) {
            return this.lengths[p0];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            Iterator<tryToComplete> it = this.sources.iterator();
            while (it.hasNext()) {
                Util.closeQuietly(it.next());
            }
        }
    }

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0018\n\u0002\b\u0004\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\u000b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0004\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00060\u0002R\u00020\u00038\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Editor;", "", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "Lokhttp3/internal/cache/DiskLruCache;", "p0", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Lokhttp3/internal/cache/DiskLruCache$Entry;)V", "", "abort", "()V", "commit", "detach$okhttp", "", "LSurfaceViewImplementationApi24Impl;", "newSink", "(I)LSurfaceViewImplementationApi24Impl;", "LtryToComplete;", "newSource", "(I)LtryToComplete;", "", "done", "Z", "entry", "Lokhttp3/internal/cache/DiskLruCache$Entry;", "getEntry$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "written", "[Z", "getWritten$okhttp", "()[Z"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Editor {
        private boolean done;
        private final Entry entry;
        final /* synthetic */ DiskLruCache this$0;
        private final boolean[] written;

        public Editor(DiskLruCache diskLruCache, Entry entry) {
            Intrinsics.checkNotNullParameter(entry, "");
            this.this$0 = diskLruCache;
            this.entry = entry;
            this.written = entry.getReadable() ? null : new boolean[diskLruCache.getValueCount$okhttp()];
        }

        /* JADX INFO: renamed from: getEntry$okhttp, reason: from getter */
        public final Entry getEntry() {
            return this.entry;
        }

        /* JADX INFO: renamed from: getWritten$okhttp, reason: from getter */
        public final boolean[] getWritten() {
            return this.written;
        }

        public final void detach$okhttp() throws IOException {
            if (Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                if (DiskLruCache.access$getCivilizedFileSystem$p(this.this$0)) {
                    this.this$0.completeEdit$okhttp(this, false);
                } else {
                    this.entry.setZombie$okhttp(true);
                }
            }
        }

        public final tryToComplete newSource(int p0) {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                tryToComplete trytocompleteSource = null;
                if (!this.entry.getReadable() || !Intrinsics.areEqual(this.entry.getCurrentEditor(), this) || this.entry.getZombie()) {
                    return null;
                }
                try {
                    trytocompleteSource = diskLruCache.getFileSystem$okhttp().source(this.entry.getCleanFiles$okhttp().get(p0));
                } catch (FileNotFoundException unused) {
                }
                return trytocompleteSource;
            }
        }

        public final SurfaceViewImplementationApi24Impl newSink(int p0) {
            final DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (!Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                    return SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
                if (!this.entry.getReadable()) {
                    boolean[] zArr = this.written;
                    Intrinsics.checkNotNull(zArr);
                    zArr[p0] = true;
                }
                try {
                    return new FaultHidingSink(diskLruCache.getFileSystem$okhttp().sink(this.entry.getDirtyFiles$okhttp().get(p0)), new Function1<IOException, Unit>() { // from class: okhttp3.internal.cache.DiskLruCache$Editor$newSink$1$1
                        @Override // kotlin.jvm.functions.Function1
                        public final /* bridge */ /* synthetic */ Unit invoke(IOException iOException) {
                            invoke2(iOException);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(IOException iOException) {
                            Intrinsics.checkNotNullParameter(iOException, "");
                            DiskLruCache diskLruCache2 = diskLruCache;
                            DiskLruCache.Editor editor = this;
                            synchronized (diskLruCache2) {
                                editor.detach$okhttp();
                                Unit unit = Unit.INSTANCE;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(1);
                        }
                    });
                } catch (FileNotFoundException unused) {
                    return SurfaceViewImplementation.TuitionPaymentFragmentspecialinlinedviewModeldefault3();
                }
            }
        }

        public final void commit() throws IOException {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                    diskLruCache.completeEdit$okhttp(this, true);
                }
                this.done = true;
                Unit unit = Unit.INSTANCE;
            }
        }

        public final void abort() throws IOException {
            DiskLruCache diskLruCache = this.this$0;
            synchronized (diskLruCache) {
                if (this.done) {
                    throw new IllegalStateException("Check failed.".toString());
                }
                if (Intrinsics.areEqual(this.entry.getCurrentEditor(), this)) {
                    diskLruCache.completeEdit$okhttp(this, false);
                }
                this.done = true;
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    @Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0016\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\t\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0018\u00010\u0011R\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR(\u0010\u001f\u001a\b\u0018\u00010\u001eR\u00020\u00128\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0001X\u0081\u0004¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u001dR\u001a\u0010'\u001a\u00020\u00028\u0001X\u0081\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010,\u001a\u00020+8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00100\u001a\u00020\n8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00107\u001a\u0002068\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010>\u001a\u00020=8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\"\u0010D\u001a\u0002068\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bD\u00108\u001a\u0004\bE\u0010:\"\u0004\bF\u0010<"}, d2 = {"Lokhttp3/internal/cache/DiskLruCache$Entry;", "", "", "p0", "<init>", "(Lokhttp3/internal/cache/DiskLruCache;Ljava/lang/String;)V", "", "", "invalidLengths", "(Ljava/util/List;)Ljava/lang/Void;", "", "LtryToComplete;", "newSource", "(I)LtryToComplete;", "", "setLengths$okhttp", "(Ljava/util/List;)V", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "snapshot$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "LRotationProviderListener;", "writeLengths$okhttp", "(LRotationProviderListener;)V", "", "Ljava/io/File;", "cleanFiles", "Ljava/util/List;", "getCleanFiles$okhttp", "()Ljava/util/List;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "currentEditor", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "getCurrentEditor$okhttp", "()Lokhttp3/internal/cache/DiskLruCache$Editor;", "setCurrentEditor$okhttp", "(Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "dirtyFiles", "getDirtyFiles$okhttp", "key", "Ljava/lang/String;", "getKey$okhttp", "()Ljava/lang/String;", "", "lengths", "[J", "getLengths$okhttp", "()[J", "lockingSourceCount", "I", "getLockingSourceCount$okhttp", "()I", "setLockingSourceCount$okhttp", "(I)V", "", "readable", "Z", "getReadable$okhttp", "()Z", "setReadable$okhttp", "(Z)V", "", "sequenceNumber", "J", "getSequenceNumber$okhttp", "()J", "setSequenceNumber$okhttp", "(J)V", "zombie", "getZombie$okhttp", "setZombie$okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Entry {
        private final List<File> cleanFiles;
        private Editor currentEditor;
        private final List<File> dirtyFiles;
        private final String key;
        private final long[] lengths;
        private int lockingSourceCount;
        private boolean readable;
        private long sequenceNumber;
        final /* synthetic */ DiskLruCache this$0;
        private boolean zombie;

        public Entry(DiskLruCache diskLruCache, String str) {
            Intrinsics.checkNotNullParameter(str, "");
            this.this$0 = diskLruCache;
            this.key = str;
            this.lengths = new long[diskLruCache.getValueCount$okhttp()];
            this.cleanFiles = new ArrayList();
            this.dirtyFiles = new ArrayList();
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            int valueCount$okhttp = diskLruCache.getValueCount$okhttp();
            for (int i = 0; i < valueCount$okhttp; i++) {
                sb.append(i);
                this.cleanFiles.add(new File(this.this$0.getDirectory(), sb.toString()));
                sb.append(".tmp");
                this.dirtyFiles.add(new File(this.this$0.getDirectory(), sb.toString()));
                sb.setLength(length);
            }
        }

        /* JADX INFO: renamed from: getKey$okhttp, reason: from getter */
        public final String getKey() {
            return this.key;
        }

        /* JADX INFO: renamed from: getLengths$okhttp, reason: from getter */
        public final long[] getLengths() {
            return this.lengths;
        }

        public final List<File> getCleanFiles$okhttp() {
            return this.cleanFiles;
        }

        public final List<File> getDirtyFiles$okhttp() {
            return this.dirtyFiles;
        }

        /* JADX INFO: renamed from: getReadable$okhttp, reason: from getter */
        public final boolean getReadable() {
            return this.readable;
        }

        public final void setReadable$okhttp(boolean z) {
            this.readable = z;
        }

        /* JADX INFO: renamed from: getZombie$okhttp, reason: from getter */
        public final boolean getZombie() {
            return this.zombie;
        }

        public final void setZombie$okhttp(boolean z) {
            this.zombie = z;
        }

        /* JADX INFO: renamed from: getCurrentEditor$okhttp, reason: from getter */
        public final Editor getCurrentEditor() {
            return this.currentEditor;
        }

        public final void setCurrentEditor$okhttp(Editor editor) {
            this.currentEditor = editor;
        }

        /* JADX INFO: renamed from: getLockingSourceCount$okhttp, reason: from getter */
        public final int getLockingSourceCount() {
            return this.lockingSourceCount;
        }

        public final void setLockingSourceCount$okhttp(int i) {
            this.lockingSourceCount = i;
        }

        /* JADX INFO: renamed from: getSequenceNumber$okhttp, reason: from getter */
        public final long getSequenceNumber() {
            return this.sequenceNumber;
        }

        public final void setSequenceNumber$okhttp(long j) {
            this.sequenceNumber = j;
        }

        public final void setLengths$okhttp(List<String> p0) throws IOException {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0.size() != this.this$0.getValueCount$okhttp()) {
                invalidLengths(p0);
                throw new KotlinNothingValueException();
            }
            try {
                int size = p0.size();
                for (int i = 0; i < size; i++) {
                    this.lengths[i] = Long.parseLong(p0.get(i));
                }
            } catch (NumberFormatException unused) {
                invalidLengths(p0);
                throw new KotlinNothingValueException();
            }
        }

        public final void writeLengths$okhttp(RotationProviderListener p0) throws IOException {
            Intrinsics.checkNotNullParameter(p0, "");
            for (long j : this.lengths) {
                p0.TuitionPaymentFragmentspecialinlinedviewModeldefault3(32).a(j);
            }
        }

        private final Void invalidLengths(List<String> p0) throws IOException {
            throw new IOException("unexpected journal line: ".concat(String.valueOf(p0)));
        }

        public final Snapshot snapshot$okhttp() {
            DiskLruCache diskLruCache = this.this$0;
            if (!Util.assertionsEnabled || Thread.holdsLock(diskLruCache)) {
                if (!this.readable) {
                    return null;
                }
                if (!DiskLruCache.access$getCivilizedFileSystem$p(this.this$0) && (this.currentEditor != null || this.zombie)) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                long[] jArr = (long[]) this.lengths.clone();
                try {
                    int valueCount$okhttp = this.this$0.getValueCount$okhttp();
                    for (int i = 0; i < valueCount$okhttp; i++) {
                        arrayList.add(newSource(i));
                    }
                    return new Snapshot(this.this$0, this.key, this.sequenceNumber, arrayList, jArr);
                } catch (FileNotFoundException unused) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Util.closeQuietly((tryToComplete) it.next());
                    }
                    try {
                        this.this$0.removeEntry$okhttp(this);
                    } catch (IOException unused2) {
                    }
                    return null;
                }
            }
            StringBuilder sb = new StringBuilder("Thread ");
            sb.append(Thread.currentThread().getName());
            sb.append(" MUST hold lock on ");
            sb.append(diskLruCache);
            throw new AssertionError(sb.toString());
        }

        private final tryToComplete newSource(int p0) throws FileNotFoundException {
            final tryToComplete trytocompleteSource = this.this$0.getFileSystem$okhttp().source(this.cleanFiles.get(p0));
            if (DiskLruCache.access$getCivilizedFileSystem$p(this.this$0)) {
                return trytocompleteSource;
            }
            this.lockingSourceCount++;
            final DiskLruCache diskLruCache = this.this$0;
            return new RotationProviderListenerWrapperExternalSyntheticLambda0(trytocompleteSource) { // from class: okhttp3.internal.cache.DiskLruCache$Entry$newSource$1
                private boolean closed;

                @Override // defpackage.RotationProviderListenerWrapperExternalSyntheticLambda0, defpackage.tryToComplete, java.io.Closeable, java.lang.AutoCloseable
                public final void close() throws IOException {
                    super.close();
                    if (this.closed) {
                        return;
                    }
                    this.closed = true;
                    DiskLruCache diskLruCache2 = diskLruCache;
                    DiskLruCache.Entry entry = this;
                    synchronized (diskLruCache2) {
                        entry.setLockingSourceCount$okhttp(entry.getLockingSourceCount() - 1);
                        if (entry.getLockingSourceCount() == 0 && entry.getZombie()) {
                            diskLruCache2.removeEntry$okhttp(entry);
                        }
                        Unit unit = Unit.INSTANCE;
                    }
                }
            };
        }
    }

    public final Snapshot get(String p0) throws IOException {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(p0, "");
            initialize();
            checkNotClosed();
            validateKey(p0);
            Entry entry = this.lruEntries.get(p0);
            if (entry == null) {
                return null;
            }
            Snapshot snapshotSnapshot$okhttp = entry.snapshot$okhttp();
            if (snapshotSnapshot$okhttp == null) {
                return null;
            }
            this.redundantOpCount++;
            RotationProviderListener rotationProviderListener = this.journalWriter;
            Intrinsics.checkNotNull(rotationProviderListener);
            rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(READ).TuitionPaymentFragmentspecialinlinedviewModeldefault3(32).TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
            if (journalRebuildRequired()) {
                TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            }
            return snapshotSnapshot$okhttp;
        }
    }

    public static /* synthetic */ Editor edit$default(DiskLruCache diskLruCache, String str, long j, int i, Object obj) throws IOException {
        int i2 = 2 % 2;
        int i3 = d;
        int i4 = i3 + 103;
        g = i4 % 128;
        if (i4 % 2 == 0 ? (i & 2) != 0 : (i & 3) != 0) {
            int i5 = i3 + 103;
            int i6 = i5 % 128;
            g = i6;
            int i7 = i5 % 2;
            long j2 = ANY_SEQUENCE_NUMBER;
            int i8 = i6 + 1;
            d = i8 % 128;
            int i9 = i8 % 2;
            j = j2;
        }
        return diskLruCache.edit(str, j);
    }

    public final Editor edit(String p0, long p1) throws IOException {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(p0, "");
            initialize();
            checkNotClosed();
            validateKey(p0);
            Entry entry = this.lruEntries.get(p0);
            if (p1 != ANY_SEQUENCE_NUMBER && (entry == null || entry.getSequenceNumber() != p1)) {
                return null;
            }
            if ((entry != null ? entry.getCurrentEditor() : null) != null) {
                return null;
            }
            if (entry != null && entry.getLockingSourceCount() != 0) {
                return null;
            }
            if (!this.mostRecentTrimFailed && !this.mostRecentRebuildFailed) {
                RotationProviderListener rotationProviderListener = this.journalWriter;
                Intrinsics.checkNotNull(rotationProviderListener);
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(DIRTY).TuitionPaymentFragmentspecialinlinedviewModeldefault3(32).TuitionPaymentFragmentspecialinlinedviewModeldefault1(p0).TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                rotationProviderListener.flush();
                if (this.hasJournalErrors) {
                    return null;
                }
                if (entry == null) {
                    entry = new Entry(this, p0);
                    this.lruEntries.put(p0, entry);
                }
                Editor editor = new Editor(this, entry);
                entry.setCurrentEditor$okhttp(editor);
                return editor;
            }
            TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            return null;
        }
    }

    public final long size() throws IOException {
        long j;
        synchronized (this) {
            initialize();
            j = this.size;
        }
        return j;
    }

    public final void completeEdit$okhttp(Editor p0, boolean p1) throws IOException {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(p0, "");
            Entry entry = p0.getEntry();
            if (!Intrinsics.areEqual(entry.getCurrentEditor(), p0)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            if (p1 && !entry.getReadable()) {
                int i = this.valueCount;
                for (int i2 = 0; i2 < i; i2++) {
                    boolean[] written = p0.getWritten();
                    Intrinsics.checkNotNull(written);
                    if (!written[i2]) {
                        p0.abort();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Newly created entry didn't create value for index ");
                        sb.append(i2);
                        throw new IllegalStateException(sb.toString());
                    }
                    if (!this.fileSystem.exists(entry.getDirtyFiles$okhttp().get(i2))) {
                        p0.abort();
                        return;
                    }
                }
            }
            int i3 = this.valueCount;
            for (int i4 = 0; i4 < i3; i4++) {
                File file = entry.getDirtyFiles$okhttp().get(i4);
                if (p1 && !entry.getZombie()) {
                    if (this.fileSystem.exists(file)) {
                        File file2 = entry.getCleanFiles$okhttp().get(i4);
                        this.fileSystem.rename(file, file2);
                        long j = entry.getLengths()[i4];
                        long size = this.fileSystem.size(file2);
                        entry.getLengths()[i4] = size;
                        this.size = (this.size - j) + size;
                    }
                } else {
                    this.fileSystem.delete(file);
                }
            }
            entry.setCurrentEditor$okhttp(null);
            if (entry.getZombie()) {
                removeEntry$okhttp(entry);
                return;
            }
            this.redundantOpCount++;
            RotationProviderListener rotationProviderListener = this.journalWriter;
            Intrinsics.checkNotNull(rotationProviderListener);
            if (entry.getReadable() || p1) {
                entry.setReadable$okhttp(true);
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(CLEAN).TuitionPaymentFragmentspecialinlinedviewModeldefault3(32);
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(entry.getKey());
                entry.writeLengths$okhttp(rotationProviderListener);
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
                if (p1) {
                    long j2 = this.nextSequenceNumber;
                    this.nextSequenceNumber = 1 + j2;
                    entry.setSequenceNumber$okhttp(j2);
                }
            } else {
                this.lruEntries.remove(entry.getKey());
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(REMOVE).TuitionPaymentFragmentspecialinlinedviewModeldefault3(32);
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault1(entry.getKey());
                rotationProviderListener.TuitionPaymentFragmentspecialinlinedviewModeldefault3(10);
            }
            rotationProviderListener.flush();
            if (this.size > this.maxSize || journalRebuildRequired()) {
                TaskQueue.schedule$default(this.cleanupQueue, this.cleanupTask, 0L, 2, null);
            }
        }
    }

    private final boolean journalRebuildRequired() {
        int i;
        int i2 = 2 % 2;
        int i3 = g;
        int i4 = i3 + 7;
        d = i4 % 128;
        if (i4 % 2 != 0 ? (i = this.redundantOpCount) >= 2000 : (i = this.redundantOpCount) >= 29709) {
            int i5 = i3 + 29;
            d = i5 % 128;
            if (i5 % 2 == 0) {
                this.lruEntries.size();
                throw null;
            }
            if (i >= this.lruEntries.size()) {
                int i6 = g + 63;
                d = i6 % 128;
                return i6 % 2 != 0;
            }
        }
        return false;
    }

    public final boolean remove(String p0) throws IOException {
        synchronized (this) {
            Intrinsics.checkNotNullParameter(p0, "");
            initialize();
            checkNotClosed();
            validateKey(p0);
            Entry entry = this.lruEntries.get(p0);
            if (entry == null) {
                return false;
            }
            boolean zRemoveEntry$okhttp = removeEntry$okhttp(entry);
            if (zRemoveEntry$okhttp && this.size <= this.maxSize) {
                this.mostRecentTrimFailed = false;
            }
            return zRemoveEntry$okhttp;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0057, code lost:
    
        if (r12.getCurrentEditor() != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean removeEntry$okhttp(okhttp3.internal.cache.DiskLruCache.Entry r12) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.removeEntry$okhttp(okhttp3.internal.cache.DiskLruCache$Entry):boolean");
    }

    private final void checkNotClosed() {
        synchronized (this) {
            if (this.closed) {
                throw new IllegalStateException("cache is closed".toString());
            }
        }
    }

    @Override // java.io.Flushable
    public final void flush() throws IOException {
        synchronized (this) {
            if (this.initialized) {
                checkNotClosed();
                trimToSize();
                RotationProviderListener rotationProviderListener = this.journalWriter;
                Intrinsics.checkNotNull(rotationProviderListener);
                rotationProviderListener.flush();
            }
        }
    }

    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.closed;
        }
        return z;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        Editor currentEditor;
        synchronized (this) {
            if (this.initialized && !this.closed) {
                Collection<Entry> collectionValues = this.lruEntries.values();
                Intrinsics.checkNotNullExpressionValue(collectionValues, "");
                for (Entry entry : (Entry[]) collectionValues.toArray(new Entry[0])) {
                    if (entry.getCurrentEditor() != null && (currentEditor = entry.getCurrentEditor()) != null) {
                        currentEditor.detach$okhttp();
                    }
                }
                trimToSize();
                RotationProviderListener rotationProviderListener = this.journalWriter;
                Intrinsics.checkNotNull(rotationProviderListener);
                rotationProviderListener.close();
                this.journalWriter = null;
                this.closed = true;
                return;
            }
            this.closed = true;
        }
    }

    public final void trimToSize() throws IOException {
        int i = 2 % 2;
        while (this.size > this.maxSize) {
            int i2 = g + 75;
            d = i2 % 128;
            int i3 = i2 % 2;
            if (!removeOldestEntry()) {
                int i4 = d + 93;
                g = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 94 / 0;
                    return;
                }
                return;
            }
        }
        this.mostRecentTrimFailed = false;
    }

    private final boolean removeOldestEntry() throws IOException {
        int i = 2 % 2;
        int i2 = g + 25;
        d = i2 % 128;
        int i3 = i2 % 2;
        for (Entry entry : this.lruEntries.values()) {
            int i4 = d + 45;
            g = i4 % 128;
            int i5 = i4 % 2;
            if (!entry.getZombie()) {
                Intrinsics.checkNotNullExpressionValue(entry, "");
                removeEntry$okhttp(entry);
                return true;
            }
        }
        return false;
    }

    public final void delete() throws IOException {
        int i = 2 % 2;
        int i2 = d + 113;
        g = i2 % 128;
        if (i2 % 2 == 0) {
            close();
            this.fileSystem.deleteContents(this.directory);
        } else {
            close();
            this.fileSystem.deleteContents(this.directory);
            int i3 = 30 / 0;
        }
    }

    public final void evictAll() throws IOException {
        synchronized (this) {
            initialize();
            Collection<Entry> collectionValues = this.lruEntries.values();
            Intrinsics.checkNotNullExpressionValue(collectionValues, "");
            for (Entry entry : (Entry[]) collectionValues.toArray(new Entry[0])) {
                Intrinsics.checkNotNullExpressionValue(entry, "");
                removeEntry$okhttp(entry);
            }
            this.mostRecentTrimFailed = false;
        }
    }

    public final void initialize() throws IOException {
        synchronized (this) {
            if (Util.assertionsEnabled && !Thread.holdsLock(this)) {
                StringBuilder sb = new StringBuilder("Thread ");
                sb.append(Thread.currentThread().getName());
                sb.append(" MUST hold lock on ");
                sb.append(this);
                throw new AssertionError(sb.toString());
            }
            if (this.initialized) {
                return;
            }
            if (this.fileSystem.exists(this.journalFileBackup)) {
                if (this.fileSystem.exists(this.journalFile)) {
                    this.fileSystem.delete(this.journalFileBackup);
                } else {
                    this.fileSystem.rename(this.journalFileBackup, this.journalFile);
                }
            }
            this.civilizedFileSystem = Util.isCivilized(this.fileSystem, this.journalFileBackup);
            if (this.fileSystem.exists(this.journalFile)) {
                try {
                    readJournal();
                    processJournal();
                    this.initialized = true;
                    return;
                } catch (IOException e2) {
                    Platform platform = Platform.INSTANCE.get();
                    StringBuilder sb2 = new StringBuilder("DiskLruCache ");
                    sb2.append(this.directory);
                    sb2.append(" is corrupt: ");
                    sb2.append(e2.getMessage());
                    sb2.append(", removing");
                    platform.log(sb2.toString(), 5, e2);
                    try {
                        delete();
                        this.closed = false;
                        rebuildJournal$okhttp();
                        this.initialized = true;
                    } catch (Throwable th) {
                        this.closed = false;
                        throw th;
                    }
                }
            }
            rebuildJournal$okhttp();
            this.initialized = true;
        }
    }

    private final void validateKey(String p0) throws IllegalAccessException {
        int i = 2 % 2;
        int i2 = d + 115;
        g = i2 % 128;
        if (i2 % 2 != 0) {
            LEGAL_KEY_PATTERN.matches(p0);
            throw null;
        }
        if (LEGAL_KEY_PATTERN.matches(p0)) {
            int i3 = d + 39;
            g = i3 % 128;
            int i4 = i3 % 2;
        } else {
            StringBuilder sb = new StringBuilder("keys must match regex [a-z0-9_-]{1,120}: \"");
            sb.append(p0);
            sb.append(Typography.quote);
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    public final Iterator<Snapshot> snapshots() throws IOException {
        AnonymousClass1 anonymousClass1;
        synchronized (this) {
            initialize();
            anonymousClass1 = new AnonymousClass1();
        }
        return anonymousClass1;
    }

    static {
        asBinder = 0;
        TuitionPaymentFragmentspecialinlinedviewModeldefault1();
        INSTANCE = new Companion(null);
        JOURNAL_FILE = "journal";
        JOURNAL_FILE_TEMP = "journal.tmp";
        JOURNAL_FILE_BACKUP = "journal.bkp";
        MAGIC = "libcore.io.DiskLruCache";
        VERSION_1 = "1";
        ANY_SEQUENCE_NUMBER = -1L;
        LEGAL_KEY_PATTERN = new Regex("[a-z0-9_-]{1,120}");
        CLEAN = "CLEAN";
        DIRTY = "DIRTY";
        REMOVE = "REMOVE";
        READ = "READ";
        int i = f1287a + 93;
        asBinder = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Editor edit(String str) throws IOException {
        int i = 2 % 2;
        int i2 = d + 71;
        g = i2 % 128;
        int i3 = i2 % 2;
        Intrinsics.checkNotNullParameter(str, "");
        return i3 != 0 ? edit$default(this, str, 0L, 4, null) : edit$default(this, str, 0L, 2, null);
    }

    static void TuitionPaymentFragmentspecialinlinedviewModeldefault1() {
        TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -1783651430;
        TuitionPaymentFragmentbindingInflater1 = -1934795628;
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 296128077;
        b = new byte[]{-19, -23, -32, 10, -41, -19, -14, -30, -5, 7, 6, -72, 25, 34, -85, -8, -5, -2, -17, -9, -18, 47, -109, 34, -97, -112, 43, -72, Base64.padSymbol, 44, 89, -120, -100, 34, -108, 104, 65, 113, 122, -98, -99, 63, 121, 117, 77, -122, 53, 75, 109, 79, 116, -104, 67, -66, -104, 121, 124, -94, 104, 110, -104, 109, 108, 116, -98, 110, -19, -2, 103, -107, -42, 100, 102, -2, -100, -12, -112, -113, -98, 43, 97, -102, -66, -89, -10, -9, -20, -101, -13, -100, -100, -107, 102, ByteCompanionObject.MIN_VALUE, -99, -103, -98, -97, -109, -84, 78, -107, -118, 96, -109, -98, -127, -90, 122, -78, -74, -40, 106, 105, 65, -90, 108, -78, 69, -33, -66, 121, -38, -76, 120, 105, -40, -78, 105, 121, -77, -33, -79, -74, 110, -79, 71, -34, -74, -77, 70, -89, -76, 121, -35, 68, -75, -35, -74, -76, 70, -39, -77, 108, -76, 66, 106, -74, -90, 121, -74, -37, -75, 70, -78, -73, -74, 109, -73, -91, -50, 16, 89, -5, 28, 90, 29, -49, 9, 9, 44, -57, 30, 32, -60, 16, 30, 9, 11, 31, 46, 31, -51, 30, 47, 10, -49, 29, 10, 45, -57, 31, 9, 30, 16, 20, 33, -8, 44, -6, 46, -7, 28, 28, 11, 29, 31, 8, 88, -62, 91, 29, -52, 36, 31, -8, 35, -5, 19, 20, 44, 29, 8, -26, -26, -26, -26, -26, -26, -26, -26};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static java.lang.String $$g(short r7, int r8, byte r9) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 1
            int r9 = r9 + 117
            byte[] r0 = okhttp3.internal.cache.DiskLruCache.$$c
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r9 = r7
            r3 = r8
            r4 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = -r7
            int r7 = r7 + r3
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.cache.DiskLruCache.$$g(short, int, byte):java.lang.String");
    }
}
