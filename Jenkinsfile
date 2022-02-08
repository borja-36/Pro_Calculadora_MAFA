pipeline {
agent any

stages {

stage ('Checkout GitHub') {
steps {
sh "mvn clean compile test"
}
}

stage ('Compile Pro_CalculadoraAABB') {
steps {
sh "mvn -f pom.xml clean install -Dmaven.test.skip=true"
}
}

stage ('Unit Tests') {
steps {
echo "Probando resultado final"
}

}

}
}
