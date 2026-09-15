package com.bpjstku.data.asik.local;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/bpjstku/data/asik/local/AsikDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Lcom/bpjstku/data/asik/local/AddressPostalCodeDao;", "addressPostalCodeDao", "()Lcom/bpjstku/data/asik/local/AddressPostalCodeDao;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AsikDatabase extends RoomDatabase {
    public static final int $stable = 0;
    private static final String DATABASE_NAME = "asik_database";
    private static volatile AsikDatabase INSTANCE;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Object lock = new Object();

    public abstract AddressPostalCodeDao addressPostalCodeDao();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0083T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010"}, d2 = {"Lcom/bpjstku/data/asik/local/AsikDatabase$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/data/asik/local/AsikDatabase;", "getInstance", "(Landroid/content/Context;)Lcom/bpjstku/data/asik/local/AsikDatabase;", "buildDatabase", "", "DATABASE_NAME", "Ljava/lang/String;", "INSTANCE", "Lcom/bpjstku/data/asik/local/AsikDatabase;", "lock", "Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final AsikDatabase getInstance(Context p0) {
            AsikDatabase asikDatabaseBuildDatabase;
            Intrinsics.checkNotNullParameter(p0, "");
            AsikDatabase asikDatabase = AsikDatabase.INSTANCE;
            if (asikDatabase != null) {
                return asikDatabase;
            }
            synchronized (AsikDatabase.lock) {
                asikDatabaseBuildDatabase = AsikDatabase.INSTANCE;
                if (asikDatabaseBuildDatabase == null) {
                    asikDatabaseBuildDatabase = AsikDatabase.INSTANCE.buildDatabase(p0);
                    Companion companion = AsikDatabase.INSTANCE;
                    AsikDatabase.INSTANCE = asikDatabaseBuildDatabase;
                }
            }
            return asikDatabaseBuildDatabase;
        }

        private final AsikDatabase buildDatabase(Context p0) {
            Context applicationContext = p0.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "");
            return (AsikDatabase) Room.databaseBuilder(applicationContext, AsikDatabase.class, AsikDatabase.DATABASE_NAME).fallbackToDestructiveMigration().build();
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
