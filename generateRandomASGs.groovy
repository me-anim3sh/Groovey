import java.util.Random

def generateRandomASGs(int count) {
    List<String> asgNames = []
    Random random = new Random()
    for (int i = 0; i < count; i++) {
        String asgName = "ASG_${random.nextInt(1000)}"
        asgNames.add(asgName)
    }
    return asgNames
}

return generateRandomASGs(10) // Adjust the count as needed
