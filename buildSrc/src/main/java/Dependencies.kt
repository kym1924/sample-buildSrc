object Dependencies {
    const val GRADLE = "com.android.tools.build:gradle:${Versions.GRADLE}"
    const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib:${Versions.KOTLIN}"
    const val KOTLIN_GRADLE = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Versions.KOTLIN}"

    const val ANDROIDX_CORE = "androidx.core:core-ktx:${Versions.ANDROIDX_CORE}"
    const val ANDROIDX_APPCOMPAT = "androidx.appcompat:appcompat:${Versions.ANDROIDX_APPCOMPAT}"
    const val MATERIAL = "com.google.android.material:material:${Versions.MATERIAL}"
    const val CONSTRAINT_LAYOUT =
        "androidx.constraintlayout:constraintlayout:${Versions.CONSTRAINT_LAYOUT}"

    const val TEST_JUNIT = "junit:junit:${Versions.TEST_JUNIT}"
    const val TEST_JUNIT_EXT = "androidx.test.ext:junit:${Versions.TEST_JUNIT_EXT}"
    const val TEST_ESPRESSO = "androidx.test.espresso:espresso-core:${Versions.TEST_ESPRESSO}"
}