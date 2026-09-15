package androidx.FastestIyy;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes5.dex */
public final class F {
    public final ArrayList b = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f260a = 30;

    public final void a(Object obj) {
        if (this.b.size() != this.f260a) {
            this.b.add(obj);
        } else {
            this.b.remove(0);
            this.b.add(obj);
        }
    }

    public final JSONArray a() {
        ArrayList arrayList = new ArrayList(this.b);
        Collections.reverse(arrayList);
        return new JSONArray((Collection) arrayList);
    }
}
