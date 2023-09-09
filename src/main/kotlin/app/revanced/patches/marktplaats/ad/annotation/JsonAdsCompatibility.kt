package app.revanced.patches.marktplaats.ad.annotation

import app.revanced.patcher.annotation.Compatibility
import app.revanced.patcher.annotation.Package

@Compatibility([Package("nl.marktplaats.android", arrayOf("12.82.0"))])
@Target(AnnotationTarget.CLASS)
internal annotation class JsonAdsCompatibility

