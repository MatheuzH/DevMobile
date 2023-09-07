import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TesteCalculadora {

        CalculadoraImc calImc;

        @Before
            public void setup(){
            calImc = new CalculadoraImc();
        }

        @Test
        public void testeAdultoBaixoPesoMuitoGrave() {
            Assert.assertEquals(
                    "Baixo peso muito grave",
                    calImc.calcGeral(45, 1.75, 21, "homem")
            );
        }

        @Test
        public void testeAdultoBaixoPesoGraveMin() {
            Assert.assertEquals(
                    "Baixo peso grave",
                    calImc.calcGeral(49, 1.75, 21, "homem")
            );
        }

        @Test
        public void testeAdultoBaixoPesoGraveMax() {
            Assert.assertEquals(
                    "Baixo peso grave",
                    calImc.calcGeral(52, 1.75, 21, "homem")
            );
        }

        @Test
        public void testeAdultoBaixoPesoMin() {
            Assert.assertEquals(
                    "Baixo peso",
                    calImc.calcGeral(62, 1.901, 21, "homem")
            );
        }

        @Test
        public void testeAdultoBaixoPesoMax() {
            Assert.assertEquals(
                    "Baixo peso",
                    calImc.calcGeral(67, 1.904, 21, "mulher")
            );
        }

        @Test
        public void testeAdultoPesoNormalIMin() { //IMC >= 18.50 && IMC < 25
            Assert.assertEquals(
                    "Peso normal",
                    calImc.calcGeral(70, 1.75, 21, "homem")
            );
        }

        @Test
        public void testeAdultoPesoNormalMax() { //IMC >= 18.50 && IMC < 25
            Assert.assertEquals(
                    "Peso normal",
                    calImc.calcGeral(68, 1.65, 21, "homem")
            );
        }

        @Test
        public void testeAdultoSobrepesoMin() { //IMC >= 25 && IMC < 30
            Assert.assertEquals(
                    "Sobrepeso",
                    calImc.calcGeral(69, 1.65, 21, "homem")
            );
        }

        @Test
        public void testeAdultoSobrepesoMax() {
            Assert.assertEquals(
                    "Sobrepeso",
                    calImc.calcGeral(80, 1.634, 35, "mulher")
            );
        }

        @Test
        public void testeAdultoObesidadeGrauIMin() { //IMC >= 30 && IMC < 35
            Assert.assertEquals(
                    "Obesidade grau I",
                    calImc.calcGeral(80, 1.63, 21, "homem")
            );
        }

        @Test
        public void testeAdultoObesidadeGrauIMax() { //IMC >= 30 && IMC < 35
            Assert.assertEquals(
                    "Obesidade grau I",
                    calImc.calcGeral(92, 1.63, 21, "homem")
            );
        }

        @Test
        public void testeAdultoObesidadeGrauIIMin() {//IMC >= 35 && IMC < 40
            Assert.assertEquals(
                    "Obesidade grau II",
                    calImc.calcGeral(95, 1.63, 21, "mulher")
            );
        }

        @Test
        public void testeAdultoObesidadeGrauIISMax() {//IMC >= 35 && IMC < 40
            Assert.assertEquals(
                    "Obesidade grau II",
                    calImc.calcGeral(115, 1.70, 21, "mulher")
            );
        }

        @Test
        public void testeAdultoObesidadeGrauIII() {//>=40
            Assert.assertEquals(
                    "Obesidade grau III (obesidade mórbida)",
                    calImc.calcGeral(120, 1.70, 21, "homem")
            );
        }

        @Test
        public void testeIdosoMulherBaixoPeso() {
            Assert.assertEquals(
                    "Baixo peso",
                    calImc.calcGeral(66, 1.75, 66, "mulher")
            );
        }

        @Test
        public void testeIdosoMulherPesoNormalMin() {
            Assert.assertEquals(
                    "Peso normal",
                    calImc.calcGeral(68, 1.75, 66, "mulher")
            );
        }

        @Test
        public void testeIdosoMulherPesoNormalSMax() {
            Assert.assertEquals(
                    "Peso normal",
                    calImc.calcGeral(82, 1.75, 66, "mulher")
            );
        }

        @Test
        public void testeIdosoMulherSobrepesoMin() {
            Assert.assertEquals(
                    "Sobrepeso",
                    calImc.calcGeral(83, 1.75, 66, "mulher")
            );
        }

        @Test
        public void testeIdosoMulherSobrepesoMax() {
            Assert.assertEquals(
                    "Sobrepeso",
                    calImc.calcGeral(98, 1.75, 66, "mulher")
            );
        }

        @Test
        public void testeIdosoMulherObesidadeGrauIMin() {
            Assert.assertEquals(
                    "Obesidade grau I",
                    calImc.calcGeral(99, 1.75, 66, "mulher")
            );
        }

        @Test
        public void testeIdosoMulherObesidadeGrauIMax() {
            Assert.assertEquals(
                    "Obesidade grau I",
                    calImc.calcGeral(113, 1.75, 66, "mulher")
            );
        }

        @Test
        public void testeIdosoMulherObesidadeGrauIIIMin() {
            Assert.assertEquals(
                    "Obesidade grau II",
                    calImc.calcGeral(114, 1.75, 66, "mulher")
            );
        }

        @Test
        public void testeIdosoMulherObesidadeGrauIIMax() {
            Assert.assertEquals(
                    "Obesidade grau II",
                    calImc.calcGeral(128, 1.75, 66, "mulher")
            );
        }

        @Test
        public void testeIdosoMulherObesidadeGrauIII() {
            Assert.assertEquals(
                    "Obesidade grau III (obesidade mórbida)",
                    calImc.calcGeral(129, 1.75, 66, "mulher")
            );
        }

        @Test
        public void testeIdosoHomemBaixoPeso() {
            Assert.assertEquals(
                    "Baixo peso",
                    calImc.calcGeral(67, 1.75, 66, "homem")
            );
        }

        @Test
        public void testeIdosoHomemPesoNormalMin() {
            Assert.assertEquals(
                    "Peso normal",
                    calImc.calcGeral(68, 1.75, 66, "homem")
            );
        }

        @Test
        public void testeIdosoHomemPesoNormalMax() {
            Assert.assertEquals(
                    "Peso normal",
                    calImc.calcGeral(82, 1.75, 66, "homem")
            );
        }

        @Test
        public void testeIdosoHomemSobrepesoMin() {
            Assert.assertEquals(
                    "Sobrepeso",
                    calImc.calcGeral(83, 1.75, 66, "homem")
            );
        }

        @Test
        public void testeIdosoHomemSobrepesoMax() {
            Assert.assertEquals(
                    "Sobrepeso",
                    calImc.calcGeral(91, 1.75, 66, "homem")
            );
        }

        @Test
        public void testeIdosoHomemObesidadeGrauIMin() {
            Assert.assertEquals(
                    "Obesidade grau I",
                    calImc.calcGeral(92, 1.70, 66, "homem")
            );
        }

        @Test
        public void testeIdosoHomemObesidadeGrauIMax() {
            Assert.assertEquals(
                    "Obesidade grau I",
                    calImc.calcGeral(107, 1.75, 66, "homem")
            );
        }

        @Test
        public void testeIdosoHomemObesidadeGrauIIMin() {
            Assert.assertEquals(
                    "Obesidade grau II",
                    calImc.calcGeral(108, 1.75, 66, "homem")
            );
        }

        @Test
        public void testeIdosoHomemObesidadeGrauIIMax() {
            Assert.assertEquals(
                    "Obesidade grau II",
                    calImc.calcGeral(122, 1.75, 66, "homem")
            );
        }

        @Test
        public void testeIdosoHomemObesidadeGrauIII() {
            Assert.assertEquals(
                    "Obesidade grau III (obesidade mórbida)",
                    calImc.calcGeral(123, 1.75, 66, "homem")
            );
        }

}
