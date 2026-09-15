package com.bpjstku.data;

import android.content.Context;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import com.bpjstku.data.about.local.AboutDao;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/bpjstku/data/AppDatabase;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Lcom/bpjstku/data/about/local/AboutDao;", "aboutDao", "()Lcom/bpjstku/data/about/local/AboutDao;", "Companion"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AppDatabase extends RoomDatabase {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static AppDatabase INSTANCE;

    public abstract AboutDao aboutDao();

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/bpjstku/data/AppDatabase$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/bpjstku/data/AppDatabase;", "getAppDatabase", "(Landroid/content/Context;)Lcom/bpjstku/data/AppDatabase;", "", "destroyInstance", "INSTANCE", "Lcom/bpjstku/data/AppDatabase;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final AppDatabase getAppDatabase(Context p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            if (AppDatabase.INSTANCE == null) {
                Context applicationContext = p0.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "");
                AppDatabase.INSTANCE = (AppDatabase) Room.databaseBuilder(applicationContext, AppDatabase.class, "bpjstkuDb").fallbackToDestructiveMigration().build();
            }
            AppDatabase appDatabase = AppDatabase.INSTANCE;
            Intrinsics.checkNotNull(appDatabase);
            return appDatabase;
        }

        public final void destroyInstance() {
            AppDatabase.INSTANCE = null;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
