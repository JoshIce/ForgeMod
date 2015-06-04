import subprocess
import shutil

def issue_command(command):
    process = subprocess.Popen(command, shell=True)
    return process.communicate()

issue_command("gradlew build")
shutil.copyfile(r'E:\Users\Vegakuma\IdeaProjects\ForgeMod\build\libs\forgemod-1.7.10-1.0.jar',
                r"C:\Users\Vegakuma\AppData\Roaming\.minecraft\mods\forgemod-1.7.10-1.0.jar")
print "Finished!"
