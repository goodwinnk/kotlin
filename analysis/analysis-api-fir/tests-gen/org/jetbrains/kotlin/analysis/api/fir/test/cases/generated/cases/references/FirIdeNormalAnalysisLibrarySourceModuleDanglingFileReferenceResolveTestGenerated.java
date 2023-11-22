/*
 * Copyright 2010-2024 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.analysis.api.fir.test.cases.generated.cases.references;

import com.intellij.testFramework.TestDataPath;
import org.jetbrains.kotlin.test.util.KtTestUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.kotlin.analysis.api.fir.test.configurators.AnalysisApiFirTestConfiguratorFactory;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfiguratorFactoryData;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiTestConfigurator;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.TestModuleKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.FrontendKind;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisSessionMode;
import org.jetbrains.kotlin.analysis.test.framework.test.configurators.AnalysisApiMode;
import org.jetbrains.kotlin.analysis.api.impl.base.test.cases.references.AbstractDanglingFileReferenceResolveTest;
import org.jetbrains.kotlin.test.TestMetadata;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.regex.Pattern;

/** This class is generated by {@link org.jetbrains.kotlin.generators.tests.analysis.api.GenerateAnalysisApiTestsKt}. DO NOT MODIFY MANUALLY */
@SuppressWarnings("all")
@TestMetadata("analysis/analysis-api/testData/danglingFileReferenceResolve")
@TestDataPath("$PROJECT_ROOT")
public class FirIdeNormalAnalysisLibrarySourceModuleDanglingFileReferenceResolveTestGenerated extends AbstractDanglingFileReferenceResolveTest {
    @NotNull
    @Override
    public AnalysisApiTestConfigurator getConfigurator() {
        return AnalysisApiFirTestConfiguratorFactory.INSTANCE.createConfigurator(
            new AnalysisApiTestConfiguratorFactoryData(
                FrontendKind.Fir,
                TestModuleKind.LibrarySource,
                AnalysisSessionMode.Normal,
                AnalysisApiMode.Ide
            )
        );
    }

    @Test
    public void testAllFilesPresentInDanglingFileReferenceResolve() throws Exception {
        KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/danglingFileReferenceResolve"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
    }

    @Test
    @TestMetadata("classDifferentFile.kt")
    public void testClassDifferentFile() throws Exception {
        runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/classDifferentFile.kt");
    }

    @Test
    @TestMetadata("classSameFile.kt")
    public void testClassSameFile() throws Exception {
        runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/classSameFile.kt");
    }

    @Test
    @TestMetadata("functionDifferentFile.kt")
    public void testFunctionDifferentFile() throws Exception {
        runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/functionDifferentFile.kt");
    }

    @Test
    @TestMetadata("functionSameFile.kt")
    public void testFunctionSameFile() throws Exception {
        runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/functionSameFile.kt");
    }

    @Nested
    @TestMetadata("analysis/analysis-api/testData/danglingFileReferenceResolve/ignoreSelf")
    @TestDataPath("$PROJECT_ROOT")
    public class IgnoreSelf {
        @Test
        public void testAllFilesPresentInIgnoreSelf() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/danglingFileReferenceResolve/ignoreSelf"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("classTypeParameter.kt")
        public void testClassTypeParameter() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/ignoreSelf/classTypeParameter.kt");
        }

        @Test
        @TestMetadata("companionObject.kt")
        public void testCompanionObject() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/ignoreSelf/companionObject.kt");
        }

        @Test
        @TestMetadata("functionTypeParameter.kt")
        public void testFunctionTypeParameter() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/ignoreSelf/functionTypeParameter.kt");
        }

        @Test
        @TestMetadata("localClass.kt")
        public void testLocalClass() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/ignoreSelf/localClass.kt");
        }

        @Test
        @TestMetadata("localVariable.kt")
        public void testLocalVariable() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/ignoreSelf/localVariable.kt");
        }

        @Test
        @TestMetadata("outerClassProperty.kt")
        public void testOuterClassProperty() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/ignoreSelf/outerClassProperty.kt");
        }

        @Test
        @TestMetadata("primaryConstructorParameter.kt")
        public void testPrimaryConstructorParameter() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/ignoreSelf/primaryConstructorParameter.kt");
        }

        @Test
        @TestMetadata("privateClass.kt")
        public void testPrivateClass() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/ignoreSelf/privateClass.kt");
        }

        @Test
        @TestMetadata("privateFunction.kt")
        public void testPrivateFunction() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/ignoreSelf/privateFunction.kt");
        }

        @Test
        @TestMetadata("privateProperty.kt")
        public void testPrivateProperty() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/ignoreSelf/privateProperty.kt");
        }

        @Test
        @TestMetadata("publicFunction.kt")
        public void testPublicFunction() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/ignoreSelf/publicFunction.kt");
        }

        @Test
        @TestMetadata("publicProperty.kt")
        public void testPublicProperty() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/ignoreSelf/publicProperty.kt");
        }

        @Test
        @TestMetadata("syntheticFieldVariable.kt")
        public void testSyntheticFieldVariable() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/ignoreSelf/syntheticFieldVariable.kt");
        }

        @Test
        @TestMetadata("topLevelFunction.kt")
        public void testTopLevelFunction() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/ignoreSelf/topLevelFunction.kt");
        }

        @Test
        @TestMetadata("valueParameter.kt")
        public void testValueParameter() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/ignoreSelf/valueParameter.kt");
        }
    }

    @Nested
    @TestMetadata("analysis/analysis-api/testData/danglingFileReferenceResolve/preferSelf")
    @TestDataPath("$PROJECT_ROOT")
    public class PreferSelf {
        @Test
        public void testAllFilesPresentInPreferSelf() throws Exception {
            KtTestUtil.assertAllTestsPresentByMetadataWithExcluded(this.getClass(), new File("analysis/analysis-api/testData/danglingFileReferenceResolve/preferSelf"), Pattern.compile("^([^.]+)\\.kt$"), null, true);
        }

        @Test
        @TestMetadata("classTypeParameter.kt")
        public void testClassTypeParameter() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/preferSelf/classTypeParameter.kt");
        }

        @Test
        @TestMetadata("companionObject.kt")
        public void testCompanionObject() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/preferSelf/companionObject.kt");
        }

        @Test
        @TestMetadata("functionTypeParameter.kt")
        public void testFunctionTypeParameter() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/preferSelf/functionTypeParameter.kt");
        }

        @Test
        @TestMetadata("localClass.kt")
        public void testLocalClass() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/preferSelf/localClass.kt");
        }

        @Test
        @TestMetadata("localVariable.kt")
        public void testLocalVariable() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/preferSelf/localVariable.kt");
        }

        @Test
        @TestMetadata("outerClassProperty.kt")
        public void testOuterClassProperty() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/preferSelf/outerClassProperty.kt");
        }

        @Test
        @TestMetadata("primaryConstructorParameter.kt")
        public void testPrimaryConstructorParameter() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/preferSelf/primaryConstructorParameter.kt");
        }

        @Test
        @TestMetadata("privateClass.kt")
        public void testPrivateClass() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/preferSelf/privateClass.kt");
        }

        @Test
        @TestMetadata("privateFunction.kt")
        public void testPrivateFunction() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/preferSelf/privateFunction.kt");
        }

        @Test
        @TestMetadata("privateProperty.kt")
        public void testPrivateProperty() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/preferSelf/privateProperty.kt");
        }

        @Test
        @TestMetadata("publicFunction.kt")
        public void testPublicFunction() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/preferSelf/publicFunction.kt");
        }

        @Test
        @TestMetadata("publicProperty.kt")
        public void testPublicProperty() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/preferSelf/publicProperty.kt");
        }

        @Test
        @TestMetadata("syntheticFieldVariable.kt")
        public void testSyntheticFieldVariable() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/preferSelf/syntheticFieldVariable.kt");
        }

        @Test
        @TestMetadata("topLevelFunction.kt")
        public void testTopLevelFunction() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/preferSelf/topLevelFunction.kt");
        }

        @Test
        @TestMetadata("valueParameter.kt")
        public void testValueParameter() throws Exception {
            runTest("analysis/analysis-api/testData/danglingFileReferenceResolve/preferSelf/valueParameter.kt");
        }
    }
}
