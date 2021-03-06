/*
 * Copyright 2010-2018 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.generators.gradle.dsl

import org.jetbrains.kotlin.konan.target.HostManager
import org.jetbrains.kotlin.konan.target.presetName

internal class KotlinPresetEntry(
    val presetName: String,
    val presetType: TypeName,
    val targetType: TypeName
)

internal fun KotlinPresetEntry.typeNames(): Set<TypeName> = setOf(presetType, targetType)

private const val MPP_PACKAGE = "org.jetbrains.kotlin.gradle.plugin.mpp"

private const val KOTLIN_NATIVE_TARGET_PRESET_CLASS_FQNAME = "$MPP_PACKAGE.KotlinNativeTargetPreset"
private const val KOTLIN_NATIVE_TARGET_CLASS_FQNAME = "$MPP_PACKAGE.KotlinNativeTarget"

private const val KOTLIN_ONLY_TARGET_CLASS_FQNAME = "$MPP_PACKAGE.KotlinOnlyTarget"

internal val jvmPresetEntry = KotlinPresetEntry(
    "jvm",
    typeName("$MPP_PACKAGE.KotlinJvmTargetPreset"),
    typeName(
        KOTLIN_ONLY_TARGET_CLASS_FQNAME,
        "$MPP_PACKAGE.KotlinJvmCompilation"
    )
)

internal val jsPresetEntry = KotlinPresetEntry(
    "js",
    typeName("$MPP_PACKAGE.KotlinJsTargetPreset"),
    typeName(
        KOTLIN_ONLY_TARGET_CLASS_FQNAME,
        "$MPP_PACKAGE.KotlinJsCompilation"
    )
)

internal val androidPresetEntry = KotlinPresetEntry(
    "android",
    typeName("$MPP_PACKAGE.KotlinAndroidTargetPreset"),
    typeName("$MPP_PACKAGE.KotlinAndroidTarget")
)

internal val nativePresetEntries = HostManager().targets.map { (_, target) ->
    KotlinPresetEntry(
        target.presetName,
        typeName(KOTLIN_NATIVE_TARGET_PRESET_CLASS_FQNAME),
        typeName(KOTLIN_NATIVE_TARGET_CLASS_FQNAME)
    )
}

internal val allPresetEntries = listOf(
    jvmPresetEntry,
    jsPresetEntry,
    androidPresetEntry
) + nativePresetEntries