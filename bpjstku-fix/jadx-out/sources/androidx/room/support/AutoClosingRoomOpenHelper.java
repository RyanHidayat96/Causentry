package androidx.room.support;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.CharArrayBuffer;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.database.SQLException;
import android.database.sqlite.SQLiteTransactionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.Pair;
import androidx.database.db.SupportSQLiteDatabase;
import androidx.database.db.SupportSQLiteOpenHelper;
import androidx.database.db.SupportSQLiteProgram;
import androidx.database.db.SupportSQLiteQuery;
import androidx.database.db.SupportSQLiteStatement;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.DelegatingOpenHelper;
import com.google.android.gms.actions.SearchIntents;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0003#$%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0096\u0001¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u00018\u0017X\u0097\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00048\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!"}, d2 = {"Landroidx/room/support/AutoClosingRoomOpenHelper;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/DelegatingOpenHelper;", "p0", "Landroidx/room/support/AutoCloser;", "p1", "<init>", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;Landroidx/room/support/AutoCloser;)V", "", "close", "()V", "", "setWriteAheadLoggingEnabled", "(Z)V", "delegate", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "getDelegate", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "autoCloser", "Landroidx/room/support/AutoCloser;", "getAutoCloser$room_runtime_release", "()Landroidx/room/support/AutoCloser;", "Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "autoClosingDb", "Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getWritableDatabase", "()Landroidx/sqlite/db/SupportSQLiteDatabase;", "writableDatabase", "getReadableDatabase", "readableDatabase", "", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "AutoClosingSupportSQLiteDatabase", "KeepAliveCursor", "AutoClosingSupportSQLiteStatement"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AutoClosingRoomOpenHelper implements SupportSQLiteOpenHelper, DelegatingOpenHelper {
    private final AutoCloser autoCloser;
    private final AutoClosingSupportSQLiteDatabase autoClosingDb;
    private final SupportSQLiteOpenHelper delegate;

    public AutoClosingRoomOpenHelper(SupportSQLiteOpenHelper supportSQLiteOpenHelper, AutoCloser autoCloser) {
        Intrinsics.checkNotNullParameter(supportSQLiteOpenHelper, "");
        Intrinsics.checkNotNullParameter(autoCloser, "");
        this.delegate = supportSQLiteOpenHelper;
        this.autoCloser = autoCloser;
        this.autoClosingDb = new AutoClosingSupportSQLiteDatabase(autoCloser);
        autoCloser.initOpenHelper(getDelegate());
    }

    @Override // androidx.room.DelegatingOpenHelper
    public final SupportSQLiteOpenHelper getDelegate() {
        return this.delegate;
    }

    /* JADX INFO: renamed from: getAutoCloser$room_runtime_release, reason: from getter */
    public final AutoCloser getAutoCloser() {
        return this.autoCloser;
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase getWritableDatabase() {
        this.autoClosingDb.pokeOpen();
        return this.autoClosingDb;
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase getReadableDatabase() {
        this.autoClosingDb.pokeOpen();
        return this.autoClosingDb;
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.autoClosingDb.close();
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    /* JADX INFO: renamed from: getDatabaseName */
    public final String getName() {
        return this.delegate.getName();
    }

    @Override // androidx.database.db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean p0) {
        this.delegate.setWriteAheadLoggingEnabled(p0);
    }

    @Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\bJ\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\bJ\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u0018\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\tH\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\t2\u0010\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010!0 H\u0017¢\u0006\u0004\b\u001e\u0010#J\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020$H\u0017¢\u0006\u0004\b\u001e\u0010%J!\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020$2\b\u0010\"\u001a\u0004\u0018\u00010&H\u0017¢\u0006\u0004\b\u001e\u0010'J'\u0010+\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\"\u001a\u00020(2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J5\u0010-\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020\t2\b\u0010\"\u001a\u0004\u0018\u00010\t2\u0012\u0010*\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010!\u0018\u00010 H\u0016¢\u0006\u0004\b-\u0010.JE\u00101\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\"\u001a\u00020(2\u0006\u0010*\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u00010\t2\u0012\u00100\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010!\u0018\u00010 H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\tH\u0016¢\u0006\u0004\b3\u00104J)\u00103\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\t2\u0010\u0010\"\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010!0 H\u0016¢\u0006\u0004\b3\u00105J\u0017\u00106\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020(H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020(H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0015H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u0015H\u0016¢\u0006\u0004\b?\u0010\u0017J\u000f\u0010@\u001a\u00020\u0006H\u0016¢\u0006\u0004\b@\u0010\bJ\u000f\u0010A\u001a\u00020\u0006H\u0016¢\u0006\u0004\bA\u0010\bR\u0014\u0010B\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0017R$\u0010H\u001a\u00020(2\u0006\u0010\u0003\u001a\u00020(8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010<R\u0014\u0010K\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR$\u0010O\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00198W@WX\u0096\u000e¢\u0006\f\u001a\u0004\bL\u0010J\"\u0004\bM\u0010NR\u0014\u0010P\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bP\u0010\u0017R\u0014\u0010Q\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010\u0017R\u0016\u0010T\u001a\u0004\u0018\u00010\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010U\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\u0017R(\u0010Z\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0W\u0018\u00010V8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010\u0017"}, d2 = {"Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase;", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "Landroidx/room/support/AutoCloser;", "p0", "<init>", "(Landroidx/room/support/AutoCloser;)V", "", "pokeOpen", "()V", "", "Landroidx/sqlite/db/SupportSQLiteStatement;", "compileStatement", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;", "beginTransaction", "beginTransactionNonExclusive", "Landroid/database/sqlite/SQLiteTransactionListener;", "beginTransactionWithListener", "(Landroid/database/sqlite/SQLiteTransactionListener;)V", "beginTransactionWithListenerNonExclusive", "endTransaction", "setTransactionSuccessful", "", "inTransaction", "()Z", "yieldIfContendedSafely", "", "(J)Z", "setMaximumSize", "(J)J", "Landroid/database/Cursor;", SearchIntents.EXTRA_QUERY, "(Ljava/lang/String;)Landroid/database/Cursor;", "", "", "p1", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "(Landroidx/sqlite/db/SupportSQLiteQuery;)Landroid/database/Cursor;", "Landroid/os/CancellationSignal;", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "", "Landroid/content/ContentValues;", "p2", "insert", "(Ljava/lang/String;ILandroid/content/ContentValues;)J", "delete", "(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)I", "p3", "p4", "update", "(Ljava/lang/String;ILandroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/Object;)I", "execSQL", "(Ljava/lang/String;)V", "(Ljava/lang/String;[Ljava/lang/Object;)V", "needUpgrade", "(I)Z", "Ljava/util/Locale;", "setLocale", "(Ljava/util/Locale;)V", "setMaxSqlCacheSize", "(I)V", "setForeignKeyConstraintsEnabled", "(Z)V", "enableWriteAheadLogging", "disableWriteAheadLogging", "close", "autoCloser", "Landroidx/room/support/AutoCloser;", "isDbLockedByCurrentThread", "getVersion", "()I", "setVersion", "version", "getMaximumSize", "()J", "maximumSize", "getPageSize", "setPageSize", "(J)V", "pageSize", "isReadOnly", "isOpen", "getPath", "()Ljava/lang/String;", "path", "isWriteAheadLoggingEnabled", "", "Landroid/util/Pair;", "getAttachedDbs", "()Ljava/util/List;", "attachedDbs", "isDatabaseIntegrityOk"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AutoClosingSupportSQLiteDatabase implements SupportSQLiteDatabase {
        private final AutoCloser autoCloser;

        public AutoClosingSupportSQLiteDatabase(AutoCloser autoCloser) {
            Intrinsics.checkNotNullParameter(autoCloser, "");
            this.autoCloser = autoCloser;
        }

        public final void pokeOpen() {
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.pokeOpen$lambda$0((SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final SupportSQLiteStatement compileStatement(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new AutoClosingSupportSQLiteStatement(p0, this.autoCloser);
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void beginTransaction() {
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransaction();
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void beginTransactionNonExclusive() {
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionNonExclusive();
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void beginTransactionWithListener(SQLiteTransactionListener p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListener(p0);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void beginTransactionWithListenerNonExclusive(SQLiteTransactionListener p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                this.autoCloser.incrementCountAndEnsureDbIsOpen().beginTransactionWithListenerNonExclusive(p0);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void endTransaction() {
            try {
                SupportSQLiteDatabase delegateDatabase = this.autoCloser.getDelegateDatabase();
                Intrinsics.checkNotNull(delegateDatabase);
                delegateDatabase.endTransaction();
            } finally {
                this.autoCloser.decrementCountAndScheduleClose();
            }
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void setTransactionSuccessful() {
            SupportSQLiteDatabase delegateDatabase = this.autoCloser.getDelegateDatabase();
            Intrinsics.checkNotNull(delegateDatabase);
            delegateDatabase.setTransactionSuccessful();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final boolean inTransaction() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$inTransaction$1.INSTANCE)).booleanValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final boolean isDbLockedByCurrentThread() {
            if (this.autoCloser.getDelegateDatabase() == null) {
                return false;
            }
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new PropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDbLockedByCurrentThread$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public final Object get(Object obj) {
                    return Boolean.valueOf(((SupportSQLiteDatabase) obj).isDbLockedByCurrentThread());
                }
            })).booleanValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final boolean yieldIfContendedSafely() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$1.INSTANCE)).booleanValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final boolean yieldIfContendedSafely(long p0) {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$yieldIfContendedSafely$2.INSTANCE)).booleanValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final int getVersion() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new MutablePropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$version$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
                public final Object get(Object obj) {
                    return Integer.valueOf(((SupportSQLiteDatabase) obj).getVersion());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
                public final void set(Object obj, Object obj2) {
                    ((SupportSQLiteDatabase) obj).setVersion(((Number) obj2).intValue());
                }
            })).intValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void setVersion(final int i) {
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase._set_version_$lambda$1(i, (SupportSQLiteDatabase) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit _set_version_$lambda$1(int i, SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.setVersion(i);
            return Unit.INSTANCE;
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final long getMaximumSize() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new PropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$maximumSize$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public final Object get(Object obj) {
                    return Long.valueOf(((SupportSQLiteDatabase) obj).getMaximumSize());
                }
            })).longValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final long setMaximumSize(final long p0) {
            return ((Number) this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.setMaximumSize$lambda$2(p0, (SupportSQLiteDatabase) obj));
                }
            })).longValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long setMaximumSize$lambda$2(long j, SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            return supportSQLiteDatabase.setMaximumSize(j);
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final long getPageSize() {
            return ((Number) this.autoCloser.executeRefCountingFunction(new MutablePropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$pageSize$1
                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KProperty1
                public final Object get(Object obj) {
                    return Long.valueOf(((SupportSQLiteDatabase) obj).getPageSize());
                }

                @Override // kotlin.jvm.internal.MutablePropertyReference1Impl, kotlin.reflect.KMutableProperty1
                public final void set(Object obj, Object obj2) {
                    ((SupportSQLiteDatabase) obj).setPageSize(((Number) obj2).longValue());
                }
            })).longValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void setPageSize(final long j) {
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase._set_pageSize_$lambda$3(j, (SupportSQLiteDatabase) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object _set_pageSize_$lambda$3(long j, SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.setPageSize(j);
            return null;
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final Cursor query(String p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(p0), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final Cursor query(String p0, Object[] p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(p0, p1), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final Cursor query(SupportSQLiteQuery p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(p0), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final Cursor query(SupportSQLiteQuery p0, CancellationSignal p1) {
            Intrinsics.checkNotNullParameter(p0, "");
            try {
                return new KeepAliveCursor(this.autoCloser.incrementCountAndEnsureDbIsOpen().query(p0, p1), this.autoCloser);
            } catch (Throwable th) {
                this.autoCloser.decrementCountAndScheduleClose();
                throw th;
            }
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final long insert(final String p0, final int p1, final ContentValues p2) throws SQLException {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p2, "");
            return ((Number) this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.insert$lambda$4(p0, p1, p2, (SupportSQLiteDatabase) obj));
                }
            })).longValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long insert$lambda$4(String str, int i, ContentValues contentValues, SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            return supportSQLiteDatabase.insert(str, i, contentValues);
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final int delete(final String p0, final String p1, final Object[] p2) {
            Intrinsics.checkNotNullParameter(p0, "");
            return ((Number) this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.delete$lambda$5(p0, p1, p2, (SupportSQLiteDatabase) obj));
                }
            })).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int delete$lambda$5(String str, String str2, Object[] objArr, SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            return supportSQLiteDatabase.delete(str, str2, objArr);
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final int update(final String p0, final int p1, final ContentValues p2, final String p3, final Object[] p4) {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p2, "");
            return ((Number) this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.update$lambda$6(p0, p1, p2, p3, p4, (SupportSQLiteDatabase) obj));
                }
            })).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int update$lambda$6(String str, int i, ContentValues contentValues, String str2, Object[] objArr, SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            return supportSQLiteDatabase.update(str, i, contentValues, str2, objArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit execSQL$lambda$7(String str, SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL(str);
            return Unit.INSTANCE;
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void execSQL(final String p0) throws SQLException {
            Intrinsics.checkNotNullParameter(p0, "");
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.execSQL$lambda$7(p0, (SupportSQLiteDatabase) obj);
                }
            });
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void execSQL(final String p0, final Object[] p1) throws SQLException {
            Intrinsics.checkNotNullParameter(p0, "");
            Intrinsics.checkNotNullParameter(p1, "");
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.execSQL$lambda$8(p0, p1, (SupportSQLiteDatabase) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit execSQL$lambda$8(String str, Object[] objArr, SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.execSQL(str, objArr);
            return Unit.INSTANCE;
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final boolean isReadOnly() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new PropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isReadOnly$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public final Object get(Object obj) {
                    return Boolean.valueOf(((SupportSQLiteDatabase) obj).isReadOnly());
                }
            })).booleanValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final boolean isOpen() {
            SupportSQLiteDatabase delegateDatabase = this.autoCloser.getDelegateDatabase();
            if (delegateDatabase != null) {
                return delegateDatabase.isOpen();
            }
            return false;
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final boolean needUpgrade(final int p0) {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.needUpgrade$lambda$9(p0, (SupportSQLiteDatabase) obj));
                }
            })).booleanValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean needUpgrade$lambda$9(int i, SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            return supportSQLiteDatabase.needUpgrade(i);
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final String getPath() {
            return (String) this.autoCloser.executeRefCountingFunction(new PropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$path$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public final Object get(Object obj) {
                    return ((SupportSQLiteDatabase) obj).getPath();
                }
            });
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void setLocale(final Locale p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.setLocale$lambda$10(p0, (SupportSQLiteDatabase) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setLocale$lambda$10(Locale locale, SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.setLocale(locale);
            return Unit.INSTANCE;
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void setMaxSqlCacheSize(final int p0) {
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.setMaxSqlCacheSize$lambda$11(p0, (SupportSQLiteDatabase) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setMaxSqlCacheSize$lambda$11(int i, SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.setMaxSqlCacheSize(i);
            return Unit.INSTANCE;
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void setForeignKeyConstraintsEnabled(final boolean p0) {
            this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteDatabase.setForeignKeyConstraintsEnabled$lambda$12(p0, (SupportSQLiteDatabase) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit setForeignKeyConstraintsEnabled$lambda$12(boolean z, SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            supportSQLiteDatabase.setForeignKeyConstraintsEnabled(z);
            return Unit.INSTANCE;
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final boolean enableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final void disableWriteAheadLogging() {
            throw new UnsupportedOperationException("Enable/disable write ahead logging on the OpenHelper instead of on the database directly.");
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final boolean isWriteAheadLoggingEnabled() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new PropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isWriteAheadLoggingEnabled$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public final Object get(Object obj) {
                    return Boolean.valueOf(((SupportSQLiteDatabase) obj).isWriteAheadLoggingEnabled());
                }
            })).booleanValue();
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final List<Pair<String, String>> getAttachedDbs() {
            return (List) this.autoCloser.executeRefCountingFunction(new PropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$attachedDbs$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public final Object get(Object obj) {
                    return ((SupportSQLiteDatabase) obj).getAttachedDbs();
                }
            });
        }

        @Override // androidx.database.db.SupportSQLiteDatabase
        public final boolean isDatabaseIntegrityOk() {
            return ((Boolean) this.autoCloser.executeRefCountingFunction(new PropertyReference1Impl() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteDatabase$isDatabaseIntegrityOk$1
                @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
                public final Object get(Object obj) {
                    return Boolean.valueOf(((SupportSQLiteDatabase) obj).isDatabaseIntegrityOk());
                }
            })).booleanValue();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.autoCloser.closeDatabaseIfOpen();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object pokeOpen$lambda$0(SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\n2\n\u0010\u0004\u001a\u0006*\u00020\u000b0\u000bH\u0096\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007H\u0097\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u001c\u0010\u0010\u001a\u0006*\u00020\u000f0\u000f2\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0015\u001a\u00020\n2\n\u0010\u0002\u001a\u0006*\u00020\u00140\u0014H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u00020\n2\n\u0010\u0002\u001a\u0006*\u00020\u00140\u0014H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0016J\u001c\u0010\u0018\u001a\u0006*\u00020\u00140\u00142\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001b\u001a\u001c\u0012\b\u0012\u0006*\u00020\u00140\u0014*\u000e\u0012\n\b\u0001\u0012\u0006*\u00020\u00140\u00140\u001a0\u001aH\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u001d\u0010\u0013J\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b\u001f\u0010 J\u0014\u0010\"\u001a\u0006*\u00020!0!H\u0096\u0001¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b'\u0010(J\u0018\u0010*\u001a\u00020)2\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b*\u0010+J\u0014\u0010-\u001a\u0006*\u00020,0,H\u0096\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b/\u0010\u0013J\u0018\u00101\u001a\u0002002\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b1\u00102J\u001c\u00103\u001a\u0006*\u00020\u00140\u00142\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b3\u0010\u0019J\u0018\u00104\u001a\u00020\n2\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b4\u0010(J\u0010\u00106\u001a\u000205H\u0096\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u000205H\u0096\u0001¢\u0006\u0004\b8\u00107J\u0010\u00109\u001a\u000205H\u0096\u0001¢\u0006\u0004\b9\u00107J\u0010\u0010:\u001a\u000205H\u0096\u0001¢\u0006\u0004\b:\u00107J\u0010\u0010;\u001a\u000205H\u0096\u0001¢\u0006\u0004\b;\u00107J\u0010\u0010<\u001a\u000205H\u0096\u0001¢\u0006\u0004\b<\u00107J\u0018\u0010=\u001a\u0002052\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b=\u0010>J\u0018\u0010?\u001a\u0002052\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\b?\u0010>J\u0010\u0010@\u001a\u000205H\u0096\u0001¢\u0006\u0004\b@\u00107J\u0010\u0010A\u001a\u000205H\u0096\u0001¢\u0006\u0004\bA\u00107J\u0010\u0010B\u001a\u000205H\u0096\u0001¢\u0006\u0004\bB\u00107J\u0018\u0010C\u001a\u0002052\u0006\u0010\u0002\u001a\u00020\nH\u0096\u0001¢\u0006\u0004\bC\u0010>J\u0010\u0010D\u001a\u000205H\u0096\u0001¢\u0006\u0004\bD\u00107J\u001c\u0010F\u001a\u00020\u00072\n\u0010\u0002\u001a\u0006*\u00020E0EH\u0096\u0001¢\u0006\u0004\bF\u0010GJ\u001c\u0010I\u001a\u00020\u00072\n\u0010\u0002\u001a\u0006*\u00020H0HH\u0096\u0001¢\u0006\u0004\bI\u0010JJ\u0010\u0010K\u001a\u000205H\u0097\u0001¢\u0006\u0004\bK\u00107J \u0010L\u001a\u0006*\u00020!0!2\n\u0010\u0002\u001a\u0006*\u00020!0!H\u0096\u0001¢\u0006\u0004\bL\u0010MJ\u001c\u0010N\u001a\u00020\u00072\n\u0010\u0002\u001a\u0006*\u00020!0!H\u0096\u0001¢\u0006\u0004\bN\u0010OJ(\u0010Q\u001a\u00020\u00072\n\u0010\u0002\u001a\u0006*\u00020P0P2\n\u0010\u0004\u001a\u0006*\u00020,0,H\u0096\u0001¢\u0006\u0004\bQ\u0010RJ\u001c\u0010S\u001a\u00020\u00072\n\u0010\u0002\u001a\u0006*\u00020E0EH\u0096\u0001¢\u0006\u0004\bS\u0010GJ\u001c\u0010T\u001a\u00020\u00072\n\u0010\u0002\u001a\u0006*\u00020H0HH\u0096\u0001¢\u0006\u0004\bT\u0010JR\u0014\u0010U\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020\u00038\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bW\u0010X"}, d2 = {"Landroidx/room/support/AutoClosingRoomOpenHelper$KeepAliveCursor;", "Landroid/database/Cursor;", "p0", "Landroidx/room/support/AutoCloser;", "p1", "<init>", "(Landroid/database/Cursor;Landroidx/room/support/AutoCloser;)V", "", "close", "()V", "", "Landroid/database/CharArrayBuffer;", "copyStringToBuffer", "(ILandroid/database/CharArrayBuffer;)V", "deactivate", "", "getBlob", "(I)[B", "getColumnCount", "()I", "", "getColumnIndex", "(Ljava/lang/String;)I", "getColumnIndexOrThrow", "getColumnName", "(I)Ljava/lang/String;", "", "getColumnNames", "()[Ljava/lang/String;", "getCount", "", "getDouble", "(I)D", "Landroid/os/Bundle;", "getExtras", "()Landroid/os/Bundle;", "", "getFloat", "(I)F", "getInt", "(I)I", "", "getLong", "(I)J", "Landroid/net/Uri;", "getNotificationUri", "()Landroid/net/Uri;", "getPosition", "", "getShort", "(I)S", "getString", "getType", "", "getWantsAllOnMoveCalls", "()Z", "isAfterLast", "isBeforeFirst", "isClosed", "isFirst", "isLast", "isNull", "(I)Z", "move", "moveToFirst", "moveToLast", "moveToNext", "moveToPosition", "moveToPrevious", "Landroid/database/ContentObserver;", "registerContentObserver", "(Landroid/database/ContentObserver;)V", "Landroid/database/DataSetObserver;", "registerDataSetObserver", "(Landroid/database/DataSetObserver;)V", "requery", "respond", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "setExtras", "(Landroid/os/Bundle;)V", "Landroid/content/ContentResolver;", "setNotificationUri", "(Landroid/content/ContentResolver;Landroid/net/Uri;)V", "unregisterContentObserver", "unregisterDataSetObserver", "delegate", "Landroid/database/Cursor;", "autoCloser", "Landroidx/room/support/AutoCloser;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class KeepAliveCursor implements Cursor {
        private final AutoCloser autoCloser;
        private final Cursor delegate;

        public KeepAliveCursor(Cursor cursor, AutoCloser autoCloser) {
            Intrinsics.checkNotNullParameter(cursor, "");
            Intrinsics.checkNotNullParameter(autoCloser, "");
            this.delegate = cursor;
            this.autoCloser = autoCloser;
        }

        @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.delegate.close();
            this.autoCloser.decrementCountAndScheduleClose();
        }

        @Override // android.database.Cursor
        public final void copyStringToBuffer(int p0, CharArrayBuffer p1) {
            this.delegate.copyStringToBuffer(p0, p1);
        }

        @Override // android.database.Cursor
        @Deprecated(message = "Deprecated in Java")
        public final void deactivate() {
            this.delegate.deactivate();
        }

        @Override // android.database.Cursor
        public final byte[] getBlob(int p0) {
            return this.delegate.getBlob(p0);
        }

        @Override // android.database.Cursor
        public final int getColumnCount() {
            return this.delegate.getColumnCount();
        }

        @Override // android.database.Cursor
        public final int getColumnIndex(String p0) {
            return this.delegate.getColumnIndex(p0);
        }

        @Override // android.database.Cursor
        public final int getColumnIndexOrThrow(String p0) {
            return this.delegate.getColumnIndexOrThrow(p0);
        }

        @Override // android.database.Cursor
        public final String getColumnName(int p0) {
            return this.delegate.getColumnName(p0);
        }

        @Override // android.database.Cursor
        public final String[] getColumnNames() {
            return this.delegate.getColumnNames();
        }

        @Override // android.database.Cursor
        public final int getCount() {
            return this.delegate.getCount();
        }

        @Override // android.database.Cursor
        public final double getDouble(int p0) {
            return this.delegate.getDouble(p0);
        }

        @Override // android.database.Cursor
        public final Bundle getExtras() {
            return this.delegate.getExtras();
        }

        @Override // android.database.Cursor
        public final float getFloat(int p0) {
            return this.delegate.getFloat(p0);
        }

        @Override // android.database.Cursor
        public final int getInt(int p0) {
            return this.delegate.getInt(p0);
        }

        @Override // android.database.Cursor
        public final long getLong(int p0) {
            return this.delegate.getLong(p0);
        }

        @Override // android.database.Cursor
        public final Uri getNotificationUri() {
            return this.delegate.getNotificationUri();
        }

        @Override // android.database.Cursor
        public final int getPosition() {
            return this.delegate.getPosition();
        }

        @Override // android.database.Cursor
        public final short getShort(int p0) {
            return this.delegate.getShort(p0);
        }

        @Override // android.database.Cursor
        public final String getString(int p0) {
            return this.delegate.getString(p0);
        }

        @Override // android.database.Cursor
        public final int getType(int p0) {
            return this.delegate.getType(p0);
        }

        @Override // android.database.Cursor
        public final boolean getWantsAllOnMoveCalls() {
            return this.delegate.getWantsAllOnMoveCalls();
        }

        @Override // android.database.Cursor
        public final boolean isAfterLast() {
            return this.delegate.isAfterLast();
        }

        @Override // android.database.Cursor
        public final boolean isBeforeFirst() {
            return this.delegate.isBeforeFirst();
        }

        @Override // android.database.Cursor
        public final boolean isClosed() {
            return this.delegate.isClosed();
        }

        @Override // android.database.Cursor
        public final boolean isFirst() {
            return this.delegate.isFirst();
        }

        @Override // android.database.Cursor
        public final boolean isLast() {
            return this.delegate.isLast();
        }

        @Override // android.database.Cursor
        public final boolean isNull(int p0) {
            return this.delegate.isNull(p0);
        }

        @Override // android.database.Cursor
        public final boolean move(int p0) {
            return this.delegate.move(p0);
        }

        @Override // android.database.Cursor
        public final boolean moveToFirst() {
            return this.delegate.moveToFirst();
        }

        @Override // android.database.Cursor
        public final boolean moveToLast() {
            return this.delegate.moveToLast();
        }

        @Override // android.database.Cursor
        public final boolean moveToNext() {
            return this.delegate.moveToNext();
        }

        @Override // android.database.Cursor
        public final boolean moveToPosition(int p0) {
            return this.delegate.moveToPosition(p0);
        }

        @Override // android.database.Cursor
        public final boolean moveToPrevious() {
            return this.delegate.moveToPrevious();
        }

        @Override // android.database.Cursor
        public final void registerContentObserver(ContentObserver p0) {
            this.delegate.registerContentObserver(p0);
        }

        @Override // android.database.Cursor
        public final void registerDataSetObserver(DataSetObserver p0) {
            this.delegate.registerDataSetObserver(p0);
        }

        @Override // android.database.Cursor
        @Deprecated(message = "Deprecated in Java")
        public final boolean requery() {
            return this.delegate.requery();
        }

        @Override // android.database.Cursor
        public final Bundle respond(Bundle p0) {
            return this.delegate.respond(p0);
        }

        @Override // android.database.Cursor
        public final void setExtras(Bundle p0) {
            this.delegate.setExtras(p0);
        }

        @Override // android.database.Cursor
        public final void setNotificationUri(ContentResolver p0, Uri p1) {
            this.delegate.setNotificationUri(p0, p1);
        }

        @Override // android.database.Cursor
        public final void unregisterContentObserver(ContentObserver p0) {
            this.delegate.unregisterContentObserver(p0);
        }

        @Override // android.database.Cursor
        public final void unregisterDataSetObserver(DataSetObserver p0) {
            this.delegate.unregisterDataSetObserver(p0);
        }
    }

    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0002\u0018\u0000 =2\u00020\u0001:\u0001=B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0017\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00152\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00028\u00000\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\bH\u0016¢\u0006\u0004\b%\u0010\nJ\u001f\u0010&\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00106\u001a\u0002058\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001e\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0002088\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u001e\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\"088\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010<"}, d2 = {"Landroidx/room/support/AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement;", "Landroidx/sqlite/db/SupportSQLiteStatement;", "", "p0", "Landroidx/room/support/AutoCloser;", "p1", "<init>", "(Ljava/lang/String;Landroidx/room/support/AutoCloser;)V", "", "close", "()V", "execute", "", "executeUpdateDelete", "()I", "", "executeInsert", "()J", "simpleQueryForLong", "simpleQueryForString", "()Ljava/lang/String;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/Function1;", "executeWithRefCount", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "bindNull", "(I)V", "bindLong", "(IJ)V", "", "bindDouble", "(ID)V", "bindString", "(ILjava/lang/String;)V", "", "bindBlob", "(I[B)V", "clearBindings", "ensureCapacity", "(II)V", "Landroidx/sqlite/db/SupportSQLiteProgram;", "bindTo", "(Landroidx/sqlite/db/SupportSQLiteProgram;)V", "sql", "Ljava/lang/String;", "autoCloser", "Landroidx/room/support/AutoCloser;", "", "bindingTypes", "[I", "", "longBindings", "[J", "", "doubleBindings", "[D", "", "stringBindings", "[Ljava/lang/String;", "blobBindings", "[[B", "Companion"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class AutoClosingSupportSQLiteStatement implements SupportSQLiteStatement {
        private static final int COLUMN_TYPE_BLOB = 4;
        private static final int COLUMN_TYPE_DOUBLE = 2;
        private static final int COLUMN_TYPE_LONG = 1;
        private static final int COLUMN_TYPE_NULL = 5;
        private static final int COLUMN_TYPE_STRING = 3;
        private final AutoCloser autoCloser;
        private int[] bindingTypes;
        private byte[][] blobBindings;
        private double[] doubleBindings;
        private long[] longBindings;
        private final String sql;
        private String[] stringBindings;

        public AutoClosingSupportSQLiteStatement(String str, AutoCloser autoCloser) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(autoCloser, "");
            this.sql = str;
            this.autoCloser = autoCloser;
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            clearBindings();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit execute$lambda$0(SupportSQLiteStatement supportSQLiteStatement) {
            Intrinsics.checkNotNullParameter(supportSQLiteStatement, "");
            supportSQLiteStatement.execute();
            return Unit.INSTANCE;
        }

        @Override // androidx.database.db.SupportSQLiteStatement
        public final void execute() {
            executeWithRefCount(new Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.execute$lambda$0((SupportSQLiteStatement) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int executeUpdateDelete$lambda$1(SupportSQLiteStatement supportSQLiteStatement) {
            Intrinsics.checkNotNullParameter(supportSQLiteStatement, "");
            return supportSQLiteStatement.executeUpdateDelete();
        }

        @Override // androidx.database.db.SupportSQLiteStatement
        public final int executeUpdateDelete() {
            return ((Number) executeWithRefCount(new Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Integer.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.executeUpdateDelete$lambda$1((SupportSQLiteStatement) obj));
                }
            })).intValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long executeInsert$lambda$2(SupportSQLiteStatement supportSQLiteStatement) {
            Intrinsics.checkNotNullParameter(supportSQLiteStatement, "");
            return supportSQLiteStatement.executeInsert();
        }

        @Override // androidx.database.db.SupportSQLiteStatement
        public final long executeInsert() {
            return ((Number) executeWithRefCount(new Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.executeInsert$lambda$2((SupportSQLiteStatement) obj));
                }
            })).longValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final long simpleQueryForLong$lambda$3(SupportSQLiteStatement supportSQLiteStatement) {
            Intrinsics.checkNotNullParameter(supportSQLiteStatement, "");
            return supportSQLiteStatement.simpleQueryForLong();
        }

        @Override // androidx.database.db.SupportSQLiteStatement
        public final long simpleQueryForLong() {
            return ((Number) executeWithRefCount(new Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Long.valueOf(AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.simpleQueryForLong$lambda$3((SupportSQLiteStatement) obj));
                }
            })).longValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String simpleQueryForString$lambda$4(SupportSQLiteStatement supportSQLiteStatement) {
            Intrinsics.checkNotNullParameter(supportSQLiteStatement, "");
            return supportSQLiteStatement.simpleQueryForString();
        }

        @Override // androidx.database.db.SupportSQLiteStatement
        public final String simpleQueryForString() {
            return (String) executeWithRefCount(new Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.simpleQueryForString$lambda$4((SupportSQLiteStatement) obj);
                }
            });
        }

        private final <T> T executeWithRefCount(final Function1<? super SupportSQLiteStatement, ? extends T> p0) {
            return (T) this.autoCloser.executeRefCountingFunction(new Function1() { // from class: androidx.room.support.AutoClosingRoomOpenHelper$AutoClosingSupportSQLiteStatement$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AutoClosingRoomOpenHelper.AutoClosingSupportSQLiteStatement.executeWithRefCount$lambda$5(this.f$0, p0, (SupportSQLiteDatabase) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object executeWithRefCount$lambda$5(AutoClosingSupportSQLiteStatement autoClosingSupportSQLiteStatement, Function1 function1, SupportSQLiteDatabase supportSQLiteDatabase) {
            Intrinsics.checkNotNullParameter(supportSQLiteDatabase, "");
            SupportSQLiteStatement supportSQLiteStatementCompileStatement = supportSQLiteDatabase.compileStatement(autoClosingSupportSQLiteStatement.sql);
            autoClosingSupportSQLiteStatement.bindTo(supportSQLiteStatementCompileStatement);
            return function1.invoke(supportSQLiteStatementCompileStatement);
        }

        @Override // androidx.database.db.SupportSQLiteProgram
        public final void bindNull(int p0) {
            ensureCapacity(5, p0);
            this.bindingTypes[p0] = 5;
        }

        @Override // androidx.database.db.SupportSQLiteProgram
        public final void bindLong(int p0, long p1) {
            ensureCapacity(1, p0);
            this.bindingTypes[p0] = 1;
            this.longBindings[p0] = p1;
        }

        @Override // androidx.database.db.SupportSQLiteProgram
        public final void bindDouble(int p0, double p1) {
            ensureCapacity(2, p0);
            this.bindingTypes[p0] = 2;
            this.doubleBindings[p0] = p1;
        }

        @Override // androidx.database.db.SupportSQLiteProgram
        public final void bindString(int p0, String p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            ensureCapacity(3, p0);
            this.bindingTypes[p0] = 3;
            this.stringBindings[p0] = p1;
        }

        @Override // androidx.database.db.SupportSQLiteProgram
        public final void bindBlob(int p0, byte[] p1) {
            Intrinsics.checkNotNullParameter(p1, "");
            ensureCapacity(4, p0);
            this.bindingTypes[p0] = 4;
            this.blobBindings[p0] = p1;
        }

        @Override // androidx.database.db.SupportSQLiteProgram
        public final void clearBindings() {
            this.bindingTypes = new int[0];
            this.longBindings = new long[0];
            this.doubleBindings = new double[0];
            this.stringBindings = new String[0];
            this.blobBindings = new byte[0][];
        }

        private final void ensureCapacity(int p0, int p1) {
            int i = p1 + 1;
            int[] iArr = this.bindingTypes;
            if (iArr.length < i) {
                int[] iArrCopyOf = Arrays.copyOf(iArr, i);
                Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "");
                this.bindingTypes = iArrCopyOf;
            }
            if (p0 == 1) {
                long[] jArr = this.longBindings;
                if (jArr.length < i) {
                    long[] jArrCopyOf = Arrays.copyOf(jArr, i);
                    Intrinsics.checkNotNullExpressionValue(jArrCopyOf, "");
                    this.longBindings = jArrCopyOf;
                    return;
                }
                return;
            }
            if (p0 == 2) {
                double[] dArr = this.doubleBindings;
                if (dArr.length < i) {
                    double[] dArrCopyOf = Arrays.copyOf(dArr, i);
                    Intrinsics.checkNotNullExpressionValue(dArrCopyOf, "");
                    this.doubleBindings = dArrCopyOf;
                    return;
                }
                return;
            }
            if (p0 == 3) {
                String[] strArr = this.stringBindings;
                if (strArr.length < i) {
                    Object[] objArrCopyOf = Arrays.copyOf(strArr, i);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "");
                    this.stringBindings = (String[]) objArrCopyOf;
                    return;
                }
                return;
            }
            if (p0 == 4) {
                byte[][] bArr = this.blobBindings;
                if (bArr.length < i) {
                    Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i);
                    Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "");
                    this.blobBindings = (byte[][]) objArrCopyOf2;
                }
            }
        }

        private final void bindTo(SupportSQLiteProgram p0) {
            int length = this.bindingTypes.length;
            for (int i = 1; i < length; i++) {
                int i2 = this.bindingTypes[i];
                if (i2 == 1) {
                    p0.bindLong(i, this.longBindings[i]);
                } else if (i2 == 2) {
                    p0.bindDouble(i, this.doubleBindings[i]);
                } else if (i2 == 3) {
                    String str = this.stringBindings[i];
                    Intrinsics.checkNotNull(str);
                    p0.bindString(i, str);
                } else if (i2 == 4) {
                    byte[] bArr = this.blobBindings[i];
                    Intrinsics.checkNotNull(bArr);
                    p0.bindBlob(i, bArr);
                } else if (i2 == 5) {
                    p0.bindNull(i);
                }
            }
        }
    }
}
