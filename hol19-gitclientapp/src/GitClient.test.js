import axios from "axios";
import GitClient from "./GitClient";

jest.mock("axios");

describe("Git Client Tests", () => {

    test("should return repository names for techiesyed", async () => {

        const dummyData = [
            { id: 1, name: "RepoOne" },
            { id: 2, name: "RepoTwo" }
        ];

        axios.get.mockResolvedValue({
            data: dummyData
        });

        const response =
            await GitClient.getRepositories("techiesyed");

        expect(axios.get).toHaveBeenCalledWith(
            "https://api.github.com/users/techiesyed/repos"
        );

        expect(response.data).toEqual(dummyData);

    });

});