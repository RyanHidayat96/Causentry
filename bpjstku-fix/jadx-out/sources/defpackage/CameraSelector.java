package defpackage;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.EncodeStrategy;

/* JADX INFO: loaded from: classes3.dex */
public abstract class CameraSelector {
    public static final CameraSelector TuitionPaymentFragmentbindingInflater1;
    public static final CameraSelector TuitionPaymentFragmentspecialinlinedviewModeldefault3;
    public static final CameraSelector b;

    public abstract boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy);

    public abstract boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2();

    public abstract boolean b();

    public abstract boolean b(DataSource dataSource);

    static {
        new CameraSelector() { // from class: CameraSelector.2
            @Override // defpackage.CameraSelector
            public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
                return true;
            }

            @Override // defpackage.CameraSelector
            public final boolean b() {
                return true;
            }

            @Override // defpackage.CameraSelector
            public final boolean b(DataSource dataSource) {
                return dataSource == DataSource.REMOTE;
            }

            @Override // defpackage.CameraSelector
            public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
                return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
            }
        };
        b = new CameraSelector() { // from class: CameraSelector.3
            @Override // defpackage.CameraSelector
            public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
                return false;
            }

            @Override // defpackage.CameraSelector
            public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
                return false;
            }

            @Override // defpackage.CameraSelector
            public final boolean b() {
                return false;
            }

            @Override // defpackage.CameraSelector
            public final boolean b(DataSource dataSource) {
                return false;
            }
        };
        TuitionPaymentFragmentbindingInflater1 = new CameraSelector() { // from class: CameraSelector.1
            @Override // defpackage.CameraSelector
            public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
                return false;
            }

            @Override // defpackage.CameraSelector
            public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
                return false;
            }

            @Override // defpackage.CameraSelector
            public final boolean b() {
                return true;
            }

            @Override // defpackage.CameraSelector
            public final boolean b(DataSource dataSource) {
                return (dataSource == DataSource.DATA_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
            }
        };
        new CameraSelector() { // from class: CameraSelector.5
            @Override // defpackage.CameraSelector
            public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
                return true;
            }

            @Override // defpackage.CameraSelector
            public final boolean b() {
                return false;
            }

            @Override // defpackage.CameraSelector
            public final boolean b(DataSource dataSource) {
                return false;
            }

            @Override // defpackage.CameraSelector
            public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
                return (dataSource == DataSource.RESOURCE_DISK_CACHE || dataSource == DataSource.MEMORY_CACHE) ? false : true;
            }
        };
        TuitionPaymentFragmentspecialinlinedviewModeldefault3 = new CameraSelector() { // from class: CameraSelector.4
            @Override // defpackage.CameraSelector
            public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault2() {
                return true;
            }

            @Override // defpackage.CameraSelector
            public final boolean b() {
                return true;
            }

            @Override // defpackage.CameraSelector
            public final boolean b(DataSource dataSource) {
                return dataSource == DataSource.REMOTE;
            }

            @Override // defpackage.CameraSelector
            public final boolean TuitionPaymentFragmentspecialinlinedviewModeldefault1(boolean z, DataSource dataSource, EncodeStrategy encodeStrategy) {
                return ((z && dataSource == DataSource.DATA_DISK_CACHE) || dataSource == DataSource.LOCAL) && encodeStrategy == EncodeStrategy.TRANSFORMED;
            }
        };
    }
}
