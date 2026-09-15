package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class getDefaultConfigFactory extends lambdainitAndRetryRecursively1androidxcameracoreCameraX {
    public getDefaultConfigFactory(Context context) {
        this(context, "image_manager_disk_cache");
    }

    private getDefaultConfigFactory(final Context context, final String str) {
        super(new lambdainitAndRetryRecursively1androidxcameracoreCameraX.b() { // from class: getDefaultConfigFactory.3
            @Override // lambdainitAndRetryRecursively1androidxcameracoreCameraX.b
            public final File TuitionPaymentFragmentspecialinlinedviewModeldefault3() {
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                return str != null ? new File(cacheDir, str) : cacheDir;
            }
        }, 262144000L);
    }
}
