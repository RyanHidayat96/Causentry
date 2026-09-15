package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.InputDeviceCompat;
import androidx.database.SQLiteConnection;
import androidx.database.SQLiteDriver;
import androidx.database.db.SimpleSQLiteQuery;
import androidx.database.db.SupportSQLiteDatabase;
import androidx.database.db.SupportSQLiteOpenHelper;
import androidx.database.db.SupportSQLiteQuery;
import androidx.database.db.SupportSQLiteStatement;
import androidx.database.db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.concurrent.CloseBarrier;
import androidx.room.coroutines.RunBlockingUninterruptible_androidKt;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.support.AutoCloser;
import androidx.room.support.AutoClosingRoomOpenHelper;
import androidx.room.support.AutoClosingRoomOpenHelperFactory;
import androidx.room.support.PrePackagedCopyOpenHelper;
import androidx.room.support.PrePackagedCopyOpenHelperFactory;
import androidx.room.support.QueryInterceptorOpenHelperFactory;
import androidx.room.util.DBUtil;
import androidx.room.util.KClassUtil;
import androidx.room.util.MigrationUtil;
import com.google.android.gms.actions.SearchIntents;
import defpackage.MimeInfo;
import defpackage.VideoMimeInfoBuilder;
import defpackage.getDataSpace;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0013\b'\u0018\u0000 \u009d\u00012\u00020\u0001:\u000e\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001£\u0001\u009d\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0007\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0017¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0007\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0007¢\u0006\u0004\b\u0007\u0010\nJ#\u0010\r\u001a\u00020\f2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u000b\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u001a\u0010\u0006\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0005\u0012\u0004\u0012\u00020\u00160\u0015H\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ1\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u001a\u0010\u0006\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\t\u0012\u0004\u0012\u00020\u00160\u0015H\u0017¢\u0006\u0004\b\u001b\u0010\u001aJ(\u0010\u001d\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0004\u0018\u0001*\u00020\u001c2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001cH\u0082\b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u000fH\u0015¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0015¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H%¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020*H\u0001¢\u0006\u0004\b-\u0010,J)\u0010.\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0005\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00050\u00170\u0015H\u0015¢\u0006\u0004\b.\u0010/J)\u00100\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u00170\u0015H\u0015¢\u0006\u0004\b0\u0010/J\u001d\u00102\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u000501H\u0017¢\u0006\u0004\b2\u00103J\u001d\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\t01H\u0017¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\fH'¢\u0006\u0004\b5\u0010\u0003J+\u00109\u001a\u00020\f2\u0006\u0010\u0006\u001a\u0002062\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020807\"\u000208H\u0005¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\fH\u0016¢\u0006\u0004\b;\u0010\u0003J\u000f\u0010<\u001a\u00020\fH\u0002¢\u0006\u0004\b<\u0010\u0003J\u000f\u0010=\u001a\u00020\fH\u0017¢\u0006\u0004\b=\u0010\u0003J\u000f\u0010>\u001a\u00020\fH\u0017¢\u0006\u0004\b>\u0010\u0003JB\u0010C\u001a\u00028\u0000\"\u0004\b\u0000\u0010?2\u0006\u0010\u0006\u001a\u0002062\"\u0010\u000b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020A\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000B\u0012\u0006\u0012\u0004\u0018\u00010\u00010@H\u0080@¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u000206H\u0000¢\u0006\u0004\bE\u0010FJ+\u0010H\u001a\u00020G2\u0006\u0010\u0006\u001a\u0002082\u0012\u0010\u000b\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u000107H\u0017¢\u0006\u0004\bH\u0010IJ#\u0010H\u001a\u00020G2\u0006\u0010\u0006\u001a\u00020J2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010KH\u0017¢\u0006\u0004\bH\u0010LJ\u0017\u0010N\u001a\u00020M2\u0006\u0010\u0006\u001a\u000208H\u0017¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\fH\u0017¢\u0006\u0004\bP\u0010\u0003J\u000f\u0010Q\u001a\u00020\fH\u0002¢\u0006\u0004\bQ\u0010\u0003J\u000f\u0010R\u001a\u00020\fH\u0017¢\u0006\u0004\bR\u0010\u0003J\u000f\u0010S\u001a\u00020\fH\u0002¢\u0006\u0004\bS\u0010\u0003J\u000f\u0010T\u001a\u00020\fH\u0017¢\u0006\u0004\bT\u0010\u0003J\u0017\u0010V\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020UH\u0016¢\u0006\u0004\bV\u0010WJ#\u0010V\u001a\u00028\u0000\"\u0004\b\u0000\u0010X2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000YH\u0016¢\u0006\u0004\bV\u0010ZJ#\u0010V\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000[H\u0002¢\u0006\u0004\bV\u0010\\J\u0017\u0010^\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020]H\u0015¢\u0006\u0004\b^\u0010_J\u0017\u0010^\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020`H\u0005¢\u0006\u0004\b^\u0010aJ\u000f\u0010b\u001a\u000206H\u0016¢\u0006\u0004\bb\u0010FR\u001e\u0010c\u001a\u0004\u0018\u00010]8\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\bc\u0010d\u0012\u0004\be\u0010\u0003R\u0016\u0010f\u001a\u00020'8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\bf\u0010gR\u0016\u0010h\u001a\u00020*8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\bh\u0010iR\u0014\u0010m\u001a\u00020j8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0016\u0010n\u001a\u00020j8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010q\u001a\u00020j8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010lR\u0016\u0010r\u001a\u00020j8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\br\u0010oR\u0014\u0010u\u001a\u00020\u001c8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0016\u0010v\u001a\u00020\u00128\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\bv\u0010wR\u0014\u0010y\u001a\u00020$8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010&R\u0016\u0010z\u001a\u00020$8\u0002@\u0002X\u0083.¢\u0006\u0006\n\u0004\bz\u0010{R\u001b\u0010}\u001a\u00020|8\u0001X\u0081\u0004¢\u0006\r\n\u0004\b}\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0019\u0010\u0081\u0001\u001a\u0002068\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R)\u0010\u0084\u0001\u001a\u000b\u0012\u0005\u0012\u00030\u0083\u0001\u0018\u00010\u00178\u0004@\u0004X\u0085\u000e¢\u0006\u000f\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u0012\u0005\b\u0086\u0001\u0010\u0003R\u001c\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001R'\u0010\u008c\u0001\u001a\n\u0012\u0005\u0012\u00030\u008b\u00010\u008a\u00018GX\u0087\u0004¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001R(\u0010\u0091\u0001\u001a\u0013\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010\u0090\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R(\u0010\u0093\u0001\u001a\u0002068\u0001@\u0001X\u0081\u000e¢\u0006\u0017\n\u0006\b\u0093\u0001\u0010\u0082\u0001\u001a\u0005\b\u0094\u0001\u0010F\"\u0006\b\u0095\u0001\u0010\u0096\u0001R0\u0010\u0098\u0001\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u00170\u00158AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010/R\u0016\u0010\u0099\u0001\u001a\u0002068WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010FR\u0013\u0010\u009a\u0001\u001a\u0002068G¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010FR\u0016\u0010\u009c\u0001\u001a\u0002068AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010F"}, d2 = {"Landroidx/room/RoomDatabase;", "", "<init>", "()V", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "p0", "getTypeConverter", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lkotlin/reflect/KClass;", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "p1", "", "addTypeConverter$room_runtime_release", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)V", "Landroidx/room/DatabaseConfiguration;", "init", "(Landroidx/room/DatabaseConfiguration;)V", "Landroidx/room/RoomConnectionManager;", "createConnectionManager$room_runtime_release", "(Landroidx/room/DatabaseConfiguration;)Landroidx/room/RoomConnectionManager;", "", "Landroidx/room/migration/AutoMigrationSpec;", "", "Landroidx/room/migration/Migration;", "getAutoMigrations", "(Ljava/util/Map;)Ljava/util/List;", "createAutoMigrations", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "unwrapOpenHelper", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;)Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "createOpenHelper", "(Landroidx/room/DatabaseConfiguration;)Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/RoomOpenDelegateMarker;", "createOpenDelegate", "()Landroidx/room/RoomOpenDelegateMarker;", "Landroidx/room/InvalidationTracker;", "createInvalidationTracker", "()Landroidx/room/InvalidationTracker;", "Lkotlinx/coroutines/CoroutineScope;", "getCoroutineScope", "()Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/CoroutineContext;", "getQueryContext", "()Lkotlin/coroutines/CoroutineContext;", "getTransactionContext$room_runtime_release", "getRequiredTypeConverters", "()Ljava/util/Map;", "getRequiredTypeConverterClasses", "", "getRequiredAutoMigrationSpecs", "()Ljava/util/Set;", "getRequiredAutoMigrationSpecClasses", "clearAllTables", "", "", "", "performClear", "(Z[Ljava/lang/String;)V", "close", "onClosed", "assertNotMainThread", "assertNotSuspendingTransaction", "R", "Lkotlin/Function2;", "Landroidx/room/Transactor;", "Lkotlin/coroutines/Continuation;", "useConnection$room_runtime_release", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inCompatibilityMode$room_runtime_release", "()Z", "Landroid/database/Cursor;", SearchIntents.EXTRA_QUERY, "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "Landroid/os/CancellationSignal;", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;", "beginTransaction", "internalBeginTransaction", "endTransaction", "internalEndTransaction", "setTransactionSuccessful", "Ljava/lang/Runnable;", "runInTransaction", "(Ljava/lang/Runnable;)V", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/concurrent/Callable;", "(Ljava/util/concurrent/Callable;)Ljava/lang/Object;", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "internalInitInvalidationTracker", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "Landroidx/sqlite/SQLiteConnection;", "(Landroidx/sqlite/SQLiteConnection;)V", "inTransaction", "mDatabase", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getMDatabase$annotations", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "transactionContext", "Lkotlin/coroutines/CoroutineContext;", "Ljava/util/concurrent/Executor;", "getQueryExecutor", "()Ljava/util/concurrent/Executor;", "queryExecutor", "internalQueryExecutor", "Ljava/util/concurrent/Executor;", "getTransactionExecutor", "transactionExecutor", "internalTransactionExecutor", "getOpenHelper", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "openHelper", "connectionManager", "Landroidx/room/RoomConnectionManager;", "getInvalidationTracker", "invalidationTracker", "internalTracker", "Landroidx/room/InvalidationTracker;", "Landroidx/room/concurrent/CloseBarrier;", "closeBarrier", "Landroidx/room/concurrent/CloseBarrier;", "getCloseBarrier$room_runtime_release", "()Landroidx/room/concurrent/CloseBarrier;", "allowMainThreadQueries", "Z", "Landroidx/room/RoomDatabase$Callback;", "mCallbacks", "Ljava/util/List;", "getMCallbacks$annotations", "Landroidx/room/support/AutoCloser;", "autoCloser", "Landroidx/room/support/AutoCloser;", "Ljava/lang/ThreadLocal;", "", "suspendingTransactionId", "Ljava/lang/ThreadLocal;", "getSuspendingTransactionId", "()Ljava/lang/ThreadLocal;", "", "typeConverters", "Ljava/util/Map;", "useTempTrackingTable", "getUseTempTrackingTable$room_runtime_release", "setUseTempTrackingTable$room_runtime_release", "(Z)V", "getRequiredTypeConverterClassesMap$room_runtime_release", "requiredTypeConverterClassesMap", "isOpen", "isOpenInternal", "isMainThread$room_runtime_release", "isMainThread", "Companion", "JournalMode", "Builder", "MigrationContainer", "Callback", "PrepackagedDatabaseCallback", "QueryCallback"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class RoomDatabase {
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private AutoCloser autoCloser;
    private RoomConnectionManager connectionManager;
    private CoroutineScope coroutineScope;
    private Executor internalQueryExecutor;
    private InvalidationTracker internalTracker;
    private Executor internalTransactionExecutor;
    public List<? extends Callback> mCallbacks;
    public volatile SupportSQLiteDatabase mDatabase;
    private CoroutineContext transactionContext;
    private final CloseBarrier closeBarrier = new CloseBarrier(new RoomDatabase$closeBarrier$1(this));
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();
    private final Map<KClass<?>, Object> typeConverters = new LinkedHashMap();
    private boolean useTempTrackingTable = true;

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Landroidx/room/RoomDatabase$QueryCallback;", "", "", "p0", "", "p1", "", "onQuery", "(Ljava/lang/String;Ljava/util/List;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface QueryCallback {
        void onQuery(String p0, List<? extends Object> p1);
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This property is always null and will be removed in a future version.")
    protected static /* synthetic */ void getMCallbacks$annotations() {
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "This property is always null and will be removed in a future version.")
    protected static /* synthetic */ void getMDatabase$annotations() {
    }

    public abstract void clearAllTables();

    protected abstract InvalidationTracker createInvalidationTracker();

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public SupportSQLiteOpenHelper getOpenHelper() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            roomConnectionManager = null;
        }
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime_release = roomConnectionManager.getSupportOpenHelper$room_runtime_release();
        if (supportOpenHelper$room_runtime_release != null) {
            return supportOpenHelper$room_runtime_release;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.".toString());
    }

    public InvalidationTracker getInvalidationTracker() {
        InvalidationTracker invalidationTracker = this.internalTracker;
        if (invalidationTracker != null) {
            return invalidationTracker;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    /* JADX INFO: renamed from: getCloseBarrier$room_runtime_release, reason: from getter */
    public final CloseBarrier getCloseBarrier() {
        return this.closeBarrier;
    }

    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    /* JADX INFO: renamed from: getUseTempTrackingTable$room_runtime_release, reason: from getter */
    public final boolean getUseTempTrackingTable() {
        return this.useTempTrackingTable;
    }

    public final void setUseTempTrackingTable$room_runtime_release(boolean z) {
        this.useTempTrackingTable = z;
    }

    @Deprecated(message = "No longer called by generated implementation")
    public <T> T getTypeConverter(Class<T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return (T) this.typeConverters.get(JvmClassMappingKt.getKotlinClass(p0));
    }

    public final <T> T getTypeConverter(KClass<T> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        T t = (T) this.typeConverters.get(p0);
        Intrinsics.checkNotNull(t, "");
        return t;
    }

    public final void addTypeConverter$room_runtime_release(KClass<?> p0, Object p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        Intrinsics.checkNotNullParameter(p1, "");
        this.typeConverters.put(p0, p1);
    }

    public void init(DatabaseConfiguration p0) {
        CoroutineContext coroutineContext;
        Intrinsics.checkNotNullParameter(p0, "");
        this.useTempTrackingTable = p0.getUseTempTrackingTable();
        this.connectionManager = createConnectionManager$room_runtime_release(p0);
        this.internalTracker = createInvalidationTracker();
        RoomDatabaseKt.validateAutoMigrations(this, p0);
        RoomDatabaseKt.validateTypeConverters(this, p0);
        CoroutineScope coroutineScope = null;
        if (p0.queryCoroutineContext != null) {
            CoroutineContext.Element element = p0.queryCoroutineContext.get(ContinuationInterceptor.INSTANCE);
            Intrinsics.checkNotNull(element, "");
            CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) element;
            Executor executorB = MimeInfo.b(coroutineDispatcher);
            this.internalQueryExecutor = executorB;
            if (executorB == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                executorB = null;
            }
            this.internalTransactionExecutor = new TransactionExecutor(executorB);
            this.coroutineScope = CoroutineScopeKt.CoroutineScope(p0.queryCoroutineContext.plus(new getDataSpace((VideoMimeInfoBuilder) p0.queryCoroutineContext.get(VideoMimeInfoBuilder.b))));
            if (inCompatibilityMode$room_runtime_release()) {
                CoroutineScope coroutineScope2 = this.coroutineScope;
                if (coroutineScope2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    coroutineScope2 = null;
                }
                coroutineContext = coroutineScope2.getCoroutineContext().plus(coroutineDispatcher.limitedParallelism(1));
            } else {
                CoroutineScope coroutineScope3 = this.coroutineScope;
                if (coroutineScope3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    coroutineScope3 = null;
                }
                coroutineContext = coroutineScope3.getCoroutineContext();
            }
            this.transactionContext = coroutineContext;
        } else {
            this.internalQueryExecutor = p0.queryExecutor;
            this.internalTransactionExecutor = new TransactionExecutor(p0.transactionExecutor);
            Executor executor = this.internalQueryExecutor;
            if (executor == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                executor = null;
            }
            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(MimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(executor).plus(new getDataSpace(null)));
            this.coroutineScope = CoroutineScope;
            if (CoroutineScope == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                CoroutineScope = null;
            }
            CoroutineContext coroutineContext2 = CoroutineScope.getCoroutineContext();
            Executor executor2 = this.internalTransactionExecutor;
            if (executor2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
                executor2 = null;
            }
            this.transactionContext = coroutineContext2.plus(MimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(executor2));
        }
        this.allowMainThreadQueries = p0.allowMainThreadQueries;
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            roomConnectionManager = null;
        }
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime_release = roomConnectionManager.getSupportOpenHelper$room_runtime_release();
        if (supportOpenHelper$room_runtime_release != null) {
            while (!(supportOpenHelper$room_runtime_release instanceof PrePackagedCopyOpenHelper)) {
                if (!(supportOpenHelper$room_runtime_release instanceof DelegatingOpenHelper)) {
                    supportOpenHelper$room_runtime_release = null;
                    break;
                }
                supportOpenHelper$room_runtime_release = ((DelegatingOpenHelper) supportOpenHelper$room_runtime_release).getDelegate();
            }
        } else {
            supportOpenHelper$room_runtime_release = null;
            break;
        }
        PrePackagedCopyOpenHelper prePackagedCopyOpenHelper = (PrePackagedCopyOpenHelper) supportOpenHelper$room_runtime_release;
        if (prePackagedCopyOpenHelper != null) {
            prePackagedCopyOpenHelper.setDatabaseConfiguration(p0);
        }
        RoomConnectionManager roomConnectionManager2 = this.connectionManager;
        if (roomConnectionManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            roomConnectionManager2 = null;
        }
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime_release2 = roomConnectionManager2.getSupportOpenHelper$room_runtime_release();
        if (supportOpenHelper$room_runtime_release2 != null) {
            while (!(supportOpenHelper$room_runtime_release2 instanceof AutoClosingRoomOpenHelper)) {
                if (!(supportOpenHelper$room_runtime_release2 instanceof DelegatingOpenHelper)) {
                    supportOpenHelper$room_runtime_release2 = null;
                    break;
                }
                supportOpenHelper$room_runtime_release2 = ((DelegatingOpenHelper) supportOpenHelper$room_runtime_release2).getDelegate();
            }
        } else {
            supportOpenHelper$room_runtime_release2 = null;
            break;
        }
        AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (AutoClosingRoomOpenHelper) supportOpenHelper$room_runtime_release2;
        if (autoClosingRoomOpenHelper != null) {
            this.autoCloser = autoClosingRoomOpenHelper.getAutoCloser();
            AutoCloser autoCloser$room_runtime_release = autoClosingRoomOpenHelper.getAutoCloser();
            CoroutineScope coroutineScope4 = this.coroutineScope;
            if (coroutineScope4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                coroutineScope = coroutineScope4;
            }
            autoCloser$room_runtime_release.initCoroutineScope(coroutineScope);
            getInvalidationTracker().setAutoCloser$room_runtime_release(autoClosingRoomOpenHelper.getAutoCloser());
        }
        if (p0.multiInstanceInvalidationServiceIntent != null) {
            if (p0.name == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            getInvalidationTracker().initMultiInstanceInvalidation$room_runtime_release(p0.context, p0.name, p0.multiInstanceInvalidationServiceIntent);
        }
    }

    public final RoomConnectionManager createConnectionManager$room_runtime_release(DatabaseConfiguration p0) {
        RoomOpenDelegate roomOpenDelegate;
        Intrinsics.checkNotNullParameter(p0, "");
        try {
            RoomOpenDelegateMarker roomOpenDelegateMarkerCreateOpenDelegate = createOpenDelegate();
            Intrinsics.checkNotNull(roomOpenDelegateMarkerCreateOpenDelegate, "");
            roomOpenDelegate = (RoomOpenDelegate) roomOpenDelegateMarkerCreateOpenDelegate;
        } catch (NotImplementedError unused) {
            roomOpenDelegate = null;
        }
        if (roomOpenDelegate == null) {
            return new RoomConnectionManager(p0, (Function1<? super DatabaseConfiguration, ? extends SupportSQLiteOpenHelper>) new Function1() { // from class: androidx.room.RoomDatabase$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RoomDatabase.createConnectionManager$lambda$1(this.f$0, (DatabaseConfiguration) obj);
                }
            });
        }
        return new RoomConnectionManager(p0, roomOpenDelegate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportSQLiteOpenHelper createConnectionManager$lambda$1(RoomDatabase roomDatabase, DatabaseConfiguration databaseConfiguration) {
        Intrinsics.checkNotNullParameter(databaseConfiguration, "");
        return roomDatabase.createOpenHelper(databaseConfiguration);
    }

    @Deprecated(message = "No longer implemented by generated")
    public List<Migration> getAutoMigrations(Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return CollectionsKt.emptyList();
    }

    private final /* synthetic */ <T extends SupportSQLiteOpenHelper> T unwrapOpenHelper(SupportSQLiteOpenHelper p0) {
        if (p0 == null) {
            return null;
        }
        while (true) {
            Intrinsics.reifiedOperationMarker(3, ExifInterface.GPS_DIRECTION_TRUE);
            if (p0 instanceof SupportSQLiteOpenHelper) {
                return (T) p0;
            }
            if (!(p0 instanceof DelegatingOpenHelper)) {
                return null;
            }
            p0 = (T) ((DelegatingOpenHelper) p0).getDelegate();
        }
    }

    @Deprecated(message = "No longer implemented by generated")
    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        throw new NotImplementedError(null, 1, null);
    }

    protected RoomOpenDelegateMarker createOpenDelegate() {
        throw new NotImplementedError(null, 1, null);
    }

    public final CoroutineScope getCoroutineScope() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    public final CoroutineContext getQueryContext() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            coroutineScope = null;
        }
        return coroutineScope.getCoroutineContext();
    }

    public final CoroutineContext getTransactionContext$room_runtime_release() {
        CoroutineContext coroutineContext = this.transactionContext;
        if (coroutineContext != null) {
            return coroutineContext;
        }
        Intrinsics.throwUninitializedPropertyAccessException("");
        return null;
    }

    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return MapsKt.emptyMap();
    }

    protected Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClasses() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> setEntrySet = getRequiredTypeConverters().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            KClass kotlinClass = JvmClassMappingKt.getKotlinClass(cls);
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(JvmClassMappingKt.getKotlinClass((Class) it2.next()));
            }
            Pair pair = TuplesKt.to(kotlinClass, arrayList);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public final Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClassesMap$room_runtime_release() {
        return getRequiredTypeConverterClasses();
    }

    @Deprecated(message = "No longer implemented by generated")
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return SetsKt.emptySet();
    }

    public Set<KClass<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecClasses() {
        Set<Class<? extends AutoMigrationSpec>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(requiredAutoMigrationSpecs, 10));
        Iterator<T> it = requiredAutoMigrationSpecs.iterator();
        while (it.hasNext()) {
            arrayList.add(JvmClassMappingKt.getKotlinClass((Class) it.next()));
        }
        return CollectionsKt.toSet(arrayList);
    }

    public final void performClear(boolean p0, String... p1) {
        Intrinsics.checkNotNullParameter(p1, "");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new AnonymousClass1(p0, p1, null));
    }

    /* JADX INFO: renamed from: androidx.room.RoomDatabase$performClear$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.RoomDatabase$performClear$1", f = "RoomDatabase.android.kt", i = {}, l = {TypedValues.PositionType.TYPE_PERCENT_Y}, m = "invokeSuspend", n = {}, s = {})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean $hasForeignKeys;
        final /* synthetic */ String[] $tableNames;
        int label;

        /* JADX INFO: renamed from: androidx.room.RoomDatabase$performClear$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "connection", "Landroidx/room/Transactor;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.room.RoomDatabase$performClear$1$1", f = "RoomDatabase.android.kt", i = {0, 1, 2, 3, 4}, l = {TypedValues.PositionType.TYPE_CURVE_FIT, 509, 511, 517, 518, 519}, m = "invokeSuspend", n = {"connection", "connection", "connection", "connection", "connection"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
        static final class C01301 extends SuspendLambda implements Function2<Transactor, Continuation<? super Unit>, Object> {
            final /* synthetic */ boolean $hasForeignKeys;
            final /* synthetic */ String[] $tableNames;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RoomDatabase this$0;

            /* JADX WARN: Code duplicated, block: B:16:0x005f  */
            /* JADX WARN: Code duplicated, block: B:18:0x0073 A[PHI: r1
  0x0073: PHI (r1v6 androidx.room.Transactor) = (r1v3 androidx.room.Transactor), (r1v3 androidx.room.Transactor), (r1v8 androidx.room.Transactor) binds: [B:15:0x005d, B:17:0x0071, B:10:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:20:0x008e A[PHI: r1
  0x008e: PHI (r1v9 androidx.room.Transactor) = (r1v6 androidx.room.Transactor), (r1v11 androidx.room.Transactor) binds: [B:19:0x008c, B:9:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:22:0x009c A[PHI: r1 r7
  0x009c: PHI (r1v12 androidx.room.Transactor) = (r1v9 androidx.room.Transactor), (r1v14 androidx.room.Transactor) binds: [B:21:0x009a, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x009c: PHI (r7v16 java.lang.Object) = (r7v15 java.lang.Object), (r7v0 java.lang.Object) binds: [B:21:0x009a, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:24:0x00a4  */
            /* JADX WARN: Code duplicated, block: B:26:0x00b7 A[PHI: r1
  0x00b7: PHI (r1v15 androidx.room.Transactor) = (r1v12 androidx.room.Transactor), (r1v18 androidx.room.Transactor) binds: [B:25:0x00b5, B:7:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00c7, code lost:
            
                if (androidx.room.TransactorKt.execSQL(r1, "VACUUM", r6) == r0) goto L32;
             */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    Method dump skipped, instruction units count: 234
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.AnonymousClass1.C01301.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            /* JADX INFO: renamed from: androidx.room.RoomDatabase$performClear$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/room/TransactionScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
            @DebugMetadata(c = "androidx.room.RoomDatabase$performClear$1$1$1", f = "RoomDatabase.android.kt", i = {0, 1, 1}, l = {InputDeviceCompat.SOURCE_DPAD, 515}, m = "invokeSuspend", n = {"$this$withTransaction", "$this$withTransaction", "$this$forEach$iv"}, s = {"L$0", "L$0", "L$1"})
            static final class C01311 extends SuspendLambda implements Function2<TransactionScope<Unit>, Continuation<? super Unit>, Object> {
                final /* synthetic */ boolean $hasForeignKeys;
                final /* synthetic */ String[] $tableNames;
                int I$0;
                int I$1;
                private /* synthetic */ Object L$0;
                Object L$1;
                int label;

                /* JADX WARN: Code duplicated, block: B:16:0x0056  */
                /* JADX WARN: Code duplicated, block: B:20:0x0081  */
                /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
                
                    if (androidx.room.TransactorKt.execSQL(r1, "PRAGMA defer_foreign_keys = TRUE", r10) != r0) goto L14;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
                
                    if (androidx.room.TransactorKt.execSQL(r6, r11, r10) == r0) goto L18;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x007c -> B:19:0x007f). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        r10 = this;
                        java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r1 = r10.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L2e
                        if (r1 == r3) goto L26
                        if (r1 != r2) goto L1e
                        int r1 = r10.I$1
                        int r4 = r10.I$0
                        java.lang.Object r5 = r10.L$1
                        java.lang.String[] r5 = (java.lang.String[]) r5
                        java.lang.Object r6 = r10.L$0
                        androidx.room.TransactionScope r6 = (androidx.room.TransactionScope) r6
                        kotlin.ResultKt.throwOnFailure(r11)
                        goto L7f
                    L1e:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r0)
                        throw r11
                    L26:
                        java.lang.Object r1 = r10.L$0
                        androidx.room.TransactionScope r1 = (androidx.room.TransactionScope) r1
                        kotlin.ResultKt.throwOnFailure(r11)
                        goto L4c
                    L2e:
                        kotlin.ResultKt.throwOnFailure(r11)
                        java.lang.Object r11 = r10.L$0
                        r1 = r11
                        androidx.room.TransactionScope r1 = (androidx.room.TransactionScope) r1
                        boolean r11 = r10.$hasForeignKeys
                        if (r11 == 0) goto L4c
                        r11 = r1
                        androidx.room.PooledConnection r11 = (androidx.room.PooledConnection) r11
                        r4 = r10
                        kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
                        r10.L$0 = r1
                        r10.label = r3
                        java.lang.String r5 = "PRAGMA defer_foreign_keys = TRUE"
                        java.lang.Object r11 = androidx.room.TransactorKt.execSQL(r11, r5, r4)
                        if (r11 == r0) goto L7e
                    L4c:
                        java.lang.String[] r11 = r10.$tableNames
                        int r4 = r11.length
                        r5 = 0
                        r6 = r1
                        r1 = r4
                        r4 = r5
                        r5 = r11
                    L54:
                        if (r4 >= r1) goto L81
                        r11 = r5[r4]
                        r7 = r6
                        androidx.room.PooledConnection r7 = (androidx.room.PooledConnection) r7
                        java.lang.StringBuilder r8 = new java.lang.StringBuilder
                        java.lang.String r9 = "DELETE FROM `"
                        r8.<init>(r9)
                        r8.append(r11)
                        r11 = 96
                        r8.append(r11)
                        java.lang.String r11 = r8.toString()
                        r10.L$0 = r6
                        r10.L$1 = r5
                        r10.I$0 = r4
                        r10.I$1 = r1
                        r10.label = r2
                        java.lang.Object r11 = androidx.room.TransactorKt.execSQL(r7, r11, r10)
                        if (r11 != r0) goto L7f
                    L7e:
                        return r0
                    L7f:
                        int r4 = r4 + r3
                        goto L54
                    L81:
                        kotlin.Unit r11 = kotlin.Unit.INSTANCE
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.AnonymousClass1.C01301.C01311.invokeSuspend(java.lang.Object):java.lang.Object");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01311(boolean z, String[] strArr, Continuation<? super C01311> continuation) {
                    super(2, continuation);
                    this.$hasForeignKeys = z;
                    this.$tableNames = strArr;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C01311 c01311 = new C01311(this.$hasForeignKeys, this.$tableNames, continuation);
                    c01311.L$0 = obj;
                    return c01311;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(TransactionScope<Unit> transactionScope, Continuation<? super Unit> continuation) {
                    return ((C01311) create(transactionScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01301(RoomDatabase roomDatabase, boolean z, String[] strArr, Continuation<? super C01301> continuation) {
                super(2, continuation);
                this.this$0 = roomDatabase;
                this.$hasForeignKeys = z;
                this.$tableNames = strArr;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                C01301 c01301 = new C01301(this.this$0, this.$hasForeignKeys, this.$tableNames, continuation);
                c01301.L$0 = obj;
                return c01301;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Transactor transactor, Continuation<? super Unit> continuation) {
                return ((C01301) create(transactor, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                RoomConnectionManager roomConnectionManager = RoomDatabase.this.connectionManager;
                if (roomConnectionManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("");
                    roomConnectionManager = null;
                }
                this.label = 1;
                if (roomConnectionManager.useConnection(false, new C01301(RoomDatabase.this, this.$hasForeignKeys, this.$tableNames, null), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, String[] strArr, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$hasForeignKeys = z;
            this.$tableNames = strArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RoomDatabase.this.new AnonymousClass1(this.$hasForeignKeys, this.$tableNames, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public boolean isOpen() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser != null) {
            return autoCloser.isActive();
        }
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            roomConnectionManager = null;
        }
        return roomConnectionManager.isSupportDatabaseOpen();
    }

    public final boolean isOpenInternal() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            roomConnectionManager = null;
        }
        return roomConnectionManager.isSupportDatabaseOpen();
    }

    public void close() {
        this.closeBarrier.close$room_runtime_release();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosed() {
        CoroutineScope coroutineScope = this.coroutineScope;
        RoomConnectionManager roomConnectionManager = null;
        if (coroutineScope == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            coroutineScope = null;
        }
        CoroutineScopeKt.TuitionPaymentFragmentspecialinlinedviewModeldefault1(coroutineScope, (CancellationException) null);
        getInvalidationTracker().stop$room_runtime_release();
        RoomConnectionManager roomConnectionManager2 = this.connectionManager;
        if (roomConnectionManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        } else {
            roomConnectionManager = roomConnectionManager2;
        }
        roomConnectionManager.close();
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.".toString());
        }
    }

    public void assertNotSuspendingTransaction() {
        if (inCompatibilityMode$room_runtime_release() && !inTransaction() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.".toString());
        }
    }

    public final <R> Object useConnection$room_runtime_release(boolean z, Function2<? super Transactor, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            roomConnectionManager = null;
        }
        return roomConnectionManager.useConnection(z, function2, continuation);
    }

    public final boolean inCompatibilityMode$room_runtime_release() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            roomConnectionManager = null;
        }
        return roomConnectionManager.getSupportOpenHelper$room_runtime_release() != null;
    }

    public Cursor query(String p0, Object[] p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().query(new SimpleSQLiteQuery(p0, p1));
    }

    public static /* synthetic */ Cursor query$default(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i & 2) != 0) {
            cancellationSignal = null;
        }
        return roomDatabase.query(supportSQLiteQuery, cancellationSignal);
    }

    public Cursor query(SupportSQLiteQuery p0, CancellationSignal p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (p1 != null) {
            return getOpenHelper().getWritableDatabase().query(p0, p1);
        }
        return getOpenHelper().getWritableDatabase().query(p0);
    }

    public SupportSQLiteStatement compileStatement(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().compileStatement(p0);
    }

    @Deprecated(message = "beginTransaction() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void beginTransaction() {
        assertNotMainThread();
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            internalBeginTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.RoomDatabase$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RoomDatabase.beginTransaction$lambda$8(this.f$0, (SupportSQLiteDatabase) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit beginTransaction$lambda$8(RoomDatabase roomDatabase, SupportSQLiteDatabase supportSQLiteDatabase) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
        roomDatabase.internalBeginTransaction();
        return Unit.INSTANCE;
    }

    private final void internalBeginTransaction() {
        assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = getOpenHelper().getWritableDatabase();
        if (!writableDatabase.inTransaction()) {
            getInvalidationTracker().syncBlocking$room_runtime_release();
        }
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    @Deprecated(message = "endTransaction() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void endTransaction() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            internalEndTransaction();
        } else {
            autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.RoomDatabase$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RoomDatabase.endTransaction$lambda$9(this.f$0, (SupportSQLiteDatabase) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit endTransaction$lambda$9(RoomDatabase roomDatabase, SupportSQLiteDatabase supportSQLiteDatabase) {
        Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
        roomDatabase.internalEndTransaction();
        return Unit.INSTANCE;
    }

    private final void internalEndTransaction() {
        getOpenHelper().getWritableDatabase().endTransaction();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().refreshVersionsAsync();
    }

    @Deprecated(message = "setTransactionSuccessful() is deprecated", replaceWith = @ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().setTransactionSuccessful();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runInTransaction$lambda$10(Runnable runnable) {
        runnable.run();
        return Unit.INSTANCE;
    }

    public void runInTransaction(final Runnable p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        runInTransaction(new Function0() { // from class: androidx.room.RoomDatabase$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RoomDatabase.runInTransaction$lambda$10(p0);
            }
        });
    }

    public <V> V runInTransaction(final Callable<V> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return (V) runInTransaction(new Function0() { // from class: androidx.room.RoomDatabase$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return p0.call();
            }
        });
    }

    private final <T> T runInTransaction(final Function0<? extends T> p0) {
        if (inCompatibilityMode$room_runtime_release()) {
            beginTransaction();
            try {
                T tInvoke = p0.invoke();
                setTransactionSuccessful();
                return tInvoke;
            } finally {
                endTransaction();
            }
        }
        return (T) DBUtil.performBlocking(this, false, true, new Function1() { // from class: androidx.room.RoomDatabase$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomDatabase.runInTransaction$lambda$12(p0, (SQLiteConnection) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object runInTransaction$lambda$12(Function0 function0, SQLiteConnection sQLiteConnection) {
        Intrinsics.checkNotNullParameter(sQLiteConnection, "");
        return function0.invoke();
    }

    @Deprecated(message = "No longer called by generated")
    public void internalInitInvalidationTracker(SupportSQLiteDatabase p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        internalInitInvalidationTracker(new SupportSQLiteConnection(p0));
    }

    public final void internalInitInvalidationTracker(SQLiteConnection p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        getInvalidationTracker().internalInit$room_runtime_release(p0);
    }

    public boolean inTransaction() {
        return isOpenInternal() && getOpenHelper().getWritableDatabase().inTransaction();
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n"}, d2 = {"Landroidx/room/RoomDatabase$JournalMode;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/content/Context;", "p0", "resolve$room_runtime_release", "(Landroid/content/Context;)Landroidx/room/RoomDatabase$JournalMode;", "AUTOMATIC", "TRUNCATE", "WRITE_AHEAD_LOGGING"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public enum JournalMode {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.enumEntries(values());

        public final JournalMode resolve$room_runtime_release(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = p0.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            if (activityManager != null && !activityManager.isLowRamDevice()) {
                return WRITE_AHEAD_LOGGING;
            }
            return TRUNCATE;
        }

        public static EnumEntries<JournalMode> getEntries() {
            return $ENTRIES;
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0010\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B9\b\u0011\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB)\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\n\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\f\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0010\u0010\u0013J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0015\u0010\u0017J#\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u0007\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u001a\u0010\u001cJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u001dH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0 \"\u00020!H\u0017¢\u0006\u0004\b\"\u0010#J\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020$H\u0017¢\u0006\u0004\b%\u0010&J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0017¢\u0006\u0004\b'\u0010(J\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020)H\u0017¢\u0006\u0004\b*\u0010+J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020,H\u0017¢\u0006\u0004\b-\u0010.J\u001d\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020,H\u0017¢\u0006\u0004\b/\u0010.J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0017¢\u0006\u0004\b0\u0010(J\u001d\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u000201H\u0017¢\u0006\u0004\b2\u00103J\u0015\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0017¢\u0006\u0004\b4\u0010(J\u001d\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u000205H\u0007¢\u0006\u0004\b4\u00106J\u0015\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0017¢\u0006\u0004\b7\u0010(J\u001d\u00107\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u000205H\u0007¢\u0006\u0004\b7\u00106J!\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010\u0005\u001a\u000208\"\u000209H\u0017¢\u0006\u0004\b:\u0010;J)\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u0002052\n\u0010\u0007\u001a\u000208\"\u000209H\u0017¢\u0006\u0004\b:\u0010<J\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020=H\u0017¢\u0006\u0004\b>\u0010?J%\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020@2\u0006\u0010\u0007\u001a\u00020,H\u0017¢\u0006\u0004\bA\u0010BJ%\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020C2\u0006\u0010\u0007\u001a\u00020@H\u0007¢\u0006\u0004\bA\u0010DJ\u001d\u0010E\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0017¢\u0006\u0004\bE\u0010FJ%\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020G2\u0006\u0010\u0007\u001a\u00020HH\u0017¢\u0006\u0004\bI\u0010JJ\u001d\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020KH\u0007¢\u0006\u0004\bL\u0010MJ\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020CH\u0007¢\u0006\u0004\bN\u0010OJ\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u000205H\u0007¢\u0006\u0004\bP\u00106J\u000f\u0010Q\u001a\u00028\u0000H\u0017¢\u0006\u0004\bQ\u0010RR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010U\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u0004\u0018\u00010\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u001c\u0010Y\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020=0[8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010^\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010`\u001a\u0004\u0018\u00010@8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010b\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0018\u0010d\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020\u00030[8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bf\u0010]R\u0018\u0010g\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bg\u0010cR\u0018\u0010h\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bh\u0010cR\u0018\u0010i\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bi\u0010jR\u0016\u0010'\u001a\u0002058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b'\u0010kR\u0016\u0010l\u001a\u00020)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bl\u0010mR\u0018\u0010n\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010p\u001a\u00020G8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010r\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0014\u0010u\u001a\u00020t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u001c\u0010x\u001a\b\u0012\u0004\u0012\u0002090w8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bx\u0010yR\u001a\u0010z\u001a\b\u0012\u0004\u0012\u0002090w8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bz\u0010yR\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020$0[8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b{\u0010]R\u0016\u0010|\u001a\u0002058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b|\u0010kR\u0016\u0010}\u001a\u0002058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b}\u0010kR\u0016\u0010~\u001a\u0002058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b~\u0010kR\u0018\u0010\u007f\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010XR\u001b\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R!\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u001a\u0010\u0086\u0001\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010eR\u0018\u0010\u0087\u0001\u001a\u0002058\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010k"}, d2 = {"Landroidx/room/RoomDatabase$Builder;", "Landroidx/room/RoomDatabase;", ExifInterface.GPS_DIRECTION_TRUE, "", "Lkotlin/reflect/KClass;", "p0", "", "p1", "Lkotlin/Function0;", "p2", "Landroid/content/Context;", "p3", "<init>", "(Lkotlin/reflect/KClass;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroid/content/Context;)V", "Ljava/lang/Class;", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V", "createFromAsset", "(Ljava/lang/String;)Landroidx/room/RoomDatabase$Builder;", "Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "(Ljava/lang/String;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;)Landroidx/room/RoomDatabase$Builder;", "Ljava/io/File;", "createFromFile", "(Ljava/io/File;)Landroidx/room/RoomDatabase$Builder;", "(Ljava/io/File;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;)Landroidx/room/RoomDatabase$Builder;", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "createFromInputStream", "(Ljava/util/concurrent/Callable;)Landroidx/room/RoomDatabase$Builder;", "(Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;)Landroidx/room/RoomDatabase$Builder;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "openHelperFactory", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;)Landroidx/room/RoomDatabase$Builder;", "", "Landroidx/room/migration/Migration;", "addMigrations", "([Landroidx/room/migration/Migration;)Landroidx/room/RoomDatabase$Builder;", "Landroidx/room/migration/AutoMigrationSpec;", "addAutoMigrationSpec", "(Landroidx/room/migration/AutoMigrationSpec;)Landroidx/room/RoomDatabase$Builder;", "allowMainThreadQueries", "()Landroidx/room/RoomDatabase$Builder;", "Landroidx/room/RoomDatabase$JournalMode;", "setJournalMode", "(Landroidx/room/RoomDatabase$JournalMode;)Landroidx/room/RoomDatabase$Builder;", "Ljava/util/concurrent/Executor;", "setQueryExecutor", "(Ljava/util/concurrent/Executor;)Landroidx/room/RoomDatabase$Builder;", "setTransactionExecutor", "enableMultiInstanceInvalidation", "Landroid/content/Intent;", "setMultiInstanceInvalidationServiceIntent", "(Landroid/content/Intent;)Landroidx/room/RoomDatabase$Builder;", "fallbackToDestructiveMigration", "", "(Z)Landroidx/room/RoomDatabase$Builder;", "fallbackToDestructiveMigrationOnDowngrade", "", "", "fallbackToDestructiveMigrationFrom", "([I)Landroidx/room/RoomDatabase$Builder;", "(Z[I)Landroidx/room/RoomDatabase$Builder;", "Landroidx/room/RoomDatabase$Callback;", "addCallback", "(Landroidx/room/RoomDatabase$Callback;)Landroidx/room/RoomDatabase$Builder;", "Landroidx/room/RoomDatabase$QueryCallback;", "setQueryCallback", "(Landroidx/room/RoomDatabase$QueryCallback;Ljava/util/concurrent/Executor;)Landroidx/room/RoomDatabase$Builder;", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/CoroutineContext;Landroidx/room/RoomDatabase$QueryCallback;)Landroidx/room/RoomDatabase$Builder;", "addTypeConverter", "(Ljava/lang/Object;)Landroidx/room/RoomDatabase$Builder;", "", "Ljava/util/concurrent/TimeUnit;", "setAutoCloseTimeout", "(JLjava/util/concurrent/TimeUnit;)Landroidx/room/RoomDatabase$Builder;", "Landroidx/sqlite/SQLiteDriver;", "setDriver", "(Landroidx/sqlite/SQLiteDriver;)Landroidx/room/RoomDatabase$Builder;", "setQueryCoroutineContext", "(Lkotlin/coroutines/CoroutineContext;)Landroidx/room/RoomDatabase$Builder;", "setInMemoryTrackingMode", "build", "()Landroidx/room/RoomDatabase;", "klass", "Lkotlin/reflect/KClass;", "context", "Landroid/content/Context;", "name", "Ljava/lang/String;", "factory", "Lkotlin/jvm/functions/Function0;", "", "callbacks", "Ljava/util/List;", "prepackagedDatabaseCallback", "Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "queryCallback", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallbackExecutor", "Ljava/util/concurrent/Executor;", "queryCallbackCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "typeConverters", "queryExecutor", "transactionExecutor", "supportOpenHelperFactory", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "Z", "journalMode", "Landroidx/room/RoomDatabase$JournalMode;", "multiInstanceInvalidationIntent", "Landroid/content/Intent;", "autoCloseTimeout", "J", "autoCloseTimeUnit", "Ljava/util/concurrent/TimeUnit;", "Landroidx/room/RoomDatabase$MigrationContainer;", "migrationContainer", "Landroidx/room/RoomDatabase$MigrationContainer;", "", "migrationsNotRequiredFrom", "Ljava/util/Set;", "migrationStartAndEndVersions", "autoMigrationSpecs", "requireMigration", "allowDestructiveMigrationOnDowngrade", "allowDestructiveMigrationForAllTables", "copyFromAssetPath", "copyFromFile", "Ljava/io/File;", "copyFromInputStream", "Ljava/util/concurrent/Callable;", "driver", "Landroidx/sqlite/SQLiteDriver;", "queryCoroutineContext", "inMemoryTrackingTableMode"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class Builder<T extends RoomDatabase> {
        private boolean allowDestructiveMigrationForAllTables;
        private boolean allowDestructiveMigrationOnDowngrade;
        private boolean allowMainThreadQueries;
        private TimeUnit autoCloseTimeUnit;
        private long autoCloseTimeout;
        private final List<AutoMigrationSpec> autoMigrationSpecs;
        private final List<Callback> callbacks;
        private final Context context;
        private String copyFromAssetPath;
        private File copyFromFile;
        private Callable<InputStream> copyFromInputStream;
        private SQLiteDriver driver;
        private final Function0<T> factory;
        private boolean inMemoryTrackingTableMode;
        private JournalMode journalMode;
        private final KClass<T> klass;
        private final MigrationContainer migrationContainer;
        private final Set<Integer> migrationStartAndEndVersions;
        private Set<Integer> migrationsNotRequiredFrom;
        private Intent multiInstanceInvalidationIntent;
        private final String name;
        private PrepackagedDatabaseCallback prepackagedDatabaseCallback;
        private QueryCallback queryCallback;
        private CoroutineContext queryCallbackCoroutineContext;
        private Executor queryCallbackExecutor;
        private CoroutineContext queryCoroutineContext;
        private Executor queryExecutor;
        private boolean requireMigration;
        private SupportSQLiteOpenHelper.Factory supportOpenHelperFactory;
        private Executor transactionExecutor;
        private final List<Object> typeConverters;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder(KClass<T> kClass, String str, Function0<? extends T> function0, Context context) {
            Intrinsics.checkNotNullParameter(kClass, "");
            Intrinsics.checkNotNullParameter(context, "");
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.journalMode = JournalMode.AUTOMATIC;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new MigrationContainer();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
            this.migrationStartAndEndVersions = new LinkedHashSet();
            this.autoMigrationSpecs = new ArrayList();
            this.requireMigration = true;
            this.inMemoryTrackingTableMode = true;
            this.klass = kClass;
            this.context = context;
            this.name = str;
            this.factory = function0;
        }

        public Builder(Context context, Class<T> cls, String str) {
            Intrinsics.checkNotNullParameter(context, "");
            Intrinsics.checkNotNullParameter(cls, "");
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.journalMode = JournalMode.AUTOMATIC;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new MigrationContainer();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
            this.migrationStartAndEndVersions = new LinkedHashSet();
            this.autoMigrationSpecs = new ArrayList();
            this.requireMigration = true;
            this.inMemoryTrackingTableMode = true;
            this.klass = JvmClassMappingKt.getKotlinClass(cls);
            this.context = context;
            this.name = str;
            this.factory = null;
        }

        public Builder<T> createFromAsset(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.copyFromAssetPath = p0;
            return this;
        }

        public Builder<T> createFromAsset(String p0, PrepackagedDatabaseCallback p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.prepackagedDatabaseCallback = p1;
            this.copyFromAssetPath = p0;
            return this;
        }

        public Builder<T> createFromFile(File p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.copyFromFile = p0;
            return this;
        }

        public Builder<T> createFromFile(File p0, PrepackagedDatabaseCallback p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.prepackagedDatabaseCallback = p1;
            this.copyFromFile = p0;
            return this;
        }

        public Builder<T> createFromInputStream(Callable<InputStream> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.copyFromInputStream = p0;
            return this;
        }

        public Builder<T> createFromInputStream(Callable<InputStream> p0, PrepackagedDatabaseCallback p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.prepackagedDatabaseCallback = p1;
            this.copyFromInputStream = p0;
            return this;
        }

        public Builder<T> openHelperFactory(SupportSQLiteOpenHelper.Factory p0) {
            this.supportOpenHelperFactory = p0;
            return this;
        }

        public Builder<T> addMigrations(Migration... p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            for (Migration migration : p0) {
                this.migrationStartAndEndVersions.add(Integer.valueOf(migration.startVersion));
                this.migrationStartAndEndVersions.add(Integer.valueOf(migration.endVersion));
            }
            this.migrationContainer.addMigrations((Migration[]) Arrays.copyOf(p0, p0.length));
            return this;
        }

        public Builder<T> addAutoMigrationSpec(AutoMigrationSpec p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.autoMigrationSpecs.add(p0);
            return this;
        }

        public Builder<T> allowMainThreadQueries() {
            this.allowMainThreadQueries = true;
            return this;
        }

        public Builder<T> setJournalMode(JournalMode p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.journalMode = p0;
            return this;
        }

        public Builder<T> setQueryExecutor(Executor p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (this.queryCoroutineContext != null) {
                throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.".toString());
            }
            this.queryExecutor = p0;
            return this;
        }

        public Builder<T> setTransactionExecutor(Executor p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (this.queryCoroutineContext != null) {
                throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.".toString());
            }
            this.transactionExecutor = p0;
            return this;
        }

        public Builder<T> enableMultiInstanceInvalidation() {
            this.multiInstanceInvalidationIntent = this.name != null ? new Intent(this.context, (Class<?>) MultiInstanceInvalidationService.class) : null;
            return this;
        }

        public Builder<T> setMultiInstanceInvalidationServiceIntent(Intent p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (this.name == null) {
                p0 = null;
            }
            this.multiInstanceInvalidationIntent = p0;
            return this;
        }

        @Deprecated(message = "Replace by overloaded version with parameter to indicate if all tables should be dropped or not.", replaceWith = @ReplaceWith(expression = "fallbackToDestructiveMigration(false)", imports = {}))
        public Builder<T> fallbackToDestructiveMigration() {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public final Builder<T> fallbackToDestructiveMigration(boolean p0) {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            this.allowDestructiveMigrationForAllTables = p0;
            return this;
        }

        @Deprecated(message = "Replace by overloaded version with parameter to indicate if all tables should be dropped or not.", replaceWith = @ReplaceWith(expression = "fallbackToDestructiveMigrationOnDowngrade(false)", imports = {}))
        public Builder<T> fallbackToDestructiveMigrationOnDowngrade() {
            this.requireMigration = true;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public final Builder<T> fallbackToDestructiveMigrationOnDowngrade(boolean p0) {
            this.requireMigration = true;
            this.allowDestructiveMigrationOnDowngrade = true;
            this.allowDestructiveMigrationForAllTables = p0;
            return this;
        }

        @Deprecated(message = "Replace by overloaded version with parameter to indicate if all tables should be dropped or not.", replaceWith = @ReplaceWith(expression = "fallbackToDestructiveMigrationFrom(false, startVersions)", imports = {}))
        public Builder<T> fallbackToDestructiveMigrationFrom(int... p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            for (int i : p0) {
                this.migrationsNotRequiredFrom.add(Integer.valueOf(i));
            }
            return this;
        }

        public Builder<T> fallbackToDestructiveMigrationFrom(boolean p0, int... p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            for (int i : p1) {
                this.migrationsNotRequiredFrom.add(Integer.valueOf(i));
            }
            this.allowDestructiveMigrationForAllTables = p0;
            return this;
        }

        public Builder<T> addCallback(Callback p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.callbacks.add(p0);
            return this;
        }

        public Builder<T> setQueryCallback(QueryCallback p0, Executor p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.queryCallback = p0;
            this.queryCallbackExecutor = p1;
            this.queryCallbackCoroutineContext = null;
            return this;
        }

        public final Builder<T> setQueryCallback(CoroutineContext p0, QueryCallback p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.queryCallback = p1;
            this.queryCallbackExecutor = null;
            this.queryCallbackCoroutineContext = p0;
            return this;
        }

        public Builder<T> addTypeConverter(Object p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.typeConverters.add(p0);
            return this;
        }

        public Builder<T> setAutoCloseTimeout(long p0, TimeUnit p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            if (p0 < 0) {
                throw new IllegalArgumentException("autoCloseTimeout must be >= 0".toString());
            }
            this.autoCloseTimeout = p0;
            this.autoCloseTimeUnit = p1;
            return this;
        }

        public final Builder<T> setDriver(SQLiteDriver p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.driver = p0;
            return this;
        }

        public final Builder<T> setQueryCoroutineContext(CoroutineContext p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (this.queryExecutor != null || this.transactionExecutor != null) {
                throw new IllegalArgumentException("This builder has already been configured with an Executor. A RoomDatabase canonly be configured with either an Executor or a CoroutineContext.".toString());
            }
            if (p0.get(ContinuationInterceptor.INSTANCE) == null) {
                throw new IllegalArgumentException("It is required that the coroutine context contain a dispatcher.".toString());
            }
            this.queryCoroutineContext = p0;
            return this;
        }

        public final Builder<T> setInMemoryTrackingMode(boolean p0) {
            this.inMemoryTrackingTableMode = p0;
            return this;
        }

        public T build() {
            QueryInterceptorOpenHelperFactory queryInterceptorOpenHelperFactory;
            SupportSQLiteOpenHelper.Factory factory;
            T tInvoke;
            CoroutineDispatcher coroutineDispatcher;
            CoroutineDispatcher coroutineDispatcherTuitionPaymentFragmentspecialinlinedviewModeldefault2;
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
                this.transactionExecutor = iOThreadExecutor;
                this.queryExecutor = iOThreadExecutor;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            RoomDatabaseKt.validateMigrationsNotRequired(this.migrationStartAndEndVersions, this.migrationsNotRequiredFrom);
            SQLiteDriver sQLiteDriver = this.driver;
            if (sQLiteDriver == null && this.supportOpenHelperFactory == null) {
                queryInterceptorOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
            } else if (sQLiteDriver == null) {
                queryInterceptorOpenHelperFactory = this.supportOpenHelperFactory;
            } else {
                if (this.supportOpenHelperFactory != null) {
                    throw new IllegalArgumentException("A RoomDatabase cannot be configured with both a SQLiteDriver and a SupportOpenHelper.Factory.");
                }
                queryInterceptorOpenHelperFactory = null;
            }
            long j = this.autoCloseTimeout;
            boolean z = j > 0;
            boolean z2 = (this.copyFromAssetPath == null && this.copyFromFile == null && this.copyFromInputStream == null) ? false : true;
            boolean z3 = this.queryCallback != null;
            if (queryInterceptorOpenHelperFactory != null) {
                if (z) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.".toString());
                    }
                    TimeUnit timeUnit = this.autoCloseTimeUnit;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                    queryInterceptorOpenHelperFactory = new AutoClosingRoomOpenHelperFactory(queryInterceptorOpenHelperFactory, new AutoCloser(j, timeUnit, null, 4, null));
                }
                if (z2) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.".toString());
                    }
                    String str = this.copyFromAssetPath;
                    int i = str == null ? 0 : 1;
                    File file = this.copyFromFile;
                    int i2 = file == null ? 0 : 1;
                    Callable<InputStream> callable = this.copyFromInputStream;
                    if (i + i2 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.".toString());
                    }
                    queryInterceptorOpenHelperFactory = new PrePackagedCopyOpenHelperFactory(str, file, callable, queryInterceptorOpenHelperFactory);
                }
                if (z3) {
                    Executor executor2 = this.queryCallbackExecutor;
                    if (executor2 == null || (coroutineDispatcherTuitionPaymentFragmentspecialinlinedviewModeldefault2 = MimeInfo.TuitionPaymentFragmentspecialinlinedviewModeldefault2(executor2)) == null) {
                        coroutineDispatcher = this.queryCallbackCoroutineContext;
                        if (coroutineDispatcher == null) {
                            throw new IllegalArgumentException("Required value was null.".toString());
                        }
                    } else {
                        coroutineDispatcher = coroutineDispatcherTuitionPaymentFragmentspecialinlinedviewModeldefault2;
                    }
                    CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineDispatcher);
                    QueryCallback queryCallback = this.queryCallback;
                    if (queryCallback != null) {
                        queryInterceptorOpenHelperFactory = new QueryInterceptorOpenHelperFactory(queryInterceptorOpenHelperFactory, CoroutineScope, queryCallback);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                factory = queryInterceptorOpenHelperFactory;
            } else {
                factory = null;
            }
            if (factory == null) {
                if (z) {
                    throw new IllegalArgumentException("Auto Closing Database is not supported when an SQLiteDriver is configured.".toString());
                }
                if (z2) {
                    throw new IllegalArgumentException("Pre-Package Database is not supported when an SQLiteDriver is configured.".toString());
                }
                if (z3) {
                    throw new IllegalArgumentException("Query Callback is not supported when an SQLiteDriver is configured.".toString());
                }
            }
            Context context = this.context;
            String str2 = this.name;
            MigrationContainer migrationContainer = this.migrationContainer;
            List<Callback> list = this.callbacks;
            boolean z4 = this.allowMainThreadQueries;
            JournalMode journalModeResolve$room_runtime_release = this.journalMode.resolve$room_runtime_release(context);
            Executor executor3 = this.queryExecutor;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            }
            Executor executor4 = this.transactionExecutor;
            if (executor4 != null) {
                DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, str2, factory, migrationContainer, list, z4, journalModeResolve$room_runtime_release, executor3, executor4, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, this.prepackagedDatabaseCallback, this.typeConverters, this.autoMigrationSpecs, this.allowDestructiveMigrationForAllTables, this.driver, this.queryCoroutineContext);
                databaseConfiguration.setUseTempTrackingTable$room_runtime_release(this.inMemoryTrackingTableMode);
                Function0<T> function0 = this.factory;
                if (function0 == null || (tInvoke = function0.invoke()) == null) {
                    tInvoke = (T) KClassUtil.findAndInstantiateDatabaseImpl$default(JvmClassMappingKt.getJavaClass((KClass) this.klass), null, 2, null);
                }
                tInvoke.init(databaseConfiguration);
                return tInvoke;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\nH\u0016¢\u0006\u0004\b\b\u0010\u000bJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e0\u000eH\u0017¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001a\u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0019\u0018\u00010\u00182\u0006\u0010\u0006\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010\u001c\u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0019\u0018\u00010\u00182\u0006\u0010\u0006\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001c\u0010\u001bR,\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u000f\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00050\u001e0\u001d8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 "}, d2 = {"Landroidx/room/RoomDatabase$MigrationContainer;", "", "<init>", "()V", "", "Landroidx/room/migration/Migration;", "p0", "", "addMigrations", "([Landroidx/room/migration/Migration;)V", "", "(Ljava/util/List;)V", "addMigration", "(Landroidx/room/migration/Migration;)V", "", "", "getMigrations", "()Ljava/util/Map;", "p1", "findMigrationPath", "(II)Ljava/util/List;", "", "contains", "(II)Z", "Lkotlin/Pair;", "", "getSortedNodes$room_runtime_release", "(I)Lkotlin/Pair;", "getSortedDescendingNodes$room_runtime_release", "", "Ljava/util/TreeMap;", "migrations", "Ljava/util/Map;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class MigrationContainer {
        private final Map<Integer, TreeMap<Integer, Migration>> migrations = new LinkedHashMap();

        public void addMigrations(List<? extends Migration> p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Iterator<T> it = p0.iterator();
            while (it.hasNext()) {
                addMigration((Migration) it.next());
            }
        }

        public final void addMigration(Migration p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            int i = p0.startVersion;
            int i2 = p0.endVersion;
            Map<Integer, TreeMap<Integer, Migration>> map = this.migrations;
            Integer numValueOf = Integer.valueOf(i);
            TreeMap<Integer, Migration> treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(numValueOf, treeMap);
            }
            TreeMap<Integer, Migration> treeMap2 = treeMap;
            TreeMap<Integer, Migration> treeMap3 = treeMap2;
            if (treeMap3.containsKey(Integer.valueOf(i2))) {
                Objects.toString(treeMap2.get(Integer.valueOf(i2)));
                Objects.toString(p0);
            }
            treeMap3.put(Integer.valueOf(i2), p0);
        }

        public Map<Integer, Map<Integer, Migration>> getMigrations() {
            return this.migrations;
        }

        public List<Migration> findMigrationPath(int p0, int p1) {
            return MigrationUtil.findMigrationPath(this, p0, p1);
        }

        public final boolean contains(int p0, int p1) {
            return MigrationUtil.contains(this, p0, p1);
        }

        public final Pair<Map<Integer, Migration>, Iterable<Integer>> getSortedNodes$room_runtime_release(int p0) {
            TreeMap<Integer, Migration> treeMap = this.migrations.get(Integer.valueOf(p0));
            if (treeMap == null) {
                return null;
            }
            return TuplesKt.to(treeMap, treeMap.keySet());
        }

        public final Pair<Map<Integer, Migration>, Iterable<Integer>> getSortedDescendingNodes$room_runtime_release(int p0) {
            TreeMap<Integer, Migration> treeMap = this.migrations.get(Integer.valueOf(p0));
            if (treeMap == null) {
                return null;
            }
            return TuplesKt.to(treeMap, treeMap.descendingKeySet());
        }

        public void addMigrations(Migration... p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            for (Migration migration : p0) {
                addMigration(migration);
            }
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0007\u0010\nJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\n"}, d2 = {"Landroidx/room/RoomDatabase$Callback;", "", "<init>", "()V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "p0", "", "onCreate", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "Landroidx/sqlite/SQLiteConnection;", "(Landroidx/sqlite/SQLiteConnection;)V", "onDestructiveMigration", "onOpen"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Callback {
        public void onCreate(SQLiteConnection p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0 instanceof SupportSQLiteConnection) {
                onCreate(((SupportSQLiteConnection) p0).getDb());
            }
        }

        public void onDestructiveMigration(SQLiteConnection p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0 instanceof SupportSQLiteConnection) {
                onDestructiveMigration(((SupportSQLiteConnection) p0).getDb());
            }
        }

        public void onOpen(SQLiteConnection p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (p0 instanceof SupportSQLiteConnection) {
                onOpen(((SupportSQLiteConnection) p0).getDb());
            }
        }

        public void onCreate(SupportSQLiteDatabase p0) {
            Intrinsics.checkNotNullParameter(p0, "");
        }

        public void onDestructiveMigration(SupportSQLiteDatabase p0) {
            Intrinsics.checkNotNullParameter(p0, "");
        }

        public void onOpen(SupportSQLiteDatabase p0) {
            Intrinsics.checkNotNullParameter(p0, "");
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "", "<init>", "()V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "p0", "", "onOpenPrepackagedDatabase", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class PrepackagedDatabaseCallback {
        public void onOpenPrepackagedDatabase(SupportSQLiteDatabase p0) {
            Intrinsics.checkNotNullParameter(p0, "");
        }
    }

    public List<Migration> createAutoMigrations(Map<KClass<? extends AutoMigrationSpec>, ? extends AutoMigrationSpec> p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(p0.size()));
        Iterator<T> it = p0.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(JvmClassMappingKt.getJavaClass((KClass) entry.getKey()), entry.getValue());
        }
        return getAutoMigrations(linkedHashMap);
    }

    public final Cursor query(SupportSQLiteQuery supportSQLiteQuery) {
        Intrinsics.checkNotNullParameter(supportSQLiteQuery, "");
        return query$default(this, supportSQLiteQuery, null, 2, null);
    }
}
