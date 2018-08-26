import json
import random

def generateRandomName(genre = "r"):
    if (genre == "f"):
        fullname = random.choice(nomes_mulheres)
    elif (genre == "m"):
        fullname = random.choice(nomes_homens)
    else:
        fullname = random.choice(nomes_homens + nomes_mulheres)
    
    return fullname.upper()

def generateRandomSchool():
    schools = ['ADELINO MAGALHÃES','DR. ALBERTO FRANCISCO TORRES','ALTIVO CÉSAR','ANTÔNIO VIEIRA DA ROCHA ','AYRTON SENNA','PROF. HORÁCIO PACHECO','DIÓGENES RIBEIRO DE MENDONÇA','DJALMA COUTINHO DE OLIVEIRA','ERNANI MOREIRA FRANCO','EULÁLIA DA SILVEIRA BRAGANÇA']
    return random.choice(schools)

# def generateTurno():
#     turno = ['manha', 'tarde', 'noite', 'integral']
#     return random.choice(turno)

def generate_numbers():
    cpf = [random.randint(0, 9) for x in range(9)]
    for _ in range(2):
        val = sum([(len(cpf) + 1 - i) * v for i, v in enumerate(cpf)]) % 11
        cpf.append(11 - val if val > 1 else 0)

    return '%s%s%s%s%s%s%s%s%s%s%s' % tuple(cpf)

def init():
    user = {}
    users = []
    
    for number in range(numbers):
        user = {}
        user["id"] = number
        user["ano"] = {}
        for ano in range(1):
            user["ano"][ano] = {}
            for bimestre in range(4):
                user["ano"][ano][bimestre] = {}
                user["ano"][ano][bimestre]["disciplinas"] = {}
                user["ano"][ano][bimestre]["faltas"] = random.randint(0, 40)
                user["ano"][ano][bimestre]["disciplinas"]["matematica"] = random.randint(0, 10)
                user["ano"][ano][bimestre]["disciplinas"]["historia"] = random.randint(0, 10)
                user["ano"][ano][bimestre]["disciplinas"]["portugues"] = random.randint(0, 10)
                user["ano"][ano][bimestre]["disciplinas"]["biologia"] = random.randint(0, 10)
                user["ano"][ano][bimestre]["disciplinas"]["geografia"] = random.randint(0, 10)
                user["ano"][ano][bimestre]["disciplinas"]["ingles"] = random.randint(0, 10)
                user["ano"][ano][bimestre]["disciplinas"]["redacao"] = random.randint(0, 10)
                user["ano"][ano][bimestre]["disciplinas"]["artes"] = random.randint(0, 10)
                user["ano"][ano][bimestre]["disciplinas"]["educacaofisica"] = random.randint(0, 10)
                user["ano"][ano][bimestre]["disciplinas"]["filosofia"] = random.randint(0, 10)

        user["idade"] = random.randint(10, 18)
        user["matricula"] = generate_numbers()
        user["nome"] = generateRandomName("r")
        user['escola'] = generateRandomSchool()
        user["cpf"] = generate_numbers()
        user["pai_nome"] = generateRandomName("m")
        user["responsavel_cpf"] = generate_numbers()
        user["mae_nome"] = generateRandomName("f")
        users.append(user)

    with open('data.json', 'w') as outfile:
        json.dump(users, outfile)

# InitAll ----------------------------------------------------------
with open("nomes_mulheres.txt", 'r', encoding = "ISO-8859-1") as f:
    content = f.readlines()
nomes_mulheres = [x.strip() for x in content] 

with open("nomes_homens.txt", 'r', encoding = "ISO-8859-1") as f:
    content = f.readlines()
nomes_homens = [x.strip() for x in content] 

numbers = 10
init()
