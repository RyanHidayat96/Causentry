package androidx.view.result.contract;

import android.content.Context;
import android.content.Intent;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0001\u0012B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H'¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u00028\u00012\u0006\u0010\u0007\u001a\u00020\f2\b\u0010\b\u001a\u0004\u0018\u00010\tH&¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContract;", "I", "O", "", "<init>", "()V", "Landroid/content/Context;", "p0", "p1", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;", "", "parseResult", "(ILandroid/content/Intent;)Ljava/lang/Object;", "Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "getSynchronousResult", "(Landroid/content/Context;Ljava/lang/Object;)Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", "SynchronousResult"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class ActivityResultContract<I, O> {
    public abstract Intent createIntent(Context p0, I p1);

    public abstract O parseResult(int p0, Intent p1);

    public SynchronousResult<O> getSynchronousResult(Context p0, I p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        return null;
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0002\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00028\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/activity/result/contract/ActivityResultContract$SynchronousResult;", ExifInterface.GPS_DIRECTION_TRUE, "", "p0", "<init>", "(Ljava/lang/Object;)V", "value", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SynchronousResult<T> {
        private final T value;

        public SynchronousResult(T t) {
            this.value = t;
        }

        public final T getValue() {
            return this.value;
        }
    }
}
