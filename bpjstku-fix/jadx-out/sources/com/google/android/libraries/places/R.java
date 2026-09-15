package com.google.android.libraries.places;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import defpackage.SessionConfigValidatingBuilder;
import defpackage.getRealtimeCaptureLatency;
import defpackage.initSession;
import java.lang.reflect.Method;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class R {

    /* JADX INFO: loaded from: classes4.dex */
    public static final class array {
        public static final int com_google_android_gms_fonts_certs_dev = 0x7f030003;
        public static final int com_google_android_gms_fonts_certs_prod = 0x7f030004;

        private array() {
        }
    }

    public static final class attr {
        public static final int placesBorderWidth = 0x7f04044e;
        public static final int placesBorderWidthButton = 0x7f04044f;
        public static final int placesColorAttributionDarkTheme = 0x7f040450;
        public static final int placesColorAttributionLightTheme = 0x7f040451;
        public static final int placesColorButtonBorder = 0x7f040452;
        public static final int placesColorInfo = 0x7f040453;
        public static final int placesColorNegative = 0x7f040454;
        public static final int placesColorNeutralContainer = 0x7f040455;
        public static final int placesColorOnNeutralContainer = 0x7f040456;
        public static final int placesColorOnPositiveContainer = 0x7f040457;
        public static final int placesColorOnSecondaryContainer = 0x7f040458;
        public static final int placesColorOnSurface = 0x7f040459;
        public static final int placesColorOnSurfaceVariant = 0x7f04045a;
        public static final int placesColorOutlineDecorative = 0x7f04045b;
        public static final int placesColorPositive = 0x7f04045c;
        public static final int placesColorPositiveContainer = 0x7f04045d;
        public static final int placesColorPrimary = 0x7f04045e;
        public static final int placesColorSecondaryContainer = 0x7f04045f;
        public static final int placesColorSurface = 0x7f040460;
        public static final int placesCornerRadius = 0x7f040461;
        public static final int placesCornerRadiusButton = 0x7f040462;
        public static final int placesCornerRadiusCard = 0x7f040463;
        public static final int placesCornerRadiusCollageOuter = 0x7f040464;
        public static final int placesCornerRadiusDialog = 0x7f040465;
        public static final int placesCornerRadiusThumbnail = 0x7f040466;
        public static final int placesSpacingExtraLarge = 0x7f040467;
        public static final int placesSpacingExtraSmall = 0x7f040468;
        public static final int placesSpacingLarge = 0x7f040469;
        public static final int placesSpacingMedium = 0x7f04046a;
        public static final int placesSpacingSmall = 0x7f04046b;
        public static final int placesSpacingTwoExtraLarge = 0x7f04046c;
        public static final int placesTextAppearanceBodyMedium = 0x7f04046d;
        public static final int placesTextAppearanceBodySmall = 0x7f04046e;
        public static final int placesTextAppearanceDisplaySmall = 0x7f04046f;
        public static final int placesTextAppearanceHeadlineMedium = 0x7f040470;
        public static final int placesTextAppearanceLabelLarge = 0x7f040471;
        public static final int placesTextAppearanceLabelMedium = 0x7f040472;
        public static final int placesTextAppearanceTitleSmall = 0x7f040473;

        private attr() {
        }
    }

    public static final class color {
        public static final int gmp_ref_palette_neutral0 = 0x7f0600eb;
        public static final int gmp_ref_palette_neutral10 = 0x7f0600ec;
        public static final int gmp_ref_palette_neutral100 = 0x7f0600ed;
        public static final int gmp_ref_palette_neutral20 = 0x7f0600ee;
        public static final int gmp_ref_palette_neutral24 = 0x7f0600ef;
        public static final int gmp_ref_palette_neutral30 = 0x7f0600f0;
        public static final int gmp_ref_palette_neutral40 = 0x7f0600f1;
        public static final int gmp_ref_palette_neutral50 = 0x7f0600f2;
        public static final int gmp_ref_palette_neutral6 = 0x7f0600f3;
        public static final int gmp_ref_palette_neutral60 = 0x7f0600f4;
        public static final int gmp_ref_palette_neutral70 = 0x7f0600f5;
        public static final int gmp_ref_palette_neutral80 = 0x7f0600f6;
        public static final int gmp_ref_palette_neutral90 = 0x7f0600f7;
        public static final int gmp_ref_palette_neutral95 = 0x7f0600f8;
        public static final int gmp_ref_palette_neutral98 = 0x7f0600f9;
        public static final int gmp_ref_palette_neutral99 = 0x7f0600fa;
        public static final int gmp_ref_palette_neutral_tint10 = 0x7f0600fb;
        public static final int gmp_ref_palette_neutral_tint100 = 0x7f0600fc;
        public static final int gmp_ref_palette_neutral_tint12 = 0x7f0600fd;
        public static final int gmp_ref_palette_neutral_tint16 = 0x7f0600fe;
        public static final int gmp_ref_palette_neutral_tint17 = 0x7f0600ff;
        public static final int gmp_ref_palette_neutral_tint22 = 0x7f060100;
        public static final int gmp_ref_palette_neutral_tint30 = 0x7f060101;
        public static final int gmp_ref_palette_neutral_tint87 = 0x7f060102;
        public static final int gmp_ref_palette_neutral_tint90 = 0x7f060103;
        public static final int gmp_ref_palette_neutral_tint92 = 0x7f060104;
        public static final int gmp_ref_palette_neutral_tint94 = 0x7f060105;
        public static final int gmp_ref_palette_neutral_tint96 = 0x7f060106;
        public static final int gmp_ref_palette_neutral_tint98 = 0x7f060107;
        public static final int gmp_ref_palette_neutral_tonal = 0x7f060108;
        public static final int gmp_ref_palette_neutral_tonal_selected = 0x7f060109;
        public static final int gmp_ref_palette_neutral_transparent = 0x7f06010a;
        public static final int gmp_ref_palette_primary0 = 0x7f06010b;
        public static final int gmp_ref_palette_primary10 = 0x7f06010c;
        public static final int gmp_ref_palette_primary100 = 0x7f06010d;
        public static final int gmp_ref_palette_primary20 = 0x7f06010e;
        public static final int gmp_ref_palette_primary30 = 0x7f06010f;
        public static final int gmp_ref_palette_primary40 = 0x7f060110;
        public static final int gmp_ref_palette_primary50 = 0x7f060111;
        public static final int gmp_ref_palette_primary60 = 0x7f060112;
        public static final int gmp_ref_palette_primary70 = 0x7f060113;
        public static final int gmp_ref_palette_primary80 = 0x7f060114;
        public static final int gmp_ref_palette_primary90 = 0x7f060115;
        public static final int gmp_ref_palette_primary95 = 0x7f060116;
        public static final int gmp_ref_palette_primary99 = 0x7f060117;
        public static final int gmp_ref_palette_primary_tonal = 0x7f060118;
        public static final int gmp_ref_palette_primary_tonal_selected = 0x7f060119;
        public static final int gmp_ref_palette_red0 = 0x7f06011a;
        public static final int gmp_ref_palette_red10 = 0x7f06011b;
        public static final int gmp_ref_palette_red100 = 0x7f06011c;
        public static final int gmp_ref_palette_red20 = 0x7f06011d;
        public static final int gmp_ref_palette_red30 = 0x7f06011e;
        public static final int gmp_ref_palette_red40 = 0x7f06011f;
        public static final int gmp_ref_palette_red50 = 0x7f060120;
        public static final int gmp_ref_palette_red60 = 0x7f060121;
        public static final int gmp_ref_palette_red70 = 0x7f060122;
        public static final int gmp_ref_palette_red80 = 0x7f060123;
        public static final int gmp_ref_palette_red90 = 0x7f060124;
        public static final int gmp_ref_palette_red95 = 0x7f060125;
        public static final int gmp_ref_palette_red99 = 0x7f060126;
        public static final int gmp_ref_palette_red_tonal = 0x7f060127;
        public static final int gmp_ref_palette_red_tonal_selected = 0x7f060128;
        public static final int gmp_ref_palette_secondary0 = 0x7f060129;
        public static final int gmp_ref_palette_secondary10 = 0x7f06012a;
        public static final int gmp_ref_palette_secondary100 = 0x7f06012b;
        public static final int gmp_ref_palette_secondary20 = 0x7f06012c;
        public static final int gmp_ref_palette_secondary25 = 0x7f06012d;
        public static final int gmp_ref_palette_secondary30 = 0x7f06012e;
        public static final int gmp_ref_palette_secondary40 = 0x7f06012f;
        public static final int gmp_ref_palette_secondary50 = 0x7f060130;
        public static final int gmp_ref_palette_secondary60 = 0x7f060131;
        public static final int gmp_ref_palette_secondary70 = 0x7f060132;
        public static final int gmp_ref_palette_secondary80 = 0x7f060133;
        public static final int gmp_ref_palette_secondary88 = 0x7f060134;
        public static final int gmp_ref_palette_secondary90 = 0x7f060135;
        public static final int gmp_ref_palette_secondary95 = 0x7f060136;
        public static final int gmp_ref_palette_secondary99 = 0x7f060137;
        public static final int gmp_ref_palette_secondary_tonal = 0x7f060138;
        public static final int gmp_ref_palette_secondary_tonal_selected = 0x7f060139;
        public static final int gmp_ref_palette_seconodary85 = 0x7f06013a;
        public static final int gmp_ref_palette_surface1 = 0x7f06013b;
        public static final int gmp_ref_palette_surface2 = 0x7f06013c;
        public static final int gmp_ref_palette_surface3 = 0x7f06013d;
        public static final int gmp_ref_palette_surface4 = 0x7f06013e;
        public static final int gmp_ref_palette_surface5 = 0x7f06013f;
        public static final int gmp_ref_palette_tertiary0 = 0x7f060140;
        public static final int gmp_ref_palette_tertiary10 = 0x7f060141;
        public static final int gmp_ref_palette_tertiary100 = 0x7f060142;
        public static final int gmp_ref_palette_tertiary20 = 0x7f060143;
        public static final int gmp_ref_palette_tertiary30 = 0x7f060144;
        public static final int gmp_ref_palette_tertiary40 = 0x7f060145;
        public static final int gmp_ref_palette_tertiary50 = 0x7f060146;
        public static final int gmp_ref_palette_tertiary60 = 0x7f060147;
        public static final int gmp_ref_palette_tertiary70 = 0x7f060148;
        public static final int gmp_ref_palette_tertiary80 = 0x7f060149;
        public static final int gmp_ref_palette_tertiary90 = 0x7f06014a;
        public static final int gmp_ref_palette_tertiary95 = 0x7f06014b;
        public static final int gmp_ref_palette_tertiary99 = 0x7f06014c;
        public static final int gmp_ref_palette_tertiary_tonal = 0x7f06014d;
        public static final int gmp_ref_palette_tertiary_tonal_selected = 0x7f06014e;
        public static final int gmp_ref_palette_yellow0 = 0x7f06014f;
        public static final int gmp_ref_palette_yellow10 = 0x7f060150;
        public static final int gmp_ref_palette_yellow100 = 0x7f060151;
        public static final int gmp_ref_palette_yellow20 = 0x7f060152;
        public static final int gmp_ref_palette_yellow30 = 0x7f060153;
        public static final int gmp_ref_palette_yellow40 = 0x7f060154;
        public static final int gmp_ref_palette_yellow50 = 0x7f060155;
        public static final int gmp_ref_palette_yellow60 = 0x7f060156;
        public static final int gmp_ref_palette_yellow70 = 0x7f060157;
        public static final int gmp_ref_palette_yellow80 = 0x7f060158;
        public static final int gmp_ref_palette_yellow90 = 0x7f060159;
        public static final int gmp_ref_palette_yellow95 = 0x7f06015a;
        public static final int gmp_ref_palette_yellow99 = 0x7f06015b;
        public static final int gmp_ref_palette_yellow_tonal = 0x7f06015c;
        public static final int gmp_ref_palette_yellow_tonal_selected = 0x7f06015d;
        public static final int gmp_sys_color_dark_caution = 0x7f06015e;
        public static final int gmp_sys_color_dark_caution_container = 0x7f06015f;
        public static final int gmp_sys_color_dark_caution_container_variant = 0x7f060160;
        public static final int gmp_sys_color_dark_caution_variant = 0x7f060161;
        public static final int gmp_sys_color_dark_custom_list = 0x7f060162;
        public static final int gmp_sys_color_dark_default = 0x7f060163;
        public static final int gmp_sys_color_dark_disabled_surface = 0x7f060164;
        public static final int gmp_sys_color_dark_favorite = 0x7f060165;
        public static final int gmp_sys_color_dark_immersive = 0x7f060166;
        public static final int gmp_sys_color_dark_info = 0x7f060167;
        public static final int gmp_sys_color_dark_info_container = 0x7f060168;
        public static final int gmp_sys_color_dark_inverse_primary = 0x7f060169;
        public static final int gmp_sys_color_dark_inverse_surface = 0x7f06016a;
        public static final int gmp_sys_color_dark_local_guides = 0x7f06016b;
        public static final int gmp_sys_color_dark_negative = 0x7f06016c;
        public static final int gmp_sys_color_dark_negative_container = 0x7f06016d;
        public static final int gmp_sys_color_dark_negative_container_variant = 0x7f06016e;
        public static final int gmp_sys_color_dark_neutral_container = 0x7f06016f;
        public static final int gmp_sys_color_dark_neutral_container_variant = 0x7f060170;
        public static final int gmp_sys_color_dark_on_caution = 0x7f060171;
        public static final int gmp_sys_color_dark_on_caution_container = 0x7f060172;
        public static final int gmp_sys_color_dark_on_disabled_surface = 0x7f060173;
        public static final int gmp_sys_color_dark_on_info = 0x7f060174;
        public static final int gmp_sys_color_dark_on_info_container = 0x7f060175;
        public static final int gmp_sys_color_dark_on_inverse_surface = 0x7f060176;
        public static final int gmp_sys_color_dark_on_negative = 0x7f060177;
        public static final int gmp_sys_color_dark_on_negative_container = 0x7f060178;
        public static final int gmp_sys_color_dark_on_neutral_container = 0x7f060179;
        public static final int gmp_sys_color_dark_on_neutral_container_variant = 0x7f06017a;
        public static final int gmp_sys_color_dark_on_positive = 0x7f06017b;
        public static final int gmp_sys_color_dark_on_positive_container = 0x7f06017c;
        public static final int gmp_sys_color_dark_on_primary_container = 0x7f06017d;
        public static final int gmp_sys_color_dark_on_secondary_container = 0x7f06017e;
        public static final int gmp_sys_color_dark_on_selected_container = 0x7f06017f;
        public static final int gmp_sys_color_dark_on_surface = 0x7f060180;
        public static final int gmp_sys_color_dark_on_surface_immersive = 0x7f060181;
        public static final int gmp_sys_color_dark_on_surface_tonal = 0x7f060182;
        public static final int gmp_sys_color_dark_on_surface_variant = 0x7f060183;
        public static final int gmp_sys_color_dark_outline_decorative = 0x7f060184;
        public static final int gmp_sys_color_dark_outline_disabled = 0x7f060185;
        public static final int gmp_sys_color_dark_outline_interactive = 0x7f060186;
        public static final int gmp_sys_color_dark_outline_transparent = 0x7f060187;
        public static final int gmp_sys_color_dark_positive = 0x7f060188;
        public static final int gmp_sys_color_dark_positive_container = 0x7f060189;
        public static final int gmp_sys_color_dark_primary = 0x7f06018a;
        public static final int gmp_sys_color_dark_primary_container = 0x7f06018b;
        public static final int gmp_sys_color_dark_secondary_container = 0x7f06018c;
        public static final int gmp_sys_color_dark_secondary_container_variant = 0x7f06018d;
        public static final int gmp_sys_color_dark_selected_container = 0x7f06018e;
        public static final int gmp_sys_color_dark_star_rating = 0x7f06018f;
        public static final int gmp_sys_color_dark_starred = 0x7f060190;
        public static final int gmp_sys_color_dark_surface_bright = 0x7f060191;
        public static final int gmp_sys_color_dark_surface_container = 0x7f060192;
        public static final int gmp_sys_color_dark_surface_container_bold = 0x7f060193;
        public static final int gmp_sys_color_dark_surface_container_high = 0x7f060194;
        public static final int gmp_sys_color_dark_surface_container_highest = 0x7f060195;
        public static final int gmp_sys_color_dark_surface_container_low = 0x7f060196;
        public static final int gmp_sys_color_dark_surface_container_lowest = 0x7f060197;
        public static final int gmp_sys_color_dark_surface_dim = 0x7f060198;
        public static final int gmp_sys_color_dark_surface_immersive = 0x7f060199;
        public static final int gmp_sys_color_dark_transparent_surface = 0x7f06019a;
        public static final int gmp_sys_color_dark_want_to_go = 0x7f06019b;
        public static final int gmp_sys_color_light_caution = 0x7f06019c;
        public static final int gmp_sys_color_light_caution_container = 0x7f06019d;
        public static final int gmp_sys_color_light_caution_container_variant = 0x7f06019e;
        public static final int gmp_sys_color_light_caution_variant = 0x7f06019f;
        public static final int gmp_sys_color_light_custom_list = 0x7f0601a0;
        public static final int gmp_sys_color_light_default = 0x7f0601a1;
        public static final int gmp_sys_color_light_disabled_surface = 0x7f0601a2;
        public static final int gmp_sys_color_light_favorite = 0x7f0601a3;
        public static final int gmp_sys_color_light_immersive = 0x7f0601a4;
        public static final int gmp_sys_color_light_info = 0x7f0601a5;
        public static final int gmp_sys_color_light_info_container = 0x7f0601a6;
        public static final int gmp_sys_color_light_inverse_primary = 0x7f0601a7;
        public static final int gmp_sys_color_light_inverse_surface = 0x7f0601a8;
        public static final int gmp_sys_color_light_local_guides = 0x7f0601a9;
        public static final int gmp_sys_color_light_negative = 0x7f0601aa;
        public static final int gmp_sys_color_light_negative_container = 0x7f0601ab;
        public static final int gmp_sys_color_light_negative_container_variant = 0x7f0601ac;
        public static final int gmp_sys_color_light_neutral_container = 0x7f0601ad;
        public static final int gmp_sys_color_light_neutral_container_variant = 0x7f0601ae;
        public static final int gmp_sys_color_light_on_caution = 0x7f0601af;
        public static final int gmp_sys_color_light_on_caution_container = 0x7f0601b0;
        public static final int gmp_sys_color_light_on_disabled_surface = 0x7f0601b1;
        public static final int gmp_sys_color_light_on_info = 0x7f0601b2;
        public static final int gmp_sys_color_light_on_info_container = 0x7f0601b3;
        public static final int gmp_sys_color_light_on_inverse_surface = 0x7f0601b4;
        public static final int gmp_sys_color_light_on_negative = 0x7f0601b5;
        public static final int gmp_sys_color_light_on_negative_container = 0x7f0601b6;
        public static final int gmp_sys_color_light_on_neutral_container = 0x7f0601b7;
        public static final int gmp_sys_color_light_on_neutral_container_variant = 0x7f0601b8;
        public static final int gmp_sys_color_light_on_positive = 0x7f0601b9;
        public static final int gmp_sys_color_light_on_positive_container = 0x7f0601ba;
        public static final int gmp_sys_color_light_on_primary_container = 0x7f0601bb;
        public static final int gmp_sys_color_light_on_secondary_container = 0x7f0601bc;
        public static final int gmp_sys_color_light_on_selected_container = 0x7f0601bd;
        public static final int gmp_sys_color_light_on_surface = 0x7f0601be;
        public static final int gmp_sys_color_light_on_surface_immersive = 0x7f0601bf;
        public static final int gmp_sys_color_light_on_surface_tonal = 0x7f0601c0;
        public static final int gmp_sys_color_light_on_surface_variant = 0x7f0601c1;
        public static final int gmp_sys_color_light_outline_decorative = 0x7f0601c2;
        public static final int gmp_sys_color_light_outline_disabled = 0x7f0601c3;
        public static final int gmp_sys_color_light_outline_interactive = 0x7f0601c4;
        public static final int gmp_sys_color_light_outline_transparent = 0x7f0601c5;
        public static final int gmp_sys_color_light_positive = 0x7f0601c6;
        public static final int gmp_sys_color_light_positive_container = 0x7f0601c7;
        public static final int gmp_sys_color_light_primary = 0x7f0601c8;
        public static final int gmp_sys_color_light_primary_container = 0x7f0601c9;
        public static final int gmp_sys_color_light_secondary_container = 0x7f0601ca;
        public static final int gmp_sys_color_light_secondary_container_variant = 0x7f0601cb;
        public static final int gmp_sys_color_light_selected_container = 0x7f0601cc;
        public static final int gmp_sys_color_light_star_rating = 0x7f0601cd;
        public static final int gmp_sys_color_light_starred = 0x7f0601ce;
        public static final int gmp_sys_color_light_surface_bright = 0x7f0601cf;
        public static final int gmp_sys_color_light_surface_container = 0x7f0601d0;
        public static final int gmp_sys_color_light_surface_container_bold = 0x7f0601d1;
        public static final int gmp_sys_color_light_surface_container_high = 0x7f0601d2;
        public static final int gmp_sys_color_light_surface_container_highest = 0x7f0601d3;
        public static final int gmp_sys_color_light_surface_container_low = 0x7f0601d4;
        public static final int gmp_sys_color_light_surface_container_lowest = 0x7f0601d5;
        public static final int gmp_sys_color_light_surface_dim = 0x7f0601d6;
        public static final int gmp_sys_color_light_surface_immersive = 0x7f0601d7;
        public static final int gmp_sys_color_light_transparent_surface = 0x7f0601d8;
        public static final int gmp_sys_color_light_want_to_go = 0x7f0601d9;
        public static final int google_maps_logo_dark_gray = 0x7f0601dd;
        public static final int google_maps_logo_white = 0x7f0601de;
        public static final int photo_viewer_gradient_dark = 0x7f0606a1;
        public static final int photo_viewer_indicator_unselected_color = 0x7f0606a2;
        public static final int place_details_attribution_color_black = 0x7f0606a3;
        public static final int place_details_attribution_color_gray = 0x7f0606a4;
        public static final int place_details_attribution_color_white = 0x7f0606a5;
        public static final int places_autocomplete_error_button = 0x7f0606a6;
        public static final int places_autocomplete_error_message = 0x7f0606a7;
        public static final int places_autocomplete_fullscreen_background = 0x7f0606a8;
        public static final int places_autocomplete_list_background = 0x7f0606a9;
        public static final int places_autocomplete_prediction_primary_text = 0x7f0606aa;
        public static final int places_autocomplete_prediction_primary_text_highlight = 0x7f0606ab;
        public static final int places_autocomplete_prediction_secondary_text = 0x7f0606ac;
        public static final int places_autocomplete_progress_tint = 0x7f0606ad;
        public static final int places_autocomplete_search_hint = 0x7f0606ae;
        public static final int places_autocomplete_search_text = 0x7f0606af;
        public static final int places_autocomplete_separator = 0x7f0606b0;
        public static final int places_color_neutral_container = 0x7f0606b1;
        public static final int places_color_on_neutral_container = 0x7f0606b2;
        public static final int places_color_on_positive_container = 0x7f0606b3;
        public static final int places_color_on_secondary_container = 0x7f0606b4;
        public static final int places_color_on_surface = 0x7f0606b5;
        public static final int places_color_on_surface_variant = 0x7f0606b6;
        public static final int places_color_outline_decorative = 0x7f0606b7;
        public static final int places_color_positive_container = 0x7f0606b8;
        public static final int places_color_primary = 0x7f0606b9;
        public static final int places_color_secondary_container = 0x7f0606ba;
        public static final int places_color_surface_container_lowest = 0x7f0606bb;
        public static final int places_negative_color = 0x7f0606bc;
        public static final int places_positive_color = 0x7f0606bd;
        public static final int places_rating_empty_star_color = 0x7f0606be;
        public static final int places_rating_full_star_color = 0x7f0606bf;
        public static final int places_rating_info_color = 0x7f0606c0;
        public static final int places_text_black_alpha_60 = 0x7f0606c1;
        public static final int places_text_black_alpha_87 = 0x7f0606c2;
        public static final int places_text_white_alpha_60 = 0x7f0606c3;
        public static final int places_text_white_alpha_87 = 0x7f0606c4;
        public static final int places_ui_default_primary = 0x7f0606c5;
        public static final int places_ui_default_primary_dark = 0x7f0606c6;
        public static final int quantum_amber100 = 0x7f0606d5;
        public static final int quantum_amber200 = 0x7f0606d6;
        public static final int quantum_amber300 = 0x7f0606d7;
        public static final int quantum_amber400 = 0x7f0606d8;
        public static final int quantum_amber50 = 0x7f0606d9;
        public static final int quantum_amber500 = 0x7f0606da;
        public static final int quantum_amber600 = 0x7f0606db;
        public static final int quantum_amber700 = 0x7f0606dc;
        public static final int quantum_amber800 = 0x7f0606dd;
        public static final int quantum_amber900 = 0x7f0606de;
        public static final int quantum_amberA100 = 0x7f0606df;
        public static final int quantum_amberA200 = 0x7f0606e0;
        public static final int quantum_amberA400 = 0x7f0606e1;
        public static final int quantum_amberA700 = 0x7f0606e2;
        public static final int quantum_black_100 = 0x7f0606e3;
        public static final int quantum_black_divider = 0x7f0606e4;
        public static final int quantum_black_hint_text = 0x7f0606e5;
        public static final int quantum_black_secondary_text = 0x7f0606e6;
        public static final int quantum_black_text = 0x7f0606e7;
        public static final int quantum_bluegrey100 = 0x7f0606e8;
        public static final int quantum_bluegrey200 = 0x7f0606e9;
        public static final int quantum_bluegrey300 = 0x7f0606ea;
        public static final int quantum_bluegrey400 = 0x7f0606eb;
        public static final int quantum_bluegrey50 = 0x7f0606ec;
        public static final int quantum_bluegrey500 = 0x7f0606ed;
        public static final int quantum_bluegrey600 = 0x7f0606ee;
        public static final int quantum_bluegrey700 = 0x7f0606ef;
        public static final int quantum_bluegrey800 = 0x7f0606f0;
        public static final int quantum_bluegrey900 = 0x7f0606f1;
        public static final int quantum_bluegrey950 = 0x7f0606f2;
        public static final int quantum_brown = 0x7f0606f3;
        public static final int quantum_brown100 = 0x7f0606f4;
        public static final int quantum_brown200 = 0x7f0606f5;
        public static final int quantum_brown300 = 0x7f0606f6;
        public static final int quantum_brown400 = 0x7f0606f7;
        public static final int quantum_brown50 = 0x7f0606f8;
        public static final int quantum_brown500 = 0x7f0606f9;
        public static final int quantum_brown600 = 0x7f0606fa;
        public static final int quantum_brown700 = 0x7f0606fb;
        public static final int quantum_brown800 = 0x7f0606fc;
        public static final int quantum_brown900 = 0x7f0606fd;
        public static final int quantum_cyan = 0x7f0606fe;
        public static final int quantum_cyan100 = 0x7f0606ff;
        public static final int quantum_cyan200 = 0x7f060700;
        public static final int quantum_cyan300 = 0x7f060701;
        public static final int quantum_cyan400 = 0x7f060702;
        public static final int quantum_cyan50 = 0x7f060703;
        public static final int quantum_cyan500 = 0x7f060704;
        public static final int quantum_cyan600 = 0x7f060705;
        public static final int quantum_cyan700 = 0x7f060706;
        public static final int quantum_cyan800 = 0x7f060707;
        public static final int quantum_cyan900 = 0x7f060708;
        public static final int quantum_cyanA100 = 0x7f060709;
        public static final int quantum_cyanA200 = 0x7f06070a;
        public static final int quantum_cyanA400 = 0x7f06070b;
        public static final int quantum_cyanA700 = 0x7f06070c;
        public static final int quantum_deeporange = 0x7f06070d;
        public static final int quantum_deeporange100 = 0x7f06070e;
        public static final int quantum_deeporange200 = 0x7f06070f;
        public static final int quantum_deeporange300 = 0x7f060710;
        public static final int quantum_deeporange400 = 0x7f060711;
        public static final int quantum_deeporange50 = 0x7f060712;
        public static final int quantum_deeporange500 = 0x7f060713;
        public static final int quantum_deeporange600 = 0x7f060714;
        public static final int quantum_deeporange700 = 0x7f060715;
        public static final int quantum_deeporange800 = 0x7f060716;
        public static final int quantum_deeporange900 = 0x7f060717;
        public static final int quantum_deeporangeA100 = 0x7f060718;
        public static final int quantum_deeporangeA200 = 0x7f060719;
        public static final int quantum_deeporangeA400 = 0x7f06071a;
        public static final int quantum_deeporangeA700 = 0x7f06071b;
        public static final int quantum_deeppurple = 0x7f06071c;
        public static final int quantum_deeppurple100 = 0x7f06071d;
        public static final int quantum_deeppurple200 = 0x7f06071e;
        public static final int quantum_deeppurple300 = 0x7f06071f;
        public static final int quantum_deeppurple400 = 0x7f060720;
        public static final int quantum_deeppurple50 = 0x7f060721;
        public static final int quantum_deeppurple500 = 0x7f060722;
        public static final int quantum_deeppurple600 = 0x7f060723;
        public static final int quantum_deeppurple700 = 0x7f060724;
        public static final int quantum_deeppurple800 = 0x7f060725;
        public static final int quantum_deeppurple900 = 0x7f060726;
        public static final int quantum_deeppurpleA100 = 0x7f060727;
        public static final int quantum_deeppurpleA200 = 0x7f060728;
        public static final int quantum_deeppurpleA400 = 0x7f060729;
        public static final int quantum_deeppurpleA700 = 0x7f06072a;
        public static final int quantum_error_dark = 0x7f06072b;
        public static final int quantum_error_light = 0x7f06072c;
        public static final int quantum_googblue = 0x7f06072d;
        public static final int quantum_googblue100 = 0x7f06072e;
        public static final int quantum_googblue200 = 0x7f06072f;
        public static final int quantum_googblue300 = 0x7f060730;
        public static final int quantum_googblue400 = 0x7f060731;
        public static final int quantum_googblue50 = 0x7f060732;
        public static final int quantum_googblue500 = 0x7f060733;
        public static final int quantum_googblue600 = 0x7f060734;
        public static final int quantum_googblue700 = 0x7f060735;
        public static final int quantum_googblue800 = 0x7f060736;
        public static final int quantum_googblue900 = 0x7f060737;
        public static final int quantum_googblueA100 = 0x7f060738;
        public static final int quantum_googblueA200 = 0x7f060739;
        public static final int quantum_googblueA400 = 0x7f06073a;
        public static final int quantum_googblueA700 = 0x7f06073b;
        public static final int quantum_googgreen = 0x7f06073c;
        public static final int quantum_googgreen100 = 0x7f06073d;
        public static final int quantum_googgreen200 = 0x7f06073e;
        public static final int quantum_googgreen300 = 0x7f06073f;
        public static final int quantum_googgreen400 = 0x7f060740;
        public static final int quantum_googgreen50 = 0x7f060741;
        public static final int quantum_googgreen500 = 0x7f060742;
        public static final int quantum_googgreen600 = 0x7f060743;
        public static final int quantum_googgreen700 = 0x7f060744;
        public static final int quantum_googgreen800 = 0x7f060745;
        public static final int quantum_googgreen900 = 0x7f060746;
        public static final int quantum_googgreenA100 = 0x7f060747;
        public static final int quantum_googgreenA200 = 0x7f060748;
        public static final int quantum_googgreenA400 = 0x7f060749;
        public static final int quantum_googgreenA700 = 0x7f06074a;
        public static final int quantum_googred = 0x7f06074b;
        public static final int quantum_googred100 = 0x7f06074c;
        public static final int quantum_googred200 = 0x7f06074d;
        public static final int quantum_googred300 = 0x7f06074e;
        public static final int quantum_googred400 = 0x7f06074f;
        public static final int quantum_googred50 = 0x7f060750;
        public static final int quantum_googred500 = 0x7f060751;
        public static final int quantum_googred600 = 0x7f060752;
        public static final int quantum_googred700 = 0x7f060753;
        public static final int quantum_googred800 = 0x7f060754;
        public static final int quantum_googred900 = 0x7f060755;
        public static final int quantum_googredA100 = 0x7f060756;
        public static final int quantum_googredA200 = 0x7f060757;
        public static final int quantum_googredA400 = 0x7f060758;
        public static final int quantum_googredA700 = 0x7f060759;
        public static final int quantum_googyellow = 0x7f06075a;
        public static final int quantum_googyellow100 = 0x7f06075b;
        public static final int quantum_googyellow200 = 0x7f06075c;
        public static final int quantum_googyellow300 = 0x7f06075d;
        public static final int quantum_googyellow400 = 0x7f06075e;
        public static final int quantum_googyellow50 = 0x7f06075f;
        public static final int quantum_googyellow500 = 0x7f060760;
        public static final int quantum_googyellow600 = 0x7f060761;
        public static final int quantum_googyellow700 = 0x7f060762;
        public static final int quantum_googyellow800 = 0x7f060763;
        public static final int quantum_googyellow900 = 0x7f060764;
        public static final int quantum_googyellowA100 = 0x7f060765;
        public static final int quantum_googyellowA200 = 0x7f060766;
        public static final int quantum_googyellowA400 = 0x7f060767;
        public static final int quantum_googyellowA700 = 0x7f060768;
        public static final int quantum_grey = 0x7f060769;
        public static final int quantum_grey100 = 0x7f06076a;
        public static final int quantum_grey200 = 0x7f06076b;
        public static final int quantum_grey300 = 0x7f06076c;
        public static final int quantum_grey400 = 0x7f06076d;
        public static final int quantum_grey50 = 0x7f06076e;
        public static final int quantum_grey500 = 0x7f06076f;
        public static final int quantum_grey600 = 0x7f060770;
        public static final int quantum_grey700 = 0x7f060771;
        public static final int quantum_grey800 = 0x7f060772;
        public static final int quantum_grey900 = 0x7f060773;
        public static final int quantum_greyblack1000 = 0x7f060774;
        public static final int quantum_greywhite1000 = 0x7f060775;
        public static final int quantum_indigo = 0x7f060776;
        public static final int quantum_indigo100 = 0x7f060777;
        public static final int quantum_indigo200 = 0x7f060778;
        public static final int quantum_indigo300 = 0x7f060779;
        public static final int quantum_indigo400 = 0x7f06077a;
        public static final int quantum_indigo50 = 0x7f06077b;
        public static final int quantum_indigo500 = 0x7f06077c;
        public static final int quantum_indigo600 = 0x7f06077d;
        public static final int quantum_indigo700 = 0x7f06077e;
        public static final int quantum_indigo800 = 0x7f06077f;
        public static final int quantum_indigo900 = 0x7f060780;
        public static final int quantum_indigoA100 = 0x7f060781;
        public static final int quantum_indigoA200 = 0x7f060782;
        public static final int quantum_indigoA400 = 0x7f060783;
        public static final int quantum_indigoA700 = 0x7f060784;
        public static final int quantum_lightblue = 0x7f060785;
        public static final int quantum_lightblue100 = 0x7f060786;
        public static final int quantum_lightblue200 = 0x7f060787;
        public static final int quantum_lightblue300 = 0x7f060788;
        public static final int quantum_lightblue400 = 0x7f060789;
        public static final int quantum_lightblue50 = 0x7f06078a;
        public static final int quantum_lightblue500 = 0x7f06078b;
        public static final int quantum_lightblue600 = 0x7f06078c;
        public static final int quantum_lightblue700 = 0x7f06078d;
        public static final int quantum_lightblue800 = 0x7f06078e;
        public static final int quantum_lightblue900 = 0x7f06078f;
        public static final int quantum_lightblueA100 = 0x7f060790;
        public static final int quantum_lightblueA200 = 0x7f060791;
        public static final int quantum_lightblueA400 = 0x7f060792;
        public static final int quantum_lightblueA700 = 0x7f060793;
        public static final int quantum_lightgreen = 0x7f060794;
        public static final int quantum_lightgreen100 = 0x7f060795;
        public static final int quantum_lightgreen200 = 0x7f060796;
        public static final int quantum_lightgreen300 = 0x7f060797;
        public static final int quantum_lightgreen400 = 0x7f060798;
        public static final int quantum_lightgreen50 = 0x7f060799;
        public static final int quantum_lightgreen500 = 0x7f06079a;
        public static final int quantum_lightgreen600 = 0x7f06079b;
        public static final int quantum_lightgreen700 = 0x7f06079c;
        public static final int quantum_lightgreen800 = 0x7f06079d;
        public static final int quantum_lightgreen900 = 0x7f06079e;
        public static final int quantum_lightgreenA100 = 0x7f06079f;
        public static final int quantum_lightgreenA200 = 0x7f0607a0;
        public static final int quantum_lightgreenA400 = 0x7f0607a1;
        public static final int quantum_lightgreenA700 = 0x7f0607a2;
        public static final int quantum_lime = 0x7f0607a3;
        public static final int quantum_lime100 = 0x7f0607a4;
        public static final int quantum_lime200 = 0x7f0607a5;
        public static final int quantum_lime300 = 0x7f0607a6;
        public static final int quantum_lime400 = 0x7f0607a7;
        public static final int quantum_lime50 = 0x7f0607a8;
        public static final int quantum_lime500 = 0x7f0607a9;
        public static final int quantum_lime600 = 0x7f0607aa;
        public static final int quantum_lime700 = 0x7f0607ab;
        public static final int quantum_lime800 = 0x7f0607ac;
        public static final int quantum_lime900 = 0x7f0607ad;
        public static final int quantum_limeA100 = 0x7f0607ae;
        public static final int quantum_limeA200 = 0x7f0607af;
        public static final int quantum_limeA400 = 0x7f0607b0;
        public static final int quantum_limeA700 = 0x7f0607b1;
        public static final int quantum_orange = 0x7f0607b2;
        public static final int quantum_orange100 = 0x7f0607b3;
        public static final int quantum_orange200 = 0x7f0607b4;
        public static final int quantum_orange300 = 0x7f0607b5;
        public static final int quantum_orange400 = 0x7f0607b6;
        public static final int quantum_orange50 = 0x7f0607b7;
        public static final int quantum_orange500 = 0x7f0607b8;
        public static final int quantum_orange600 = 0x7f0607b9;
        public static final int quantum_orange700 = 0x7f0607ba;
        public static final int quantum_orange800 = 0x7f0607bb;
        public static final int quantum_orange900 = 0x7f0607bc;
        public static final int quantum_orangeA100 = 0x7f0607bd;
        public static final int quantum_orangeA200 = 0x7f0607be;
        public static final int quantum_orangeA400 = 0x7f0607bf;
        public static final int quantum_orangeA700 = 0x7f0607c0;
        public static final int quantum_pink = 0x7f0607c1;
        public static final int quantum_pink100 = 0x7f0607c2;
        public static final int quantum_pink200 = 0x7f0607c3;
        public static final int quantum_pink300 = 0x7f0607c4;
        public static final int quantum_pink400 = 0x7f0607c5;
        public static final int quantum_pink50 = 0x7f0607c6;
        public static final int quantum_pink500 = 0x7f0607c7;
        public static final int quantum_pink600 = 0x7f0607c8;
        public static final int quantum_pink700 = 0x7f0607c9;
        public static final int quantum_pink800 = 0x7f0607ca;
        public static final int quantum_pink900 = 0x7f0607cb;
        public static final int quantum_pinkA100 = 0x7f0607cc;
        public static final int quantum_pinkA200 = 0x7f0607cd;
        public static final int quantum_pinkA400 = 0x7f0607ce;
        public static final int quantum_pinkA700 = 0x7f0607cf;
        public static final int quantum_purple = 0x7f0607d0;
        public static final int quantum_purple100 = 0x7f0607d1;
        public static final int quantum_purple200 = 0x7f0607d2;
        public static final int quantum_purple300 = 0x7f0607d3;
        public static final int quantum_purple400 = 0x7f0607d4;
        public static final int quantum_purple50 = 0x7f0607d5;
        public static final int quantum_purple500 = 0x7f0607d6;
        public static final int quantum_purple600 = 0x7f0607d7;
        public static final int quantum_purple700 = 0x7f0607d8;
        public static final int quantum_purple800 = 0x7f0607d9;
        public static final int quantum_purple900 = 0x7f0607da;
        public static final int quantum_purpleA100 = 0x7f0607db;
        public static final int quantum_purpleA200 = 0x7f0607dc;
        public static final int quantum_purpleA400 = 0x7f0607dd;
        public static final int quantum_purpleA700 = 0x7f0607de;
        public static final int quantum_teal = 0x7f0607df;
        public static final int quantum_teal100 = 0x7f0607e0;
        public static final int quantum_teal200 = 0x7f0607e1;
        public static final int quantum_teal300 = 0x7f0607e2;
        public static final int quantum_teal400 = 0x7f0607e3;
        public static final int quantum_teal50 = 0x7f0607e4;
        public static final int quantum_teal500 = 0x7f0607e5;
        public static final int quantum_teal600 = 0x7f0607e6;
        public static final int quantum_teal700 = 0x7f0607e7;
        public static final int quantum_teal800 = 0x7f0607e8;
        public static final int quantum_teal900 = 0x7f0607e9;
        public static final int quantum_tealA100 = 0x7f0607ea;
        public static final int quantum_tealA200 = 0x7f0607eb;
        public static final int quantum_tealA400 = 0x7f0607ec;
        public static final int quantum_tealA700 = 0x7f0607ed;
        public static final int quantum_vanillablue100 = 0x7f0607ee;
        public static final int quantum_vanillablue200 = 0x7f0607ef;
        public static final int quantum_vanillablue300 = 0x7f0607f0;
        public static final int quantum_vanillablue400 = 0x7f0607f1;
        public static final int quantum_vanillablue50 = 0x7f0607f2;
        public static final int quantum_vanillablue500 = 0x7f0607f3;
        public static final int quantum_vanillablue600 = 0x7f0607f4;
        public static final int quantum_vanillablue700 = 0x7f0607f5;
        public static final int quantum_vanillablue800 = 0x7f0607f6;
        public static final int quantum_vanillablue900 = 0x7f0607f7;
        public static final int quantum_vanillablueA100 = 0x7f0607f8;
        public static final int quantum_vanillablueA200 = 0x7f0607f9;
        public static final int quantum_vanillablueA400 = 0x7f0607fa;
        public static final int quantum_vanillablueA700 = 0x7f0607fb;
        public static final int quantum_vanillagreen100 = 0x7f0607fc;
        public static final int quantum_vanillagreen200 = 0x7f0607fd;
        public static final int quantum_vanillagreen300 = 0x7f0607fe;
        public static final int quantum_vanillagreen400 = 0x7f0607ff;
        public static final int quantum_vanillagreen50 = 0x7f060800;
        public static final int quantum_vanillagreen500 = 0x7f060801;
        public static final int quantum_vanillagreen600 = 0x7f060802;
        public static final int quantum_vanillagreen700 = 0x7f060803;
        public static final int quantum_vanillagreen800 = 0x7f060804;
        public static final int quantum_vanillagreen900 = 0x7f060805;
        public static final int quantum_vanillagreenA100 = 0x7f060806;
        public static final int quantum_vanillagreenA200 = 0x7f060807;
        public static final int quantum_vanillagreenA400 = 0x7f060808;
        public static final int quantum_vanillagreenA700 = 0x7f060809;
        public static final int quantum_vanillared100 = 0x7f06080a;
        public static final int quantum_vanillared200 = 0x7f06080b;
        public static final int quantum_vanillared300 = 0x7f06080c;
        public static final int quantum_vanillared400 = 0x7f06080d;
        public static final int quantum_vanillared50 = 0x7f06080e;
        public static final int quantum_vanillared500 = 0x7f06080f;
        public static final int quantum_vanillared600 = 0x7f060810;
        public static final int quantum_vanillared700 = 0x7f060811;
        public static final int quantum_vanillared800 = 0x7f060812;
        public static final int quantum_vanillared900 = 0x7f060813;
        public static final int quantum_vanillaredA100 = 0x7f060814;
        public static final int quantum_vanillaredA200 = 0x7f060815;
        public static final int quantum_vanillaredA400 = 0x7f060816;
        public static final int quantum_vanillaredA700 = 0x7f060817;
        public static final int quantum_white_100 = 0x7f060818;
        public static final int quantum_white_divider = 0x7f060819;
        public static final int quantum_white_hint_text = 0x7f06081a;
        public static final int quantum_white_secondary_text = 0x7f06081b;
        public static final int quantum_white_text = 0x7f06081c;
        public static final int quantum_yellow = 0x7f06081d;
        public static final int quantum_yellow100 = 0x7f06081e;
        public static final int quantum_yellow200 = 0x7f06081f;
        public static final int quantum_yellow300 = 0x7f060820;
        public static final int quantum_yellow400 = 0x7f060821;
        public static final int quantum_yellow50 = 0x7f060822;
        public static final int quantum_yellow500 = 0x7f060823;
        public static final int quantum_yellow600 = 0x7f060824;
        public static final int quantum_yellow700 = 0x7f060825;
        public static final int quantum_yellow800 = 0x7f060826;
        public static final int quantum_yellow900 = 0x7f060827;
        public static final int quantum_yellowA100 = 0x7f060828;
        public static final int quantum_yellowA200 = 0x7f060829;
        public static final int quantum_yellowA400 = 0x7f06082a;
        public static final int quantum_yellowA700 = 0x7f06082b;

        private color() {
        }
    }

    public static final class dimen {
        public static final int ev_chargers_available_horizontal_padding = 0x7f070138;
        public static final int ev_chargers_available_vertical_padding = 0x7f070139;
        public static final int gmp_ref_measurement_icon_size_14 = 0x7f070142;
        public static final int gmp_ref_measurement_icon_size_18 = 0x7f070143;
        public static final int gmp_ref_measurement_icon_size_24 = 0x7f070144;
        public static final int gmp_ref_measurement_icon_size_32 = 0x7f070145;
        public static final int gmp_ref_measurement_spacing_12 = 0x7f070146;
        public static final int gmp_ref_measurement_spacing_16 = 0x7f070147;
        public static final int gmp_ref_measurement_spacing_20 = 0x7f070148;
        public static final int gmp_ref_measurement_spacing_24 = 0x7f070149;
        public static final int gmp_ref_measurement_spacing_4 = 0x7f07014a;
        public static final int gmp_ref_measurement_spacing_8 = 0x7f07014b;
        public static final int gmp_sys_measurement_gutter = 0x7f07014c;
        public static final int gmp_sys_measurement_horizontal_margin = 0x7f07014d;
        public static final int gmp_sys_measurement_icon_size_extra_small = 0x7f07014e;
        public static final int gmp_sys_measurement_icon_size_large = 0x7f07014f;
        public static final int gmp_sys_measurement_icon_size_medium = 0x7f070150;
        public static final int gmp_sys_measurement_icon_size_small = 0x7f070151;
        public static final int gmp_sys_measurement_keyline = 0x7f070152;
        public static final int gmp_sys_measurement_spacing_extra_large = 0x7f070153;
        public static final int gmp_sys_measurement_spacing_extra_small = 0x7f070154;
        public static final int gmp_sys_measurement_spacing_large = 0x7f070155;
        public static final int gmp_sys_measurement_spacing_medium = 0x7f070156;
        public static final int gmp_sys_measurement_spacing_small = 0x7f070157;
        public static final int gmp_sys_measurement_spacing_two_extra_large = 0x7f070158;
        public static final int gmp_sys_measurement_tap_target = 0x7f070159;
        public static final int gmp_sys_shape_corner_extra_large_corner_size = 0x7f07015a;
        public static final int gmp_sys_shape_corner_extra_small_corner_size = 0x7f07015b;
        public static final int gmp_sys_shape_corner_large_corner_size = 0x7f07015c;
        public static final int gmp_sys_shape_corner_medium_corner_size = 0x7f07015d;
        public static final int gmp_sys_shape_corner_none_corner_size = 0x7f07015e;
        public static final int gmp_sys_shape_corner_small_corner_size = 0x7f07015f;
        public static final int icon_padding_for_min_touch_target_18dp_icon = 0x7f07016b;
        public static final int icon_padding_for_min_touch_target_24dp_icon = 0x7f07016c;
        public static final int lightbox_bottom_gradient_height = 0x7f070172;
        public static final int lightbox_hint_chip_horizontal_margin = 0x7f070173;
        public static final int lightbox_hint_chip_icon_margin_end = 0x7f070174;
        public static final int lightbox_hint_chip_vertical_margin = 0x7f070175;
        public static final int lightbox_top_gradient_height = 0x7f070176;
        public static final int min_touch_target_size_for_a11y = 0x7f070360;
        public static final int photo_viewer_attribution_open_now_button_margin_start = 0x7f07043d;
        public static final int photo_viewer_attribution_open_now_button_size = 0x7f07043e;
        public static final int photo_viewer_attribution_profile_image_margin_end = 0x7f07043f;
        public static final int photo_viewer_attribution_profile_image_size = 0x7f070440;
        public static final int photo_viewer_attribution_profile_margin_vertical = 0x7f070441;
        public static final int photo_viewer_bar_indicator_height = 0x7f070442;
        public static final int photo_viewer_bar_indicator_margin = 0x7f070443;
        public static final int photo_viewer_google_maps_logo_height = 0x7f070444;
        public static final int photo_viewer_google_maps_logo_width = 0x7f070445;
        public static final int photo_viewer_user_profile_card_corner_radius = 0x7f070446;
        public static final int place_details_compact_widget_horizontal_image_size = 0x7f070448;
        public static final int place_details_widget_full_button_horizontal_padding = 0x7f070449;
        public static final int place_details_widget_full_button_vertical_padding = 0x7f07044a;
        public static final int place_search_horizontal_card_width = 0x7f07044c;
        public static final int place_search_image_size_large = 0x7f07044d;
        public static final int place_search_image_size_medium = 0x7f07044e;
        public static final int place_search_image_size_small = 0x7f07044f;
        public static final int place_search_widget_button_elevation = 0x7f070450;
        public static final int place_widget_border_width = 0x7f070451;
        public static final int place_widget_button_border_width = 0x7f070452;
        public static final int places_autocomplete_button_padding = 0x7f070453;
        public static final int places_autocomplete_overlay_padding = 0x7f070454;
        public static final int places_autocomplete_powered_by_google_height = 0x7f070455;
        public static final int places_autocomplete_prediction_height = 0x7f070456;
        public static final int places_autocomplete_prediction_primary_text = 0x7f070457;
        public static final int places_autocomplete_prediction_secondary_text = 0x7f070458;
        public static final int places_autocomplete_progress_horizontal_margin = 0x7f070459;
        public static final int places_autocomplete_progress_size = 0x7f07045a;
        public static final int places_autocomplete_search_bar_button_padding = 0x7f07045b;
        public static final int places_autocomplete_search_bar_margin = 0x7f07045c;
        public static final int places_autocomplete_search_bar_padding = 0x7f07045d;
        public static final int places_autocomplete_search_input_padding = 0x7f07045e;
        public static final int places_autocomplete_search_input_text = 0x7f07045f;
        public static final int places_autocomplete_vertical_dropdown = 0x7f070460;
        public static final int rating_stars_spacing = 0x7f07046b;
        public static final int review_publish_time_badge_horizontal_padding = 0x7f07046c;
        public static final int review_publish_time_badge_vertical_padding = 0x7f07046d;

        private dimen() {
        }
    }

    public static final class drawable {
        public static final int autocomplete_list_item_icon_background = 0x7f0800af;
        public static final int bar_indicator = 0x7f0800b6;
        public static final int cancel_icon = 0x7f080122;
        public static final int current_tab_indicator = 0x7f080138;
        public static final int google_maps_attribution_image = 0x7f08014d;
        public static final int googlemaps_logo_withdarkoutline = 0x7f080150;
        public static final int gs_accessible_forward_vd_24 = 0x7f080152;
        public static final int gs_arrow_forward_ios_vd_20 = 0x7f080153;
        public static final int gs_call_vd_24 = 0x7f080154;
        public static final int gs_cancel_vd_theme_24 = 0x7f080155;
        public static final int gs_check_vd_24 = 0x7f080156;
        public static final int gs_close_vd_24 = 0x7f080157;
        public static final int gs_ev_station_vd_24 = 0x7f080158;
        public static final int gs_info_vd_24 = 0x7f080159;
        public static final int gs_keyboard_arrow_down_vd_24 = 0x7f08015a;
        public static final int gs_more_vert_vd_24 = 0x7f08015b;
        public static final int gs_open_in_new_vd_24 = 0x7f08015c;
        public static final int gs_photo_library_vd_24 = 0x7f08015d;
        public static final int gs_plus_code_vd_24 = 0x7f08015e;
        public static final int gs_public_vd_24 = 0x7f08015f;
        public static final int gs_schedule_vd_24 = 0x7f080160;
        public static final int lightbox_button_background = 0x7f08035d;
        public static final int location_on_icon = 0x7f08035e;
        public static final int open_in_new = 0x7f0803ae;
        public static final int place_card_foreground = 0x7f0803b2;
        public static final int place_details_circle_button_background = 0x7f0803b3;
        public static final int place_details_image_loading_background = 0x7f0803b4;
        public static final int place_details_placeholder_horizontal = 0x7f0803b5;
        public static final int place_details_placeholder_vertical = 0x7f0803b6;
        public static final int place_details_review_publish_time_badge = 0x7f0803b7;
        public static final int place_search_button_background = 0x7f0803b8;
        public static final int place_widgets_foreground = 0x7f0803b9;
        public static final int places_autocomplete_toolbar_shadow = 0x7f0803ba;
        public static final int places_lightbox_bottom_gradient = 0x7f0803bb;
        public static final int places_lightbox_top_gradient = 0x7f0803bc;
        public static final int places_powered_by_google_dark = 0x7f0803bd;
        public static final int places_powered_by_google_light = 0x7f0803be;
        public static final int places_widgets_button_background = 0x7f0803bf;
        public static final int places_widgets_dialog_background = 0x7f0803c0;
        public static final int quantum_ic_arrow_back_grey600_24 = 0x7f0803c5;
        public static final int quantum_ic_clear_grey600_24 = 0x7f0803c6;
        public static final int quantum_ic_cloud_off_vd_theme_24 = 0x7f0803c7;
        public static final int quantum_ic_search_grey600_24 = 0x7f0803c8;
        public static final int ratings_empty_star = 0x7f0803cc;
        public static final int ratings_full_star = 0x7f0803cd;
        public static final int ratings_half_star = 0x7f0803ce;
        public static final int review_author_image_placeholder = 0x7f0803d0;
        public static final int search_bar_background = 0x7f0803d3;
        public static final int user_profile_background = 0x7f0803f6;

        private drawable() {
        }
    }

    public static final class layout {
        public static final int about_tab_feature = 0x7f0e001c;
        public static final int about_tab_horizontal_divider = 0x7f0e001d;
        public static final int about_tab_section_title = 0x7f0e001e;
        public static final int autocomplete_activity = 0x7f0e0120;
        public static final int autocomplete_fullscreen = 0x7f0e0121;
        public static final int autocomplete_google_maps_attribution = 0x7f0e0122;
        public static final int autocomplete_no_matching_results = 0x7f0e0123;
        public static final int autocomplete_prediction_item = 0x7f0e0124;
        public static final int autocomplete_search_bar = 0x7f0e0125;
        public static final int ev_charging_option_item = 0x7f0e0149;
        public static final int expanded_open_hours_item = 0x7f0e014b;
        public static final int fuel_option_item = 0x7f0e01ee;
        public static final int legal_disclosures_dialog = 0x7f0e028b;
        public static final int no_gmm_or_browser_dialog = 0x7f0e02c1;
        public static final int page_indicator = 0x7f0e02d1;
        public static final int photo_viewer_fragment = 0x7f0e02d2;
        public static final int place_collage = 0x7f0e02d3;
        public static final int place_details_about_fragment = 0x7f0e02d4;
        public static final int place_details_compact_content = 0x7f0e02d5;
        public static final int place_details_compact_horizontal_fragment = 0x7f0e02d6;
        public static final int place_details_compact_vertical_fragment = 0x7f0e02d7;
        public static final int place_details_metadata = 0x7f0e02d8;
        public static final int place_details_overview_fragment = 0x7f0e02d9;
        public static final int place_details_reviews_fragment = 0x7f0e02da;
        public static final int place_details_reviews_item = 0x7f0e02db;
        public static final int place_details_vertical_fragment = 0x7f0e02dc;
        public static final int place_search_google_maps_attribution = 0x7f0e02dd;
        public static final int place_search_horizontal_fragment = 0x7f0e02de;
        public static final int place_search_vertical_fragment = 0x7f0e02df;
        public static final int places_autocomplete_activity = 0x7f0e02e0;
        public static final int places_autocomplete_fragment = 0x7f0e02e1;
        public static final int places_autocomplete_impl_error = 0x7f0e02e2;
        public static final int places_autocomplete_impl_fragment_fullscreen = 0x7f0e02e3;
        public static final int places_autocomplete_impl_fragment_overlay = 0x7f0e02e4;
        public static final int places_autocomplete_impl_powered_by_google = 0x7f0e02e5;
        public static final int places_autocomplete_impl_search_bar = 0x7f0e02e6;
        public static final int places_autocomplete_prediction = 0x7f0e02e7;
        public static final int places_lightbox_activity = 0x7f0e02e8;
        public static final int rating_stars_view = 0x7f0e02f9;

        private layout() {
        }
    }

    public static final class menu {
        public static final int photo_more_menu = 0x7f100004;

        private menu() {
        }
    }

    public static final class plurals {
        public static final int place_details_photo_count = 0x7f120001;
        public static final int place_details_ratings_content_description = 0x7f120002;
        public static final int place_details_review_count_a11y_label = 0x7f120003;

        private plurals() {
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class raw {
        public static final int places_keep = 0x7f130008;

        private raw() {
        }
    }

    public static final class string {
        public static final int about_reviews_icon_content_description = 0x7f14001e;
        public static final int about_these_results_body = 0x7f14001f;
        public static final int about_these_results_title = 0x7f140020;
        public static final int autocomplete_error_loading_results_message = 0x7f1400d7;
        public static final int autocomplete_no_matching_results_for_query = 0x7f1400d8;
        public static final int autocomplete_search_hint = 0x7f1400d9;
        public static final int ccs_combo_1_ev_connector_type = 0x7f140159;
        public static final int ccs_combo_2_ev_connector_type = 0x7f14015a;
        public static final int chademo_ev_connector_type = 0x7f14015b;
        public static final int ev_charger_connectors_available = 0x7f140264;
        public static final int ev_charger_max_charge_rate_kw = 0x7f140265;
        public static final int fuel_price = 0x7f140283;
        public static final int fuel_price_updated_over_24_hours_ago = 0x7f140284;
        public static final int fuel_type_diesel = 0x7f140285;
        public static final int fuel_type_midgrade = 0x7f140286;
        public static final int fuel_type_premium = 0x7f140287;
        public static final int fuel_type_regular = 0x7f140288;
        public static final int gb_t_ev_connector_type = 0x7f140289;
        public static final int google_maps_attribution_image_description = 0x7f14028e;
        public static final int google_maps_terms_title = 0x7f140290;
        public static final int google_maps_text_attribution = 0x7f140291;
        public static final int hide_weekly_hours_content_description = 0x7f1402aa;
        public static final int j1772_ev_connector_type = 0x7f1403e9;
        public static final int legal_disclosures_ok = 0x7f1407b3;
        public static final int nacs_outlet_ev_connector_type = 0x7f1408d8;
        public static final int place_details_about_accessibility = 0x7f140998;
        public static final int place_details_about_amenities = 0x7f140999;
        public static final int place_details_about_children = 0x7f14099a;
        public static final int place_details_about_known_for = 0x7f14099b;
        public static final int place_details_about_offerings = 0x7f14099c;
        public static final int place_details_about_parking = 0x7f14099d;
        public static final int place_details_about_payments = 0x7f14099e;
        public static final int place_details_about_pets = 0x7f14099f;
        public static final int place_details_about_popular_for = 0x7f1409a0;
        public static final int place_details_about_service_options = 0x7f1409a1;
        public static final int place_details_about_tab_name = 0x7f1409a2;
        public static final int place_details_accessibility_entrance = 0x7f1409a3;
        public static final int place_details_accessibility_parking_lot = 0x7f1409a4;
        public static final int place_details_accessibility_restroom = 0x7f1409a5;
        public static final int place_details_accessibility_seating = 0x7f1409a6;
        public static final int place_details_amenities_restroom = 0x7f1409a7;
        public static final int place_details_children_good_for_kids = 0x7f1409a8;
        public static final int place_details_children_kids_menu = 0x7f1409a9;
        public static final int place_details_content_spacer = 0x7f1409aa;
        public static final int place_details_curbside_pickup_service_option = 0x7f1409ab;
        public static final int place_details_day_of_week_friday = 0x7f1409ac;
        public static final int place_details_day_of_week_monday = 0x7f1409ad;
        public static final int place_details_day_of_week_saturday = 0x7f1409ae;
        public static final int place_details_day_of_week_sunday = 0x7f1409af;
        public static final int place_details_day_of_week_thursday = 0x7f1409b0;
        public static final int place_details_day_of_week_tuesday = 0x7f1409b1;
        public static final int place_details_day_of_week_wednesday = 0x7f1409b2;
        public static final int place_details_delivery_service_option = 0x7f1409b3;
        public static final int place_details_dine_in_service_option = 0x7f1409b4;
        public static final int place_details_image_content_description = 0x7f1409b5;
        public static final int place_details_known_for_groups = 0x7f1409b6;
        public static final int place_details_known_for_live_music = 0x7f1409b7;
        public static final int place_details_known_for_sports = 0x7f1409b8;
        public static final int place_details_link_no_gmm_or_browser_error_body = 0x7f1409b9;
        public static final int place_details_link_no_gmm_or_browser_error_ok_button = 0x7f1409ba;
        public static final int place_details_link_no_gmm_or_browser_error_title = 0x7f1409bb;
        public static final int place_details_loading_failed = 0x7f1409bc;
        public static final int place_details_maps_button_a11y_label = 0x7f1409bd;
        public static final int place_details_maps_button_label = 0x7f1409be;
        public static final int place_details_next_close_time = 0x7f1409bf;
        public static final int place_details_next_close_time_and_day = 0x7f1409c0;
        public static final int place_details_next_open_time = 0x7f1409c1;
        public static final int place_details_next_open_time_and_day = 0x7f1409c2;
        public static final int place_details_no_reviews = 0x7f1409c3;
        public static final int place_details_offerings_beer = 0x7f1409c4;
        public static final int place_details_offerings_cocktails = 0x7f1409c5;
        public static final int place_details_offerings_coffee = 0x7f1409c6;
        public static final int place_details_offerings_vegetarian_options = 0x7f1409c7;
        public static final int place_details_offerings_wine = 0x7f1409c8;
        public static final int place_details_open_in_maps_button_label = 0x7f1409c9;
        public static final int place_details_opening_status_closed = 0x7f1409ca;
        public static final int place_details_opening_status_open = 0x7f1409cb;
        public static final int place_details_opening_status_open_24_hours = 0x7f1409cc;
        public static final int place_details_opening_status_open_permanently_closed = 0x7f1409cd;
        public static final int place_details_opening_status_open_temporarily_closed = 0x7f1409ce;
        public static final int place_details_outdoor_seating_service_option = 0x7f1409cf;
        public static final int place_details_overview_tab_name = 0x7f1409d0;
        public static final int place_details_parking_free_garage_parking = 0x7f1409d1;
        public static final int place_details_parking_free_parking_lot = 0x7f1409d2;
        public static final int place_details_parking_free_street_parking = 0x7f1409d3;
        public static final int place_details_parking_paid_garage_parking = 0x7f1409d4;
        public static final int place_details_parking_paid_parking_lot = 0x7f1409d5;
        public static final int place_details_parking_paid_street_parking = 0x7f1409d6;
        public static final int place_details_parking_valet = 0x7f1409d7;
        public static final int place_details_payments_cash_only = 0x7f1409d8;
        public static final int place_details_payments_credit_cards = 0x7f1409d9;
        public static final int place_details_payments_debit_cards = 0x7f1409da;
        public static final int place_details_payments_nfc = 0x7f1409db;
        public static final int place_details_pets_dogs = 0x7f1409dc;
        public static final int place_details_popular_for_breakfast = 0x7f1409dd;
        public static final int place_details_popular_for_brunch = 0x7f1409de;
        public static final int place_details_popular_for_dessert = 0x7f1409df;
        public static final int place_details_popular_for_dinner = 0x7f1409e0;
        public static final int place_details_popular_for_lunch = 0x7f1409e1;
        public static final int place_details_price_level_1 = 0x7f1409e2;
        public static final int place_details_price_level_2 = 0x7f1409e3;
        public static final int place_details_price_level_3 = 0x7f1409e4;
        public static final int place_details_price_level_4 = 0x7f1409e5;
        public static final int place_details_price_range = 0x7f1409e6;
        public static final int place_details_price_range_no_upper_bound = 0x7f1409e7;
        public static final int place_details_report_review = 0x7f1409e8;
        public static final int place_details_review_count = 0x7f1409e9;
        public static final int place_details_review_menu_button_content_description = 0x7f1409ea;
        public static final int place_details_reviews_tab_name = 0x7f1409eb;
        public static final int place_details_takeout_service_option = 0x7f1409ec;
        public static final int place_details_takes_reservations_service_option = 0x7f1409ed;
        public static final int place_details_time_midnight = 0x7f1409ee;
        public static final int place_details_time_noon = 0x7f1409ef;
        public static final int place_details_view_review_author_content_description = 0x7f1409f0;
        public static final int place_details_wheelchair_icon_a11y_label = 0x7f1409f1;
        public static final int place_details_wheelchair_icon_label = 0x7f1409f2;
        public static final int place_photo_viewer_attribution_user_profile_image_content_description = 0x7f1409f3;
        public static final int place_photo_viewer_close_button_content_description = 0x7f1409f4;
        public static final int place_photo_viewer_google_maps_logo_content_description = 0x7f1409f5;
        public static final int place_photo_viewer_image_load_failed_message = 0x7f1409f6;
        public static final int place_photo_viewer_more_options_button_content_description = 0x7f1409f7;
        public static final int place_photo_viewer_next_image_button_content_description = 0x7f1409f8;
        public static final int place_photo_viewer_open_in_another_app_button_content_description = 0x7f1409f9;
        public static final int place_photo_viewer_photo_viewer_image_content_description = 0x7f1409fa;
        public static final int place_photo_viewer_previous_image_button_content_description = 0x7f1409fb;
        public static final int place_photo_viewer_report_review = 0x7f1409fc;
        public static final int place_search_loading_failed = 0x7f1409fd;
        public static final int place_search_no_places_to_display = 0x7f1409fe;
        public static final int place_search_scroller_button_a11y_label = 0x7f1409ff;
        public static final int place_widgets_legal_disclosures_icon_a11y_label = 0x7f140a00;
        public static final int places_autocomplete_clear_button = 0x7f140a01;
        public static final int places_autocomplete_label = 0x7f140a02;
        public static final int places_autocomplete_no_results_for_query = 0x7f140a03;
        public static final int places_autocomplete_search_hint = 0x7f140a04;
        public static final int places_ev_charging_last_updated_days = 0x7f140a06;
        public static final int places_ev_charging_last_updated_hours = 0x7f140a07;
        public static final int places_ev_charging_last_updated_minutes = 0x7f140a08;
        public static final int places_ev_charging_last_updated_now = 0x7f140a09;
        public static final int places_navigate_up = 0x7f140a0a;
        public static final int places_powered_by_google = 0x7f140a0b;
        public static final int places_search_error = 0x7f140a0c;
        public static final int places_try_again = 0x7f140a0d;
        public static final int review_ordering_title = 0x7f140a32;
        public static final int reviews_disclosure_body = 0x7f140a33;
        public static final int reviews_disclosure_learn_more = 0x7f140a34;
        public static final int reviews_disclosure_title = 0x7f140a35;
        public static final int reviews_ordering_body = 0x7f140a36;
        public static final int show_weekly_hours_content_description = 0x7f140aac;
        public static final int stale_fuel_price = 0x7f140ab2;
        public static final int tesla_ev_connector_type = 0x7f140ae7;
        public static final int type_2_ev_connector_type = 0x7f140b87;
        public static final int unknown_ev_connector_type = 0x7f140bb8;
        public static final int view_privacy_link = 0x7f140c52;
        public static final int view_privacy_link_content_description = 0x7f140c53;
        public static final int view_terms_link = 0x7f140c54;
        public static final int view_terms_link_content_description = 0x7f140c55;
        public static final int wall_outlet_ev_connector_type = 0x7f140c5a;

        private string() {
        }
    }

    public static final class style {
        public static final int AutocompleteFullscreen = 0x7f150012;
        public static final int GoogleMapsTextAttribution = 0x7f1501cd;
        public static final int PlaceImageCornerShape = 0x7f1501f4;
        public static final int PlacesAutocompleteBase = 0x7f1501f5;
        public static final int PlacesAutocompleteErrorButtonText = 0x7f1501f6;
        public static final int PlacesAutocompleteErrorMessageText = 0x7f1501f7;
        public static final int PlacesAutocompleteFullscreen = 0x7f1501f8;
        public static final int PlacesAutocompleteOverlay = 0x7f1501f9;
        public static final int PlacesMaterialTheme = 0x7f1501fa;

        private style() {
        }
    }

    public static final class styleable {
        public static final int[] PlacesMaterialThemeAttrs = {com.bpjstku.R.attr.placesBorderWidth, com.bpjstku.R.attr.placesBorderWidthButton, com.bpjstku.R.attr.placesColorAttributionDarkTheme, com.bpjstku.R.attr.placesColorAttributionLightTheme, com.bpjstku.R.attr.placesColorButtonBorder, com.bpjstku.R.attr.placesColorInfo, com.bpjstku.R.attr.placesColorNegative, com.bpjstku.R.attr.placesColorNeutralContainer, com.bpjstku.R.attr.placesColorOnNeutralContainer, com.bpjstku.R.attr.placesColorOnPositiveContainer, com.bpjstku.R.attr.placesColorOnSecondaryContainer, com.bpjstku.R.attr.placesColorOnSurface, com.bpjstku.R.attr.placesColorOnSurfaceVariant, com.bpjstku.R.attr.placesColorOutlineDecorative, com.bpjstku.R.attr.placesColorPositive, com.bpjstku.R.attr.placesColorPositiveContainer, com.bpjstku.R.attr.placesColorPrimary, com.bpjstku.R.attr.placesColorSecondaryContainer, com.bpjstku.R.attr.placesColorSurface, com.bpjstku.R.attr.placesCornerRadius, com.bpjstku.R.attr.placesCornerRadiusButton, com.bpjstku.R.attr.placesCornerRadiusCard, com.bpjstku.R.attr.placesCornerRadiusCollageOuter, com.bpjstku.R.attr.placesCornerRadiusDialog, com.bpjstku.R.attr.placesCornerRadiusThumbnail, com.bpjstku.R.attr.placesSpacingExtraLarge, com.bpjstku.R.attr.placesSpacingExtraSmall, com.bpjstku.R.attr.placesSpacingLarge, com.bpjstku.R.attr.placesSpacingMedium, com.bpjstku.R.attr.placesSpacingSmall, com.bpjstku.R.attr.placesSpacingTwoExtraLarge, com.bpjstku.R.attr.placesTextAppearanceBodyMedium, com.bpjstku.R.attr.placesTextAppearanceBodySmall, com.bpjstku.R.attr.placesTextAppearanceDisplaySmall, com.bpjstku.R.attr.placesTextAppearanceHeadlineMedium, com.bpjstku.R.attr.placesTextAppearanceLabelLarge, com.bpjstku.R.attr.placesTextAppearanceLabelMedium, com.bpjstku.R.attr.placesTextAppearanceTitleSmall};
        public static final int PlacesMaterialThemeAttrs_placesBorderWidth = 0x00000000;
        public static final int PlacesMaterialThemeAttrs_placesBorderWidthButton = 0x00000001;
        public static final int PlacesMaterialThemeAttrs_placesColorAttributionDarkTheme = 0x00000002;
        public static final int PlacesMaterialThemeAttrs_placesColorAttributionLightTheme = 0x00000003;
        public static final int PlacesMaterialThemeAttrs_placesColorButtonBorder = 0x00000004;
        public static final int PlacesMaterialThemeAttrs_placesColorInfo = 0x00000005;
        public static final int PlacesMaterialThemeAttrs_placesColorNegative = 0x00000006;
        public static final int PlacesMaterialThemeAttrs_placesColorNeutralContainer = 0x00000007;
        public static final int PlacesMaterialThemeAttrs_placesColorOnNeutralContainer = 0x00000008;
        public static final int PlacesMaterialThemeAttrs_placesColorOnPositiveContainer = 0x00000009;
        public static final int PlacesMaterialThemeAttrs_placesColorOnSecondaryContainer = 0x0000000a;
        public static final int PlacesMaterialThemeAttrs_placesColorOnSurface = 0x0000000b;
        public static final int PlacesMaterialThemeAttrs_placesColorOnSurfaceVariant = 0x0000000c;
        public static final int PlacesMaterialThemeAttrs_placesColorOutlineDecorative = 0x0000000d;
        public static final int PlacesMaterialThemeAttrs_placesColorPositive = 0x0000000e;
        public static final int PlacesMaterialThemeAttrs_placesColorPositiveContainer = 0x0000000f;
        public static final int PlacesMaterialThemeAttrs_placesColorPrimary = 0x00000010;
        public static final int PlacesMaterialThemeAttrs_placesColorSecondaryContainer = 0x00000011;
        public static final int PlacesMaterialThemeAttrs_placesColorSurface = 0x00000012;
        public static final int PlacesMaterialThemeAttrs_placesCornerRadius = 0x00000013;
        public static final int PlacesMaterialThemeAttrs_placesCornerRadiusButton = 0x00000014;
        public static final int PlacesMaterialThemeAttrs_placesCornerRadiusCard = 0x00000015;
        public static final int PlacesMaterialThemeAttrs_placesCornerRadiusCollageOuter = 0x00000016;
        public static final int PlacesMaterialThemeAttrs_placesCornerRadiusDialog = 0x00000017;
        public static final int PlacesMaterialThemeAttrs_placesCornerRadiusThumbnail = 0x00000018;
        public static final int PlacesMaterialThemeAttrs_placesSpacingExtraLarge = 0x00000019;
        public static final int PlacesMaterialThemeAttrs_placesSpacingExtraSmall = 0x0000001a;
        public static final int PlacesMaterialThemeAttrs_placesSpacingLarge = 0x0000001b;
        public static final int PlacesMaterialThemeAttrs_placesSpacingMedium = 0x0000001c;
        public static final int PlacesMaterialThemeAttrs_placesSpacingSmall = 0x0000001d;
        public static final int PlacesMaterialThemeAttrs_placesSpacingTwoExtraLarge = 0x0000001e;
        public static final int PlacesMaterialThemeAttrs_placesTextAppearanceBodyMedium = 0x0000001f;
        public static final int PlacesMaterialThemeAttrs_placesTextAppearanceBodySmall = 0x00000020;
        public static final int PlacesMaterialThemeAttrs_placesTextAppearanceDisplaySmall = 0x00000021;
        public static final int PlacesMaterialThemeAttrs_placesTextAppearanceHeadlineMedium = 0x00000022;
        public static final int PlacesMaterialThemeAttrs_placesTextAppearanceLabelLarge = 0x00000023;
        public static final int PlacesMaterialThemeAttrs_placesTextAppearanceLabelMedium = 0x00000024;
        public static final int PlacesMaterialThemeAttrs_placesTextAppearanceTitleSmall = 0x00000025;

        private styleable() {
        }
    }

    private R() {
    }

    public static final class id {
        public static final int ALT = 0x7f0b0000;
        public static final int BOTTOM_END = 0x7f0b0001;
        public static final int BOTTOM_START = 0x7f0b0002;
        public static final int CTRL = 0x7f0b0003;
        public static final int FUNCTION = 0x7f0b0006;
        public static final int META = 0x7f0b0009;
        public static final int NO_DEBUG = 0x7f0b000b;
        public static final int SHIFT = 0x7f0b000c;
        public static final int SHOW_ALL = 0x7f0b000d;
        public static final int SHOW_PATH = 0x7f0b000e;
        public static final int SHOW_PROGRESS = 0x7f0b000f;
        public static final int SYM = 0x7f0b0010;
        public static final int TOP_END = 0x7f0b0012;
        public static final int TOP_START = 0x7f0b0013;
        public static final int about_reviews = 0x7f0b0014;
        public static final int about_reviews_icon = 0x7f0b0015;
        public static final int about_tab = 0x7f0b0016;
        public static final int about_these_results_body = 0x7f0b0017;
        public static final int about_these_results_container = 0x7f0b0018;
        public static final int about_these_results_link = 0x7f0b0019;
        public static final int about_these_results_link_icon = 0x7f0b001a;
        public static final int about_these_results_link_text = 0x7f0b001b;
        public static final int about_these_results_title = 0x7f0b001c;
        public static final int accelerate = 0x7f0b001e;
        public static final int accessibility_action_clickable_span = 0x7f0b001f;
        public static final int accessibility_custom_action_0 = 0x7f0b0020;
        public static final int accessibility_custom_action_1 = 0x7f0b0021;
        public static final int accessibility_custom_action_10 = 0x7f0b0022;
        public static final int accessibility_custom_action_11 = 0x7f0b0023;
        public static final int accessibility_custom_action_12 = 0x7f0b0024;
        public static final int accessibility_custom_action_13 = 0x7f0b0025;
        public static final int accessibility_custom_action_14 = 0x7f0b0026;
        public static final int accessibility_custom_action_15 = 0x7f0b0027;
        public static final int accessibility_custom_action_16 = 0x7f0b0028;
        public static final int accessibility_custom_action_17 = 0x7f0b0029;
        public static final int accessibility_custom_action_18 = 0x7f0b002a;
        public static final int accessibility_custom_action_19 = 0x7f0b002b;
        public static final int accessibility_custom_action_2 = 0x7f0b002c;
        public static final int accessibility_custom_action_20 = 0x7f0b002d;
        public static final int accessibility_custom_action_21 = 0x7f0b002e;
        public static final int accessibility_custom_action_22 = 0x7f0b002f;
        public static final int accessibility_custom_action_23 = 0x7f0b0030;
        public static final int accessibility_custom_action_24 = 0x7f0b0031;
        public static final int accessibility_custom_action_25 = 0x7f0b0032;
        public static final int accessibility_custom_action_26 = 0x7f0b0033;
        public static final int accessibility_custom_action_27 = 0x7f0b0034;
        public static final int accessibility_custom_action_28 = 0x7f0b0035;
        public static final int accessibility_custom_action_29 = 0x7f0b0036;
        public static final int accessibility_custom_action_3 = 0x7f0b0037;
        public static final int accessibility_custom_action_30 = 0x7f0b0038;
        public static final int accessibility_custom_action_31 = 0x7f0b0039;
        public static final int accessibility_custom_action_4 = 0x7f0b003a;
        public static final int accessibility_custom_action_5 = 0x7f0b003b;
        public static final int accessibility_custom_action_6 = 0x7f0b003c;
        public static final int accessibility_custom_action_7 = 0x7f0b003d;
        public static final int accessibility_custom_action_8 = 0x7f0b003e;
        public static final int accessibility_custom_action_9 = 0x7f0b003f;
        public static final int action0 = 0x7f0b004a;
        public static final int actionDown = 0x7f0b004b;
        public static final int actionDownUp = 0x7f0b004c;
        public static final int actionUp = 0x7f0b004d;
        public static final int action_bar = 0x7f0b004e;
        public static final int action_bar_activity_content = 0x7f0b004f;
        public static final int action_bar_container = 0x7f0b0050;
        public static final int action_bar_root = 0x7f0b0051;
        public static final int action_bar_spinner = 0x7f0b0052;
        public static final int action_bar_subtitle = 0x7f0b0053;
        public static final int action_bar_title = 0x7f0b0054;
        public static final int action_container = 0x7f0b0055;
        public static final int action_context_bar = 0x7f0b0056;
        public static final int action_divider = 0x7f0b0057;
        public static final int action_image = 0x7f0b0058;
        public static final int action_menu_divider = 0x7f0b0059;
        public static final int action_menu_presenter = 0x7f0b005a;
        public static final int action_mode_bar = 0x7f0b005b;
        public static final int action_mode_bar_stub = 0x7f0b005c;
        public static final int action_mode_close_button = 0x7f0b005d;
        public static final int action_rows_bottom_spacer = 0x7f0b005e;
        public static final int action_rows_top_spacer = 0x7f0b005f;
        public static final int action_text = 0x7f0b0061;
        public static final int actions = 0x7f0b0062;
        public static final int activity_chooser_view_content = 0x7f0b0063;
        public static final int add = 0x7f0b0077;
        public static final int address_icon = 0x7f0b0078;
        public static final int address_text = 0x7f0b0079;
        public static final int alertTitle = 0x7f0b007d;
        public static final int aligned = 0x7f0b007e;
        public static final int all = 0x7f0b007f;
        public static final int allStates = 0x7f0b0080;
        public static final int always = 0x7f0b0081;
        public static final int animateToEnd = 0x7f0b0085;
        public static final int animateToStart = 0x7f0b0086;
        public static final int antiClockwise = 0x7f0b0089;
        public static final int anticipate = 0x7f0b008a;
        public static final int asConfigured = 0x7f0b0090;
        public static final int async = 0x7f0b0091;
        public static final int author_attribution = 0x7f0b0092;
        public static final int author_image = 0x7f0b0093;
        public static final int author_name = 0x7f0b0094;
        public static final int auto = 0x7f0b0095;
        public static final int autoComplete = 0x7f0b0096;
        public static final int autoCompleteToEnd = 0x7f0b0097;
        public static final int autoCompleteToStart = 0x7f0b0098;
        public static final int autocomplete_back_image_button = 0x7f0b0099;
        public static final int autocomplete_clear_image_button = 0x7f0b009a;
        public static final int autocomplete_content = 0x7f0b009b;
        public static final int autocomplete_disclosure_icon = 0x7f0b009c;
        public static final int autocomplete_google_maps_attribution_image = 0x7f0b009d;
        public static final int autocomplete_google_maps_attribution_image_container = 0x7f0b009e;
        public static final int autocomplete_google_maps_attribution_image_separator = 0x7f0b009f;
        public static final int autocomplete_message_container = 0x7f0b00a0;
        public static final int autocomplete_message_text_view = 0x7f0b00a1;
        public static final int autocomplete_prediction_container = 0x7f0b00a2;
        public static final int autocomplete_prediction_list = 0x7f0b00a3;
        public static final int autocomplete_prediction_list_separator = 0x7f0b00a4;
        public static final int autocomplete_prediction_primary_text = 0x7f0b00a5;
        public static final int autocomplete_prediction_secondary_text = 0x7f0b00a6;
        public static final int autocomplete_prediction_text_container = 0x7f0b00a7;
        public static final int autocomplete_search_bar_edit_text = 0x7f0b00a8;
        public static final int barrier = 0x7f0b00b8;
        public static final int baseline = 0x7f0b00ba;
        public static final int beginOnFirstDraw = 0x7f0b00bb;
        public static final int beginning = 0x7f0b00bc;
        public static final int bestChoice = 0x7f0b00be;
        public static final int black = 0x7f0b00c3;
        public static final int blocking = 0x7f0b00c4;
        public static final int blurred_background_image = 0x7f0b00c5;
        public static final int bottom = 0x7f0b00c7;
        public static final int bounce = 0x7f0b00ca;
        public static final int bounceBoth = 0x7f0b00cb;
        public static final int bounceEnd = 0x7f0b00cc;
        public static final int bounceStart = 0x7f0b00cd;
        public static final int buttonPanel = 0x7f0b015e;
        public static final int cache_measures = 0x7f0b0170;
        public static final int callMeasure = 0x7f0b0171;
        public static final int cancel_action = 0x7f0b0174;
        public static final int carryVelocity = 0x7f0b0184;
        public static final int center = 0x7f0b018a;
        public static final int center_horizontal = 0x7f0b018d;
        public static final int center_vertical = 0x7f0b018e;
        public static final int chain = 0x7f0b018f;
        public static final int chain2 = 0x7f0b0190;
        public static final int chains = 0x7f0b0191;
        public static final int chargers_available = 0x7f0b0192;
        public static final int chargers_available_card = 0x7f0b0193;
        public static final int checkbox = 0x7f0b0195;
        public static final int checked = 0x7f0b0198;
        public static final int chronometer = 0x7f0b019c;
        public static final int clip_horizontal = 0x7f0b01a7;
        public static final int clip_vertical = 0x7f0b01a8;
        public static final int clockwise = 0x7f0b01a9;
        public static final int close_button = 0x7f0b01aa;
        public static final int closest = 0x7f0b01ab;
        public static final int collapseActionView = 0x7f0b01ae;
        public static final int connector_name = 0x7f0b01b9;
        public static final int constraint = 0x7f0b01ba;
        public static final int content = 0x7f0b01ea;
        public static final int contentPanel = 0x7f0b01f8;
        public static final int continuousVelocity = 0x7f0b01fa;
        public static final int cos = 0x7f0b01fe;
        public static final int currentState = 0x7f0b0207;
        public static final int custom = 0x7f0b0208;
        public static final int customPanel = 0x7f0b0209;
        public static final int cut = 0x7f0b020a;
        public static final int day_of_week_timings = 0x7f0b0258;
        public static final int decelerate = 0x7f0b025a;
        public static final int decelerateAndComplete = 0x7f0b025b;
        public static final int decor_content_parent = 0x7f0b025c;
        public static final int default_activity_button = 0x7f0b025d;
        public static final int deltaRelative = 0x7f0b025f;
        public static final int dependency_ordering = 0x7f0b0260;
        public static final int design_menu_item_action_area = 0x7f0b0265;
        public static final int design_menu_item_action_area_stub = 0x7f0b0266;
        public static final int design_menu_item_text = 0x7f0b0267;
        public static final int design_navigation_view = 0x7f0b0268;
        public static final int dialog_button = 0x7f0b0269;
        public static final int dimensions = 0x7f0b026a;
        public static final int direct = 0x7f0b026b;
        public static final int disableHome = 0x7f0b026c;
        public static final int disableIntraAutoTransition = 0x7f0b026d;
        public static final int disablePostScroll = 0x7f0b026e;
        public static final int disableScroll = 0x7f0b026f;
        public static final int dragAnticlockwise = 0x7f0b027a;
        public static final int dragClockwise = 0x7f0b027b;
        public static final int dragDown = 0x7f0b027c;
        public static final int dragEnd = 0x7f0b027d;
        public static final int dragLeft = 0x7f0b027e;
        public static final int dragRight = 0x7f0b027f;
        public static final int dragStart = 0x7f0b0280;
        public static final int dragUp = 0x7f0b0281;
        public static final int easeIn = 0x7f0b0285;
        public static final int easeInOut = 0x7f0b0286;
        public static final int easeOut = 0x7f0b0287;
        public static final int east = 0x7f0b0288;
        public static final int edge = 0x7f0b0289;
        public static final int edit_query = 0x7f0b0292;
        public static final int edit_text_id = 0x7f0b0293;
        public static final int elastic = 0x7f0b02ff;
        public static final int end = 0x7f0b0315;
        public static final int end_padder = 0x7f0b0317;
        public static final int ev_chargers_availability_last_updated = 0x7f0b0336;
        public static final int ev_charging_icon = 0x7f0b0337;
        public static final int ev_charging_options = 0x7f0b0338;
        public static final int expand_activities_button = 0x7f0b033a;
        public static final int expand_open_hours = 0x7f0b033b;
        public static final int expanded_menu = 0x7f0b033d;
        public static final int expanded_open_hours = 0x7f0b033e;
        public static final int fade = 0x7f0b0340;
        public static final int feature_name = 0x7f0b0341;
        public static final int features_list = 0x7f0b0342;
        public static final int fill = 0x7f0b034c;
        public static final int fill_horizontal = 0x7f0b0350;
        public static final int fill_vertical = 0x7f0b0351;
        public static final int fixed = 0x7f0b035c;
        public static final int flip = 0x7f0b035e;
        public static final int forever = 0x7f0b0363;
        public static final int fragment_container_view_tag = 0x7f0b03ac;
        public static final int frost = 0x7f0b03ae;
        public static final int fuel_options = 0x7f0b03af;
        public static final int fuel_price = 0x7f0b03b0;
        public static final int fuel_type = 0x7f0b03b1;
        public static final int ghost_view = 0x7f0b03b9;
        public static final int ghost_view_holder = 0x7f0b03ba;
        public static final int gone = 0x7f0b03bc;
        public static final int google_maps_attribution = 0x7f0b03bd;
        public static final int google_maps_logo = 0x7f0b03be;
        public static final int graph = 0x7f0b03c8;
        public static final int graph_wrap = 0x7f0b03c9;
        public static final int gray = 0x7f0b03ca;
        public static final int group_divider = 0x7f0b03d4;
        public static final int grouping = 0x7f0b03d5;
        public static final int groups = 0x7f0b03d6;
        public static final int hide_ime_id = 0x7f0b03e6;
        public static final int home = 0x7f0b03ee;
        public static final int homeAsUp = 0x7f0b03ef;
        public static final int honorRequest = 0x7f0b03f0;
        public static final int horizontal = 0x7f0b03f1;
        public static final int horizontal_only = 0x7f0b03f2;
        public static final int icon = 0x7f0b03f5;
        public static final int icon_group = 0x7f0b03f9;
        public static final int ifRoom = 0x7f0b03fc;
        public static final int ignore = 0x7f0b03fd;
        public static final int ignoreRequest = 0x7f0b03fe;
        public static final int image = 0x7f0b0400;
        public static final int image_loading_failure_text = 0x7f0b0407;
        public static final int immediateStop = 0x7f0b04e1;
        public static final int included = 0x7f0b04e3;
        public static final int info = 0x7f0b04e7;
        public static final int invisible = 0x7f0b04f5;
        public static final int is_pooling_container_tag = 0x7f0b04f7;
        public static final int italic = 0x7f0b04f8;
        public static final int item_touch_helper_previous_elevation = 0x7f0b0524;
        public static final int jumpToEnd = 0x7f0b053e;
        public static final int jumpToStart = 0x7f0b053f;
        public static final int layout = 0x7f0b0543;
        public static final int left = 0x7f0b0565;
        public static final int legacy = 0x7f0b0567;
        public static final int legal_disclosures_and_content_divider = 0x7f0b0568;
        public static final int legal_disclosures_dialog_root = 0x7f0b0569;
        public static final int legal_disclosures_icon = 0x7f0b056a;
        public static final int legal_disclosures_ok = 0x7f0b056b;
        public static final int legal_disclosures_scroll_view = 0x7f0b056c;
        public static final int line1 = 0x7f0b056f;
        public static final int line3 = 0x7f0b0571;
        public static final int linear = 0x7f0b0572;
        public static final int listMode = 0x7f0b057d;
        public static final int list_item = 0x7f0b057e;
        public static final int list_item_icon = 0x7f0b057f;
        public static final int list_item_icon_background = 0x7f0b0580;
        public static final int list_item_icon_container = 0x7f0b0581;
        public static final int loading_failed_message = 0x7f0b05b0;
        public static final int loading_failed_ui = 0x7f0b05b1;
        public static final int loading_indicator = 0x7f0b05b2;
        public static final int match_constraint = 0x7f0b05c4;
        public static final int match_parent = 0x7f0b05c5;
        public static final int max_charge_rate = 0x7f0b05db;
        public static final int media_actions = 0x7f0b05dc;
        public static final int message = 0x7f0b05e9;
        public static final int middle = 0x7f0b05ec;
        public static final int more_button = 0x7f0b05f5;
        public static final int motion_base = 0x7f0b05f6;
        public static final int mtrl_child_content_container = 0x7f0b0623;
        public static final int mtrl_internal_children_alpha_tag = 0x7f0b0624;
        public static final int mtrl_view_tag_bottom_padding = 0x7f0b062f;
        public static final int multiply = 0x7f0b0631;
        public static final int navigation_header_container = 0x7f0b063a;
        public static final int never = 0x7f0b063b;
        public static final int neverCompleteToEnd = 0x7f0b063c;
        public static final int neverCompleteToStart = 0x7f0b063d;
        public static final int next_image_button = 0x7f0b063e;
        public static final int next_open_or_close_time = 0x7f0b063f;
        public static final int noState = 0x7f0b0644;
        public static final int no_browser_error_ok = 0x7f0b0645;
        public static final int none = 0x7f0b064a;
        public static final int normal = 0x7f0b064b;
        public static final int north = 0x7f0b064c;
        public static final int notification_background = 0x7f0b064d;
        public static final int notification_main_column = 0x7f0b064e;
        public static final int notification_main_column_container = 0x7f0b064f;
        public static final int off = 0x7f0b0650;
        public static final int on = 0x7f0b0651;
        public static final int onInterceptTouchReturnSwipe = 0x7f0b0652;
        public static final int open_hours_flow = 0x7f0b0653;
        public static final int open_hours_icon = 0x7f0b0654;
        public static final int open_in_maps = 0x7f0b0655;
        public static final int open_in_maps_icon_measurement = 0x7f0b0656;
        public static final int open_in_new_icon = 0x7f0b0657;
        public static final int open_now_status_flow = 0x7f0b0658;
        public static final int open_status = 0x7f0b0667;
        public static final int open_status_and_time_spacer = 0x7f0b0668;
        public static final int overshoot = 0x7f0b0674;
        public static final int overview_tab = 0x7f0b0675;
        public static final int packed = 0x7f0b0676;
        public static final int page_indicator = 0x7f0b0677;
        public static final int parent = 0x7f0b067a;
        public static final int parentPanel = 0x7f0b067b;
        public static final int parentRelative = 0x7f0b067c;
        public static final int parent_matrix = 0x7f0b067d;
        public static final int path = 0x7f0b0681;
        public static final int pathRelative = 0x7f0b0682;
        public static final int percent = 0x7f0b068a;
        public static final int phone_icon = 0x7f0b068e;
        public static final int phone_text = 0x7f0b068f;
        public static final int photo_pager = 0x7f0b0692;
        public static final int photo_viewer_image = 0x7f0b0693;
        public static final int place_address = 0x7f0b0695;
        public static final int place_collage = 0x7f0b0696;
        public static final int place_collage_card = 0x7f0b0697;
        public static final int place_collage_error = 0x7f0b0698;
        public static final int place_content = 0x7f0b0699;
        public static final int place_details_attribution = 0x7f0b069a;
        public static final int place_details_compact_horizontal_card = 0x7f0b069b;
        public static final int place_details_compact_vertical_card = 0x7f0b069c;
        public static final int place_details_horizontal_layout = 0x7f0b069d;
        public static final int place_details_metadata = 0x7f0b069e;
        public static final int place_details_vertical_fragment = 0x7f0b069f;
        public static final int place_details_vertical_layout = 0x7f0b06a0;
        public static final int place_highlight_scrim = 0x7f0b06a1;
        public static final int place_image = 0x7f0b06a2;
        public static final int place_image2 = 0x7f0b06a3;
        public static final int place_image3 = 0x7f0b06a4;
        public static final int place_image_card = 0x7f0b06a5;
        public static final int place_image_card2 = 0x7f0b06a6;
        public static final int place_image_card3 = 0x7f0b06a7;
        public static final int place_image_card_number_of_photos = 0x7f0b06a8;
        public static final int place_image_card_number_of_photos_text = 0x7f0b06a9;
        public static final int place_image_container = 0x7f0b06aa;
        public static final int place_name = 0x7f0b06ab;
        public static final int place_next_open_or_close_time = 0x7f0b06ac;
        public static final int place_open_status = 0x7f0b06ad;
        public static final int place_open_status_and_time_spacer = 0x7f0b06ae;
        public static final int place_price = 0x7f0b06af;
        public static final int place_price_a11y_spacer = 0x7f0b06b0;
        public static final int place_rating = 0x7f0b06b1;
        public static final int place_rating_container = 0x7f0b06b2;
        public static final int place_rating_count = 0x7f0b06b3;
        public static final int place_rating_spacer = 0x7f0b06b4;
        public static final int place_search_attribution_container_bottom = 0x7f0b06b5;
        public static final int place_search_attribution_container_top = 0x7f0b06b6;
        public static final int place_search_border_bottom = 0x7f0b06b7;
        public static final int place_search_disclosure_icon = 0x7f0b06b8;
        public static final int place_search_disclosure_icon_image = 0x7f0b06b9;
        public static final int place_search_google_maps_attribution_image = 0x7f0b06ba;
        public static final int place_search_horizontal_bottom_gap = 0x7f0b06bb;
        public static final int place_search_horizontal_card_view = 0x7f0b06bc;
        public static final int place_search_horizontal_top_gap = 0x7f0b06bd;
        public static final int place_search_list_recycler_view = 0x7f0b06be;
        public static final int place_search_list_recycler_view_container = 0x7f0b06bf;
        public static final int place_search_text_bottom = 0x7f0b06c0;
        public static final int place_search_text_top = 0x7f0b06c1;
        public static final int place_search_vertical_card_view = 0x7f0b06c2;
        public static final int place_summary = 0x7f0b06c3;
        public static final int place_type = 0x7f0b06c4;
        public static final int place_type_price_accessibility_flow = 0x7f0b06c5;
        public static final int place_type_price_spacer = 0x7f0b06c6;
        public static final int place_wheelchair_icon_label = 0x7f0b06c7;
        public static final int places_autocomplete_back_button = 0x7f0b06c8;
        public static final int places_autocomplete_clear_button = 0x7f0b06c9;
        public static final int places_autocomplete_content = 0x7f0b06ca;
        public static final int places_autocomplete_error_message = 0x7f0b06cb;
        public static final int places_autocomplete_list = 0x7f0b06cc;
        public static final int places_autocomplete_powered_by_google = 0x7f0b06cd;
        public static final int places_autocomplete_powered_by_google_separator = 0x7f0b06ce;
        public static final int places_autocomplete_prediction_primary_text = 0x7f0b06cf;
        public static final int places_autocomplete_prediction_secondary_text = 0x7f0b06d0;
        public static final int places_autocomplete_progress = 0x7f0b06d1;
        public static final int places_autocomplete_sad_cloud = 0x7f0b06d2;
        public static final int places_autocomplete_search_bar = 0x7f0b06d3;
        public static final int places_autocomplete_search_bar_container = 0x7f0b06d4;
        public static final int places_autocomplete_search_bar_separator = 0x7f0b06d5;
        public static final int places_autocomplete_search_button = 0x7f0b06d6;
        public static final int places_autocomplete_search_input = 0x7f0b06d7;
        public static final int places_autocomplete_try_again = 0x7f0b06d8;
        public static final int places_autocomplete_try_again_progress = 0x7f0b06d9;
        public static final int places_lightbox_activity_root = 0x7f0b06da;
        public static final int plus_code_icon = 0x7f0b06db;
        public static final int plus_code_text = 0x7f0b06dc;
        public static final int pooling_container_listener_holder_tag = 0x7f0b06dd;
        public static final int position = 0x7f0b06de;
        public static final int postLayout = 0x7f0b06df;
        public static final int previous_image_button = 0x7f0b06e4;
        public static final int profile_image = 0x7f0b06e6;
        public static final int progress_circular = 0x7f0b06ec;
        public static final int progress_horizontal = 0x7f0b06ee;
        public static final int publish_time = 0x7f0b06f0;
        public static final int radio = 0x7f0b06f2;
        public static final int rating_star_1 = 0x7f0b06f3;
        public static final int rating_star_2 = 0x7f0b06f4;
        public static final int rating_star_3 = 0x7f0b06f5;
        public static final int rating_star_4 = 0x7f0b06f6;
        public static final int rating_star_5 = 0x7f0b06f7;
        public static final int rating_stars = 0x7f0b06f8;
        public static final int ratings_flow = 0x7f0b06f9;
        public static final int ratio = 0x7f0b06fa;
        public static final int rectangles = 0x7f0b072a;
        public static final int report_a_photo = 0x7f0b0730;
        public static final int report_drawn = 0x7f0b0731;
        public static final int report_review = 0x7f0b0732;
        public static final int reverseSawtooth = 0x7f0b0735;
        public static final int review_options = 0x7f0b0736;
        public static final int review_ordering_body = 0x7f0b0737;
        public static final int review_ordering_container = 0x7f0b0738;
        public static final int review_ordering_title = 0x7f0b0739;
        public static final int review_text = 0x7f0b073a;
        public static final int reviews_disclosure_body = 0x7f0b073b;
        public static final int reviews_disclosure_container = 0x7f0b073c;
        public static final int reviews_disclosure_learn_more_link = 0x7f0b073d;
        public static final int reviews_disclosure_learn_more_link_icon = 0x7f0b073e;
        public static final int reviews_disclosure_learn_more_link_text = 0x7f0b073f;
        public static final int reviews_disclosure_title = 0x7f0b0740;
        public static final int reviews_list = 0x7f0b0741;
        public static final int reviews_tab = 0x7f0b0742;
        public static final int right = 0x7f0b0755;
        public static final int right_icon = 0x7f0b0757;
        public static final int right_side = 0x7f0b0758;
        public static final int rounded = 0x7f0b0763;
        public static final int row_index_key = 0x7f0b0764;
        public static final int save_non_transition_alpha = 0x7f0b07bc;
        public static final int save_overlay_view = 0x7f0b07bd;
        public static final int sawtooth = 0x7f0b07be;
        public static final int screen = 0x7f0b07c3;
        public static final int scrollIndicatorDown = 0x7f0b07c8;
        public static final int scrollIndicatorUp = 0x7f0b07c9;
        public static final int scrollView = 0x7f0b07ca;
        public static final int scroll_view = 0x7f0b07cb;
        public static final int scrollable = 0x7f0b07cc;
        public static final int scroller_button = 0x7f0b07cd;
        public static final int search_badge = 0x7f0b07cf;
        public static final int search_bar = 0x7f0b07d0;
        public static final int search_button = 0x7f0b07d1;
        public static final int search_close_btn = 0x7f0b07d2;
        public static final int search_edit_frame = 0x7f0b07d3;
        public static final int search_go_btn = 0x7f0b07d4;
        public static final int search_mag_icon = 0x7f0b07d5;
        public static final int search_plate = 0x7f0b07d6;
        public static final int search_src_text = 0x7f0b07d7;
        public static final int search_voice_btn = 0x7f0b07d8;
        public static final int section_title = 0x7f0b07df;
        public static final int select_dialog_listview = 0x7f0b07e4;
        public static final int selection_indicator = 0x7f0b07e6;
        public static final int sharedValueSet = 0x7f0b07f0;
        public static final int sharedValueUnset = 0x7f0b07f1;
        public static final int shortcut = 0x7f0b0800;
        public static final int showCustom = 0x7f0b0801;
        public static final int showHome = 0x7f0b0802;
        public static final int showTitle = 0x7f0b0803;
        public static final int sin = 0x7f0b0804;
        public static final int skipped = 0x7f0b0809;
        public static final int south = 0x7f0b0813;
        public static final int spacer = 0x7f0b0814;
        public static final int special_effects_controller_view_tag = 0x7f0b0815;
        public static final int spline = 0x7f0b0817;
        public static final int split_action_bar = 0x7f0b0818;
        public static final int spread = 0x7f0b0819;
        public static final int spread_inside = 0x7f0b081a;
        public static final int spring = 0x7f0b081b;
        public static final int square = 0x7f0b081d;
        public static final int src_atop = 0x7f0b081e;
        public static final int src_in = 0x7f0b081f;
        public static final int src_over = 0x7f0b0820;
        public static final int stale_fuel_prices_message = 0x7f0b0826;
        public static final int standard = 0x7f0b0827;
        public static final int start = 0x7f0b0828;
        public static final int startHorizontal = 0x7f0b0829;
        public static final int startVertical = 0x7f0b082b;
        public static final int staticLayout = 0x7f0b082f;
        public static final int staticPostLayout = 0x7f0b0830;
        public static final int status_bar_latest_event_content = 0x7f0b0831;
        public static final int stop = 0x7f0b0833;
        public static final int stretch = 0x7f0b0834;
        public static final int submenuarrow = 0x7f0b0835;
        public static final int submit_area = 0x7f0b0836;
        public static final int summary_and_tabs_divider = 0x7f0b0837;
        public static final int supportScrollUp = 0x7f0b0838;
        public static final int tabMode = 0x7f0b0840;
        public static final int tab_layout = 0x7f0b0844;
        public static final int tabs_and_tab_content_divider = 0x7f0b0846;
        public static final int tabs_view_pager = 0x7f0b0847;
        public static final int tag_accessibility_actions = 0x7f0b0848;
        public static final int tag_accessibility_clickable_spans = 0x7f0b0849;
        public static final int tag_accessibility_heading = 0x7f0b084a;
        public static final int tag_accessibility_pane_title = 0x7f0b084b;
        public static final int tag_compat_insets_dispatch = 0x7f0b084c;
        public static final int tag_on_apply_window_listener = 0x7f0b084d;
        public static final int tag_on_receive_content_listener = 0x7f0b084e;
        public static final int tag_on_receive_content_mime_types = 0x7f0b084f;
        public static final int tag_screen_reader_focusable = 0x7f0b0850;
        public static final int tag_state_description = 0x7f0b0851;
        public static final int tag_system_bar_state_monitor = 0x7f0b0852;
        public static final int tag_transition_group = 0x7f0b0853;
        public static final int tag_unhandled_key_event_manager = 0x7f0b0854;
        public static final int tag_unhandled_key_listeners = 0x7f0b0855;
        public static final int tag_window_insets_animation_callback = 0x7f0b0856;
        public static final int terms_container = 0x7f0b085c;
        public static final int text = 0x7f0b085e;
        public static final int text2 = 0x7f0b085f;
        public static final int textSpacerNoButtons = 0x7f0b0862;
        public static final int textSpacerNoTitle = 0x7f0b0863;
        public static final int time = 0x7f0b096c;
        public static final int title = 0x7f0b096f;
        public static final int titleDividerNoCustom = 0x7f0b0978;
        public static final int title_template = 0x7f0b097d;
        public static final int toggle = 0x7f0b097e;
        public static final int top = 0x7f0b0985;
        public static final int topPanel = 0x7f0b0986;
        public static final int transitionToEnd = 0x7f0b098a;
        public static final int transitionToStart = 0x7f0b098b;
        public static final int transition_clip = 0x7f0b098c;
        public static final int transition_current_scene = 0x7f0b098d;
        public static final int transition_image_transform = 0x7f0b098e;
        public static final int transition_layout_save = 0x7f0b098f;
        public static final int transition_pause_alpha = 0x7f0b0990;
        public static final int transition_position = 0x7f0b0991;
        public static final int transition_scene_layoutid_cache = 0x7f0b0992;
        public static final int transition_transform = 0x7f0b0993;
        public static final int triangle = 0x7f0b0994;
        public static final int type_specific_info_divider = 0x7f0b0cf7;
        public static final int unchecked = 0x7f0b0cfb;
        public static final int uniform = 0x7f0b0cfc;
        public static final int up = 0x7f0b0d00;
        public static final int useLogo = 0x7f0b0d01;
        public static final int user_name = 0x7f0b0d03;
        public static final int user_profile_card = 0x7f0b0d04;
        public static final int user_profile_container = 0x7f0b0d05;
        public static final int vertical = 0x7f0b0d06;
        public static final int vertical_only = 0x7f0b0d07;
        public static final int view_privacy_link = 0x7f0b0d5e;
        public static final int view_privacy_link_icon = 0x7f0b0d5f;
        public static final int view_privacy_link_text = 0x7f0b0d60;
        public static final int view_terms_link = 0x7f0b0d61;
        public static final int view_terms_link_icon = 0x7f0b0d62;
        public static final int view_terms_link_text = 0x7f0b0d63;
        public static final int view_transition = 0x7f0b0d64;
        public static final int view_tree_disjoint_parent = 0x7f0b0d65;
        public static final int view_tree_lifecycle_owner = 0x7f0b0d66;
        public static final int view_tree_navigation_event_dispatcher_owner = 0x7f0b0d67;
        public static final int view_tree_on_back_pressed_dispatcher_owner = 0x7f0b0d68;
        public static final int view_tree_saved_state_registry_owner = 0x7f0b0d69;
        public static final int view_tree_view_model_store_owner = 0x7f0b0d6a;
        public static final int visible = 0x7f0b0d6b;
        public static final int visible_removing_fragment_view_tag = 0x7f0b0d6c;
        public static final int website_icon = 0x7f0b0d77;
        public static final int website_text = 0x7f0b0d78;
        public static final int west = 0x7f0b0d7b;
        public static final int wheelchair_accessibility_icon = 0x7f0b0d7c;
        public static final int white = 0x7f0b0d7d;
        public static final int withText = 0x7f0b0d81;
        public static final int wrap = 0x7f0b0d86;
        public static final int wrap_content = 0x7f0b0d87;
        public static final int wrap_content_constrained = 0x7f0b0d88;
        public static final int x_left = 0x7f0b0d8e;
        public static final int x_right = 0x7f0b0d8f;
        private static final byte[] $$c = {83, ByteCompanionObject.MIN_VALUE, -37, -48};
        private static final int $$f = 9;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {49, 84, -120, 101, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, -7, 18, 16, 1, 16, 16, 4, -19, 48, 3, 17, 0, 30, -4, 24, -54, 44, -1, 22, 0, 17, 10, -19, 28, 35, -1, 3, 20, 17, -35, 55, -6, 17, 17, 3, 20, 17, 10, 8, 0, 9, 17, 3, 22, 8, 16, 9, 8, 16, 2, 10, 29, -2, 7, 29, -31, 45, 0, 12, 18, 3, 12, 12, 6, 31, 2, 19, -56};
        private static final int $$e = 38;
        private static final byte[] $$a = {82, Base64.padSymbol, -66, -42, 6, -24, 18, 48, -72, 11, -1, -21, 0, 6, -14, -8, 72, -56, -5, -16, -5, 67, -45, 32, 2, -12, -13, -37, -16, -5, 8, 0, -6, 3, -1, -22, 12, -1, -18, 44, -54, 1, 12, -12, -8, 7, -9, -2, 21, -14, -14, -12, 13};
        private static final int $$b = 130;
        private static int b = 0;
        private static int TuitionPaymentFragmentspecialinlinedviewModeldefault3 = 1;
        private static int[] TuitionPaymentFragmentbindingInflater1 = {-1276754871, -824475578, 1339275166, -445525940, -851305571, 96931298, -1506564764, -1671285362, -242934273, -1100849461, -180398256, -1434270829, -628982946, 765090568, 519981231, 1515152287, -1906573894, 540807711};
        private static long TuitionPaymentFragmentspecialinlinedviewModeldefault2 = -2687802592846192643L;

        /* JADX WARN: Code duplicated, block: B:10:0x0020  */
        /* JADX WARN: Code duplicated, block: B:8:0x0018  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0020
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void d(short r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                int r8 = 93 - r8
                int r6 = 103 - r6
                byte[] r0 = com.google.android.libraries.places.R.id.$$d
                int r1 = 53 - r7
                byte[] r1 = new byte[r1]
                int r7 = 52 - r7
                r2 = 0
                if (r0 != 0) goto L12
                r3 = r8
                r4 = r2
                goto L28
            L12:
                r3 = r2
            L13:
                byte r4 = (byte) r6
                r1[r3] = r4
                if (r3 != r7) goto L20
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L20:
                int r3 = r3 + 1
                r4 = r0[r8]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L28:
                int r6 = r6 + r8
                int r8 = r3 + 1
                int r6 = r6 + (-11)
                r3 = r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.R.id.d(short, short, int, java.lang.Object[]):void");
        }

        private static void e(short s, int i, int i2, Object[] objArr) {
            int i3 = 106 - (i2 * 3);
            int i4 = 36 - (s * 33);
            int i5 = i * 17;
            byte[] bArr = $$a;
            byte[] bArr2 = new byte[i5 + 17];
            int i6 = i5 + 16;
            int i7 = -1;
            if (bArr == null) {
                i3 = (i4 + (-i3)) - 3;
                i4 = i4;
            }
            while (true) {
                i7++;
                bArr2[i7] = (byte) i3;
                int i8 = i4 + 1;
                if (i7 == i6) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i3 = (i3 + (-bArr[i8])) - 3;
                    i4 = i8;
                }
            }
        }

        private static void c(char[] cArr, int i, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            getRealtimeCaptureLatency getrealtimecapturelatency = new getRealtimeCaptureLatency();
            getrealtimecapturelatency.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            getrealtimecapturelatency.b = 0;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i3 = $10 + 91;
                $11 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = getrealtimecapturelatency.b;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (19472 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getTapTimeout() >> 16) + 2624, 13 - Color.alpha(0), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                        }
                        jArr[i4] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).longValue() - (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                        Object[] objArr3 = {getrealtimecapturelatency, getrealtimecapturelatency};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) (TextUtils.getOffsetAfter("", 0) + 39422), 481 - TextUtils.indexOf("", "", 0, 0), 37 - TextUtils.indexOf("", "", 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    int i5 = getrealtimecapturelatency.b;
                    Object[] objArr4 = {Integer.valueOf(cArr[getrealtimecapturelatency.b]), getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(1177060190);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (19472 - Drawable.resolveOpacity(0, 0)), ExpandableListView.getPackedPositionChild(0L) + 2625, 13 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1565121399, false, "F", new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).longValue() ^ (TuitionPaymentFragmentspecialinlinedviewModeldefault2 ^ 9053247990562531611L);
                    Object[] objArr5 = {getrealtimecapturelatency, getrealtimecapturelatency};
                    Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                    if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                        objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (39422 - View.resolveSizeAndState(0, 0, 0)), 481 - TextUtils.getOffsetBefore("", 0), ((Process.getThreadPriority(0) + 20) >> 6) + 37, 1781041463, false, "I", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5);
                }
            }
            char[] cArr2 = new char[length];
            getrealtimecapturelatency.b = 0;
            int i6 = $11 + 15;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            while (getrealtimecapturelatency.b < cArr.length) {
                int i8 = $10 + 115;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr2[getrealtimecapturelatency.b] = (char) jArr[getrealtimecapturelatency.b];
                Object[] objArr6 = {getrealtimecapturelatency, getrealtimecapturelatency};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1900663072);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) (39423 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 481 - (ViewConfiguration.getTapTimeout() >> 16), 37 - TextUtils.getCapsMode("", 0, 0), 1781041463, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2);
        }

        private static void a(int[] iArr, int i, Object[] objArr) throws Throwable {
            int i2;
            int i3 = 2 % 2;
            SessionConfigValidatingBuilder sessionConfigValidatingBuilder = new SessionConfigValidatingBuilder();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = TuitionPaymentFragmentbindingInflater1;
            int i4 = -1870535734;
            int i5 = 1;
            int i6 = 0;
            if (iArr2 != null) {
                int i7 = $10 + 123;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i9 = 0;
                while (i9 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(i4);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault3 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault3 = initSession.b((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3291, 31 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1948206109, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        iArr3[i9] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault3).invoke(null, objArr2)).intValue();
                        i9++;
                        i4 = -1870535734;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = TuitionPaymentFragmentbindingInflater1;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i10 = 0;
                while (i10 < length3) {
                    int i11 = $11 + 105;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        try {
                            Object[] objArr3 = new Object[i5];
                            objArr3[i6] = Integer.valueOf(iArr5[i10]);
                            Object objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                            if (objTuitionPaymentFragmentspecialinlinedviewModeldefault4 == null) {
                                byte b4 = (byte) i6;
                                byte b5 = b4;
                                objTuitionPaymentFragmentspecialinlinedviewModeldefault4 = initSession.b((char) View.resolveSize(i6, i6), (Process.myTid() >> 22) + 3291, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 31, 1948206109, false, $$g(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            iArr6[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault4).invoke(null, objArr3)).intValue();
                            i10 %= 1;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        length3 = length3;
                        Object[] objArr4 = {Integer.valueOf(iArr5[i10])};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-1870535734);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault5 == null) {
                            byte b6 = (byte) 0;
                            byte b7 = b6;
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault5 = initSession.b((char) (ViewConfiguration.getPressedStateDuration() >> 16), 3290 - TextUtils.indexOf((CharSequence) "", '0'), 32 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 1948206109, false, $$g(b6, b7, b7), new Class[]{Integer.TYPE});
                        }
                        iArr6[i10] = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault5).invoke(null, objArr4)).intValue();
                        i10++;
                    }
                    length3 = length3;
                    i5 = 1;
                    i6 = 0;
                }
                i2 = i6;
                iArr5 = iArr6;
            } else {
                i2 = 0;
            }
            System.arraycopy(iArr5, i2, iArr4, i2, length2);
            int i12 = 2;
            sessionConfigValidatingBuilder.b = 2;
            while (sessionConfigValidatingBuilder.b < iArr.length) {
                int i13 = $11 + 123;
                $10 = i13 % 128;
                int i14 = i13 % i12;
                cArr[0] = (char) (iArr[sessionConfigValidatingBuilder.b] >> 16);
                cArr[1] = (char) iArr[sessionConfigValidatingBuilder.b];
                cArr[2] = (char) (iArr[sessionConfigValidatingBuilder.b + 1] >> 16);
                cArr[3] = (char) iArr[sessionConfigValidatingBuilder.b + 1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = (cArr[0] << 16) + cArr[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = (cArr[2] << 16) + cArr[3];
                int i15 = 17;
                for (int i16 = 1; i15 > i16; i16 = 1) {
                    int i17 = $11 + 31;
                    $10 = i17 % 128;
                    if (i17 % 2 != 0) {
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                        Object[] objArr5 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault6 == null) {
                            byte b8 = (byte) 0;
                            byte b9 = (byte) (b8 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault6 = initSession.b((char) (Color.rgb(0, 0, 0) + 16777216), 2559 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 29, 683220507, false, $$g(b8, b9, (byte) (b9 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault6).invoke(null, objArr5)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue;
                        i15 += 2;
                    } else {
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[i15];
                        Object[] objArr6 = {sessionConfigValidatingBuilder, Integer.valueOf(SessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3(sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1)), sessionConfigValidatingBuilder, sessionConfigValidatingBuilder};
                        Object objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(-869811764);
                        if (objTuitionPaymentFragmentspecialinlinedviewModeldefault7 == null) {
                            byte b10 = (byte) 0;
                            byte b11 = (byte) (b10 + 1);
                            objTuitionPaymentFragmentspecialinlinedviewModeldefault7 = initSession.b((char) Color.red(0), 2559 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 28, 683220507, false, $$g(b10, b11, (byte) (b11 - 1)), new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault7).invoke(null, objArr6)).intValue();
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                        sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = iIntValue2;
                        i15--;
                    }
                }
                int i18 = sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i18;
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 ^= iArr4[1];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr4[0];
                sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 ^= iArr[sessionConfigValidatingBuilder.b - 2];
                int i19 = sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                Object[] objArr7 = {sessionConfigValidatingBuilder};
                Object objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.TuitionPaymentFragmentspecialinlinedviewModeldefault3(447797990);
                if (objTuitionPaymentFragmentspecialinlinedviewModeldefault8 == null) {
                    objTuitionPaymentFragmentspecialinlinedviewModeldefault8 = initSession.b((char) (TextUtils.indexOf((CharSequence) "", '0') + 28880), ImageFormat.getBitsPerPixel(0) + 349, 25 - (ViewConfiguration.getLongPressTimeout() >> 16), -30507727, false, "G", new Class[]{Object.class});
                }
                sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 = i19 ^ iArr[((Integer) ((Method) objTuitionPaymentFragmentspecialinlinedviewModeldefault8).invoke(null, objArr7)).intValue()];
                cArr[0] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1 >>> 16);
                cArr[1] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentbindingInflater1;
                cArr[2] = (char) (sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3 >>> 16);
                cArr[3] = (char) sessionConfigValidatingBuilder.TuitionPaymentFragmentspecialinlinedviewModeldefault3;
                cArr2[(sessionConfigValidatingBuilder.b - 2) * 2] = cArr[0];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 1] = cArr[1];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 2] = cArr[2];
                cArr2[((sessionConfigValidatingBuilder.b - 2) * 2) + 3] = cArr[3];
                sessionConfigValidatingBuilder.b += 2;
                i12 = 2;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        private id() {
        }

        /*  JADX ERROR: Type inference failed
            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 267061. Try increasing type updates limit count.
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
            */
        public static java.lang.Object[] TuitionPaymentFragmentspecialinlinedviewModeldefault1(android.content.Context r65, java.lang.String[] r66, int r67, int r68, int r69) {
            /*
                Method dump skipped, instruction units count: 26706
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.R.id.TuitionPaymentFragmentspecialinlinedviewModeldefault1(android.content.Context, java.lang.String[], int, int, int):java.lang.Object[]");
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0022  */
        /* JADX WARN: Code duplicated, block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0022
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static java.lang.String $$g(byte r5, int r6, byte r7) {
            /*
                int r5 = r5 * 3
                int r0 = r5 + 1
                int r6 = r6 * 56
                int r6 = r6 + 66
                byte[] r1 = com.google.android.libraries.places.R.id.$$c
                int r7 = r7 * 2
                int r7 = r7 + 4
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L16
                r4 = r5
                r3 = r2
                goto L26
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r5) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L22:
                int r3 = r3 + 1
                r4 = r1[r7]
            L26:
                int r6 = r6 + r4
                int r7 = r7 + 1
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.R.id.$$g(byte, int, byte):java.lang.String");
        }
    }
}
