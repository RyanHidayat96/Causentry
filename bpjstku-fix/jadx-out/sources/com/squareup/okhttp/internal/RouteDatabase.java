package com.squareup.okhttp.internal;

import com.squareup.okhttp.Route;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class RouteDatabase {
    private final Set<Route> failedRoutes = new LinkedHashSet();

    public final void failed(Route route) {
        synchronized (this) {
            this.failedRoutes.add(route);
        }
    }

    public final void connected(Route route) {
        synchronized (this) {
            this.failedRoutes.remove(route);
        }
    }

    public final boolean shouldPostpone(Route route) {
        boolean zContains;
        synchronized (this) {
            zContains = this.failedRoutes.contains(route);
        }
        return zContains;
    }

    public final int failedRoutesCount() {
        int size;
        synchronized (this) {
            size = this.failedRoutes.size();
        }
        return size;
    }
}
