package br.edu.utfpr.calculaimc.util

import kotlin.math.pow


    fun calculaimc(peso: Double, altura: Double, locale: String): Double {

        if (locale.equals(other = "en", ignoreCase = true)) {
            return 783 * (peso / altura.pow(x = 2.0))
        } else {
            return (peso / altura.pow(x = 2.0))

        }

        val resultado: Double = peso / altura.pow(2.0)

    }
