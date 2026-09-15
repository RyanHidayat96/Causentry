package androidx.p005navigation.p006compose;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.State;
import androidx.p005navigation.NavBackStackEntry;
import androidx.p005navigation.NavController;
import androidx.p005navigation.NavDestination;
import androidx.p005navigation.NavHostController;
import androidx.p005navigation.Navigator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"androidx/navigation/compose/NavHostControllerKt__NavHostControllerKt", "androidx/navigation/compose/NavHostControllerKt__NavHostController_androidKt"}, k = 4, mv = {2, 0, 0}, xi = 48)
public final class NavHostControllerKt {
    public static final State<NavBackStackEntry> currentBackStackEntryAsState(NavController navController, Composer composer, int i) {
        return NavHostControllerKt__NavHostControllerKt.currentBackStackEntryAsState(navController, composer, i);
    }

    public static final NavHostController rememberNavController(Navigator<? extends NavDestination>[] navigatorArr, Composer composer, int i) {
        return NavHostControllerKt__NavHostController_androidKt.rememberNavController(navigatorArr, composer, i);
    }
}
